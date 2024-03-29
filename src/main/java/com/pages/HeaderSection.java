package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class HeaderSection {
	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement myAccountLink;

	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(linkText="Login")
	public static WebElement login;

	
	public HeaderSection() {
		PageFactory.initElements(Base.driver, this);
	}
	
}
