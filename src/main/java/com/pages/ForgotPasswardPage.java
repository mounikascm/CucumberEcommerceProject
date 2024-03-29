package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.framework.Elements;

public class ForgotPasswardPage {

@FindBy(id = "input-email")
public static WebElement emailField;

@FindBy(xpath = "//input[@value='Continue']")
public static WebElement continueButton;

public ForgotPasswardPage() {
	PageFactory.initElements(Base.driver, this);
}



}
