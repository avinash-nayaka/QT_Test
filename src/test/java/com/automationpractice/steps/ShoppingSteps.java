package com.automationpractice.steps;

import com.test.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingSteps extends CommonMethods
{
	static String 	shoppingTotalValue,
					shoppingOrderRef;

	@When("user logged in successfully")
	public void user_logged_in_successfully() 
	{
	    System.out.println("User logged-in successfully");
	}

	@Then("user clicked on tshirts link in menu")
	public void user_clicked_on_tshirts_link_in_menu() 
	{
		myAccountPage.clickOnTshirtsMenu();
	}

	@Then("user selected the required shirt")
	public void user_selected_the_required_shirt() 
	{
		tShirtsPage.selectTShirt();
	}


	@When("user clicked on add to cart button")
	public void user_clicked_on_add_to_cart_button() 
	{
		tShirtsPage.clickOnAddToCartButton();
	}

	@When("user clicked on proceeded to checkout button")
	public void user_clicked_on_proceeded_to_checkout_button() 
	{
		tShirtsPage.clickOnProceedToCheckoutButton();
	}

	@Then("user checked the shirt and payment summary")
	public void user_checked_the_shirt_and_payment_summary() 
	{
		shoppingTotalValue = orderPage.getShoppingTotalValue();
	}

	@When("user clicked on add a new address button")
	public void user_clicked_on_add_a_new_address_button() 
	{
		orderPage.clickProceedToCheckoutButton();
	}

	@Then("user enters First name {string}")
	public void user_enters_first_name(String firstName) 
	{
		if(driver.getTitle().equals("Address - My Store"))
			addressPage.enterFirstName(firstName);
	}

	@Then("user enters Last name {string}")
	public void user_enters_last_name(String lastName) 
	{
		
		if(driver.getTitle().equals("Address - My Store"))
			addressPage.enterlastName(lastName);
	    
	}

	@Then("user enters Address {string}")
	public void user_enters_address(String address)
	{
		if(driver.getTitle().equals("Address - My Store"))
			addressPage.enterAddress(address);
	}

	@Then("user enters City {string}")
	public void user_enters_city(String city) 
	{
		if(driver.getTitle().equals("Address - My Store"))
			addressPage.enterCity(city);
	}

	@Then("user selects state from dropdown {string}")
	public void user_selects_state_from_dropdown(String state) 
	{
		if(driver.getTitle().equals("Address - My Store"))
			addressPage.selectState(state);
	}

	@Then("user eneter zipcode {string}")
	public void user_eneter_zipcode(String zipCode) 
	{
		if(driver.getTitle().equals("Address - My Store"))
			addressPage.enterZipcode(zipCode);
	}
	
	@Then("user eneters home phone {string}")
	public void user_eneters_home_phone(String phone) 
	{
		if(driver.getTitle().equals("Address - My Store"))
			addressPage.enterHomePhone(phone);
	}

	@Then("user eneters address reference {string}")
	public void user_eneters_address_reference(String alias) 
	{
		if(driver.getTitle().equals("Address - My Store"))
			addressPage.enterAddrRef(alias);
	}

	@Then("user clicks on save button")
	public void user_clicks_on_save_button() 
	{
		if(driver.getTitle().equals("Address - My Store"))
			addressPage.clickSaveButton();
	}

	@When("user chooses delivery address dropdown reference {string}")
	public void user_chooses_delivery_address_dropdown_reference(String alias) 
	{
	   orderPage.selectAddressDropDown(alias);
	}

	@Then("user clicked on proceeded to checkout button in address page")
	public void user_clicked_on_proceeded_to_checkout_button_in_address_page() 
	{
	    orderPage.clickAddrProceedToCheckoutButton();
	}

	@When("user clicks on terms check box")
	public void user_clicks_on_terms_check_box() 
	{
	    orderPage.checkToSCheckBox();
	}

	@Then("user clicked on proceeded to checkout button in shipping page")
	public void user_clicked_on_proceeded_to_checkout_button_in_shipping_page() 
	{
	    orderPage.clickCarrProceedToCheckoutButton();
	}

	@When("user selects pay by bank wire option")
	public void user_selects_pay_by_bank_wire_option() 
	{
		orderPage.clickPayByWireOption();
	}

	@When("user clicked on I confirm my order button")
	public void user_clicked_on_i_confirm_my_order_button() 
	{
		orderPage.clickConfirmOrderButton();
	}

	@Then("user gets the order reference number")
	public void user_gets_the_order_reference_number() 
	{
		shoppingOrderRef = orderPage.getOrderReference();
	}

}
