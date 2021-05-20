package com.automationpractice.pages;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.utils.CommonMethods;

public class OrderHistoryPage extends CommonMethods{
	
	public OrderHistoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//td[@class='history_link bold footable-first-column']")
	WebElement orderRefList;
	
	public List<String> getOrderRefList()
	{
		List<WebElement> orderWebEleList = driver.findElements(By.xpath("//td[@class='history_link bold footable-first-column']"));
		List<String> orderRefList = new LinkedList<>();
		
		for(WebElement orderWebEle : orderWebEleList)
			orderRefList.add(orderWebEle.getText());
		
		return orderRefList;
	}

}
