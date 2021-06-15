package com.spring.ioc.xml_config;

import com.spring.ioc.version_one.Coach;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run 5 miles everyday";
    }

}
