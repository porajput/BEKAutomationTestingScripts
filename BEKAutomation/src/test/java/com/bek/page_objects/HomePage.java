package com.bek.page_objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bek.helpers.LocalDriverManager;

public class HomePage {

	public By byUsername = By.xpath("//*[@name='j_username']");
	public By bySSOUsername = By.xpath("//*[@id='signInName']");
	public By byPassword = By.xpath("//*[@name='j_password']");
	public By bySSOPassword = By.xpath("//*[@id='password']");
	public By byLogin    = By.xpath("//*[text()='Login']");
	public By bySSOLogin    = By.xpath("//*[@type='submit']");
	public By byBEKEmployee = By.xpath("//*[@id='BEKExchange']");
	public By byHeadericons = By.xpath("//*[@class='row header__navigation']//*[@class='header__navigation-list js-navigation-list hidden-sm hidden-xs']");	 
	public By byMyaccountButton = By.xpath("//*[@class='header__icons-profile-image']");
	public By byMyAccpageSearchbar = By.xpath("//*[@class='show-accounts__dt-filter']");
	
	public By byProduct1 = By.xpath("//*[text()='CHEESE GOAT LOG NATURAL ']");
	public By byProduct2 = By.xpath("(//*[@class='plp-grid__image-container'])[2]");
	public By byProduct3 = By.xpath("(//*[@class='plp-grid__image-container'])[3]");
	public By byProduct1Checkbox = By.xpath("(//label[@class='check-container app-js__check-container forms-control--filled'])[1]");
	public By byProduct2Checkbox = By.xpath("(//label[@class='check-container app-js__check-container forms-control--filled'])[2]");
	public By byProduct3Checkbox = By.xpath("(//label[@class='check-container app-js__check-container forms-control--filled'])[3]");
	
	public By bySearchedit = By.xpath("(//*[@id='js-site-search-input'])[1]");
	public By bySearchicon = By.xpath("(//*[@class='glyphicon glyphicon-search'])[1]");
	public By bySearchProductName = By.xpath("//*[@class='row plp-srp-header-top plp-srp-header-container']/span[2]");
	public By bySearchAjaxDropDown = By.xpath("//*[@id='ui-id-9']");
	public By bySearchDropDownclick = By.xpath("(//span[contains(text(),'All Products')])[1]");
	public By bySearchDropDownVisible1 = By.xpath("//*[@class='js-dropdown-type dropdown-menu js-dropdown-menu']");
	public By byShowingResultsFor = By.xpath("//span[contains(text(),'Showing results for')]");
	public By byProductNumber = By.xpath("//*[@class='plp-grid__item']");
	public By byPagination = By.xpath("//*[@class='pagination app-js__pagination']");
	public By byAddItemToCart = By.xpath("//*[@class='plp-header__add-items-to']");
	public By byEntreeLogo = By.xpath("//div[@class='col-md-2 col-lg-2 header__logo']");
	public By bySearchBarDropDown = By.xpath("(//input[@id='js-site-search-input'])[1]");
	public By bysearchDropDownclick = By.xpath("(//div[@class='dropdown dropdown-group js-dropdown'])[1]");
	public By bySearchDropDownVisible = By.xpath("//*[@class='js-dropdown-type dropdown-menu js-dropdown-menu']");
	public By byNotificationIcon = By.xpath("//*[@class='header__icons-notification']");
	public By byMiniCart = By.xpath("//*[@class='header__icons-cart']");
	public By byAccountDropDown = By.xpath("(//div[@class='profile-dropdown app-js__profile-dropdown'])[1]");
	public By byProfileIcon = By.xpath("//*[@class='header__icons-profile-image']");
	
	public By byCompanySection = By.xpath("(//div[@class='col-md-2 col-lg-2'])[1]");
	public By byOurService = By.xpath("(//div[@class='col-md-2 col-lg-2'])[2]");
	public By byCustomerSupport = By.xpath("(//div[@class='col-md-2 col-lg-2'])[3]");
	public By byPolicyTerms = By.xpath("(//div[@class='col-md-2 col-lg-2'])[4]");
	public By byFacebookIcon = By.xpath("(//span[@class='footer__icons-item'])[1]");
	public By byTwitterIcon = By.xpath("(//span[@class='footer__icons-item'])[2]");
	public By byInstagramIcon = By.xpath("(//span[@class='footer__icons-item'])[3]");
	public By byYoutubeIcon = By.xpath("(//span[@class='footer__icons-item'])[4]");
	public By byReceieveExclusiveText = By.xpath("(//div[@class='footer__info-text'])[1]");
	public By bySubscribeButton = By.xpath("(//button[@class='footer__button'])[1]");
	
