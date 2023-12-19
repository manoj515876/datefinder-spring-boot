package com.example.datefinder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@RestController
public class MyController {
    @GetMapping
    public String getDays() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 100);
        String dateAfter = sdf.format(cal.getTime());
        return dateAfter;
    }
}
