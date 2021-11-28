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
}