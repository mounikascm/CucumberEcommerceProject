package com.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.framework.Elements;

import io.cucumber.datatable.DataTable;

public class RegisterPage {

	@FindBy(id="input-firstname")
	public static WebElement firstName;

	@FindBy(id="input-lastname")
	public static WebElement lastName;

	@FindBy(id="input-email")
	public static WebElement email;

	@FindBy(id="input-telephone")
	public static WebElement telephone;

	@FindBy(id="input-password")
	public static WebElement password;

	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;

	@FindBy(name = "agree")
	public static WebElement privacyPolicy;

	@FindBy(css = "input[type = 'submit'][value = 'Continue']")
	public static WebElement continueButton;

	@FindBy(linkText="Register")
	public static WebElement registerbutton;

	@FindBy(css = "input[id='input-firstname']+div")
	public static WebElement firstNameError;
	@FindBy(css = "input[id='input-lastname']+div")
	public static WebElement lastNameError;
	@FindBy(css = "input[id='input-email']+div")
	public static WebElement emailError;
	@FindBy(css = "input[id='input-telephone']+div")
	public static WebElement telephoneError;
	@FindBy(css = "input[id='input-password']+div")
	public static WebElement passwordError;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	public static WebElement mainError;
	
	@FindBy(xpath= "(//input[@name='newsletter'])[1]")
	public static WebElement yestoNewsletter;


	public RegisterPage() {
		PageFactory.initElements(Base.driver, this);
	}

	public static void enterAllDetails(DataTable dataTable,String detailsType) {
		Map<String, String> map = dataTable.asMap(String.class,String.class);
		Elements.TypeText(firstName, map.get("FirstName") );
		Elements.TypeText(lastName,map.get("LastName"));
		Elements.TypeText(telephone,map.get("Telephone"));
		Elements.TypeText(password,map.get("Password"));
		Elements.TypeText(confirmPassword,map.get("Password"));
		
		if(detailsType.equalsIgnoreCase("duplicate")) {
			Elements.TypeText(email,map.get("Email"));

		}else {
			Elements.TypeText(email,System.currentTimeMillis()+map.get("Email"));

			
		}

	}
}
