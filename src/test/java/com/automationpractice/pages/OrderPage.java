package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.CommonMethods;

public class OrderPage extends CommonMethods
{
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "total_price")
	WebElement shoppingTotalValue;
	
	@FindBy (xpath = "(//a[@title='Proceed to checkout'])[2]")
	WebElement proceedToCheckoutButton;
	
	@FindBy (xpath = "//button[@name='processAddress']")
	WebElement addrProceedToCheckoutButton;
	
	@FindBy (xpath = "//button[@name='processCarrier']")
	WebElement carrProceedToCheckoutButton;
	
	@FindBy (id = "id_address_delivery")
	WebElement addressDropDown;
	
	@FindBy (id = "cgv")
	WebElement tosCheckBox;
	
	@FindBy (xpath = "//a[@title='Pay by bank wire']")
	WebElement payByWireOption;
	
	@FindBy (xpath = "(//a[@title='Add'])[2]")
	WebElement addNewAddressButton;
	
	@FindBy (xpath = "//span[contains(text(),'I confirm my order')]")
	WebElement confirmOrderButton;
	
	@FindBy (className = "box")
	WebElement orderConfirmationText;
	
	
	public String getShoppingTotalValue()
	{
		return shoppingTotalValue.getText();
	}
	
	public void clickProceedToCheckoutButton()
	{
		proceedToCheckoutButton.click();
	}
	
	public void selectAddressDropDown(String addrAlias)
	{
		selectDropdown(addressDropDown, addrAlias);
	}
	
	
	
	public void clickAddrProceedToCheckoutButton()
	{
		addrProceedToCheckoutButton.click();
	}
	
	public void clickCarrProceedToCheckoutButton()
	{
		carrProceedToCheckoutButton.click();
	}
	
	public void checkToSCheckBox()
	{
		if(!tosCheckBox.isSelected())
			tosCheckBox.click();
	}
	
	public void clickPayByWireOption()
	{
		payByWireOption.click();
	}
	
	public void clickConfirmOrderButton()
	{
		confirmOrderButton.click();
	}
	
	public String getOrderReference()
	{
		String actOrderConfirmationText = orderConfirmationText.getText();
		String orderRef = getSubString(actOrderConfirmationText, "order reference ", " in the subject");
		return orderRef;
	}
}
