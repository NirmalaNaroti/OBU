package com.fragma.client;

import com.fragma.config.InputDataConfig;
import com.fragma.config.PersistenceConfig;
import com.fragma.config.SMTPMailThreadConfig;
import com.fragma.config.ThymeleafConfig;
import com.fragma.dao.ReportDAO;
import com.fragma.service.VolumeMetricsReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@Import({ThymeleafConfig.class, SMTPMailThreadConfig.class, InputDataConfig.class, PersistenceConfig.class})
public class Runner implements ApplicationRunner {

    static Logger LOG = LoggerFactory.getLogger(Runner.class);

    private TemplateEngine templateEngine;
    private Session session;
    private ReportDAO dao;
    private SMTPMailThreadConfig mailThreadConfig;
    private InputDataConfig inputDataConfig;


    @Autowired
    public Runner(TemplateEngine templateEngine, Session session, SMTPMailThreadConfig mailThreadConfig, ReportDAO dao, InputDataConfig inputDataConfig) {

        this.templateEngine = templateEngine;
        this.session = session;
        this.mailThreadConfig = mailThreadConfig;
        this.dao = dao;
        this.inputDataConfig = inputDataConfig;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {
            System.out.println("run started");
            LOG.info("run started");
            List<String> businessDates = args.getOptionValues("businessDate");
            Date businessDate;
            String bdString;
            if (businessDates != null && businessDates.size() > 0) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
                bdString = businessDates.get(0);
                businessDate = dateFormat.parse(bdString);
            } else {
                Calendar instance = Calendar.getInstance();
                instance.add(Calendar.DAY_OF_MONTH, -1);
                businessDate = instance.getTime();
            }


            VolumeMetricsReport volumeMetricsReport = new VolumeMetricsReport();
           // volumeMetricsReport.setReportType("Export");

            volumeMetricsReport.hardCodeStaticData(inputDataConfig);
            volumeMetricsReport.dateInReport(businessDate);
            dao.exexuteQueries(volumeMetricsReport,businessDate,volumeMetricsReport.getDateInHeader());

            LOG.info("Today's Date"+businessDate.getTime());

                LOG.info("Executing  Reports=====");

                volumeMetricsReport.writeDumpDataToExcelSheetForControl(inputDataConfig.getExcelFileLocation());
                Context context = new Context();
                context.setVariable("volumeMetricsReport", volumeMetricsReport);

                StringWriter st = null;
                st = new StringWriter();
                templateEngine.process("report", context, st);

                LOG.info("Uae IBG MAp"+volumeMetricsReport.getControlUAEORIBGSet());

               // LOG.info("after process()=====" + st.toString());
                sendMail(st, volumeMetricsReport, mailThreadConfig.getToAddress(), mailThreadConfig.getCcAddress());
                LOG.info("=====Mail Sent Succesfully for Executing=====");

        } catch (Exception e) {
            LOG.info("error is :" + e);
            e.printStackTrace();
        }
    }

    private void sendMail(StringWriter st, VolumeMetricsReport volumeMetricsReport, String toAddress, String ccAddress) {
        try {
            MimeMessage msg = new MimeMessage(session);
            //set message headers
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            //msg.addHeader("Content-type", "application/excel; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");

            msg.setFrom(new InternetAddress(mailThreadConfig.getFromAddress(), mailThreadConfig.getFromName()));

            msg.setReplyTo(InternetAddress.parse(mailThreadConfig.getFromAddress(), false));

            String subject = mailThreadConfig.getSubject() + volumeMetricsReport.getDateInHeader();

            msg.setSubject(subject, "UTF-8");
            msg.setContent(st.toString(), "text/html");


            MimeBodyPart messageBodyPart1 = new MimeBodyPart();

            messageBodyPart1.addHeader("Content-type", "text/HTML; charset=UTF-8");
            messageBodyPart1.addHeader("format", "flowed");
            messageBodyPart1.addHeader("Content-Transfer-Encoding", "8bit");
            messageBodyPart1.setContent(st.toString(), "text/html");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart1);

            File file = new File(inputDataConfig.getExcelFileLocation());

            if (file.exists()) {
                LOG.info(file + " is avaiable and attaching to mail");

                MimeBodyPart messageBodyPartAOFlex = new MimeBodyPart();
                DataSource sourceAOFlex = new FileDataSource(file);
                messageBodyPartAOFlex.setDataHandler(new DataHandler(sourceAOFlex));
                messageBodyPartAOFlex.setFileName(file.getName());
                multipart.addBodyPart(messageBodyPartAOFlex);

            }


            msg.setContent(multipart);
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toAddress, false));
            msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccAddress, false));
            Transport.send(msg);

        } catch (Throwable e) {
            Writer buffer = new StringWriter();
            PrintWriter pw = new PrintWriter(buffer);
            e.printStackTrace(pw);
            //Logger.log(loglevel, buffer.toString());
            LOG.info("error msg is :" + buffer.toString());
            LOG.info("error stacktrace is :" + e.getStackTrace());
            e.printStackTrace();
        }

    }
}
