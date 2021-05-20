package com.automationpractice.steps;

import org.junit.Assert;

import com.test.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderVerifySteps extends CommonMethods
{
	@When("user clicks my account link")
	public void user_clicks_my_account_link()  
	{
		myAccountPage.clickOnMyAccount();
	}

	@Then("user clicks order history and details options")
	public void user_clicks_order_history_and_details_options() 
	{
		myAccountPage.clickOnOrderOption();
	}

	@Then("user verifies purchased order from order reference")
	public void user_verifies_purchased_order_from_order_reference() 
	{
		Assert.assertTrue(orderHistoryPage.getOrderRefList().contains(ShoppingSteps.shoppingOrderRef));
	}
}
