package com.automationpractice.steps;

import org.junit.Assert;

import com.test.utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageSteps extends CommonMethods {
	
	@When("blank email id is entered {string}")
	public void blank_email_id_is_entered(String emailID) 
	{
	    signInPage.enterSignInEmailId(emailID);
	    
	}

	@And("clicked on signin button with blank email id")
	public void clicked_on_signin_button_with_blank_email_id() 
	{
	    signInPage.clickSignInButton();

	}

	@Then("verify blank email error message {string}")
	public void verify_blank_email_error_message(String expErrMsg) 
	{
		String actualErrMsg = signInPage.blankEmailErrorMsg.getText();
		
		Assert.assertEquals(expErrMsg, actualErrMsg);
	    
	}

	@When("email id entered is {string}")
	public void email_id_entered_is (String emailID) 
	{
	    signInPage.enterSignInEmailId(emailID);

	}

	@Then("clicked on signin button with blank password")
	public void clicked_on_signin_button_with_blank_password() 
	{
	    signInPage.clickSignInButton();
	}

	@Then("verify blank password error message {string}")
	public void verify_blank_password_error_message(String expErrMsg) 
	{
		String actualErrMsg = signInPage.blankPasswordErrorMsg.getText();	
		Assert.assertEquals(expErrMsg, actualErrMsg);
	}

	@When("valid email id is entered")
	public void evalid_email_id_is_entered()
	{
	    signInPage.enterSignInEmailId(userName);

	}

	@And("valid password is entered")
	public void enter_valid_password() 
	{
	    signInPage.enterSignInPassword(password);
	}

	@Then("click on signin button")
	public void click_on_signin_button() 
	{
	    signInPage.clickSignInButton();

	}
	
	@And("Signin should be successful")
	public void signin_should_be_successful() 
	{
	   System.out.println("Sign-in Successful");
	}
	
	@Then("verify page title {string}")
	public void verify_page_title(String expTitle)
	{
	   Assert.assertEquals(expTitle, driver.getTitle());
	}

}
