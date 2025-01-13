package com.mgk021;


import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService{
    @Override
    public String sendSms() {
        return "text..";
    }
}
