package com.bsuir.realtystore.utils.loggerFactory;

public class DatabaseLogger implements Logger {
    @Override
    public String log(String message) {
        return "Logging to database: " + message;
    }
}
