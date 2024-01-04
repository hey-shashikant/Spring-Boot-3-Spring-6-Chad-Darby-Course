package com.cyborg.springcodedemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice daily for Tennis Coach";
    }
}
