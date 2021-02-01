package com.bek.stepdefinitions;

import com.bek.page_objects.MyAccountPage;
import com.bek.helpers.ExecutionHelper;
import com.bek.page_objects.HomePage;
import com.bek.utils.Utils;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;

public class MyAccountPageStepDefs {

	Utils utility = new Utils();
	HomePage homepage = new HomePage();
	MyAccountPage accountPage = new MyAccountPage();

	@Then("I validate delete another user from the account")
	public void i_validate_delete_another_user_from_the_account() throws Throwable {
		try {
			utility.click(homepage.profileIcon(),"Profile Icon");
			utility.click(homepage.manageUsers(),"Manage Users");
			utility.click(homepage.users(),"Users");
			utility.click(accountPage.usersListEditIcon(),"Edit Icon in User List");
			utility.click(accountPage.usersDetailsEditButton(),"Edit Button");
			utility.click(accountPage.deleteUserButton(),"Delete User");
			utility.click(accountPage.cancelNewWindow(),"Cancel");
			utility.click(accountPage.deleteUserButton(),"Delete User");
			utility.click(accountPage.deleteUserNewWindow(),"Delete User in new window");
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while validating delete user account");
		}
	}

	@Then("I validate the edit user details")
	public void i_validate_the_edit_user_details() throws Throwable {
		try {
			utility.click(homepage.profileIcon(),"Profile Icon");
			utility.click(homepage.manageUsers(),"Manage Users");
			utility.click(homepage.users(),"Users");
			utility.click(accountPage.usersListEditIcon(),"Edit Icon in User List");
			utility.isElementDisplayed(accountPage.lastLogin(),"Last Login");
			utility.isElementDisplayed(accountPage.userDetailsFirsLastName(),"Fist and Last Name");
			utility.isElementDisplayed(accountPage.userDetailsEmail(),"Email");
			utility.isElementDisplayed(accountPage.UserDetailsPhoneNumber(),"Phone Number");
			utility.isElementDisplayed(accountPage.userDetailsUserRole(),"User Role");
			utility.isElementDisplayed(accountPage.userDetailsInvoice(),"Invoice");
			utility.isElementDisplayed(accountPage.userAccountsAccountNumber(),"Account #");
			utility.isElementDisplayed(accountPage.userAccountsAccountName(),"Account Name");
			utility.isElementDisplayed(accountPage.usersDetailsEditButton(),"Edit Button");
			utility.click(accountPage.usersDetailsEditButton(),"Edit");
			utility.isElementDisplayed(accountPage.deleteUserButton(),"Delete user");
			utility.isElementEnabled(accountPage.updateUserButton(),"Update user");
			utility.isElementEnabled(accountPage.userDetailsCancelButton(),"Cancel Button");
			utility.isElementDisplayed(accountPage.firstNameEditBox(),"First Name");
			utility.isElementDisplayed(accountPage.lastNameEditBox(),"Last Name");
			utility.isElementDisplayed(accountPage.emailAddressEditBox(),"Email Address");
			utility.isElementDisplayed(accountPage.phoneNumberEditBox(),"Phone Number");
			utility.click(accountPage.userRoleDropDown(),"User Role");
			utility.isElementDisplayed(accountPage.userDetailsAccountNumber(),"Account Number");
			utility.isElementDisplayed(accountPage.userDetailsAccountName(),"Account Name");  
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while validating edit user section");
		}
	}

	@Then("I validate the my account user profile details")
	public void i_validate_the_my_account_user_profile_details() throws Throwable {
		try {
			utility.click(homepage.profileIcon(),"profile icon");
			utility.click(accountPage.profileSetting(),"Profile Setting");
			utility.click(accountPage.userProfileEditButton(),"User Profile Edit Button");
			utility.click(accountPage.userProfileCancelButton(),"Cancel");
			utility.click(accountPage.userProfileEditButton(),"User Profile Edit Button");
			utility.isElementDisplayed(accountPage.userProfileFirstNameEditBox(),"First Name");
			utility.SendKeys(accountPage.userProfileFirstNameEditBox(),"smruti");
			utility.isElementDisplayed(accountPage.userProfileLastNameEditBox(),"Last Name");
			utility.SendKeys(accountPage.userProfileLastNameEditBox(),"ranjan");
			utility.isElementDisplayed(accountPage.userProfileEmailEditBox(),"Email");
			utility.isElementDisplayed(accountPage.userProfilePhoneNumberEditBox(),"Phone");
			utility.SendKeys(accountPage.userProfilePhoneNumberEditBox(),"(937) 582-9301");
			utility.isElementDisplayed(accountPage.userProfileMobileEditBox(),"Mobile");
			utility.SendKeys(accountPage.userProfileMobileEditBox(),"(692) 903-9050");
			utility.isElementDisplayed(accountPage.userProfileRoleEditBox(),"Role");
			utility.click(accountPage.userProfileSaveButton(),"Save");
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while validating user profile section");
		}

	}


}
