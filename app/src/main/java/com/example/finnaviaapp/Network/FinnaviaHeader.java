package com.example.finnaviaapp.Network;

public class FinnaviaHeader {
    private String timeStamp;
    private String from;
    private String description;

    public FinnaviaHeader(String timeStamp, String from, String description) {
        this.timeStamp = timeStamp;
        this.from = from;
        this.description = description;
    }

    public FinnaviaHeader() {
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
