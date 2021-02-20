package com.cg.stepdef;

import org.junit.Assert;

import com.cg.page.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	LoginPage login;
	
	@Given("user is on practice site")
	public void user_is_on_practice_site() {
		
		login = new LoginPage();
	    
	}
	@When("user clicks on shop menu")
	public void user_clicks_on_shop_menu() {
	    
		login.clickShop();
	}
	@When("user clicks on home button")
	public void user_clicks_on_home_button() {
	    
		login.clickHome();
	}
	
	@When("user clicks on description tab")
	public void user_clicks_on_description_tab() {
	    
		login.viewDescription();
	}
	
	@When("user clicks on reviews tab")
	public void user_clicks_on_reviews_tab() {
	    
		login.viewReviews();
	}
	@Then("it must contain reviews")
	public void it_must_contain_reviews() {
	   
	}
	
	@Then("description should be shown")
	public void description_should_be_shown() {
	    
	}


	@Then("user checks whether home page has three sliders")
	public void user_checks_whether_home_page_has_three_sliders() {
	    Assert.assertTrue(login.checkSliderCount().contains(null));
	}
	
	@Then("user checks whether home page has three arrivals")
	public void user_checks_whether_home_page_has_three_arrivals() {
	    Assert.assertEquals(3, login.checkSliderCount());
	}
	
	@Then("user must click on image and add to basket")
	public void user_must_click_on_image_and_add_to_basket() {
	    
	}

}
