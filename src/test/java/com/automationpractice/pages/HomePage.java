package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.CommonMethods;

public class HomePage extends CommonMethods
{
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@class='logo img-responsive']")
	public WebElement homePageLogo;
	
	@FindBy(linkText = "Sign in")
	public WebElement signIn_link;
	
	public String homePageTitle = "My Store";
	
	public void clickOnSignInLink ()
	{
		signIn_link.click();
	}
}
