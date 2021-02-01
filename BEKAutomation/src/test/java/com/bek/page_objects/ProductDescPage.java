package com.bek.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bek.helpers.LocalDriverManager;

public class ProductDescPage {


	public By byProductNamePLP= By.xpath("//*[@class='plp-grid__items js-plp-grid-items']/div[1]/div/div[2]//a");
	public By byItemNumber= By.xpath("//*[@class='col-xs-12 col-sm-12 hidden-md hidden-lg']//div[@class='pdp-header__item']");
	public By byDescription = By.xpath("//*[@class='col-md-5 col-lg-5 col-md-offset-1 col-lg-offset-1 hidden-xs hidden-sm']/div[2]/div[6]/span");
	public By byPacksize =By.xpath("//*[@class='col-md-5 col-lg-5 col-md-offset-1 col-lg-offset-1 hidden-xs hidden-sm']/div[2]/div[3]");
	public By byBrand =By.xpath("//*[@class='col-md-5 col-lg-5 col-md-offset-1 col-lg-offset-1 hidden-xs hidden-sm']/div[2]/div[1]");
	public By byManufacturer =By.xpath("//*[@class='col-md-5 col-lg-5 col-md-offset-1 col-lg-offset-1 hidden-xs hidden-sm']/div[2]/div[2]");
	public By byPrice =By.xpath("//*[@class='col-md-5 col-lg-5 col-md-offset-1 col-lg-offset-1 hidden-xs hidden-sm']/div[2]/div[4]/span");
	public By byAddToCart =By.xpath("//*[@class='col-md-5 col-lg-5 col-md-offset-1 col-lg-offset-1 hidden-xs hidden-sm']//button[@class='add-to-cart__btn']");
	public By byAddToList =By.xpath("//*[@class='col-md-5 col-lg-5 col-md-offset-1 col-lg-offset-1 hidden-xs hidden-sm']//button[@class='add-to-list app-js__add-to-list']");
	public By byAddToFavorite =By.xpath("//*[@class='col-md-5 col-lg-5 col-md-offset-1 col-lg-offset-1 hidden-xs hidden-sm']//button[@class='add-to-fav-list app-js__add-to-fav-list']");
	public By byItemSpecsTab =By.xpath("//*[@class='padding-left-0 hidden-xs hidden-sm col-md-7 col-lg-7']/div[2]");
	public By byDietarySpecsTab =By.xpath("//*[@class='padding-left-0 hidden-xs hidden-sm col-md-7 col-lg-7']/div[1]");
	public By byNutritionFactsTab =By.xpath("//*[@class='hidden-xs hidden-sm col-md-4 col-lg-4 pdp-product-details__item--margin-left']/div");
	public By byItemOrderHistoryTab =By.xpath("//*[@class='padding-left-0 hidden-xs hidden-sm col-md-7 col-lg-7']/div[3]");
	public By byImageVideoTab =By.xpath("//*[@id='primary-slider-slide01']");
	public By byDisclaimer =By.xpath("//*[@class='content']");
	public By byProductImage =By.xpath("//*[@class='plp-grid__items js-plp-grid-items']/div[1]//img");



	public WebElement productImage() {
		return LocalDriverManager.getDriver().findElement(byProductImage);
	}
	public WebElement ProductNamePLP() {
		return LocalDriverManager.getDriver().findElement(byProductNamePLP);
	}
	public WebElement itemNumber() {
		return LocalDriverManager.getDriver().findElement(byItemNumber);
	}
	public WebElement description() {
		return LocalDriverManager.getDriver().findElement(byDescription);
	}
	public WebElement packsize() {
		return LocalDriverManager.getDriver().findElement(byPacksize);
	}
	public WebElement brand() {
		return LocalDriverManager.getDriver().findElement(byBrand);
	}
	public WebElement manufacturer() {
		return LocalDriverManager.getDriver().findElement(byManufacturer);
	}
	public WebElement price() {
		return LocalDriverManager.getDriver().findElement(byPrice);
	}
	public WebElement addToCart() {
		return LocalDriverManager.getDriver().findElement(byAddToCart);
	}
	public WebElement addToList() {
		return LocalDriverManager.getDriver().findElement(byAddToList);
	}
	public WebElement addToFavorite() {
		return LocalDriverManager.getDriver().findElement(byAddToFavorite);
	}
	public WebElement itemSpecsTab() {
		return LocalDriverManager.getDriver().findElement(byItemSpecsTab);
	}
	public WebElement dietarySpecsTab() {
		return LocalDriverManager.getDriver().findElement(byDietarySpecsTab);
	}
	public WebElement nutritionFactsTab() {
		return LocalDriverManager.getDriver().findElement(byNutritionFactsTab);
	}
	public WebElement itemOrderHistoryTab() {
		return LocalDriverManager.getDriver().findElement(byItemOrderHistoryTab);
	}
	public WebElement imageVideoTab() {
		return LocalDriverManager.getDriver().findElement(byImageVideoTab);
	}
	public WebElement disclaimer() {
		return LocalDriverManager.getDriver().findElement(byDisclaimer);
	}

}
