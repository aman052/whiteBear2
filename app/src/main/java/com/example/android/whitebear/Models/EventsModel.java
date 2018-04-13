package com.example.android.whitebear.Models;

/**
 * Created by dellpc on 3/19/2018.
 */

public class EventsModel {

    private String cusId;
    private String eventType;
    private String cusname;
    private String eventId;
    private String eventVenue;
    private String guestCount;
    private String cuisineType;

    public EventsModel(String cusId, String cusname,String eventId,String eventType, String eventVenue,String guestCount,String cuisineType) {
        this.cusId = cusId;
        this.eventType = eventType;
        this.eventVenue = eventVenue;
        this.cusname=cusname;
        this.eventId=eventId;
        this.guestCount=guestCount;
        this.cuisineType=cuisineType;
    }

    public String getCusId() {
        return cusId;
    }

    public String getEventType() {
        return eventType;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public String getCusname() {
        return cusname;
    }

    public String getEventId() {
        return eventId;
    }

    public String getGuestCount() {
        return guestCount;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public void setGuestCount(String guestCount) {
        this.guestCount = guestCount;
    }

}
