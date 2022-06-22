package com.springdemo.service;

import com.springdemo.model.Speaker;
import com.springdemo.repository.SpeakerRepository;
import com.springdemo.repository.SpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository = new SpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return speakerRepository.findall();
    }
}
