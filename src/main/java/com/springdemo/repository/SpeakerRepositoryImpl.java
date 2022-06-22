package com.springdemo.repository;

import com.springdemo.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class SpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findall() {

        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("Govardhan");
        speaker.setLastName("Reddy");
        speakers.add(speaker);

        speakers.add(speaker);
        return speakers;
    }

}
