package com.sample.mvnproj;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App 
{
	private static final Logger Log = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Log.info("This is sample information logs test");
        
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
        
        Log.info("Current date:"+date);
        List<String> listObject = new ArrayList<String>();
        listObject.add("per1");
        listObject.add("per2");
        listObject.add("per3");
        listObject.add("per4");
        listObject.add("per5");
        
        for(String item : listObject) {
        	System.out.println("output::"+item);
        }
    }
}
