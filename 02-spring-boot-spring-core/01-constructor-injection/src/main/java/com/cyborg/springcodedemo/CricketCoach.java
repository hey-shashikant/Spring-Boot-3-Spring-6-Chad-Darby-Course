package com.cyborg.springcodedemo;

import org.springframework.stereotype.Component;

// component annotation marks the class ready of injection
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minuties.";
    }
}
