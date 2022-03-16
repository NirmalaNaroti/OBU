package com.fragma.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "input")
public class InputDataConfig {

    private String excelFileLocation;

    //Dump
    private String inventoryReportDatadump;
    private String billInInitialDueDatadump;
    private  String billInFinalDueDatadump;
    private String settledBillAndCollectionDatadump;
    private String loansOutstandingDatadump;

    private String loanIssuedBillDatadump;

    private String loanSettledDatadump;


    private String blockedMT103ReportDatadump;
    private String loansIssuedOpenTRDatadump;
    private  String loansIssuedCollectionDatadump;

//March09-2022
   private String  loanssettlementReportDatadump;
   private String  billssettlementReportDatadump;
   private String activebillsReportDatadump;
   private String billsClosureReportDatadump;
   private String tradeLoansReportDatadump;
   private String legalisationReportDatadump;

   private String bcrefReportsDatadump;

    //TotalTransactions
    private String obuimportBillInitialdue;
    private String obuimportBillFinaldue;
    private String obuBillsSettled;
    private String obuLoansOutstanding;
    private String obuLoansIssuedBills;
    private String obuLoansIssuedCollection;
    private String obuLoansIssuedOpenAccount;
    private String obuLoanssettledReports;

   private String edmsInventoryReport;
   private String blockedMT103Report;

   //March09-2022
    private String loanssettlementReport;
    private String billssettlementReport;
    private String activebillsReport;
    private String billsClosureReport;
    private String tradeLoansReport;
    private String legalisationReport;

    private String bcrefReports;

//reportOwner
    private String reportOwnerForobuimportBillInitialdue;
    private String reportOwnerForobuimportBillFinaldue;
    private String reportOwnerForobuBillsSettled;
    private String reportOwnerForobuLoansOutstanding;
    private String reportOwnerForobuLoanssettledReports;
    private String reportOwnerForobuLoansIssuedBills;
    private String reportOwnerForobuLoansIssuedCollection;
    private String reportOwnerForobuLoansIssuedOpenAccount;
    private String reportOwnerForEdmsInventoryReport;
    private String reportOwnerForBlockedMT103Report;

    //##MArch06-2022
    private String reportOwnerForloanssettlementReport;
    private String reportOwnerForbillssettlementReport;
    private String reportOwnerForactivebillsReport;
    private String  reportOwnerForbillsClosureReport;
    private String  reportOwnerFortradeLoansReport;
    private String  reportOwnerForlegalisationReport;

    private String reportOwnerForbcrefReports;



//primaryReviewer

    private String primaryReviewerForobuimportBillInitialdue;
    private String primaryReviewerForobuimportBillFinaldue;
    private String primaryReviewerForobuBillsSettled;
    private String primaryReviewerForobuLoansOutstanding;
    private String primaryReviewerForobuLoansIssuedBills;
    private String primaryReviewerForobuLoansIssuedCollection;
    private String primaryReviewerForobuLoansIssuedOpenAccount;
    private String primaryReviewerForobuLoanssettledReports;

   private String primaryReviewerForEdmsInventoryReport;
   private String primaryReviewerForBlockedMT103Report;

   //##MArch06-2022
   private String primaryReviewerForloanssettlementReport;
   private String primaryReviewerForbillssettlementReport;
   private String primaryReviewerForactivebillsReport;
   private String primaryReviewerForbillsClosureReport;
   private String primaryReviewerFortradeLoansReport;
   private String primaryReviewerForlegalisationReport;

   private String primaryReviewerForbcrefReports;

//secondaryReviewer

    private String secondaryReviewerForobuimportBillInitialdue;
    private String secondaryReviewerForobuimportBillFinaldue;
    private String secondaryReviewerForobuBillsSettled;
    private String secondaryReviewerForobuLoansOutstanding;
    private String secondaryReviewerForobuLoansIssuedBills;
    private String secondaryReviewerForobuLoansIssuedCollection;
    private String secondaryReviewerForobuLoansIssuedOpenAccount;
    private String secondaryReviewerForobuLoanssettledReports;

    private String secondaryreviewerForEdmsInventoryReport;
    private String  secondaryReviewerForBlockedMT103Report;

    //##MArch06-2022
    private String secondaryReviewerForloanssettlementReport;
    private String secondaryReviewerForbillssettlementReport;
    private String secondaryReviewerForactivebillsReport;
    private String  secondaryReviewerForbillsClosureReport;
    private String secondaryReviewerFortradeLoansReport;
    private String secondaryReviewerForlegalisationReport;

