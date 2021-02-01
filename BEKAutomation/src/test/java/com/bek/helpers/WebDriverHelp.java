package com.bek.helpers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ThreadGuard;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverHelp {
	private static String BROWSER;
	private static String PLATFORM;
	public static URL basePath;
	private static final String RUN_CONFIG_PROPERTIES = "/environment.properties";

	public static void driverSetup(String FeatureName , String ScenarioName) throws Throwable{

		Props.loadRunConfigProps(RUN_CONFIG_PROPERTIES);
		BROWSER = Props.getProp("browser");
		try {
			if (Props.getProp("environment").equalsIgnoreCase("QA")){
				basePath = new URL(Props.getProp("QA.site.url"));
			}else if (Props.getProp("environment").equalsIgnoreCase("QA2")) {
				basePath = new URL(Props.getProp("QA2.site.url"));
			} 
			else if (Props.getProp("environment").equalsIgnoreCase("STAGE")) {
				basePath = new URL(Props.getProp("STAGE.site.url"));
			}
			else {
				System.out.println("NOT a Valid env");	
			}

		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}


		try {
			System.gc();
			switch (BROWSER.toLowerCase()) {
			case ("chrome"):
				startChromeDriver(FeatureName,ScenarioName);
			break;
			case ("firefox"):
				startFireFoxDriver();
			break;
			case ("iexplore"):
				startIEDriver();
			break;
			case ("edge"):
				startEdgeDriver();
			break;
			default:
				throw new IllegalArgumentException("Browser " + BROWSER + " or Platform "
						+ PLATFORM + " type not supported");
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}


	public static void startEdgeDriver() throws Throwable{
		try{
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.setCapability("InPrivate", true);
			WebDriver driver = ThreadGuard.protect(new EdgeDriver(options));
			LocalDriverManager.setWebDriver(driver);
			LocalDriverManager.getDriver().manage().window().maximize();
			LocalDriverManager.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			startAtHomePage();
		}catch (Exception e ){
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception occured while launching the Edge browser "+e);
			e.printStackTrace();
			System.out.println("Exception" + e );
		}
	}
	public static void startFireFoxDriver() throws Throwable{
		try{
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = ThreadGuard.protect(new FirefoxDriver());
			LocalDriverManager.setWebDriver(driver);
			LocalDriverManager.getDriver().manage().window().maximize();
			LocalDriverManager.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			startAtHomePage();
		}catch (Exception e ){
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception occured while launching the Firefox browser "+e);
			e.printStackTrace();
			System.out.println("Exception" + e );
		}
	}
	public static void startAtHomePage() throws Throwable {
		try{
			LocalDriverManager.getDriver().navigate().to(basePath);	
		}catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception occured while landing on the Home Page "+e);
			e.printStackTrace();
			System.out.println("Exception" + e );
		}
	}

	private static void startChromeDriver(String FeatureName , String ScenarioName) throws Throwable {
		try{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = ThreadGuard.protect(new ChromeDriver());
			LocalDriverManager.setWebDriver(driver);
			LocalDriverManager.getDriver().manage().window().maximize();
			LocalDriverManager.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			startAtHomePage();
		}catch (Exception e ){
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception occured while launching the chrome browser "+e);
			e.printStackTrace();
			System.out.println("Exception" + e );
		}
	}

	private static void startIEDriver() throws Throwable{
		try{
			WebDriverManager.iedriver().setup();
			WebDriver driver = ThreadGuard.protect(new InternetExplorerDriver());
			LocalDriverManager.setWebDriver(driver);
			LocalDriverManager.getDriver().manage().window().maximize();
			LocalDriverManager.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			startAtHomePage();
		}catch (Exception e ){
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception occured while launching the chrome browser "+e);
			e.printStackTrace();
			System.out.println("Exception" + e );
		}
	}

	public static void resizeBrowserWindow(Dimension dimension) {
		LocalDriverManager.getDriver().manage().window().setSize(dimension);
	}

	public static void quitDriver(){
		LocalDriverManager.getDriver().quit();
	}

}