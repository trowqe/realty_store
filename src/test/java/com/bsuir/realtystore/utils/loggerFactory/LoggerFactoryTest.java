package com.bsuir.realtystore.utils.loggerFactory;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LoggerFactoryTest {

    @Test
    void testFileLogger() {
        Logger logger = LoggerFactory.getLogger(LoggerFactory.LoggerType.FILE);
        assertEquals("Logging to file: message", logger.log("message"));
    }

    @Test
    void testDatabaseLogger() {
        Logger logger = LoggerFactory.getLogger(LoggerFactory.LoggerType.DATABASE);
        assertEquals("Logging to database: message", logger.log("message"));
    }


}