    private String secondaryReviewerForbcrefReports;


    public String getReportOwnerForobuimportBillInitialdue() {
        return reportOwnerForobuimportBillInitialdue;
    }

    public void setReportOwnerForobuimportBillInitialdue(String reportOwnerForobuimportBillInitialdue) {
        this.reportOwnerForobuimportBillInitialdue = reportOwnerForobuimportBillInitialdue;
    }

    public String getReportOwnerForobuimportBillFinaldue() {
        return reportOwnerForobuimportBillFinaldue;
    }

    public void setReportOwnerForobuimportBillFinaldue(String reportOwnerForobuimportBillFinaldue) {
        this.reportOwnerForobuimportBillFinaldue = reportOwnerForobuimportBillFinaldue;
    }

    public String getReportOwnerForobuBillsSettled() {
        return reportOwnerForobuBillsSettled;
    }

    public void setReportOwnerForobuBillsSettled(String reportOwnerForobuBillsSettled) {
        this.reportOwnerForobuBillsSettled = reportOwnerForobuBillsSettled;
    }

    public String getReportOwnerForobuLoansOutstanding() {
        return reportOwnerForobuLoansOutstanding;
    }

    public void setReportOwnerForobuLoansOutstanding(String reportOwnerForobuLoansOutstanding) {
        this.reportOwnerForobuLoansOutstanding = reportOwnerForobuLoansOutstanding;
    }

    public String getReportOwnerForobuLoansIssuedBills() {
        return reportOwnerForobuLoansIssuedBills;
    }

    public void setReportOwnerForobuLoansIssuedBills(String reportOwnerForobuLoansIssuedBills) {
        this.reportOwnerForobuLoansIssuedBills = reportOwnerForobuLoansIssuedBills;
    }

    public String getReportOwnerForobuLoansIssuedCollection() {
        return reportOwnerForobuLoansIssuedCollection;
    }

    public void setReportOwnerForobuLoansIssuedCollection(String reportOwnerForobuLoansIssuedCollection) {
        this.reportOwnerForobuLoansIssuedCollection = reportOwnerForobuLoansIssuedCollection;
    }

    public String getReportOwnerForobuLoansIssuedOpenAccount() {
        return reportOwnerForobuLoansIssuedOpenAccount;
    }

    public void setReportOwnerForobuLoansIssuedOpenAccount(String reportOwnerForobuLoansIssuedOpenAccount) {
        this.reportOwnerForobuLoansIssuedOpenAccount = reportOwnerForobuLoansIssuedOpenAccount;
    }

    public String getReportOwnerForEdmsInventoryReport() {
        return reportOwnerForEdmsInventoryReport;
    }

    public void setReportOwnerForEdmsInventoryReport(String reportOwnerForEdmsInventoryReport) {
        this.reportOwnerForEdmsInventoryReport = reportOwnerForEdmsInventoryReport;
    }

    public String getReportOwnerForBlockedMT103Report() {
        return reportOwnerForBlockedMT103Report;
    }

    public void setReportOwnerForBlockedMT103Report(String reportOwnerForBlockedMT103Report) {
        this.reportOwnerForBlockedMT103Report = reportOwnerForBlockedMT103Report;
    }

    public String getObuimportBillInitialdue() {
        return obuimportBillInitialdue;
    }

    public void setObuimportBillInitialdue(String obuimportBillInitialdue) {
        this.obuimportBillInitialdue = obuimportBillInitialdue;
    }

    public String getObuimportBillFinaldue() {
        return obuimportBillFinaldue;
    }

    public void setObuimportBillFinaldue(String obuimportBillFinaldue) {
        this.obuimportBillFinaldue = obuimportBillFinaldue;
    }

    public String getObuBillsSettled() {
        return obuBillsSettled;
    }

    public void setObuBillsSettled(String obuBillsSettled) {
        this.obuBillsSettled = obuBillsSettled;
    }

    public String getObuLoansOutstanding() {
        return obuLoansOutstanding;
    }

    public void setObuLoansOutstanding(String obuLoansOutstanding) {
        this.obuLoansOutstanding = obuLoansOutstanding;
    }

    public String getObuLoansIssuedBills() {
        return obuLoansIssuedBills;
    }

