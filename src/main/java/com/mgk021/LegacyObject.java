package com.mgk021;

public class LegacyObject {

    public String sendSms() {
        //Get the Service from the Bridge
        EventService eventService = SpringContextBridge.services().getEventService();
        return eventService.sendSms();
    }

}
