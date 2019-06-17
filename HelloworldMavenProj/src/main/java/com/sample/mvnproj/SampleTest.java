package com.sample.mvnproj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class SampleTest {

	private static final Logger Log = LoggerFactory.getLogger(SampleTest.class);
    public static void main( String[] args )
    {
    	try {
        ArrayList<String> employeeList = new ArrayList<String>();
        
          employeeList.add("Empployee1");
          employeeList.add("Empployee2");
          employeeList.add("Empployee3");
          employeeList.add("Empployee4");
          employeeList.add("Empployee5");
          employeeList.add("Empployee6");
          employeeList.add("Empployee7");
          employeeList.add("Empployee8");
          
          
         
          Log.debug("employeelist details->{}"+employeeList);
          
          //Log.info("employeeList size::"+employeeList.size()); // invalid
          Log.info("employeeList  size {} ::",employeeList.size()); // valid
    	}catch(Exception e) {
    		Log.error("Error in SampleTest::{}",e);
    	}
    }
    
}
