package com.bek.stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bek.helpers.ExecutionHelper;
import com.bek.helpers.LocalDriverManager;
import com.bek.page_objects.HomePage;
import com.bek.utils.DataHelper;
import com.bek.utils.Utils;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LoginPageStepDefs {

	Utils utility = new Utils();
	HomePage homepage = new HomePage();

	@Given("I login as a registered user")
	public void i_login_as_a_registered_user() throws Throwable {
		try {
			utility.SendKeys(homepage.Username(),"testsree@gmail.com");
			utility.SendKeys(homepage.Password(),"1234");
			utility.click(homepage.Login(),"Login Button");
			LocalDriverManager.getDriver().get("https://accstorefront.clelkh39mt-benekeith1-s1-public.model-t.cc.commerce.ondemand.com/");
			utility.waitTime();
			/*WebDriverWait wait = new WebDriverWait(LocalDriverManager.getDriver(), 30);
			utility.waitForPageToBeReady();
			if(LocalDriverManager.getDriver().getCurrentUrl().contains("/sso/")) {
				wait.until(ExpectedConditions.elementToBeClickable(homepage.SSOLogin()));
				if(homepage.SSOUsername().isDisplayed()){
					WebDriverWait wait1 = new WebDriverWait(LocalDriverManager.getDriver(), 30);
					wait1.until(ExpectedConditions.urlContains("/sso/"));
					utility.waitForPageToBeReady();
					utility.SendKeys(homepage.SSOUsername(), "ckent@madeupdomain.com");
					utility.SendKeys(homepage.SSOPassword(), "xIx%FV2iB#y1");
					ExecutionHelper.getLogger().log(LogStatus.PASS, "Email, Password fields are displayed and values are entered");
					utility.click(homepage.SSOLogin(), "Login");
					utility.waitTime();
				}
			}else {
				wait.until(ExpectedConditions.elementToBeClickable(homepage.Login()));
				if(homepage.Username().isDisplayed()){
					utility.SendKeys(homepage.Username(), DataHelper.getRegisteredUser("RegisteredUser1"));
					utility.SendKeys(homepage.Password(), DataHelper.getPassword("RegisteredUser1"));
					ExecutionHelper.getLogger().log(LogStatus.PASS, "Email, Password fields are displayed and values are entered");
					homepage.Password().sendKeys(Keys.chord(Keys.TAB));
					homepage.Password().sendKeys(Keys.chord(Keys.ENTER));
					ExecutionHelper.getLogger().log(LogStatus.PASS, "Successfully clicked on Login Button");
					LocalDriverManager.getDriver().navigate().to("https://accstorefront.clelkh39mt-benekeith1-s1-public.model-t.cc.commerce.ondemand.com/");
					utility.waitTime();
				}
			}*/
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL,
					"Exception " + e + " occured while login as registered user");
		}
	}
}
