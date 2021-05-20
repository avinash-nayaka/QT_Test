package com.test.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationpractice.testbase.PageInitializer;



public class CommonMethods extends PageInitializer{

	public static void sendText(WebElement element, String text) 
	{
		element.clear();
		element.sendKeys(text);
	}
	
	public static void clickRadioOrCheckbox(List<WebElement> listElement, String value) 
	{
		String actualValue;

		for (WebElement el : listElement) 
		{
			actualValue = el.getAttribute("value").trim();
			if (el.isEnabled() && actualValue.equals(value)) 
			{
				el.click();
				break;
			}
		}
	}
	
	public static void selectDropdown(WebElement element, String textToSelect) {
		try {
			Select select = new Select(element);

			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {
				if (el.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}
	
	public static String getSubString(String fromString, String beforeString, String afterString)
	{
		int stringLength = beforeString.length();
		System.out.println(stringLength);
		int startIndex = fromString.indexOf(beforeString);
		String str1 = fromString.substring(startIndex+stringLength);
		int endIndex = str1.indexOf(afterString);
		String subStr;
		try
		{
			subStr = str1.substring(0, endIndex);
		}
		catch(Exception rv)
		{
			subStr =  fromString;
		}
		return subStr;
	}
	
	public static void selectDropdown(WebElement element, int index) {

		try {
			Select select = new Select(element);

			int size = select.getOptions().size();

			if (size > index) {
				select.selectByIndex(index);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}
	
	public static WebDriverWait getWaitObject() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);

		return wait;
	}
	
	public static WebElement waitForClickability(WebElement element)
	{
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void click(WebElement element) 
	{
		waitForClickability(element);
		element.click();
	}

	public static void wait(int seconds) 
	{
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public static void scrollToElement(WebElement element) 
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}
	
	public static byte[] takeScreenshot(String filename)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;

		byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);

		File file = ts.getScreenshotAs(OutputType.FILE);
		// create destination as : filepath + filename + timestamp + .png
		String destination = Constants.SCREENSHOT_FILEPATH + filename + getTimeStamp() + ".png";

		try {
			FileUtils.copyFile(file, new File(destination));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return picBytes;
	}
	
	public static byte[] getWebElementScreenShot(String fileName)
    {
		TakesScreenshot f1 = (TakesScreenshot) driver;
		byte[] picBytes = f1.getScreenshotAs(OutputType.BYTES);
        File sourceFile = f1.getScreenshotAs(OutputType.FILE);
        BufferedImage bufferdImage = null;
        WebElement webElement = driver.findElement(By.tagName("html"));
		try
        {
			bufferdImage = ImageIO.read(sourceFile);
			Rectangle  heigh = webElement.getRect();
        	bufferdImage = bufferdImage.getSubimage(heigh.getX(), heigh.getY(), heigh.width, heigh.height);
        	ImageIO.write(bufferdImage, "png", sourceFile);
			FileUtils.copyFile(sourceFile, new File(Constants.SCREENSHOT_FILEPATH +fileName+getTimeStamp()+".png"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return picBytes;
    }
	
	public static String getTimeStamp() {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");

		return sdf.format(date.getTime());

	}

	
}
