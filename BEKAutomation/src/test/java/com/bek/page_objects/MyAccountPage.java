package com.bek.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bek.helpers.LocalDriverManager;

public class MyAccountPage {
	
	public By byUsersListEditIcon = By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[6]");
	public By byUsersDetailsEditButton = By.xpath("//*[@class='user-sticky-section__cta-create js-user-sticky-section-edit']");
	public By byDeleteUserButton = By.xpath("//*[@class='user-details__button-delete js-user-button-delete']");
	public By byDeleteUserNewWindow = By.xpath("//*[@class='users-delete-modal js-delete-modal']//div[3]/div[2]");
	public By byCancelNewWindow = By.xpath("//*[@class='users-delete-modal js-delete-modal']//div[3]/div[1]");
	public By byDeleteUserToastMessage = By.xpath("//*[@class='users-toast-message js-delete-user-toast-success']//span");
	public By byLastLogin = By.xpath("//*[@class='user-details__last-login']");
	public By byUserDetailsFirsLastName = By.xpath("//*[@class='user-details__value forms__input-text forms-label forms-label--overlay js-user-name']");
	public By byUserDetailsEmail = By.xpath("//*[@class='user-details__value forms__input-text forms-label forms-label--overlay js-user-email']");
	public By byUserDetailsPhoneNumber = By.xpath("//*[@class='user-details__value forms__input-text forms-label forms-label--overlay js-user-phone']");
	public By byUserDetailsUserRole = By.xpath("//*[@class='user-details__value forms__input-text forms-label forms-label--overlay js-user-role']");
	public By byUserDetailsInvoice = By.xpath("//*[@class='user-details__value forms__input-text forms-label forms-label--overlay js-user-invoice-access']");
	public By byUserAccountsAccountNumber = By.xpath("//*[@id='DataTables_Table_2']/thead/tr/th[1]");
	public By byUserAccountsAccountName = By.xpath("//*[@id='DataTables_Table_2']/thead/tr/th[2]");
	public By byUpdateUserButton = By.xpath("//*[@class='user-sticky-section__cta-create js-user-sticky-section-update']");
	public By byUserDetailsCancelButton = By.xpath("//*[@class='user-sticky-section__cta-cancel js-cancel-update']");
	public By byFirstNameEditBox = By.xpath("//*[@class='user-details__input forms__input-box js-user-firstName forms-text js-forms-text']");
	public By byLastNameEditBox = By.xpath("//*[@class='user-details__input forms__input-box js-user-lastName forms-text js-forms-text']");
	public By byEmailAddressEditBox = By.xpath("//*[@class='user-details__input forms__input-box js-user-email forms-text js-forms-text']");
	public By byPhoneNumberEditBox = By.xpath("//*[@name='phoneNumber']");
	public By byUserRoleDropDown = By.xpath("//*[@class='dropdown app-js__dropdown']//input");
	public By byUserRoleDropDownAllRoles = By.xpath("//button[@data-code='all']");
	public By byUserDetailsAccountNumber = By.xpath("//*[@id='DataTables_Table_0']/thead/tr/th[2]");
	public By byUserDetailsAccountName = By.xpath("//*[@id='DataTables_Table_0']/thead/tr/th[3]");
	public By byProfileSetting = By.xpath("//*[@class='col-md-5 col-lg-5 header__icons']/div[3]/div[2]/div[1]/a");
	public By byUserProfileEditButton = By.xpath("//*[@class='hidden-xs hidden-sm col-md-9 col-lg-9']/div[2]/div/div[3]/div[2]/div[2]/div[6]/button");
	public By byUserProfileFirstNameEditBox = By.xpath("//*[@class='row profile-row']/div[3]//*[@id='firstName']");
	public By byUserProfileLastNameEditBox = By.xpath("//*[@class='row profile-row']/div[3]//*[@id='lastName']");
	public By byUserProfileEmailEditBox = By.xpath("//*[@class='row profile-row']/div[3]//*[@id='email']");
	public By byUserProfilePhoneNumberEditBox = By.xpath("//*[@class='row profile-row']/div[3]//*[@id='phoneNumber']");
	public By byUserProfileMobileEditBox = By.xpath("//*[@class='row profile-row']/div[3]//*[@id='mobileNumber']");
	public By byUserProfileRoleEditBox = By.xpath("//*[@class='row profile-row']/div[3]//*[@id='role']");
	public By byUserProfileCancelButton = By.xpath("//*[@class='row profile-row']/div[3]//button[@class='user-profile__button-cancel js-button-cancel col-xs-5']");
	public By byUserProfileSaveButton = By.xpath("//*[@class='row profile-row']/div[3]//button[@class='col-xs-5 col-xs-offset-2 user-profile__button-save js-button-save']");
	
	
	public WebElement userProfileSaveButton() {
		return LocalDriverManager.getDriver().findElement(byUserProfileSaveButton);
	}
	public WebElement userProfileCancelButton() {
		return LocalDriverManager.getDriver().findElement(byUserProfileCancelButton);
	}
	public WebElement userProfileRoleEditBox() {
		return LocalDriverManager.getDriver().findElement(byUserProfileRoleEditBox);
	}
	public WebElement userProfileMobileEditBox() {
		return LocalDriverManager.getDriver().findElement(byUserProfileMobileEditBox);
	}
	public WebElement userProfilePhoneNumberEditBox() {
		return LocalDriverManager.getDriver().findElement(byUserProfilePhoneNumberEditBox);
	}
	public WebElement userProfileEmailEditBox() {
		return LocalDriverManager.getDriver().findElement(byUserProfileEmailEditBox);
	}
	public WebElement userProfileLastNameEditBox() {
		return LocalDriverManager.getDriver().findElement(byUserProfileLastNameEditBox);
	}
	public WebElement userProfileFirstNameEditBox() {
		return LocalDriverManager.getDriver().findElement(byUserProfileFirstNameEditBox);
	}
	public WebElement userProfileEditButton() {
		return LocalDriverManager.getDriver().findElement(byUserProfileEditButton);
	}
	public WebElement profileSetting() {
		return LocalDriverManager.getDriver().findElement(byProfileSetting);
	}
	public WebElement userDetailsAccountName() {
		return LocalDriverManager.getDriver().findElement(byUserDetailsAccountName);
	}
	public WebElement userDetailsAccountNumber() {
		return LocalDriverManager.getDriver().findElement(byUserDetailsAccountNumber);
	}
	public WebElement userRoleDropDownAllRoles() {
		return LocalDriverManager.getDriver().findElement(byUserRoleDropDownAllRoles);
	}
	public WebElement userRoleDropDown() {
		return LocalDriverManager.getDriver().findElement(byUserRoleDropDown);
	}
	public WebElement phoneNumberEditBox() {
		return LocalDriverManager.getDriver().findElement(byPhoneNumberEditBox);
	}
	public WebElement emailAddressEditBox() {
		return LocalDriverManager.getDriver().findElement(byEmailAddressEditBox);
	}
	public WebElement lastNameEditBox() {
		return LocalDriverManager.getDriver().findElement(byLastNameEditBox);
	}
	public WebElement firstNameEditBox() {
		return LocalDriverManager.getDriver().findElement(byFirstNameEditBox);
	}
	public WebElement userDetailsCancelButton() {
		return LocalDriverManager.getDriver().findElement(byUserDetailsCancelButton);
	}
	public WebElement updateUserButton() {
		return LocalDriverManager.getDriver().findElement(byUpdateUserButton);
	}
	public WebElement userAccountsAccountName() {
		return LocalDriverManager.getDriver().findElement(byUserAccountsAccountName);
	}
	public WebElement userAccountsAccountNumber() {
		return LocalDriverManager.getDriver().findElement(byUserAccountsAccountNumber);
	}
	public WebElement userDetailsInvoice() {
		return LocalDriverManager.getDriver().findElement(byUserDetailsInvoice);
	}
	public WebElement userDetailsUserRole() {
		return LocalDriverManager.getDriver().findElement(byUserDetailsUserRole);
	}
	public WebElement UserDetailsPhoneNumber() {
		return LocalDriverManager.getDriver().findElement(byUserDetailsPhoneNumber);
	}
	public WebElement userDetailsEmail() {
		return LocalDriverManager.getDriver().findElement(byUserDetailsEmail);
	}
	public WebElement userDetailsFirsLastName() {
		return LocalDriverManager.getDriver().findElement(byUserDetailsFirsLastName);
	}
	public WebElement lastLogin() {
		return LocalDriverManager.getDriver().findElement(byLastLogin);
	}
	public WebElement usersListEditIcon() {
		return LocalDriverManager.getDriver().findElement(byUsersListEditIcon);
	}
	public WebElement usersDetailsEditButton() {
		return LocalDriverManager.getDriver().findElement(byUsersDetailsEditButton);
	}
	public WebElement deleteUserButton() {
		return LocalDriverManager.getDriver().findElement(byDeleteUserButton);
	}
	public WebElement deleteUserNewWindow() {
		return LocalDriverManager.getDriver().findElement(byDeleteUserNewWindow);
	}
	public WebElement cancelNewWindow() {
		return LocalDriverManager.getDriver().findElement(byCancelNewWindow);
	}
	public WebElement deleteUserToastMessage() {
		return LocalDriverManager.getDriver().findElement(byDeleteUserToastMessage);
	}
    
	
	
}
