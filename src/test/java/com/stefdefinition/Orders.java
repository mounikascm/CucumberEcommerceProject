package com.stefdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait;

import com.framework.Browser;
import com.framework.Elements;
import com.framework.Waits;
import com.pages.CheckoutPage;
import com.pages.HeaderSection;
import com.pages.LoginPage;
import com.pages.OrderSuccessPage;
import com.pages.SearchResultsPage;
import com.pages.ShoppingCartPage;

import io.cucumber.java.en.*;

public class Orders {
	HeaderSection headerSection = new HeaderSection();
	LoginPage loginPage = new LoginPage();
	SearchResultsPage searchresultpage = new SearchResultsPage();
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	CheckoutPage checkoutPage = new CheckoutPage();
	OrderSuccessPage orderSucessPage = new OrderSuccessPage();
	
	
	@Given("I login to the application")
	public void i_login_to_the_application() {
		Browser.openapplicationUrl();
		HeaderSection.navigatetoLoginPage();

		LoginPage.doLogin();
	}

	@When("I add any product to Bag and checkout")
	public void i_add_any_product_to_bag_and_checkout() {
		HeaderSection.searchProduct();
		SearchResultsPage.addFirstSearchResulttoCart();
		HeaderSection.navigateToShoppingcartPage();
		ShoppingCartPage.navigateToCheckOutPage();

	
	}

	@When("I place an order")
	public void i_place_an_order() {
		
		//CheckoutPage.placeAnOrder();
		Elements.click(ShoppingCartPage.checkoutBtn);
	}

	@Then("I should see that the order is placed successfully")
	public void i_should_see_that_the_order_is_placed_successfully() {
		Waits.waitUntilElementToClick(Duration.ofSeconds(50), shoppingCartPage.productunAvilabel);

		Assert.assertTrue(Elements.isDisplayed(shoppingCartPage.productunAvilabel));

	}


}
