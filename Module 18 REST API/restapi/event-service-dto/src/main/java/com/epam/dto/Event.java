package com.epam.dto;

public class Event {
    private String title;
    private String place;
    private String speaker;
    private String eventType;
    private String dateTime;
    private int id;

    public Event(String title, String place, String speaker, String eventType,
        String dateTime, int id) {
        this.title = title;
        this.place = place;
        this.speaker = speaker;
        this.eventType = eventType;
        this.dateTime = dateTime;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getPlace() {
        return place;
    }

    public String getSpeaker() {
        return speaker;
    }

    public String getEventType() {
        return eventType;
    }

    public String getDateTime() {
        return dateTime;
    }

    public int getID() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setId(int id) {
        this.id = id;
    }
}
