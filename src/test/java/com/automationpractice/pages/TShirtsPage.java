package com.automationpractice.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.CommonMethods;

public class TShirtsPage extends CommonMethods
{
	public TShirtsPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	WebElement selectTshirt;
	
	@FindBy(xpath = "//a[@data-id-product='1']")
	WebElement addToCartButton;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	WebElement proceedToCheckOutButton;
	
	public void selectTShirt()
	{
		Actions actions = new Actions(driver);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", selectTshirt);
		wait(5);
		actions.moveToElement(selectTshirt); actions.perform();
	}
	
	public void clickOnAddToCartButton()
	{
		addToCartButton.click();
		wait(5);
	}
	
	public void clickOnProceedToCheckoutButton()
	{
		proceedToCheckOutButton.click();
	}
	
	
}
