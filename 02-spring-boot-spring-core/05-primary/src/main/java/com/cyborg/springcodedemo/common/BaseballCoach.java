package com.cyborg.springcodedemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice daily for basketball coach";
    }
}