    public void setObuLoansIssuedBills(String obuLoansIssuedBills) {
        this.obuLoansIssuedBills = obuLoansIssuedBills;
    }

    public String getObuLoansIssuedCollection() {
        return obuLoansIssuedCollection;
    }

    public void setObuLoansIssuedCollection(String obuLoansIssuedCollection) {
        this.obuLoansIssuedCollection = obuLoansIssuedCollection;
    }

    public String getObuLoansIssuedOpenAccount() {
        return obuLoansIssuedOpenAccount;
    }

    public void setObuLoansIssuedOpenAccount(String obuLoansIssuedOpenAccount) {
        this.obuLoansIssuedOpenAccount = obuLoansIssuedOpenAccount;
    }

    public String getObuLoanssettledReports() {
        return obuLoanssettledReports;
    }

    public void setObuLoanssettledReports(String obuLoanssettledReports) {
        this.obuLoanssettledReports = obuLoanssettledReports;
    }


    public String getPrimaryReviewerForobuimportBillInitialdue() {
        return primaryReviewerForobuimportBillInitialdue;
    }

    public void setPrimaryReviewerForobuimportBillInitialdue(String primaryReviewerForobuimportBillInitialdue) {
        this.primaryReviewerForobuimportBillInitialdue = primaryReviewerForobuimportBillInitialdue;
    }

    public String getPrimaryReviewerForobuimportBillFinaldue() {
        return primaryReviewerForobuimportBillFinaldue;
    }

    public void setPrimaryReviewerForobuimportBillFinaldue(String primaryReviewerForobuimportBillFinaldue) {
        this.primaryReviewerForobuimportBillFinaldue = primaryReviewerForobuimportBillFinaldue;
    }

    public String getPrimaryReviewerForobuBillsSettled() {
        return primaryReviewerForobuBillsSettled;
    }

    public void setPrimaryReviewerForobuBillsSettled(String primaryReviewerForobuBillsSettled) {
        this.primaryReviewerForobuBillsSettled = primaryReviewerForobuBillsSettled;
    }

    public String getPrimaryReviewerForobuLoansOutstanding() {
        return primaryReviewerForobuLoansOutstanding;
    }

    public void setPrimaryReviewerForobuLoansOutstanding(String primaryReviewerForobuLoansOutstanding) {
        this.primaryReviewerForobuLoansOutstanding = primaryReviewerForobuLoansOutstanding;
    }

    public String getPrimaryReviewerForobuLoansIssuedBills() {
        return primaryReviewerForobuLoansIssuedBills;
    }

    public void setPrimaryReviewerForobuLoansIssuedBills(String primaryReviewerForobuLoansIssuedBills) {
        this.primaryReviewerForobuLoansIssuedBills = primaryReviewerForobuLoansIssuedBills;
    }

    public String getPrimaryReviewerForobuLoansIssuedCollection() {
        return primaryReviewerForobuLoansIssuedCollection;
    }

    public void setPrimaryReviewerForobuLoansIssuedCollection(String primaryReviewerForobuLoansIssuedCollection) {
        this.primaryReviewerForobuLoansIssuedCollection = primaryReviewerForobuLoansIssuedCollection;
    }

    public String getPrimaryReviewerForobuLoansIssuedOpenAccount() {
        return primaryReviewerForobuLoansIssuedOpenAccount;
    }

    public void setPrimaryReviewerForobuLoansIssuedOpenAccount(String primaryReviewerForobuLoansIssuedOpenAccount) {
        this.primaryReviewerForobuLoansIssuedOpenAccount = primaryReviewerForobuLoansIssuedOpenAccount;
    }

    public String getPrimaryReviewerForobuLoanssettledReports() {
        return primaryReviewerForobuLoanssettledReports;
    }

    public void setPrimaryReviewerForobuLoanssettledReports(String primaryReviewerForobuLoanssettledReports) {
        this.primaryReviewerForobuLoanssettledReports = primaryReviewerForobuLoanssettledReports;
    }

    public String getSecondaryReviewerForobuimportBillInitialdue() {
        return secondaryReviewerForobuimportBillInitialdue;
    }

    public void setSecondaryReviewerForobuimportBillInitialdue(String secondaryReviewerForobuimportBillInitialdue) {
        this.secondaryReviewerForobuimportBillInitialdue = secondaryReviewerForobuimportBillInitialdue;
    }

