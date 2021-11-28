package com.fragma.dto;

public class SummaryHtml {

    private String reportOwner;
    private String primaryReviewer;
    private String secondaryReviewer;
    private String totalFlaggedTransactions="";


    public String getReportOwner() {
        return reportOwner;
    }

    public void setReportOwner(String reportOwner) {
        this.reportOwner = reportOwner;
    }

    public String getPrimaryReviewer() {
        return primaryReviewer;
    }

    public void setPrimaryReviewer(String primaryReviewer) {
        this.primaryReviewer = primaryReviewer;
    }

    public String getSecondaryReviewer() {
        return secondaryReviewer;
    }

    public void setSecondaryReviewer(String secondaryReviewer) {
        this.secondaryReviewer = secondaryReviewer;
    }

    public String getTotalFlaggedTransactions() {
        return totalFlaggedTransactions;
    }

    public void setTotalFlaggedTransactions(String totalFlaggedTransactions) {
        this.totalFlaggedTransactions = totalFlaggedTransactions;
    }
}
