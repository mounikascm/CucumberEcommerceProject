package com.stefdefinition;

import org.junit.Assert;

import com.framework.Elements;
import com.pages.HeaderSection;
import com.pages.SearchResultsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	HeaderSection hearderSection = new HeaderSection();
	SearchResultsPage searchresultsPage = new SearchResultsPage();
	
	@When("I search for a product {string}")
	public void i_search_for_a_product(String product) {
		Elements.TypeText(HeaderSection.searchBox, product);
		Elements.click(hearderSection.searchButton);
	    
	}
	@Then("I should see the product in the search resultsil address")
	public void i_should_see_the_product_in_the_search_resultsil_address() {
	   Assert.assertTrue(Elements.isDisplayed(searchresultsPage.SamsungProduct));
	}

	@Then("I should see the page displaying the message {string}")
	public void i_should_see_the_page_displaying_the_message(String message) {
		
		Assert.assertTrue(Elements.VerifyTextEquals(searchresultsPage.noResultsFound, message));
	    	}


}
