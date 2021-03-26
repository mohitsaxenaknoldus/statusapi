package com.knoldus.runningtimeapi;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ControllerTest {

    @org.junit.Test
    public void getRunningTime() {
        Controller controller = new Controller();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String formatDateTime = now.format(formatter);

        assertEquals(controller.getRunningTime(), "Running, " + formatDateTime);
    }
}