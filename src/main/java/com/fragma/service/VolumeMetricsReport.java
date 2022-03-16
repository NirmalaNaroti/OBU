package com.fragma.service;

import com.fragma.config.InputDataConfig;
import com.fragma.dto.Controls;
import com.fragma.dto.SummaryHtml;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class VolumeMetricsReport {

    private static final Logger LOGGER = LoggerFactory.getLogger(VolumeMetricsReport.class);
    public Map<String, List<List<Object>>> dataDumpMap = new LinkedHashMap<>();
    public Map<String, SummaryHtml> bahrainSummaryHtmlMap = new LinkedHashMap<>();
    public Map<String, SummaryHtml> uaeOrIbgSummaryHtmlMap = new LinkedHashMap<>();
    public Set<String> controlBahrainSet = new LinkedHashSet<>();
    public Set<String> controlUAEORIBGSet = new LinkedHashSet<>();
    public String reportType;
    private String dateInHeader;

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }
//----------------------------------------------------------------------------------------------------------------------------------------


    public String getDateInHeader() {
        return dateInHeader;
    }

    public void setDateInHeader(String dateInHeader) {
        this.dateInHeader = dateInHeader;
    }


    public void hardCodeStaticData(InputDataConfig inputDataConfig) {
        controlBahrainSet.add(Controls.obuimportBillInitialdue);
        controlBahrainSet.add(Controls.obuimportBillFinaldue);
        controlBahrainSet.add(Controls.obuBillsSettled);
        controlBahrainSet.add(Controls.obuLoansOutstanding);
        controlBahrainSet.add(Controls.obuLoansIssuedBills);
        controlBahrainSet.add(Controls.obuLoansIssuedCollection);
        controlBahrainSet.add(Controls.obuLoansIssuedOpenAccount);
        controlBahrainSet.add(Controls.obuLoanssettledReports);

        //March09-2022
        controlBahrainSet.add(Controls.loanssettlementReport);
        controlBahrainSet.add(Controls.billssettlementReport);
        controlBahrainSet.add(Controls.activebillsReport);
        controlBahrainSet.add(Controls.billsClosureReport);
        controlBahrainSet.add(Controls.tradeLoansReport);
        controlBahrainSet.add(Controls.legalisationReport);

        controlBahrainSet.add(Controls.bcrefReports);


        controlUAEORIBGSet.add(Controls.edmsInventoryReport);
        controlUAEORIBGSet.add(Controls.blockedMT103Report);

        for (String control : controlBahrainSet) {
            populateSummaryHtmlMap(control, 0, inputDataConfig);
        }

        for (String control : controlUAEORIBGSet) {
            populateSummaryHtmlMap(control, 0, inputDataConfig);
        }

    }

    public void populateSummaryHtmlMap(String control, int count, InputDataConfig inputDataConfig) {

        SummaryHtml summaryHtml = new SummaryHtml();

        switch (control) {

            case Controls.obuimportBillInitialdue:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForobuimportBillInitialdue());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForobuimportBillFinaldue());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForobuimportBillInitialdue());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control, summaryHtml);

                break;
            case Controls.obuimportBillFinaldue:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForobuimportBillFinaldue());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForobuimportBillFinaldue());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForobuimportBillFinaldue());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control, summaryHtml);

                break;
            case  Controls.obuBillsSettled:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForobuBillsSettled());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForobuBillsSettled());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForobuBillsSettled());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control,summaryHtml);
                break;

            case  Controls.obuLoansOutstanding:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForobuLoansOutstanding());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForobuLoansOutstanding());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForobuLoansOutstanding());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control,summaryHtml);
                break;

            case  Controls.obuLoansIssuedBills:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForobuLoansIssuedBills());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForobuLoansIssuedBills());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForobuLoansIssuedBills());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control,summaryHtml);
                break;

            case  Controls.obuLoansIssuedCollection:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForobuLoansIssuedCollection());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForobuLoansIssuedCollection());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForobuLoansIssuedCollection());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control,summaryHtml);
                break;

            case  Controls.obuLoansIssuedOpenAccount:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForobuLoansIssuedOpenAccount());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForobuLoansIssuedOpenAccount());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForobuLoansIssuedOpenAccount());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control,summaryHtml);
                break;

            case  Controls.obuLoanssettledReports:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForobuLoanssettledReports());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForobuLoanssettledReports());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForobuLoanssettledReports());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control,summaryHtml);
                break;

                //March09-2022
            case  Controls.loanssettlementReport:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForloanssettlementReport());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForloanssettlementReport());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForloanssettlementReport());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control,summaryHtml);
                break;

            case  Controls.billssettlementReport:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForbillssettlementReport());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForbillssettlementReport());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForbillssettlementReport());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control,summaryHtml);
                break;

            case  Controls.activebillsReport:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForactivebillsReport());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForactivebillsReport());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForactivebillsReport());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control,summaryHtml);
                break;

            case  Controls.billsClosureReport:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForbillsClosureReport());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForbillsClosureReport());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForbillsClosureReport());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control,summaryHtml);
                break;

            case  Controls.tradeLoansReport:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerFortradeLoansReport());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerFortradeLoansReport());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerFortradeLoansReport());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control,summaryHtml);
                break;

            case  Controls.legalisationReport:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForlegalisationReport());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForlegalisationReport());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForlegalisationReport());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control,summaryHtml);
                break;

            case  Controls.bcrefReports:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForbcrefReports());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForbcrefReports());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForbcrefReports());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                bahrainSummaryHtmlMap.put(control,summaryHtml);
                break;

                //======UAE=OR=IBG===========

            case  Controls.edmsInventoryReport:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForEdmsInventoryReport());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForEdmsInventoryReport());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryreviewerForEdmsInventoryReport());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                uaeOrIbgSummaryHtmlMap.put(control,summaryHtml);
                break;

            case  Controls.blockedMT103Report:
                summaryHtml.setReportOwner(inputDataConfig.getReportOwnerForBlockedMT103Report());
                summaryHtml.setPrimaryReviewer(inputDataConfig.getPrimaryReviewerForBlockedMT103Report());
                summaryHtml.setSecondaryReviewer(inputDataConfig.getSecondaryReviewerForBlockedMT103Report());
                summaryHtml.setTotalFlaggedTransactions(summaryHtml.getTotalFlaggedTransactions() + count);
                uaeOrIbgSummaryHtmlMap.put(control,summaryHtml);
                break;


        }
    }


    public void writeDumpDataToExcelSheetForControl(String excelFileLocation) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();

        int rownum = 0;
        for (Map.Entry<String, List<List<Object>>> keyValue : dataDumpMap.entrySet()) {

            String sheetName = keyValue.getKey();
            List<List<Object>> sheetList = keyValue.getValue();
            /*String[] split = sheetName.split("&", 2);
            String controlName = split[0];
            String reportType = split[1];*/
                rownum = 0;
                Sheet sheet = workbook.createSheet(sheetName);
               if (sheetList.size() != 0) {

                    for (List<Object> rowData : sheetList) {
                        Row currentDatarow = sheet.createRow(rownum++);
                        int cellnum = 0;

                        if (rowData != null) {
                            for (Object obj : rowData) {

                                Cell cell = currentDatarow.createCell(cellnum++);
                                //      cell.setCellValue((String) obj);
                                if (obj instanceof String) {
                                    cell.setCellValue((String) obj);
                                } else if (obj instanceof Integer) {
                                    cell.setCellValue((Integer) obj);
                                } else if (obj instanceof Double) {
                                    double doubleValue = (Double) obj;
                                    cell.setCellValue((int) doubleValue);
                                } else if (obj instanceof Float) {
                                    float floatValue = (Float) obj;
                                    cell.setCellValue((int) floatValue);
                                } else {
                                    cell.setCellValue(String.valueOf(obj));

                                }

                            }
                        }
                    }
                    for(int i =0;i<=sheet.getRow(0).getLastCellNum();i++) {
                            sheet.autoSizeColumn(i);
                           /* int columnWidth = sheet.getColumnWidth(i);
                            sheet.setColumnWidth(i, columnWidth + 6000);*/
                    }
                }
            //    else {
             //   }

        }
        FileOutputStream out = new FileOutputStream(new File(excelFileLocation));
        workbook.write(out);
        out.close();
        LOGGER.info(excelFileLocation + " written successfully on disk.");
        LOGGER.info("createExcelFile(-) method ended");


    }

    public void dateInReport(Date businessDate) {

        Calendar presentBusinessDateCal = Calendar.getInstance();
        presentBusinessDateCal.setTime(businessDate);
        presentBusinessDateCal.add(Calendar.DAY_OF_MONTH, 1);
        presentBusinessDateCal.set(presentBusinessDateCal.get(Calendar.YEAR), presentBusinessDateCal.get(Calendar.MONTH), presentBusinessDateCal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(presentBusinessDateCal);
        dateInHeader = df.format(presentBusinessDateCal.getTime());
    }


    public SummaryHtml getSummaryHtmlForBahrainControl(String control) {
        return bahrainSummaryHtmlMap.get(control) != null ? bahrainSummaryHtmlMap.get(control) : new SummaryHtml();
    }

    public SummaryHtml getSummaryHtmlForUAEOrIBGControl(String control) {
        return uaeOrIbgSummaryHtmlMap.get(control) != null ? uaeOrIbgSummaryHtmlMap.get(control) : new SummaryHtml();
    }

    public String getStringNumber(String value) {

        return value;
    }

    public Set<String> getControlBahrainSet() {
        return controlBahrainSet;
    }

    public Set<String> getControlUAEORIBGSet() {
        return controlUAEORIBGSet;
    }

/*
    public Set<String> getControlNames() {

        if (this.getReportType().equalsIgnoreCase("Export")) {
            return getControlNamesForExport();
        } else {
            //Issurnce set
            return getControlNamesForIssuance();
        }
    }
*/
}
