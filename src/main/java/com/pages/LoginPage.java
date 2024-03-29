package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.framework.Elements;

public class LoginPage {

	@FindBy(id = "input-email")
	public static WebElement emailField;
	@FindBy(id = "input-password")
	public static WebElement passwordField;
	@FindBy(xpath ="//input[@type='submit']")
	public static WebElement loginButton;
	
	@FindBy(xpath = "(//div[contains(.,'Warning: No match for E-Mail Address and/or Password.')])[2]")
	public static WebElement loginError;
	
	@FindBy(xpath = "(//a[contains(.,'Forgotten Password')])[1]")
	public static WebElement forgotpassword;
	
	
	@FindBy(xpath = "(//div[contains(.,'An email with a confirmation link has been sent your email address.')])[2]")
	public static WebElement emailSentmsg; 
	

public LoginPage() {
	PageFactory.initElements(Base.driver, this);
}

public static void doLogin(String email,String password) {
    Elements.TypeText(LoginPage.emailField,email );
    Elements.TypeText(LoginPage.passwordField,password );
    Elements.click(LoginPage.loginButton);

}
}
