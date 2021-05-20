package com.automationpractice.testbase;

import com.automationpractice.pages.AddressPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.IdentityPage;
import com.automationpractice.pages.MyAccountPage;
import com.automationpractice.pages.OrderHistoryPage;
import com.automationpractice.pages.OrderPage;
import com.automationpractice.pages.TShirtsPage;
import com.automationpractice.pages.SignInPage;

public class PageInitializer extends BaseClass
{
	public static HomePage homePage;
	public static SignInPage signInPage;
	public static MyAccountPage myAccountPage;
	public static TShirtsPage tShirtsPage;
	public static OrderPage orderPage;
	public static AddressPage addressPage;
	public static IdentityPage identityPage;
	public static OrderHistoryPage orderHistoryPage;


	
	public static void initialize()
	{
		homePage = new HomePage();
		signInPage = new SignInPage();
		myAccountPage = new MyAccountPage();
		tShirtsPage = new TShirtsPage();
		orderPage = new OrderPage();
		addressPage = new AddressPage();
		identityPage = new IdentityPage();
		orderHistoryPage = new OrderHistoryPage();
	}
	
	

}