    public String getSecondaryReviewerForobuimportBillFinaldue() {
        return secondaryReviewerForobuimportBillFinaldue;
    }

    public void setSecondaryReviewerForobuimportBillFinaldue(String secondaryReviewerForobuimportBillFinaldue) {
        this.secondaryReviewerForobuimportBillFinaldue = secondaryReviewerForobuimportBillFinaldue;
    }

    public String getSecondaryReviewerForobuBillsSettled() {
        return secondaryReviewerForobuBillsSettled;
    }

    public void setSecondaryReviewerForobuBillsSettled(String secondaryReviewerForobuBillsSettled) {
        this.secondaryReviewerForobuBillsSettled = secondaryReviewerForobuBillsSettled;
    }

    public String getSecondaryReviewerForobuLoansOutstanding() {
        return secondaryReviewerForobuLoansOutstanding;
    }

    public void setSecondaryReviewerForobuLoansOutstanding(String secondaryReviewerForobuLoansOutstanding) {
        this.secondaryReviewerForobuLoansOutstanding = secondaryReviewerForobuLoansOutstanding;
    }

    public String getSecondaryReviewerForobuLoansIssuedBills() {
        return secondaryReviewerForobuLoansIssuedBills;
    }

    public void setSecondaryReviewerForobuLoansIssuedBills(String secondaryReviewerForobuLoansIssuedBills) {
        this.secondaryReviewerForobuLoansIssuedBills = secondaryReviewerForobuLoansIssuedBills;
    }

    public String getSecondaryReviewerForobuLoansIssuedCollection() {
        return secondaryReviewerForobuLoansIssuedCollection;
    }

    public void setSecondaryReviewerForobuLoansIssuedCollection(String secondaryReviewerForobuLoansIssuedCollection) {
        this.secondaryReviewerForobuLoansIssuedCollection = secondaryReviewerForobuLoansIssuedCollection;
    }

    public String getSecondaryReviewerForobuLoansIssuedOpenAccount() {
        return secondaryReviewerForobuLoansIssuedOpenAccount;
    }

    public void setSecondaryReviewerForobuLoansIssuedOpenAccount(String secondaryReviewerForobuLoansIssuedOpenAccount) {
        this.secondaryReviewerForobuLoansIssuedOpenAccount = secondaryReviewerForobuLoansIssuedOpenAccount;
    }

    public String getSecondaryReviewerForobuLoanssettledReports() {
        return secondaryReviewerForobuLoanssettledReports;
    }

    public void setSecondaryReviewerForobuLoanssettledReports(String secondaryReviewerForobuLoanssettledReports) {
        this.secondaryReviewerForobuLoanssettledReports = secondaryReviewerForobuLoanssettledReports;
    }

    public String getExcelFileLocation() {
        return excelFileLocation;
    }

    public void setExcelFileLocation(String excelFileLocation) {
        this.excelFileLocation = excelFileLocation;
    }

    public String getInventoryReportDatadump() {
        return inventoryReportDatadump;
    }

    public void setInventoryReportDatadump(String inventoryReportDatadump) {
        this.inventoryReportDatadump = inventoryReportDatadump;
    }

    public String getBillInInitialDueDatadump() {
        return billInInitialDueDatadump;
    }

    public void setBillInInitialDueDatadump(String billInInitialDueDatadump) {
        this.billInInitialDueDatadump = billInInitialDueDatadump;
    }

    public String getBillInFinalDueDatadump() {
        return billInFinalDueDatadump;
    }

    public void setBillInFinalDueDatadump(String billInFinalDueDatadump) {
        this.billInFinalDueDatadump = billInFinalDueDatadump;
    }

    public String getSettledBillAndCollectionDatadump() {
        return settledBillAndCollectionDatadump;
    }

    public void setSettledBillAndCollectionDatadump(String settledBillAndCollectionDatadump) {
        this.settledBillAndCollectionDatadump = settledBillAndCollectionDatadump;
    }

    public String getLoansOutstandingDatadump() {
        return loansOutstandingDatadump;
    }

    public void setLoansOutstandingDatadump(String loansOutstandingDatadump) {
        this.loansOutstandingDatadump = loansOutstandingDatadump;
    }

    public String getLoanIssuedBillDatadump() {
        return loanIssuedBillDatadump;
    }

    public void setLoanIssuedBillDatadump(String loanIssuedBillDatadump) {
        this.loanIssuedBillDatadump = loanIssuedBillDatadump;
    }