	public By byUserDropDown = By.xpath("(//*[@class='js-filterdropdown-selectedaccount'])[1]");
	public By byUserDropdownlists = By.xpath("//*[@class='filterdropdown__btn js-filterdropdown__btn closedrop']/..//*[@class='js-list-item']/span[@class='accountCode']");
	//public By byUserDropDownListFirstUser = By.xpath("//*[@class='col-md-5 col-lg-5 header__icons']/div[1]/div[1]/a[1]");
	//public By byUserDropDownListSecondUser = By.xpath("//*[@class='col-md-5 col-lg-5 header__icons']/div[1]/div[1]/a[2]");
	//public By byUserDropDownListFourthUser = By.xpath("//*[@class='col-md-5 col-lg-5 header__icons']/div[1]/div[1]/a[4]");
	public By bySelectedUserInUserDropDown = By.xpath("(//div[@class='filterdropdown app-js__filterdropdown'])[1]");
	public By byManageUsers = By.xpath("(//*[@class='profile-dropdown__lists-item'])[1]");
	
	public By byUsers = By.xpath("(//*[@class='left-nav__list-item-text'])[2]");
	public By byUsersSearch = By.xpath("//input[@type='search']");
	public By byUsersSearchIcon = By.xpath("//div[@class='show-users__dt-search']//*[@class='icon-container']");
	public By byUsersEmailSort = By.xpath("//*[@class='show-users__dt-col show-users__dt-col--email sorting']");
	public By byUsersFirstNameSort = By.xpath("//*[@class='show-users__dt-col show-users__dt-col--firstname sorting']");
	public By byUsersLastNameSort = By.xpath("//*[@class='show-users__dt-col show-users__dt-col--lastname sorting']");
	public By byUsersRoleFilterSort = By.xpath("(//*[@class='dropdown dropdown-group js-dropdown'])[3]");
	public By byRoleFilterList=By.xpath("(//*[@class='list-group js-list-group'])[3]");
	public By byEmailAddressResult = By.xpath("(//*[@class='odd'])[1]/td[1]");
	public By byFirstNameResult = By.xpath("(//*[@class='odd'])[1]/td[2]");
	public By byLastNameResult = By.xpath("(//*[@class='odd'])[1]/td[3]");
	public By byRoleResult = By.xpath("(//*[@class='odd'])[1]/td[4]");
	public By byInvoiceResult = By.xpath("(//*[@class='odd'])[1]/td[5]");
	public By byUserpagination = By.xpath("//*[@id='DataTables_Table_0_paginate']");
	
	public By byCreateUser = By.xpath("//*[text()='Create User']");
	public By byCreateUserFirstName = By.xpath("//*[@class='user-details__input forms__input-box js-user-firstName forms-text js-forms-text']");
	public By byCreateUserLastName = By.xpath("//*[@class='user-details__input forms__input-box js-user-lastName forms-text js-forms-text']");
	public By byCreateUserEmailAddress = By.xpath("//*[@class='user-details__input forms__input-box js-user-email forms-text js-forms-text']");
	public By byCreateUserPhoneNumber = By.xpath("//*[@class='user-details__input forms__input-box forms-text js-user-phone js-forms-text js-phone-number-details']");
	public By byCreateUserRole = By.xpath("(//*[@class='dropdown dropdown-group js-dropdown'])[3]");
	public By byPhoneNumberErrorMsg = By.xpath("//*[@id='parsley-id-11']/span");
	public By byFooterLinks = By.xpath("//*[@class='row hidden-xs hidden-sm footer__content-items']//*[@class='footer__list-item']");
	
	public By byUserdatalist = By.xpath("//*[@role='row' and (@class='odd' or @class='even')]");
	public By byCreateUserButton = By.xpath("//*[@class='user-sticky-section__cta-create js-user-sticky-section-create']");
	
	
	public List<WebElement> Footerlinks(){
		return LocalDriverManager.getDriver().findElements(byFooterLinks);
	}
	public List<WebElement> Userdatalist(){
		return LocalDriverManager.getDriver().findElements(byUserdatalist);
	}
	
