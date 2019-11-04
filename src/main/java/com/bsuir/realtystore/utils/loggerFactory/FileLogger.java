package com.bsuir.realtystore.utils.loggerFactory;

public class FileLogger implements Logger {
    @Override
    public String log(String message) {
       return "Logging to file: " + message;
    }
}
