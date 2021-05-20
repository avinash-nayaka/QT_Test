package com.automationpractice.steps;

import org.junit.Assert;

import com.test.utils.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends CommonMethods
{
	@When("^Open browser and goto automationpractice home page$")
	public void open_browser_and_goto_automationpractice_home_page() 
	{
	    Hooks.start();
	    System.out.println("Browser opened sucessfully");
	}

	@Then("^Verify home page title$")
	public void verify_home_page_title() 
	{
		String actualHomePageTitle = driver.getTitle();

		Assert.assertEquals(homePage.homePageTitle, actualHomePageTitle);
	}

	@And("^Verify home page logo$")
	public void verify_home_page_logo() 
	{
		Assert.assertTrue(homePage.homePageLogo.isDisplayed());
		
	}

	@Then("^Click on Sign in link$")
	public void click_on_sign_in_link() 
	{
		homePage.clickOnSignInLink();
	}
	
}
