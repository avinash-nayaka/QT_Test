package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.CommonMethods;

public class AddressPage extends CommonMethods
{
	public AddressPage() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "firstname")
	WebElement firstNameTextBox;
	
	@FindBy(id = "lastname")
	WebElement lastNameTextBox;
	
	@FindBy(id = "address1")
	WebElement addressTextBox;
	
	@FindBy(id = "city")
	WebElement cityTextBox;
	
	@FindBy(id = "id_state")
	WebElement stateDropDown;
	
	@FindBy(id = "postcode")
	WebElement zipCodeTextBox;

	@FindBy(id = "id_country")
	WebElement countryDropDown;

	@FindBy(id = "phone")
	WebElement homePhoneTextBox;
	
	@FindBy(id = "alias")
	WebElement addressRefTextBox;

	@FindBy(id = "submitAddress")
	WebElement saveButton;

	public void enterFirstName(String firstName) 
	{
		firstNameTextBox.clear();
		firstNameTextBox.sendKeys(firstName);
	}
	
	public void enterlastName(String lastName) 
	{
		lastNameTextBox.clear();
		lastNameTextBox.sendKeys(lastName);
	}
	
	public void enterAddress(String address) 
	{
		addressTextBox.clear();
		addressTextBox.sendKeys(address);
	}
	
	public void enterCity(String city) 
	{
		cityTextBox.clear();
		cityTextBox.sendKeys(city);
	}
	
	public void selectState(String state) 
	{
		selectDropdown(stateDropDown, state);
	}
	
	public void selectCountry(String country) 
	{
		selectDropdown(countryDropDown, country);
	}
	
	public void enterZipcode(String zipcode) 
	{
		zipCodeTextBox.clear();
		zipCodeTextBox.sendKeys(zipcode);
	}
	
	public void enterHomePhone(String homePhone) 
	{
		homePhoneTextBox.clear();
		homePhoneTextBox.sendKeys(homePhone);
	}
	
	public void enterAddrRef(String addrRef) 
	{
		addressRefTextBox.clear();
		addressRefTextBox.sendKeys(addrRef);
	}
	
	public void clickSaveButton()
	{
		saveButton.click();
	}
}
