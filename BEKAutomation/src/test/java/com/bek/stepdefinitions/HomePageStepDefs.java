package com.bek.stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bek.helpers.ExecutionHelper;
import com.bek.helpers.LocalDriverManager;
import com.bek.page_objects.HomePage;
import com.bek.utils.DataHelper;
import com.bek.utils.Utils;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HomePageStepDefs {

	Utils utility = new Utils();
	HomePage homepage = new HomePage();

	@Then("I validate the Search Functionality")
	public void i_view_the_search_bar_with_search_icon() throws Throwable {
		try {
			utility.isElementDisplayed(homepage.searchedit(),"Search edit");
			utility.isElementDisplayed(homepage.searchicon(),"Search Icon");
			utility.SendKeys(homepage.searchedit(), "Butt");
			utility.isElementDisplayed(homepage.searchAjaxDropDown(),"Search Ajax DropDown");
			utility.SendKeys(homepage.searchedit(),"Butter");
			utility.click(homepage.searchicon(),"Search Icon");
			utility.click(homepage.SearchDropDownclick(),"All Product");
			utility.SendKeys(homepage.searchedit(),"Cheese");
			homepage.searchedit().sendKeys(Keys.ENTER);
			String maxlengthDefined = homepage.searchedit().getAttribute("maxlength");
			utility.verifyTextMatches(maxlengthDefined, "50");
			String actualWatermark = homepage.searchedit().getAttribute("placeholder");
			String expectingWatermark = "Search Ben E. Keith Catalog";
			utility.verifyTextMatches(actualWatermark, expectingWatermark);
			utility.SendKeys(homepage.searchedit(), "Bread");
			utility.click(homepage.searchicon(), "Search Icon");
			utility.verifyTextContains(homepage.showingResultsFor().getText(), "Showing results for");
			utility.isElementDisplayed(homepage.pagination(), "Pagination");
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while validating search bar with search icon");
		}
	}

	@Then("I validate type-ahead suggestions")
	public void i_validate_type_ahead_suggestions() throws Throwable {
		try {
			utility.SendKeys(homepage.searchedit(), "Chee");
			utility.isElementDisplayed(homepage.searchAjaxDropDown(), "4 char suggestion");
			utility.SendKeys(homepage.searchedit(),"123957");
			utility.isElementDisplayed(homepage.searchAjaxDropDown(), "Product ID suggestion");
			utility.SendKeys(homepage.searchedit(), "MUSSELMN");
			utility.isElementDisplayed(homepage.searchAjaxDropDown(), "Product Brand suggestion");
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while validating type ahead section");
		}
	}

	@Then("I validate the header and footer components")
	public void i_validate_the_header_and_footer_components() throws Throwable {
		try {
			utility.isElementDisplayed(homepage.entreeLogo(), "Entree logo on top left of the page");
			utility.isElementDisplayed(homepage.searchBarWithDropDown(), "Search Bar");
			utility.click(homepage.searchBarWithDropDownClick(), "clicked on search bar dropdown");
			utility.isElementDisplayed(homepage.searchDropDownVisible(), "Search bar with category drop down");
			utility.isElementDisplayed(homepage.notificationIcon(), "Notification Icon");
			utility.isElementDisplayed(homepage.miniCart(), "Mini-Cart Icon");
			utility.isElementClickable(homepage.profileIcon(), "Profile Icon");
			utility.click(homepage.profileIcon(), "clicked on profile icon to see account dropdown");
			utility.isElementDisplayed(homepage.accountDropDown(), "Account Dropdown");
			utility.isElementDisplayed(homepage.companySection(), "Company Section");
			utility.isElementDisplayed(homepage.ourService(), "Our Services");
			utility.isElementDisplayed(homepage.customerSupport(), "Customer Support");
			utility.isElementDisplayed(homepage.policyTerms(), "Policy & Terms");
			try {
				List<WebElement> links = homepage.Footerlinks();
				if(links.size()!=0){
					for (int i =0;i<links.size();i++){
						WebElement element = links.get(i);
						utility.highLight(element);
						String text= element.getText();
						element.click();
						int Size = LocalDriverManager.getDriver().getWindowHandles().size();
						if(Size>1) {
							ExecutionHelper.getLogger().log(LogStatus.PASS,"Successfully validated the Footer text fields "+ text);
						}else {
							ExecutionHelper.getLogger().log(LogStatus.FAIL,"Exception occured while validating the Footer texts");
						}
						utility.switchToNewWindowFromCurrentWindow();
						utility.closeCurrentWindow();
						utility.switchToParentWindow();
					}
				}
				else
					ExecutionHelper.getLogger().log(LogStatus.FAIL,"List Size is empty");
			} catch (Exception e) {
				ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while validating the header links");
			}
			utility.click(homepage.facebookIcon(), "Facebook Icon");
			utility.switchToNewWindowFromCurrentWindow();
			utility.verifyTextContains(utility.getCurrentPageUrl(), "https://www.facebook.com/BenEKeithFoods/");
			utility.closeCurrentWindow();
			utility.switchToParentWindow();
			utility.click(homepage.twitterIcon(), "Twitter Icon");
			utility.switchToNewWindowFromCurrentWindow();
			utility.verifyTextContains(utility.getCurrentPageUrl(), "https://twitter.com/BenEKeithFoods?lang=en");
			utility.closeCurrentWindow();
			utility.switchToParentWindow();
			utility.click(homepage.instagramIcon(), "Instagram Icon");
			utility.switchToNewWindowFromCurrentWindow();
			utility.verifyTextContains(utility.getCurrentPageUrl(), "https://www.instagram.com/benekeithfoods/");
			utility.closeCurrentWindow();
			utility.switchToParentWindow();
			utility.click(homepage.youtubeIcon(), "Youtube Icon");
			utility.switchToNewWindowFromCurrentWindow();
			utility.verifyTextContains(utility.getCurrentPageUrl(),
					"https://www.youtube.com/channel/UCrEG5QBccsy2-rKXHREElSQ");
			utility.closeCurrentWindow();
			utility.switchToParentWindow();
			utility.verifyTextMatches(homepage.receieveExclusiveText().getText(),
					"Receive exclusive email-only promotions and offers");
			utility.isElementEnabled(homepage.subscribeButton(), "Subscribe Button");
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while validating Header and footer components");
		}
	}

	@Then("I validate the dropdown with list of account that user have access")
	public void i_validate_the_dropdown_with_list_of_account_that_user_have_access() throws Throwable {
		try {
			utility.click(homepage.userDropDown(),"User Account Dropdown");
			List<WebElement> links = homepage.UserDropdownlists();
			String text = null;
			if(links.size()!=0){
				for (int i =0;i<links.size();){
					WebElement element = links.get(i);
					utility.highLight(element);
					text= element.getText();
					element.click();
					break;
				}
				utility.isElementDisplayed(homepage.selectedUserInUserDropDown(), "selected user account");
				String selectedAccount =homepage.selectedUserInUserDropDown().getText();
				utility.verifyTextContains(selectedAccount,text );
			}else {
				ExecutionHelper.getLogger().log(LogStatus.PASS, "User List is empty ");
			}
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while validating list of users which have access");
		}
	}

	@Then("I validate the search and view users")
	public void i_validate_the_search_and_view_users() throws Throwable {
		try {
			utility.click(homepage.profileIcon(),"Profile dropdown");
			utility.click(homepage.manageUsers(),"Manage Users");
			utility.click(homepage.users(),"Users");
			List<WebElement> links = homepage.Userdatalist();
			String emailid = null;
			String firstname = null;
			if(links.size()!=0){
				for (int i =1;i<links.size();){
					System.out.println(links.get(i));
					WebElement elem =links.get(i);
					utility.highLight(elem);
					System.out.println(links.get(i)+"/td[1]");
					System.out.println(links.get(i)+"["+i+"]/td[1]");
					emailid= LocalDriverManager.getDriver().findElement(By.xpath(links.get(i)+"/td[1]")).getText();
					firstname= LocalDriverManager.getDriver().findElement(By.xpath(links.get(i)+"/td[2]")).getText();
					break;
				}
			}else {
				ExecutionHelper.getLogger().log(LogStatus.PASS, "User records are is empty ");
			}
			utility.SendKeys(homepage.usersSearch(),firstname);
			utility.click(homepage.usersSearchIcon(),"Search Icon");
			LocalDriverManager.getDriver().navigate().back();
			utility.click(homepage.users(),"Users");
			utility.SendKeys(homepage.usersSearch(),emailid);
			utility.click(homepage.usersSearchIcon(),"Search Icon");
			LocalDriverManager.getDriver().navigate().back();
			utility.click(homepage.users(),"Users");
			utility.click(homepage.usersEmailSort(),"Email-Address Sort");
			utility.click(homepage.usersFirstNameSort(),"First Name Sort");
			utility.click(homepage.usersLastNameSort(),"Last Name Sort");
			utility.click(homepage.usersRoleFilterSort(),"Role Filter");
			utility.selectByTextInList(homepage.roleFilterList(),"Owner");
			utility.isElementDisplayed(homepage.emailAddressResult(),"Email Address Filtered output result");
			utility.isElementDisplayed(homepage.FirstNameResult(),"First Name Filtered output");
			utility.isElementDisplayed(homepage.LastNameResult(), "Last Name Filtered output");
			utility.isElementDisplayed(homepage.roleResult(), "Role Filtered output");
			utility.isElementDisplayed(homepage.invoiceResult(),"Invoice Filtered output");
			utility.scrollToBottom();
			utility.isElementDisplayed(homepage.userpagination(),"Pagination");
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while validating search and view users section");
		}
	}

	@Then("I validate the create user functionality")
	public void i_validate_the_create_user_functionality() throws Throwable {
		try {
			utility.click(homepage.accountDropDown(),"Profile Account");
			utility.click(homepage.manageUsers(),"Manage Users");
			utility.click(homepage.users(),"Users");
			utility.click(homepage.createUser(),"Create User");
			utility.isElementDisplayed(homepage.createUserFirstName(),"First Name Field");
			utility.SendKeys(homepage.createUserFirstName(),utility.generateRandomAlphabetsString(5));
			utility.isElementDisplayed(homepage.createUserLastName(),"Last Name Field");
			utility.SendKeys(homepage.createUserLastName(),utility.generateRandomAlphabetsString(7));
			utility.isElementDisplayed(homepage.createUserEmailAddress(),"Email Address Field");
			utility.SendKeys(homepage.createUserEmailAddress(),utility.generateRandomAlphabetsString(8)+"@gmail.com");
			utility.isElementDisplayed(homepage.createUserPhoneNumber(),"Phone Number field");
			utility.SendKeys(homepage.createUserPhoneNumber(),utility.generateRandomNumber(10));
			utility.click(homepage.createUserRole(),"User Role");
			utility.click(homepage.UserRole("Owner"), "Owner");
			utility.click(homepage.CreateUserButton(), "Create User");
			/**
			 * Create USer validation need to include right now create user threwing some errors
			 */
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while validating create user functionality");
		}
	}

	@Then("I validate the multiple product select and add individual product to cart")
	public void i_validate_the_multiple_product_select_and_add_individual_product_to_cart() throws Throwable {
		try {
			utility.SendKeys(homepage.searchedit(),"Cheese");
			utility.click(homepage.searchicon(),"Search Icon");
			utility.MouseHover(homepage.product1());
			utility.Jsclick(homepage.product1Checkbox(),"product1");
			utility.MouseHover(homepage.product2());
			utility.Jsclick(homepage.product2Checkbox(),"product2");
			utility.MouseHover(homepage.product3());
			utility.Jsclick(homepage.product3Checkbox(),"product3");
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while validating multiple product add and individual product top cart");
		}
	}






}