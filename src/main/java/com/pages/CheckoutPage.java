package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.framework.Elements;

public class CheckoutPage {

	
	@FindBy(id = "button-payment-address")
	public static WebElement continueBtnOfbillingDetails;
	
	@FindBy(id = "button-shipping-address")
	public static WebElement continueBtnOfDelivarydetailsSection;
	@FindBy(id = "button-shipping-method")
	public static WebElement continueBtnOfDelivarymethodSection;
	
	@FindBy(name = "agree")
	public static WebElement termsandConditionsCheckBox;
	
	@FindBy(id = "button-payment-method")
	public static WebElement continueBtnofPaymentMethodSection;
	
	@FindBy(id = "button-confirm")
	public static WebElement confirmOrderButton;
	
	public CheckoutPage() {
		PageFactory.initElements(Base.driver,this);
	}
	
	//public static void placeAnOrder() {
		//Elements.click(continueBtnOfbillingDetails);
//		Elements.click(continueBtnOfDelivarydetailsSection);
//		Elements.click(continueBtnOfDelivarymethodSection);
//		Elements.click(termsandConditionsCheckBox);
//		Elements.click(continueBtnofPaymentMethodSection);
//		Elements.click(confirmOrderButton);
//
	
//	}
}
