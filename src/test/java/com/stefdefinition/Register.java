package com.stefdefinition;

import java.time.Duration;

import org.junit.Assert;

import com.base.Base;
import com.framework.Elements;
import com.framework.Waits;
import com.pages.AccountSuccessPage;
import com.pages.HeaderSection;
import com.pages.RegisterPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	HeaderSection headersection = new HeaderSection();
	RegisterPage registerPage = new RegisterPage();
	AccountSuccessPage accountSuccessPage = new AccountSuccessPage();
	
	@Given("^Launch the application$")
	public void launch_the_application() {
		
		Base.driver.get(Base.reader.getUrl());
	}

	@And("^Navigate to Account Registration page$")
	public void navigate_to_account_registration_page() {
     Elements.click(HeaderSection.myAccountLink);
     Elements.click(HeaderSection.register);
	}

	@When("^Provide all the below valid details$")
	public void provide_all_the_below_valid_details(io.cucumber.datatable.DataTable dataTable) {
		RegisterPage.enterAllDetails(dataTable, "unique");

	}

	@When("^Select the Privacy Policy$")
	public void select_the_privacy_policy() {
		Elements.click(RegisterPage.privacyPolicy);
	}

	@And("^Click on Continue button$")
	public void click_on_continue_button() {
		Elements.click(RegisterPage.continueButton);
		
	}

	@Then("^Should see that the User Account has successfully created$")
	public void should_see_that_the_user_account_has_successfully_created() {
		Waits.waitUntilElementToClick(Duration.ofSeconds(10), accountSuccessPage.accountSuccess);
		Assert.assertTrue(Elements.isDisplayed(accountSuccessPage.accountSuccess));

	}
    @And("^Should see that the User Account is not created$")
public void Should_see_that_the_User_Account_is_not_created() {
    	Assert.assertTrue(Elements.isDisplayed(registerPage.registerbutton));
    	
    }
    @And("subscribe to Newsletter")
public void subscribe_to_Newsletter() {
    	Elements.click(registerPage.yestoNewsletter);
    	
    }
    
    @Then("^Should see the error messages informing the user to fill the mandatory fields$")
    public void Should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields() {
    	Assert.assertTrue(Elements.isDisplayed(registerPage.firstNameError));
    	Assert.assertTrue(Elements.isDisplayed(registerPage.lastNameError));
    	Assert.assertTrue(Elements.isDisplayed(registerPage.emailError));
    	Assert.assertTrue(Elements.isDisplayed(registerPage.telephoneError));
    	Assert.assertTrue(Elements.isDisplayed(registerPage.passwordError));
		Waits.waitUntilElementToClick(Duration.ofSeconds(20), registerPage.mainError);

    	Assert.assertTrue(Elements.isDisplayed(registerPage.mainError));

    	
    }
    
    @When("I provide the below duplicate details into the fields")
    public void i_provide_the_below_duplicate_details_into_the_fields(io.cucumber.datatable.DataTable dataTable) {
		RegisterPage.enterAllDetails(dataTable, "duplicate");
    
    }
    @Then("should see the warning message stating that the user is already created")
    public void should_see_the_warning_message_stating_that_the_user_is_already_created() {
		Waits.waitUntilElementToClick(Duration.ofSeconds(20), registerPage.mainError);

    	Assert.assertTrue(Elements.VerifyTextEquals(registerPage.mainError, "Warning: E-Mail Address is already registered!"));
    	
    }



}
