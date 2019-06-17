package com.sample.mvnproj;

import org.apache.log4j.Logger;

public class App1 {
	private static Logger logger = Logger.getLogger(App1.class);
    public static void main( String[] args )
    {
    	logger.debug("Log4jExample: A Sample Debug Message");
        logger.info("Log4jExample: A Sample Info  Message");
        logger.warn("Log4jExample: A Sample Warn  Message");
        logger.error("Log4jExample: A Sample Error Message");
        logger.fatal("Log4jExample: A Sample Fatal Message"); 
    }
}
