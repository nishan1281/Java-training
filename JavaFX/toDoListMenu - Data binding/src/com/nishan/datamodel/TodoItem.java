package com.nishan.datamodel;

import java.time.LocalDate;

public class TodoItem {
    private String shortDescription;
    private String details;
    private LocalDate deadlines;

    public TodoItem(String shortDescription, String details, LocalDate deadlines) {
        this.shortDescription = shortDescription;
        this.details = details;
        this.deadlines = deadlines;
    }

    public String getShortDescription() { return shortDescription; }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeadlines() {
        return deadlines;
    }

    public void setDeadlines(LocalDate deadlines) {
        this.deadlines = deadlines;
    }

    // toString is not required if celFectory is used in controller
//    @Override
//    public String toString() {
//        return  shortDescription ;
//    }
}
