package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class MyAccountPage {


	@FindBy(xpath = "//a[contains(.,'Register for an affiliate account')]")
public static WebElement registeAffliateAccount;
	
	
	public MyAccountPage() {
		PageFactory.initElements(Base.driver,this);
	}
}
