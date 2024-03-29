package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class AccountSuccessPage {

	
	@FindBy(xpath ="//h1[contains(.,'Your Account Has Been Created!')]")
	public static WebElement accountSuccess;
	
	public AccountSuccessPage() {
		PageFactory.initElements(Base.driver, this);
	}
}
