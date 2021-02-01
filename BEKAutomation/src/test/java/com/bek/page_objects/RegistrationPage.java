package com.bek.page_objects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bek.helpers.ExecutionHelper;
import com.bek.helpers.LocalDriverManager;
import com.bek.utils.Utils;
import com.relevantcodes.extentreports.LogStatus;

public class RegistrationPage {

	public By EmailAddress_Locator = By.id("email");
	public By EmailAddressError_Locator = By.xpath("//*[@id='parsley-id-5']/span");
	public By FirstName_Locator = By.id("firstName");
	public By FirstNameError_Locator = By.xpath("//*[@id='parsley-id-7']/span");
	public By LastName_Locator = By.id("lastName");
	public By LastNameError_Locator = By.xpath("//*[@id='parsley-id-9']/span");
	public By CustomerNumber_Locator = By.id("customerNumber");
	public By CustomerNumberError_Locator = By.xpath("//*[@id='parsley-id-11']/span");
	public By BusinessName_Locator = By.id("businessName");
	public By BusinessNameError_Locator = By.xpath("//*[@id='parsley-id-13']/span");
	public By DivisionDropDown_Locator = By.xpath("//*[@id='division']");
	public By list_dropdown_Locator = By.xpath("//div[contains(@class,'list-group js-list-group')]//button");
	public By DivisionDropDownError_Locator = By.xpath("//*[@id='parsley-id-15']/span");
	public By City_Locator = By.id("city");
	public By CityError_Locator = By.xpath("//*[@id='parsley-id-17']/span");
	public By State_Locator = By.id("state");
	public By StateError_Locator = By.xpath("//*[@id='parsley-id-19']/span");
	public By RegisterButton_Locator = By.xpath("//*[contains(@type,'submit')]");
	public By RegisterationSuccessful_Locator =By.xpath("//*[@class='signup__success-message']");

	public WebElement EnterEmailAddress(){
		return LocalDriverManager.getDriver().findElement(EmailAddress_Locator);
	}

	public WebElement getEmailErrorMsg(){
		return LocalDriverManager.getDriver().findElement(EmailAddressError_Locator);
	}

	public WebElement EnterFirstName() {
		return LocalDriverManager.getDriver().findElement(FirstName_Locator);
	}

	public WebElement getFirstNameErrorMsg()
	{

		return LocalDriverManager.getDriver().findElement(FirstNameError_Locator);
	}

	public WebElement EnterLastName() {
		return LocalDriverManager.getDriver().findElement(LastName_Locator);
	}

	public WebElement getLastNameErrorMsg(){
		return LocalDriverManager.getDriver().findElement(LastNameError_Locator );
	}

	public WebElement EnterCustomerNumber() {
		return LocalDriverManager.getDriver().findElement(CustomerNumber_Locator);
	}

	public WebElement getCustomerNumberErrorMsg(){
		return LocalDriverManager.getDriver().findElement(CustomerNumberError_Locator);
	}

	public WebElement EnterBusinessName() {
		return LocalDriverManager.getDriver().findElement(BusinessName_Locator);
	}

	public WebElement getBusinessNameErrorMsg(){
		return LocalDriverManager.getDriver().findElement(BusinessNameError_Locator);
	}

	public void selectDivisionDropDown(String Division) {
		LocalDriverManager.getDriver().findElement(DivisionDropDown_Locator).click(); 
		List<WebElement> list_dropdown = LocalDriverManager.getDriver().findElements(list_dropdown_Locator); 
		for(int i =0; i<list_dropdown.size(); i++){
			if(list_dropdown.get(i).getText().contains(Division)) {
				list_dropdown.get(i).click();
				break;
			}
		}
		ExecutionHelper.getLogger().log(LogStatus.PASS, "Selected the value from the drop down with the text");
	}

	public WebElement getDivisionDropDownErrorMsg() {
		return LocalDriverManager.getDriver().findElement(DivisionDropDownError_Locator);
	}

	public WebElement EnterCity() {
		return LocalDriverManager.getDriver().findElement(City_Locator);
	}
	public WebElement getCityErrorMsg() {
		return LocalDriverManager.getDriver().findElement(CityError_Locator);
	}

	public WebElement EnterState() {
		return LocalDriverManager.getDriver().findElement(State_Locator);
	}
	public WebElement getStateErrorMsg(){
		return LocalDriverManager.getDriver().findElement(StateError_Locator);
	}

	public WebElement RegisterButton() {
		return LocalDriverManager.getDriver().findElement(RegisterButton_Locator);
	}

	public WebElement RegisterationSuccessful() {
		return LocalDriverManager.getDriver().findElement(RegisterationSuccessful_Locator);
	}





}
