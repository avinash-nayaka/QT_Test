package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.CommonMethods;

public class IdentityPage extends CommonMethods
{
	public IdentityPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id = "firstname")
	WebElement firstNameTextBox;
	
	@FindBy(id = "lastname")
	WebElement lastNameTextBox;
	
	@FindBy (id = "old_passwd")
	WebElement oldPassordTextBox;
	
	@FindBy(xpath = "//button[@name='submitIdentity']")
	WebElement saveButton;
	
	@FindBy(xpath = "//p[@class='alert alert-success']")
	WebElement updateConfirmationMsg;
	
	public void enterFirstName(String firstName)
	{
		firstNameTextBox.clear();
		firstNameTextBox.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName)
	{
		lastNameTextBox.clear();
		lastNameTextBox.sendKeys(lastName);
	}
	
	public void enterOldPassword(String password)
	{
		oldPassordTextBox.clear();
		oldPassordTextBox.sendKeys(password);
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
	
	public String getProfileUpdateCnfrmMsg()
	{
		return updateConfirmationMsg.getText();
	}
}
