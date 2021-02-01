package com.bek.stepdefinitions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bek.helpers.ExecutionHelper;
import com.bek.helpers.LocalDriverManager;
import com.bek.page_objects.RegistrationPage;
import com.bek.utils.Utils;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationPageStepDefs {
	
	Utils utility = new Utils();
	RegistrationPage BEKregpage = new RegistrationPage();
	
	@When("I navigate to registration section")
	public void i_navigate_to_registration_section() throws Throwable {
		try {
			LocalDriverManager.getDriver().navigate().to("https://accstorefront.clelkh39mt-benekeith1-s1-public.model-t.cc.commerce.ondemand.com/register");
			WebDriverWait wait = new WebDriverWait(LocalDriverManager.getDriver(), 30);
			wait.until(ExpectedConditions.urlContains("register"));
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while entering the fields");
		}
	}
	
	@Given("I enter the user data for the registration")
	public void i_enter_the_user_data_for_the_registration() throws Throwable {
		try {
			utility.SendKeys(BEKregpage.EnterEmailAddress(), Utils.generateRandomAlphabetsString(15)+ "@gmail.com");
			utility.SendKeys(BEKregpage.EnterFirstName(), Utils.generateRandomAlphabetsString(10)); 
			utility.SendKeys(BEKregpage.EnterLastName(), Utils.generateRandomAlphabetsString(10));
			utility.SendKeys(BEKregpage.EnterCustomerNumber(), Utils.generateRandomNumber(10));
			utility.SendKeys(BEKregpage.EnterBusinessName(), Utils.generateRandomAlphabetsString(15));
			BEKregpage.selectDivisionDropDown("Albuquerque");
			utility.SendKeys(BEKregpage.EnterCity(), Utils.generateRandomAlphabetsString(9));
			utility.SendKeys(BEKregpage.EnterState(), Utils.generateRandomAlphabetsString(15));
			utility.click(BEKregpage.RegisterButton(), "Register");
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while entering the fields");
		}
	}

	@Then("I validate the user Registration")
	public void i_validate_the_user_Registration() throws Throwable {
		utility.verifyWebElementTextContains(BEKregpage.RegisterationSuccessful(), "Your sign up request has been successfully submitted!");
	}

	@Given("I click on the register button by passing empty fields")
	public void i_click_on_the_register_button_by_passing_empty_fields() throws Throwable {
		try {
			utility.click(BEKregpage.RegisterButton(), "Register");
		}catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while clicking on the register button  by passing empty fields");
		}
	}

	@Then("I validate the corresponding error messages")
	public void i_validate_the_corresponding_error_messages() throws Throwable {
		try {
			utility.verifyWebElementTextContains(BEKregpage.getEmailErrorMsg(), "Email address is required");
			utility.verifyWebElementTextContains(BEKregpage.getFirstNameErrorMsg(), "First Name is required");
			utility.verifyWebElementTextContains(BEKregpage.getLastNameErrorMsg(), "Last Name is required");
			utility.verifyWebElementTextContains(BEKregpage.getCustomerNumberErrorMsg(), "Customer Number is required");
			utility.verifyWebElementTextContains(BEKregpage.getBusinessNameErrorMsg(), "Business Name is required");
			utility.verifyWebElementTextContains(BEKregpage.getDivisionDropDownErrorMsg(), "Division is required");
			utility.verifyWebElementTextContains(BEKregpage.getCityErrorMsg(), "City is required");
			utility.verifyWebElementTextContains(BEKregpage.getStateErrorMsg(), "State is required");
		}catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while validating the error messages");
		}
	    
	}
	

	

}