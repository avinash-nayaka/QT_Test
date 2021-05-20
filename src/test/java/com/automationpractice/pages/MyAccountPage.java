package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.CommonMethods;

public class MyAccountPage extends CommonMethods
{
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "(//a[text()='T-shirts'])[2]")
	WebElement tShirtMenuLink;
	
	@FindBy (xpath = "//a[@title='Information']")
	WebElement myPersonalInformationOption;
	
	@FindBy(xpath = "//a[@class='account']")
	WebElement accountLink;
	
	@FindBy(xpath = "//a[@title='Orders']")
	WebElement orderOption;
	
	@FindBy(xpath = "//a[@title='Information']")
	WebElement personalInfo;

	public void clickOnTshirtsMenu()
	{
		tShirtMenuLink.click();
	}
	
	public void clickOnMyPersInfoOption()
	{
		myPersonalInformationOption.click();
	}
	
	public void clickOnMyAccount()
	{
		accountLink.click();
	}
	
	public void clickOnOrderOption()
	{
		orderOption.click();
	}
	
	public void clickOnPersonalInfo()
	{
		personalInfo.click();
	}
}
