package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.CommonMethods;

public class SignInPage extends CommonMethods
{
	public SignInPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//div[@class='alert alert-danger']//li")
	public WebElement blankEmailErrorMsg;
	
	@FindBy(id = "SubmitLogin")
	public WebElement signInButton;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']//li")
	public WebElement blankPasswordErrorMsg;
	
	@FindBy(id = "email")
	public WebElement signInEmailTextBox;
	
	@FindBy(id = "passwd")
	public WebElement signInPasswordTextBox;
	
	public void enterSignInEmailId(String emailID)
	{
		signInEmailTextBox.clear();
		signInEmailTextBox.sendKeys(emailID);
	}
	
	public void enterSignInPassword(String password)
	{
		signInPasswordTextBox.clear();
		signInPasswordTextBox.sendKeys(password);
	}
	
	public void clickSignInButton()
	{
		signInButton.click();
	}
}