	public WebElement UserRole(String role) {
		return LocalDriverManager.getDriver().findElement(By.xpath("//*[contains(text(),'"+role+"')]"));
	}
	public List<WebElement> UserDropdownlists(){
		return LocalDriverManager.getDriver().findElements(byUserDropdownlists);
	}
	public WebElement CreateUserButton() {
		return LocalDriverManager.getDriver().findElement(byCreateUserButton);
	}

	public WebElement phoneNumberErrorMsg() {
		return LocalDriverManager.getDriver().findElement(byPhoneNumberErrorMsg);
	}
	public WebElement createUserRole() {
		return LocalDriverManager.getDriver().findElement(byCreateUserRole);
	}
	public WebElement createUserPhoneNumber() {
		return LocalDriverManager.getDriver().findElement(byCreateUserPhoneNumber);
	}
	public WebElement createUserEmailAddress() {
		return LocalDriverManager.getDriver().findElement(byCreateUserEmailAddress);
	}
	public WebElement createUserLastName() {
		return LocalDriverManager.getDriver().findElement(byCreateUserLastName);
	}
	public WebElement createUserFirstName() {
		return LocalDriverManager.getDriver().findElement(byCreateUserFirstName);
	}
	public WebElement createUser() {
		return LocalDriverManager.getDriver().findElement(byCreateUser);
	}
	public WebElement userpagination() {
		return LocalDriverManager.getDriver().findElement(byUserpagination);
	}
	public WebElement invoiceResult() {
		return LocalDriverManager.getDriver().findElement(byInvoiceResult);
	}
	public WebElement roleResult() {
		return LocalDriverManager.getDriver().findElement(byRoleResult);
	}
	public WebElement LastNameResult() {
		return LocalDriverManager.getDriver().findElement(byLastNameResult);
	}
	public WebElement FirstNameResult() {
		return LocalDriverManager.getDriver().findElement(byFirstNameResult);
	}
	public WebElement emailAddressResult() {
		return LocalDriverManager.getDriver().findElement(byEmailAddressResult);
	}
	public List<WebElement> roleFilterList() {
		return LocalDriverManager.getDriver().findElements(byRoleFilterList);
	}
	public WebElement usersRoleFilterSort() {
		return LocalDriverManager.getDriver().findElement(byUsersRoleFilterSort);
	}
	public WebElement usersLastNameSort() {
		return LocalDriverManager.getDriver().findElement(byUsersLastNameSort);
	}
	public WebElement usersFirstNameSort() {
		return LocalDriverManager.getDriver().findElement(byUsersFirstNameSort);
	}
	public WebElement usersEmailSort() {
		return LocalDriverManager.getDriver().findElement(byUsersEmailSort);
	}
	public WebElement usersSearchIcon() {
		return LocalDriverManager.getDriver().findElement(byUsersSearchIcon);
	}
	public WebElement usersSearch() {
		return LocalDriverManager.getDriver().findElement(byUsersSearch);
	}
	public WebElement users() {
		return LocalDriverManager.getDriver().findElement(byUsers);
	}
	public WebElement manageUsers() {
		return LocalDriverManager.getDriver().findElement(byManageUsers);
	}
	public WebElement selectedUserInUserDropDown() {
		return LocalDriverManager.getDriver().findElement(bySelectedUserInUserDropDown);
	}
	
	public WebElement userDropDown() {
		return LocalDriverManager.getDriver().findElement(byUserDropDown);
	}
	public WebElement userDropDownLists() {
		return LocalDriverManager.getDriver().findElement(byUserDropdownlists);
	}
	public WebElement entreeLogo() {
		return LocalDriverManager.getDriver().findElement(byEntreeLogo);
	}

	public WebElement searchBarWithDropDown() {
		return LocalDriverManager.getDriver().findElement(bySearchBarDropDown);
	}

	public WebElement searchBarWithDropDownClick() {
		return LocalDriverManager.getDriver().findElement(bysearchDropDownclick);
	}

	public WebElement searchDropDownVisible() {
		return LocalDriverManager.getDriver().findElement(bySearchDropDownVisible1);
	}

	public WebElement accountDropDown() {
		return LocalDriverManager.getDriver().findElement(byAccountDropDown);
	}

	public WebElement notificationIcon() {
		return LocalDriverManager.getDriver().findElement(byNotificationIcon);
	}

	public WebElement miniCart() {
		return LocalDriverManager.getDriver().findElement(byMiniCart);
	}

	public WebElement profileIcon() {
		return LocalDriverManager.getDriver().findElement(byProfileIcon);
	}

	public WebElement companySection() {
		return LocalDriverManager.getDriver().findElement(byCompanySection);
	}

