package com.fragma.dao;

import com.fragma.config.InputDataConfig;
import com.fragma.dto.Controls;
import com.fragma.service.VolumeMetricsReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

@Repository
public class ReportDAO {

    @Autowired
    @Qualifier("hiveJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    Logger LOGGER = LoggerFactory.getLogger(ReportDAO.class);

    @Autowired
    InputDataConfig inputDataConfig;

    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public String formateDate(java.sql.Date date) {

        String text = dateFormat.format(date);
        return text;
    }

    public LocalDate convertUtilDateToLocalDate(Date nextBusinessDate) {
        Instant instant = Instant.ofEpochMilli(nextBusinessDate.getTime());
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        return localDateTime.toLocalDate();
    }


//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


    public void exexuteQueries(VolumeMetricsReport volumeMetricsReport, Date businessDate, String dateInHeader) {
        LOGGER.info("---------------------------------exexuteQueries(-) started--------------------------------------");

        exexuteQueryForSummaryHtml(inputDataConfig.getObuimportBillInitialdue(), Controls.obuimportBillInitialdue, volumeMetricsReport);
        exexuteQueryForSummaryHtml(inputDataConfig.getObuimportBillFinaldue(), Controls.obuimportBillFinaldue, volumeMetricsReport);
        exexuteQueryForSummaryHtml(inputDataConfig.getObuBillsSettled(),Controls.obuBillsSettled,volumeMetricsReport);
        exexuteQueryForSummaryHtml(inputDataConfig.getObuLoansOutstanding(), Controls.obuLoansOutstanding, volumeMetricsReport);
        exexuteQueryForSummaryHtml(inputDataConfig.getObuLoansIssuedCollection(), Controls.obuLoansIssuedCollection, volumeMetricsReport);
        exexuteQueryForSummaryHtml(inputDataConfig.getObuLoanssettledReports(), Controls.obuLoanssettledReports, volumeMetricsReport);

        exexuteQueryForSummaryHtml(inputDataConfig.getEdmsInventoryReport(), Controls.edmsInventoryReport, volumeMetricsReport);

        exexuteQueryForSummaryHtmlWithDateCondition(inputDataConfig.getObuLoansIssuedBills(), Controls.obuLoansIssuedBills, volumeMetricsReport,businessDate);
        exexuteQueryForSummaryHtmlWithDateCondition(inputDataConfig.getObuLoansIssuedOpenAccount(), Controls.obuLoansIssuedOpenAccount, volumeMetricsReport,businessDate);

        exexuteQueryForSummaryHtmlWithDateCondition(inputDataConfig.getBlockedMT103Report(), Controls.blockedMT103Report, volumeMetricsReport,businessDate);

        //March09-2022
        exexuteQueryForSummaryHtml(inputDataConfig.getLoanssettlementReport(), Controls.loanssettlementReport, volumeMetricsReport);
        exexuteQueryForSummaryHtml(inputDataConfig.getBillssettlementReport(), Controls.billssettlementReport, volumeMetricsReport);
        exexuteQueryForSummaryHtml(inputDataConfig.getActivebillsReport(), Controls.activebillsReport, volumeMetricsReport);
        exexuteQueryForSummaryHtml(inputDataConfig.getBillsClosureReport(), Controls.billsClosureReport, volumeMetricsReport);
        exexuteQueryForSummaryHtml(inputDataConfig.getTradeLoansReport(), Controls.tradeLoansReport, volumeMetricsReport);
        exexuteQueryForSummaryHtml(inputDataConfig.getLegalisationReport(), Controls.legalisationReport, volumeMetricsReport);

        exexuteQueryForSummaryHtml(inputDataConfig.getBcrefReports(), Controls.bcrefReports, volumeMetricsReport);



        List<List<Object>> inventoryReportDumpList = executeQueryForDump(inputDataConfig.getInventoryReportDatadump());
        volumeMetricsReport.dataDumpMap.put("Inventory_Report", inventoryReportDumpList);

        List<List<Object>> blockedMT103ReportDumpList = executeQueryForDump(inputDataConfig.getBlockedMT103ReportDatadump(),businessDate);
        volumeMetricsReport.dataDumpMap.put("Blocked_MT_103_Report",blockedMT103ReportDumpList);

        List<List<Object>> billInIntialDueDumList = executeQueryForDump(inputDataConfig.getBillInInitialDueDatadump());
        volumeMetricsReport.dataDumpMap.put("Bill_In_Initial_Due-"+dateInHeader, billInIntialDueDumList);

        List<List<Object>> billInFinalDumpList = executeQueryForDump(inputDataConfig.getBillInFinalDueDatadump());
        volumeMetricsReport.dataDumpMap.put("Bill_In_Final_Due-"+dateInHeader, billInFinalDumpList);

        List<List<Object>> settledBillsAndCollectionDumpList = executeQueryForDump(inputDataConfig.getSettledBillAndCollectionDatadump());
        volumeMetricsReport.dataDumpMap.put("Settled_Bills_And_Collection-"+dateInHeader,settledBillsAndCollectionDumpList);

        List<List<Object>> loansOutstandingDumpList = executeQueryForDump(inputDataConfig.getLoansOutstandingDatadump());
        volumeMetricsReport.dataDumpMap.put("Loans_Oustanding-"+dateInHeader,loansOutstandingDumpList);

        List<List<Object>> loansIssuedOpenTRDumpList = executeQueryForDump(inputDataConfig.getLoansIssuedOpenTRDatadump(),businessDate);
        volumeMetricsReport.dataDumpMap.put("Loans_Issued_Open_TR-"+dateInHeader,loansIssuedOpenTRDumpList);

        List<List<Object>> loanIssuedBillDumpList = executeQueryForDump(inputDataConfig.getLoanIssuedBillDatadump());
        volumeMetricsReport.dataDumpMap.put("Loans_Issued_Bill-"+dateInHeader,loanIssuedBillDumpList);

        List<List<Object>> loansIssuedCollectionDumpList = executeQueryForDump(inputDataConfig.getLoansIssuedCollectionDatadump(),businessDate);
        volumeMetricsReport.dataDumpMap.put("Loans_Issued_Collection-"+dateInHeader,loansIssuedCollectionDumpList);

        List<List<Object>> loanSettledDumpList = executeQueryForDump(inputDataConfig.getLoanSettledDatadump());
        volumeMetricsReport.dataDumpMap.put("Loans_Settled-"+dateInHeader,loanSettledDumpList);


        //---MArch09-2022
        List<List<Object>> loansSettlementDumpList = executeQueryForDump(inputDataConfig.getLoanssettlementReportDatadump());
        volumeMetricsReport.dataDumpMap.put("Loans_Settlement-"+dateInHeader,loansSettlementDumpList);

        List<List<Object>> billsSettlementReportDumpList = executeQueryForDump(inputDataConfig.getBillssettlementReportDatadump());
        volumeMetricsReport.dataDumpMap.put("Bills_Settlement_Report-"+dateInHeader,billsSettlementReportDumpList);

        List<List<Object>> activeBillsReportDumpList = executeQueryForDump(inputDataConfig.getActivebillsReportDatadump());
        volumeMetricsReport.dataDumpMap.put("Active_Bills_Report-"+dateInHeader,activeBillsReportDumpList);

        List<List<Object>> billsClosureReportDumpList = executeQueryForDump(inputDataConfig.getBillsClosureReportDatadump());
        volumeMetricsReport.dataDumpMap.put("Bills_Closure_Report-"+dateInHeader,billsClosureReportDumpList);

        List<List<Object>> tradeLoanReportDumpList = executeQueryForDump(inputDataConfig.getTradeLoansReportDatadump());
        volumeMetricsReport.dataDumpMap.put("Trade_Loan_Report-"+dateInHeader,tradeLoanReportDumpList);

        List<List<Object>> LegalisationReportDumpList = executeQueryForDump(inputDataConfig.getLegalisationReportDatadump());
        volumeMetricsReport.dataDumpMap.put("Loans_Settled-"+dateInHeader,LegalisationReportDumpList);

        List<List<Object>> bcrefDumpList = executeQueryForDump(inputDataConfig.getBcrefReportsDatadump());
        volumeMetricsReport.dataDumpMap.put("BCREF-"+dateInHeader,bcrefDumpList);

        LOGGER.info("---------------------------------exexuteQueries(-) ended--------------------------------------");


    }



    private void exexuteQueryForSummaryHtmlWithDateCondition(String summaryQuery, String control, VolumeMetricsReport volumeMetricsReport, Date businessDate) {

        LOGGER.info(control+" === For summaryQuery is : " + summaryQuery);

        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(summaryQuery);

                 java.sql.Date date = new java.sql.Date(businessDate.getTime());
                //  java.sql.Date upperLimit = new java.sql.Date(nextBusinessDate.getTime());

                    LOGGER.info("Date Parameter"+formateDate(date));
                ps.setString(1, formateDate(date));
                //ps.setString(2, formateDate(upperLimit));

                return ps;
            }
        }, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

