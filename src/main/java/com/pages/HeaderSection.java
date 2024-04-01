package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.framework.Elements;

public class HeaderSection {
	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement myAccountLink;

	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(linkText="Login")
	public static WebElement login;
	
	@FindBy(name = "search")
	public static WebElement searchBox;
	
	@FindBy(xpath = "//i[@class='fa fa-search']")
	public static WebElement searchButton ;
	
	@FindBy(xpath = "//span[contains(.,'Shopping Cart')]")
	public static WebElement viewShoppingCart;
	
	
	public HeaderSection() {
		PageFactory.initElements(Base.driver, this);
	}
	
	
	public static void navigatetoLoginPage() {
		Elements.click(myAccountLink);
		Elements.click(login);
	}
	public static void searchProduct() {
		Elements.TypeText(searchBox,Base.reader.getProduct());
		Elements.click(searchButton);
	}
	
	public static void navigateToShoppingcartPage() {
		Elements.click(viewShoppingCart);
	}
	
	
}
