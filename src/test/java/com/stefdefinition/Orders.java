package com.stefdefinition;

import com.framework.Browser;

import io.cucumber.java.en.*;

public class Orders {
	@Given("I login to the application")
	public void i_login_to_the_application() {
		Browser.openapplicationUrl();
	}

	@When("I add any product to Bag and checkout")
	public void i_add_any_product_to_bag_and_checkout() {
	    	}

	@When("I place an order")
	public void i_place_an_order() {
	}

	@Then("I should see that the order is placed successfully")
	public void i_should_see_that_the_order_is_placed_successfully() {
	}


}
