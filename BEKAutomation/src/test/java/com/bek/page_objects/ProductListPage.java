package com.bek.page_objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bek.helpers.LocalDriverManager;

public class ProductListPage {

	public By byProducttile = By.xpath("//*[@class='plp-grid__image-container']/a");
	public By byProductDetailtext= By.xpath("//*[@class='container-fluid']/div[2]/div[1]/div/div[2]/div/span");
	public By byListViewIcon= By.xpath("//*[@id='list_view']");
	public By byItemNumber= By.xpath("//*[@class='plp-list__table-tablebody js-plp-list-tbody']//tr[1]/td[2]");
	public By byItemName= By.xpath("//*[@class='plp-list__table-tablebody js-plp-list-tbody']//tr[1]//td[3]");
	public By byBrand= By.xpath("//*[@class='plp-list__table-tablebody js-plp-list-tbody']//tr[1]//td[4]");
	public By byPackSize= By.xpath("//*[@class='plp-list__table-tablebody js-plp-list-tbody']//tr[1]//td[5]");
	public By byPrice= By.xpath("//*[@class='plp-list__table-tablebody js-plp-list-tbody']//tr[1]//td[7]");
	public By byAddToCart= By.xpath("//*[@class='plp-list__table-tablebody js-plp-list-tbody']//tr[1]//td[9]/div/div/button");
	public By byAddToList= By.xpath("//*[@class='plp-list__table-tablebody js-plp-list-tbody']//tr[1]//td[9]/div/button[1]");
	public By byAddToListButton= By.xpath("//*[@class='plp-header__addtolist']");
	public By byFavorites= By.xpath("//*[@class='plp-list__table-tablebody js-plp-list-tbody']//tr[1]//td[9]/div/button[2]");
	public By byProductIcon= By.xpath("//*[@class='plp-list__table-tablebody js-plp-list-tbody']/tr[1]/td[1]");
	public By bySelectionOption= By.xpath("//*[@class='plp-list__table-tablebody js-plp-list-tbody']/tr[1]/td[1]/label/span");
	public By byPagination = By.xpath("//*[@class='pagination app-js__pagination']");
	public By bySortByDropDown = By.xpath("//*[@class='dropdown__btn dropdown__btn--noform js-dropdown-inp text-left dropdown-toggle']");
	public By bySortByDropDownList= By.xpath("//*[@data-selected-event='ui-sortby-selected']/div/div//button");
	public By byNumberOfItemsList= By.xpath("//*[@class='plp-list__table-tablebody js-plp-list-tbody']/tr");


	public void Productname(Integer productnumber){
		List<WebElement> productList =  LocalDriverManager.getDriver().findElements(byProducttile);
		if(productnumber<productList.size()) {
			if(productList.get(productnumber).getAttribute("href")!= null) {
				productList.get(productnumber).click();
			}
		}
	}
	public String productDetailText() {
		return LocalDriverManager.getDriver().findElement(byProductDetailtext).getText();
	}
	public WebElement listViewIcon() {
		return LocalDriverManager.getDriver().findElement(byListViewIcon);
	}
	public WebElement itemNumber() {
		return LocalDriverManager.getDriver().findElement(byItemNumber);
	}
	public WebElement itemName() {
		return LocalDriverManager.getDriver().findElement(byItemName);
	}
	public WebElement brand() {
		return LocalDriverManager.getDriver().findElement(byBrand);
	}
	public WebElement packSize() {
		return LocalDriverManager.getDriver().findElement(byPackSize);
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
	public WebElement addToListButton() {
		return LocalDriverManager.getDriver().findElement(byAddToListButton);
	}
	public WebElement favorites() {
		return LocalDriverManager.getDriver().findElement(byFavorites);
	}
	public WebElement productIcon() {
		return LocalDriverManager.getDriver().findElement(byProductIcon);
	}
	public WebElement SelectionOption() {
		return LocalDriverManager.getDriver().findElement(bySelectionOption);
	}
	public WebElement pagination() {
		return LocalDriverManager.getDriver().findElement(byPagination);
	}
	public WebElement sortByDropDown() {
		return LocalDriverManager.getDriver().findElement(bySortByDropDown);
	}
	public List<WebElement> sortByDropDownList() {
		return LocalDriverManager.getDriver().findElements(bySortByDropDownList);
	}
	public List<WebElement> numberOfItemsList() {
		return LocalDriverManager.getDriver().findElements(byNumberOfItemsList);
	}






}
