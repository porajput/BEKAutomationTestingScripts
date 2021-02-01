package com.bek.helpers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.Scenario;

public class ExecutionHelper {

	public static ExtentReports extent;
	public static Scenario scenario = null;
	public static ThreadLocal<ExtentTest> logger = new ThreadLocal<ExtentTest>();
	public static boolean isExecuted;
	static {
		try {
			extentReportInitialize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String scenarioName(){
		String scenarioName = scenario.getName();
		System.out.println("Scenario"+scenarioName);
		String featureName = scenario.getId().split(";")[0]; 
		return scenarioName;
	}

	public static void extentReportInitialize() throws Exception {
		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS");
			Date date = new Date();
			String extentReportLocation = System.getProperty("user.dir")+"/ExtentReports/BEKReport"+dateFormat.format(date)+".html";
			System.out.println("extentReport" + extentReportLocation);
			System.out.println("SystemDirectory"+System.getProperty("user.dir"));
			extent = new ExtentReports(extentReportLocation, true);

		} catch (Exception exception) {
		}
	}

	public static void startTest(String scenarioID) throws Throwable{
		try {
			setLogger(extent.startTest(scenarioID));
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public static void setLogger(ExtentTest test){
		logger.set(test);
	}
	public static ExtentTest getLogger(){
		return logger.get();
	}


	public static void extentReportFlush() throws Exception {
		try {
			extent.endTest(getLogger());
			extent.flush();
		} catch (Exception exception) {
		}
	} 

}
