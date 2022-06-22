package com.springdemo;

import com.springdemo.service.SpeakerService;
import com.springdemo.service.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {
        SpeakerService speakerService = new SpeakerServiceImpl();
        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}
