package com.bek.stepdefinitions;

import com.bek.helpers.LocalDriverManager;
import com.bek.page_objects.HomePage;
import com.bek.page_objects.ProductDescPage;
import com.bek.utils.Utils;
import io.cucumber.java.en.Then;

public class ProductDescPageStepDefs {
	
	Utils utility = new Utils();
	ProductDescPage pdp = new ProductDescPage();
	HomePage homepage = new HomePage();
	
	@Then("I go to PDP and validate the product details")
	public void i_go_to_PDP_and_validate_the_product_details() throws Throwable {
		utility.SendKeys(homepage.searchedit(),"Butter");
		utility.click(homepage.searchicon(),"Search Icon");
		utility.click(pdp.ProductNamePLP(),"Product Name");
		utility.isElementDisplayed(pdp.itemNumber(),"Item Number");
		utility.isElementDisplayed(pdp.brand(),"Brand");
		utility.isElementDisplayed(pdp.manufacturer(),"Manufacturer");
		utility.isElementDisplayed(pdp.packsize(),"Pack/Size");
		utility.isElementDisplayed(pdp.price(),"Price");
		utility.isElementDisplayed(pdp.addToCart(),"Add To Cart");
		utility.isElementDisplayed(pdp.addToList(),"Add To List");
		utility.isElementDisplayed(pdp.addToFavorite(),"Favorite");
		utility.isElementDisplayed(pdp.description(),"Item Description");
		utility.isElementDisplayed(pdp.itemSpecsTab(),"Item Specifications");
		utility.isElementDisplayed(pdp.dietarySpecsTab(),"Dietary Specifications");
		utility.isElementDisplayed(pdp.nutritionFactsTab(),"Nutrition Facts");
		utility.isElementDisplayed(pdp.itemOrderHistoryTab(),"Item Order History");
		utility.isElementDisplayed(pdp.imageVideoTab(),"Image Video Tab");
		utility.isElementDisplayed(pdp.disclaimer(),"Disclaimer");
	}
	
	@Then("I validate the product media assets")
	public void i_validate_the_product_media_assets() throws Throwable {
		LocalDriverManager.getDriver().get("https://accstorefront.clelkh39mt-benekeith1-s1-public.model-t.cc.commerce.ondemand.com/bek/en/search/?text=CHEESE+MUENSTER+SLICED&categoryCode=");
	    utility.isElementDisplayed(pdp.productImage(),"Product Image");
	    LocalDriverManager.getDriver().get("https://accstorefront.clelkh39mt-benekeith1-s1-public.model-t.cc.commerce.ondemand.com/bek/en/c/VEAL-PATTY-RAW-BREADED-4OZ-FZN/p/114842");
	    
	    
	}
}
