package com.knoldus.runningtimeapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping(path = "/time")
public class Controller {

    /**
     * getRunningTime()
     * @return Return a String with the current time in HH:mm:ss format
     */
    @GetMapping(path="/status")
    public String getRunningTime()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String formatDateTime = now.format(formatter);

        return "Running, " + formatDateTime;
    }
}
