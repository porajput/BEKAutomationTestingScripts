package com.bek.stepdefinitions;

import java.util.HashMap;
import java.util.List;

import com.bek.helpers.ExecutionHelper;
import com.bek.helpers.LocalDriverManager;
import com.bek.helpers.WebDriverHelp;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class Hooks {
	
	public List<HashMap<String,String>> datamap;
	ExecutionHelper helper = new ExecutionHelper();
	
	
    @Before
    public void beforeScenario(Scenario scenario) throws Throwable {
    	String scenarioName = scenario.getName();
		String featureName = scenario.getId().split(";")[0]; 
		String value = featureName.split("features/")[1];
		String FeatureName = value.split(".feature")[0];
		System.out.println("featureName : "+value.split(".feature")[0]);
		System.out.println("scenarioName : "+scenarioName);
		WebDriverHelp.driverSetup(FeatureName,scenarioName);
		ExecutionHelper.startTest(value.split(".feature")[0]+" : "+scenarioName); 
    }
    
    @After
	public void endTestExecution(){
		//LocalDriverManager.getDriver().quit();
		try {
			ExecutionHelper.extentReportFlush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
   
    
}