               // int count = resultSet.getInt(1);
                LOGGER.info("control :" + control);
                ++count;

            }
        });

        LOGGER.info("count :" + count);

        volumeMetricsReport.populateSummaryHtmlMap(control, count, inputDataConfig);

        count = 0;

    }

    int count=0;

    private void exexuteQueryForSummaryHtml(String summaryQuery, String control, VolumeMetricsReport volumeMetricsReport) {


        LOGGER.info(control+" === For summaryQuery is : " + summaryQuery);

        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(summaryQuery);
                return ps;
            }
        }, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {

                //int count = resultSet.getInt(1);
                LOGGER.info("control :" + control);
                ++count;



            }
        });
        LOGGER.info("count :" + count);
        volumeMetricsReport.populateSummaryHtmlMap(control, count, inputDataConfig);
        count=0;

    }




    public List<List<Object>> executeQueryForDump(String query) {
        Set<Boolean> columnNamesAdded = new LinkedHashSet<>();

        List<List<Object>> controlDataList = new ArrayList<>();
        LOGGER.info("*******executeQueryForDump(-)***** in dao query :" + query);

        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(query);
                //  java.sql.Date date = new java.sql.Date(businessDate.getTime());
                //  java.sql.Date upperLimit = new java.sql.Date(nextBusinessDate.getTime());

                //ps.setString(1, formateDate(date));
                //ps.setString(2, formateDate(upperLimit));


                return ps;
            }
        }, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                List<Object> columnNames = new ArrayList<>();

                int columnCount = resultSet.getMetaData().getColumnCount();
                if (columnNamesAdded.size() == 0) {
                    for (int i = 1; i <= columnCount; i++) {
                        String columnName = resultSet.getMetaData().getColumnName(i);
                     //   LOGGER.info("Column name :" + columnName);
                        columnNames.add(columnName);

                    }
                    controlDataList.add(columnNames);
                    columnNamesAdded.add(true);
                }

                List<Object> rowData = new ArrayList<>();
                for (int i = 1; i <= columnCount; i++) {
                    Object columnData = resultSet.getObject(i);
                    rowData.add(columnData);
                }
               // LOGGER.info("row data :" + rowData);
                controlDataList.add(rowData);

            }

        });


        return controlDataList;

    }//executeQueryForDump(-,-,)

    private List<List<Object>> executeQueryForDump(String query, Date businessDate) {
        Set<Boolean> columnNamesAdded = new LinkedHashSet<>();

        List<List<Object>> controlDataList = new ArrayList<>();
        LOGGER.info("*******executeQueryForDump(-)***** in dao query :" + query);

        jdbcTemplate.query(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(query);
                  java.sql.Date date = new java.sql.Date(businessDate.getTime());
                //  java.sql.Date upperLimit = new java.sql.Date(nextBusinessDate.getTime());

                ps.setString(1, formateDate(date));
                //ps.setString(2, formateDate(upperLimit));


                return ps;
            }
        }, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                List<Object> columnNames = new ArrayList<>();

                int columnCount = resultSet.getMetaData().getColumnCount();
                if (columnNamesAdded.size() == 0) {
                    for (int i = 1; i <= columnCount; i++) {
                        String columnName = resultSet.getMetaData().getColumnName(i);
                        //   LOGGER.info("Column name :" + columnName);

                        String[] splittedColumnName = null;
                        if (columnName.contains(".")) {
                            splittedColumnName = columnName.split("\\.");
                            columnName = splittedColumnName[1];
                        }
                        columnNames.add(columnName);

                    }

                    controlDataList.add(columnNames);
                    columnNamesAdded.add(true);
                }

                List<Object> rowData = new ArrayList<>();
                for (int i = 1; i <= columnCount; i++) {
                    Object columnData = resultSet.getObject(i);
                    rowData.add(columnData);
                }
                // LOGGER.info("row data :" + rowData);
                controlDataList.add(rowData);

            }

        });


        return controlDataList;
    }


    public String isNullOrEmpty(String value) {

        if (value == null || value.isEmpty() || value.equalsIgnoreCase("0")) {
            return "-";
        } else

            return value;
    }


}

