package com.bilgeadam.log4jexample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4JExample {

    static final Logger logger = Logger.getLogger(Log4JExample.class.getName());

    public static void main(String[] args) {
        PropertyConfigurator.configure("BilgeAdam-12\\src\\log4j.properties");
        Log4JExample example = new Log4JExample();
        example.test_logging("Bilgeadam");
    }

    private void test_logging(String text) {

        logger.trace("Trace logging : " + text);
        logger.debug("Debug logging : " + text);
        logger.info("Info logging : " + text);
        logger.warn("Warn logging : " + text);
        logger.fatal("Fatal logging : " + text);

    }
}
