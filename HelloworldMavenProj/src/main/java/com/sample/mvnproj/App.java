package com.sample.mvnproj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App 
{
	private static final Logger Log = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Log.info("This is sample information logs");
    }
}
