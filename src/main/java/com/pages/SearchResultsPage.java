package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.framework.Elements;

public class SearchResultsPage {
	@FindBy(linkText = "Samsung SyncMaster 941BW")
  public static WebElement SamsungProduct;
	@FindBy(xpath = "//p[contains(.,'There is no product that matches the search criteria.')]")
	public static WebElement noResultsFound;
	
	@FindBy(xpath = "//span[contains(.,'Add to Cart')]")
	public static WebElement addtoCart;
	
	public SearchResultsPage() {
		PageFactory.initElements(Base.driver,this);
	}
	
	public static void addFirstSearchResulttoCart() {
	
		Elements.click(addtoCart);

	}
}
