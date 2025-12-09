package com.example;

import org.junit.jupiter.api.Test;

import lombok.extern.log4j.Log4j2;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
public class AppTest {
    @Test
    public void testAppRuns() {
        log.debug("debug test");
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
