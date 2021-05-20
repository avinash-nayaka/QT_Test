package com.automationpractice.steps;

import org.junit.Assert;

import com.automationpractice.testbase.BaseClass;
import com.test.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountSteps extends CommonMethods
{
	@When("user clicks account information link")
	public void user_clicks_account_information_link() 
	{
	    myAccountPage.clickOnMyAccount();
	}

	@Then("user clicks my personal information option")
	public void user_clicks_my_personal_information_option()
	{
	    myAccountPage.clickOnMyPersInfoOption();
	}

	@Then("user updates first name {string}")
	public void user_updates_first_name(String firstName)
	{
		identityPage.enterFirstName(firstName);
		identityPage.enterOldPassword(password);
	}

	@Then("user clicks save button")
	public void user_clicks_save_button() 
	{
		identityPage.clickSaveButton();
	}

	@Then("user verifies success message {string}")
	public void user_verifies_success_message(String expMsg) 
	{
		Assert.assertEquals(expMsg, identityPage.getProfileUpdateCnfrmMsg());
		BaseClass.tearDown();
	}

}
