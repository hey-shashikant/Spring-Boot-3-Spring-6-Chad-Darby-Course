package com.cyborg.springcodedemo.common;

import com.cyborg.springcodedemo.common.Coach;
import org.springframework.stereotype.Component;

// component annotation marks the class ready of injection
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minuties!!!!";
    }
}