    public String getLoanSettledDatadump() {
        return loanSettledDatadump;
    }

    public void setLoanSettledDatadump(String loanSettledDatadump) {
        this.loanSettledDatadump = loanSettledDatadump;
    }

    public String getBlockedMT103ReportDatadump() {
        return blockedMT103ReportDatadump;
    }

    public void setBlockedMT103ReportDatadump(String blockedMT103ReportDatadump) {
        this.blockedMT103ReportDatadump = blockedMT103ReportDatadump;
    }

    public String getLoansIssuedOpenTRDatadump() {
        return loansIssuedOpenTRDatadump;
    }

    public void setLoansIssuedOpenTRDatadump(String loansIssuedOpenTRDatadump) {
        this.loansIssuedOpenTRDatadump = loansIssuedOpenTRDatadump;
    }

    public String getLoansIssuedCollectionDatadump() {
        return loansIssuedCollectionDatadump;
    }

    public void setLoansIssuedCollectionDatadump(String loansIssuedCollectionDatadump) {
        this.loansIssuedCollectionDatadump = loansIssuedCollectionDatadump;
    }

    public String getEdmsInventoryReport() {
        return edmsInventoryReport;
    }

    public void setEdmsInventoryReport(String edmsInventoryReport) {
        this.edmsInventoryReport = edmsInventoryReport;
    }

    public String getBlockedMT103Report() {
        return blockedMT103Report;
    }

    public void setBlockedMT103Report(String blockedMT103Report) {
        this.blockedMT103Report = blockedMT103Report;
    }


    public String getPrimaryReviewerForEdmsInventoryReport() {
        return primaryReviewerForEdmsInventoryReport;
    }

    public void setPrimaryReviewerForEdmsInventoryReport(String primaryReviewerForEdmsInventoryReport) {
        this.primaryReviewerForEdmsInventoryReport = primaryReviewerForEdmsInventoryReport;
    }

    public String getPrimaryReviewerForBlockedMT103Report() {
        return primaryReviewerForBlockedMT103Report;
    }

    public void setPrimaryReviewerForBlockedMT103Report(String primaryReviewerForBlockedMT103Report) {
        this.primaryReviewerForBlockedMT103Report = primaryReviewerForBlockedMT103Report;
    }

    public String getSecondaryreviewerForEdmsInventoryReport() {
        return secondaryreviewerForEdmsInventoryReport;
    }

    public void setSecondaryreviewerForEdmsInventoryReport(String secondaryreviewerForEdmsInventoryReport) {
        this.secondaryreviewerForEdmsInventoryReport = secondaryreviewerForEdmsInventoryReport;
    }

    public String getSecondaryReviewerForBlockedMT103Report() {
        return secondaryReviewerForBlockedMT103Report;
    }

    public void setSecondaryReviewerForBlockedMT103Report(String secondaryReviewerForBlockedMT103Report) {
        this.secondaryReviewerForBlockedMT103Report = secondaryReviewerForBlockedMT103Report;
    }

    public String getReportOwnerForobuLoanssettledReports() {
        return reportOwnerForobuLoanssettledReports;
    }

    public void setReportOwnerForobuLoanssettledReports(String reportOwnerForobuLoanssettledReports) {
        this.reportOwnerForobuLoanssettledReports = reportOwnerForobuLoanssettledReports;
    }

    public String getLoanssettlementReportDatadump() {
        return loanssettlementReportDatadump;
    }

    public void setLoanssettlementReportDatadump(String loanssettlementReportDatadump) {
        this.loanssettlementReportDatadump = loanssettlementReportDatadump;
    }

    public String getBillssettlementReportDatadump() {
        return billssettlementReportDatadump;
    }

    public void setBillssettlementReportDatadump(String billssettlementReportDatadump) {
        this.billssettlementReportDatadump = billssettlementReportDatadump;
    }

    public String getActivebillsReportDatadump() {
        return activebillsReportDatadump;
    }

    public void setActivebillsReportDatadump(String activebillsReportDatadump) {
        this.activebillsReportDatadump = activebillsReportDatadump;
    }

    public String getBillsClosureReportDatadump() {
        return billsClosureReportDatadump;
    }

    public void setBillsClosureReportDatadump(String billsClosureReportDatadump) {
        this.billsClosureReportDatadump = billsClosureReportDatadump;
    }

