package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class OrderSuccessPage {

	@FindBy(linkText = "success")
	public static WebElement Successtext;
	
	
	
	public OrderSuccessPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	
}