	public WebElement ourService() {
		return LocalDriverManager.getDriver().findElement(byOurService);
	}

	public WebElement customerSupport() {
		return LocalDriverManager.getDriver().findElement(byCustomerSupport);
	}

	public WebElement policyTerms() {
		return LocalDriverManager.getDriver().findElement(byPolicyTerms);
	}

	public WebElement facebookIcon() {
		return LocalDriverManager.getDriver().findElement(byFacebookIcon);
	}

	public WebElement twitterIcon() {
		return LocalDriverManager.getDriver().findElement(byTwitterIcon);
	}

	public WebElement instagramIcon() {
		return LocalDriverManager.getDriver().findElement(byInstagramIcon);
	}

	public WebElement youtubeIcon() {
		return LocalDriverManager.getDriver().findElement(byYoutubeIcon);
	}

	public WebElement receieveExclusiveText() {
		return LocalDriverManager.getDriver().findElement(byReceieveExclusiveText);
	}

	public WebElement subscribeButton() {
		return LocalDriverManager.getDriver().findElement(bySubscribeButton);
	}

	public WebElement searchedit() {
		return LocalDriverManager.getDriver().findElement(bySearchedit);
	}

	public WebElement searchicon() {
		return LocalDriverManager.getDriver().findElement(bySearchicon);
	}

	public WebElement searchProductName() {
		return LocalDriverManager.getDriver().findElement(bySearchProductName);
	}

	public WebElement searchAjaxDropDown() {
		return LocalDriverManager.getDriver().findElement(bySearchAjaxDropDown);
	}

	public WebElement SearchDropDownclick() {
		return LocalDriverManager.getDriver().findElement(bySearchDropDownclick);
	}

	public WebElement SearchDropDownVisible() {
		return LocalDriverManager.getDriver().findElement(bySearchDropDownVisible1);
	}

	public WebElement showingResultsFor() {
		return LocalDriverManager.getDriver().findElement(byShowingResultsFor);
	}

	public List<WebElement> productNumber() {
		List<WebElement> products = LocalDriverManager.getDriver().findElements(byProductNumber);
		return products;
	}

	public WebElement pagination() {
		return LocalDriverManager.getDriver().findElement(byPagination);
	}

	public WebElement addItemToCart() {
		return LocalDriverManager.getDriver().findElement(byAddItemToCart);
	}

	public WebElement product1(){
		return LocalDriverManager.getDriver().findElement(byProduct1);
	}
	public WebElement product2(){
		return LocalDriverManager.getDriver().findElement(byProduct2);
	}
	public WebElement product3(){
		return LocalDriverManager.getDriver().findElement(byProduct3);
	}
	public WebElement product1Checkbox(){
		return LocalDriverManager.getDriver().findElement(byProduct1Checkbox);
	}
	public WebElement product2Checkbox(){
		return LocalDriverManager.getDriver().findElement(byProduct2Checkbox);
	}
	public WebElement product3Checkbox(){
		return LocalDriverManager.getDriver().findElement(byProduct3Checkbox);
	}
	public WebElement Username(){
		return LocalDriverManager.getDriver().findElement(byUsername);
	}
	public WebElement Password(){
		return LocalDriverManager.getDriver().findElement(byPassword);
	}
	public WebElement Login(){
		return LocalDriverManager.getDriver().findElement(byLogin);
	}
	public WebElement SSOUsername(){
		return LocalDriverManager.getDriver().findElement(bySSOUsername);
	}
	public WebElement SSOPassword(){
		return LocalDriverManager.getDriver().findElement(bySSOPassword);
	}
	public WebElement SSOLogin(){
		return LocalDriverManager.getDriver().findElement(bySSOLogin);
	}
	public WebElement Searchedit(){
		return LocalDriverManager.getDriver().findElement(bySearchedit);
	}
	public WebElement Searchicon(){
		return LocalDriverManager.getDriver().findElement(bySearchicon);
	}
	public List<WebElement> Headericons(){
		return LocalDriverManager.getDriver().findElements(byHeadericons);
	}
	public WebElement MyaccountButton(){
		return LocalDriverManager.getDriver().findElement(byMyaccountButton);
	}
	public WebElement ManageUsers(){
		return LocalDriverManager.getDriver().findElement(byManageUsers);
	}
	public WebElement MyAccpageSearchbar(){
		return LocalDriverManager.getDriver().findElement(byMyAccpageSearchbar);
	}


}
