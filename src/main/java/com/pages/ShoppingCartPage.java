package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.framework.Elements;

public class ShoppingCartPage {

	
	@FindBy(xpath= "(//a[contains(.,'Checkout')])[3]")
	public static WebElement checkoutBtn;
	
	@FindBy(xpath = "//div[contains(@class,'alert alert-danger alert-dismissible')]")
	public static WebElement productunAvilabel;
	
	public ShoppingCartPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	public static void navigateToCheckOutPage() {
		Elements.click(checkoutBtn);

	}
}
