package com.nt.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wf")

public class WeekDayFinder {
    
    private final LocalDate localDate;

    // Constructor Injection
    @Autowired
    public WeekDayFinder(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String isWeekend() {
        DayOfWeek day = localDate.getDayOfWeek();
        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY)
        	return "weekend";
        else
        	return "not weekend";
    }
}