    public String getTradeLoansReportDatadump() {
        return tradeLoansReportDatadump;
    }

    public void setTradeLoansReportDatadump(String tradeLoansReportDatadump) {
        this.tradeLoansReportDatadump = tradeLoansReportDatadump;
    }

    public String getLegalisationReportDatadump() {
        return legalisationReportDatadump;
    }

    public void setLegalisationReportDatadump(String legalisationReportDatadump) {
        this.legalisationReportDatadump = legalisationReportDatadump;
    }

    public String getBcrefReportsDatadump() {
        return bcrefReportsDatadump;
    }

    public void setBcrefReportsDatadump(String bcrefReportsDatadump) {
        this.bcrefReportsDatadump = bcrefReportsDatadump;
    }

    public String getLoanssettlementReport() {
        return loanssettlementReport;
    }

    public void setLoanssettlementReport(String loanssettlementReport) {
        this.loanssettlementReport = loanssettlementReport;
    }

    public String getBillssettlementReport() {
        return billssettlementReport;
    }

    public void setBillssettlementReport(String billssettlementReport) {
        this.billssettlementReport = billssettlementReport;
    }

    public String getActivebillsReport() {
        return activebillsReport;
    }

    public void setActivebillsReport(String activebillsReport) {
        this.activebillsReport = activebillsReport;
    }

    public String getBillsClosureReport() {
        return billsClosureReport;
    }

    public void setBillsClosureReport(String billsClosureReport) {
        this.billsClosureReport = billsClosureReport;
    }

    public String getTradeLoansReport() {
        return tradeLoansReport;
    }

    public void setTradeLoansReport(String tradeLoansReport) {
        this.tradeLoansReport = tradeLoansReport;
    }

    public String getLegalisationReport() {
        return legalisationReport;
    }

    public void setLegalisationReport(String legalisationReport) {
        this.legalisationReport = legalisationReport;
    }

    public String getBcrefReports() {
        return bcrefReports;
    }

    public void setBcrefReports(String bcrefReports) {
        this.bcrefReports = bcrefReports;
    }

    public String getReportOwnerForloanssettlementReport() {
        return reportOwnerForloanssettlementReport;
    }

    public void setReportOwnerForloanssettlementReport(String reportOwnerForloanssettlementReport) {
        this.reportOwnerForloanssettlementReport = reportOwnerForloanssettlementReport;
    }

    public String getReportOwnerForbillssettlementReport() {
        return reportOwnerForbillssettlementReport;
    }

    public void setReportOwnerForbillssettlementReport(String reportOwnerForbillssettlementReport) {
        this.reportOwnerForbillssettlementReport = reportOwnerForbillssettlementReport;
    }

    public String getReportOwnerForactivebillsReport() {
        return reportOwnerForactivebillsReport;
    }

    public void setReportOwnerForactivebillsReport(String reportOwnerForactivebillsReport) {
        this.reportOwnerForactivebillsReport = reportOwnerForactivebillsReport;
    }

    public String getReportOwnerForbillsClosureReport() {
        return reportOwnerForbillsClosureReport;
    }

    public void setReportOwnerForbillsClosureReport(String reportOwnerForbillsClosureReport) {
        this.reportOwnerForbillsClosureReport = reportOwnerForbillsClosureReport;
    }

    public String getReportOwnerFortradeLoansReport() {
        return reportOwnerFortradeLoansReport;
    }

    public void setReportOwnerFortradeLoansReport(String reportOwnerFortradeLoansReport) {
        this.reportOwnerFortradeLoansReport = reportOwnerFortradeLoansReport;
    }

    public String getReportOwnerForlegalisationReport() {
        return reportOwnerForlegalisationReport;
    }

    public void setReportOwnerForlegalisationReport(String reportOwnerForlegalisationReport) {
        this.reportOwnerForlegalisationReport = reportOwnerForlegalisationReport;
    }

    public String getReportOwnerForbcrefReports() {
        return reportOwnerForbcrefReports;
    }

    public void setReportOwnerForbcrefReports(String reportOwnerForbcrefReports) {
        this.reportOwnerForbcrefReports = reportOwnerForbcrefReports;
    }

    public String getPrimaryReviewerForloanssettlementReport() {
        return primaryReviewerForloanssettlementReport;
    }

    public void setPrimaryReviewerForloanssettlementReport(String primaryReviewerForloanssettlementReport) {
        this.primaryReviewerForloanssettlementReport = primaryReviewerForloanssettlementReport;
    }

