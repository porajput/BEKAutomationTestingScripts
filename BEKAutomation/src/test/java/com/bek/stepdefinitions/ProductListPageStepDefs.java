package com.bek.stepdefinitions;

import com.bek.helpers.ExecutionHelper;
import com.bek.page_objects.HomePage;
import com.bek.page_objects.ProductListPage;
import com.bek.utils.Utils;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;

public class ProductListPageStepDefs {

	Utils utility = new Utils();
	HomePage homepage = new HomePage();
	ProductListPage plp = new ProductListPage();

	@Then("I go to the PLP List view and validate all product list page catalogue")
	public void i_go_to_the_PLP_List_view_and_validate_all_product_list_page_catalogue() throws Throwable {
		try {
			utility.SendKeys(homepage.searchedit(), "cheese");
			utility.click(homepage.searchicon(), "Search Icon");
			utility.click(plp.listViewIcon(), "List view icon");
			utility.isElementDisplayed(plp.itemNumber(), "Item Number");
			utility.isElementDisplayed(plp.itemName(), "Item Name");
			utility.isElementDisplayed(plp.brand(), "Brand");
			utility.isElementDisplayed(plp.packSize(), "Pack/Size");
			utility.isElementDisplayed(plp.price(), "Price");
			//EACH CHECKBOX missing
			utility.isElementDisplayed(plp.addToCart(), "Add to Cart");
			utility.isElementDisplayed(plp.addToList(), "Add to List");
			utility.isElementDisplayed(plp.favorites(), "Favorite");
			utility.isElementDisplayed(plp.productIcon(), "Product Icon");
			utility.isElementDisplayed(plp.SelectionOption(), "Selection Option");
			utility.click(plp.SelectionOption(), "Selection Option");
			utility.isElementSelected(plp.SelectionOption(), "Selection Option");
			utility.isElementDisplayed(plp.addToListButton(), "Add to List Button");
			utility.click(plp.SelectionOption(), "Deselect Selection Option");
			// add sort by (low to high) VALIDATION later
			utility.click(plp.sortByDropDown(), "Sort By dropdown");
			utility.selectByTextInList(plp.sortByDropDownList(), "Name");
			utility.click(plp.sortByDropDown(), "Sort By dropdown");
			utility.selectByTextInList(plp.sortByDropDownList(), "Brand");
			utility.scrollToBottom();
			utility.isElementDisplayed(plp.pagination(), "Pagination");
		} catch (Exception e) {
			ExecutionHelper.getLogger().log(LogStatus.FAIL, "Exception "+e+" occured while validating product list page catalogue");
		}
	}


}