    public String getPrimaryReviewerForbillssettlementReport() {
        return primaryReviewerForbillssettlementReport;
    }

    public void setPrimaryReviewerForbillssettlementReport(String primaryReviewerForbillssettlementReport) {
        this.primaryReviewerForbillssettlementReport = primaryReviewerForbillssettlementReport;
    }

    public String getPrimaryReviewerForactivebillsReport() {
        return primaryReviewerForactivebillsReport;
    }

    public void setPrimaryReviewerForactivebillsReport(String primaryReviewerForactivebillsReport) {
        this.primaryReviewerForactivebillsReport = primaryReviewerForactivebillsReport;
    }

    public String getPrimaryReviewerForbillsClosureReport() {
        return primaryReviewerForbillsClosureReport;
    }

    public void setPrimaryReviewerForbillsClosureReport(String primaryReviewerForbillsClosureReport) {
        this.primaryReviewerForbillsClosureReport = primaryReviewerForbillsClosureReport;
    }

    public String getPrimaryReviewerFortradeLoansReport() {
        return primaryReviewerFortradeLoansReport;
    }

    public void setPrimaryReviewerFortradeLoansReport(String primaryReviewerFortradeLoansReport) {
        this.primaryReviewerFortradeLoansReport = primaryReviewerFortradeLoansReport;
    }

    public String getPrimaryReviewerForlegalisationReport() {
        return primaryReviewerForlegalisationReport;
    }

    public void setPrimaryReviewerForlegalisationReport(String primaryReviewerForlegalisationReport) {
        this.primaryReviewerForlegalisationReport = primaryReviewerForlegalisationReport;
    }

    public String getPrimaryReviewerForbcrefReports() {
        return primaryReviewerForbcrefReports;
    }

    public void setPrimaryReviewerForbcrefReports(String primaryReviewerForbcrefReports) {
        this.primaryReviewerForbcrefReports = primaryReviewerForbcrefReports;
    }

    public String getSecondaryReviewerForloanssettlementReport() {
        return secondaryReviewerForloanssettlementReport;
    }

    public void setSecondaryReviewerForloanssettlementReport(String secondaryReviewerForloanssettlementReport) {
        this.secondaryReviewerForloanssettlementReport = secondaryReviewerForloanssettlementReport;
    }

    public String getSecondaryReviewerForbillssettlementReport() {
        return secondaryReviewerForbillssettlementReport;
    }

    public void setSecondaryReviewerForbillssettlementReport(String secondaryReviewerForbillssettlementReport) {
        this.secondaryReviewerForbillssettlementReport = secondaryReviewerForbillssettlementReport;
    }

    public String getSecondaryReviewerForactivebillsReport() {
        return secondaryReviewerForactivebillsReport;
    }

    public void setSecondaryReviewerForactivebillsReport(String secondaryReviewerForactivebillsReport) {
        this.secondaryReviewerForactivebillsReport = secondaryReviewerForactivebillsReport;
    }

    public String getSecondaryReviewerForbillsClosureReport() {
        return secondaryReviewerForbillsClosureReport;
    }

    public void setSecondaryReviewerForbillsClosureReport(String secondaryReviewerForbillsClosureReport) {
        this.secondaryReviewerForbillsClosureReport = secondaryReviewerForbillsClosureReport;
    }

    public String getSecondaryReviewerFortradeLoansReport() {
        return secondaryReviewerFortradeLoansReport;
    }

    public void setSecondaryReviewerFortradeLoansReport(String secondaryReviewerFortradeLoansReport) {
        this.secondaryReviewerFortradeLoansReport = secondaryReviewerFortradeLoansReport;
    }

    public String getSecondaryReviewerForlegalisationReport() {
        return secondaryReviewerForlegalisationReport;
    }

    public void setSecondaryReviewerForlegalisationReport(String secondaryReviewerForlegalisationReport) {
        this.secondaryReviewerForlegalisationReport = secondaryReviewerForlegalisationReport;
    }

    public String getSecondaryReviewerForbcrefReports() {
        return secondaryReviewerForbcrefReports;
    }

    public void setSecondaryReviewerForbcrefReports(String secondaryReviewerForbcrefReports) {
        this.secondaryReviewerForbcrefReports = secondaryReviewerForbcrefReports;
    }
}