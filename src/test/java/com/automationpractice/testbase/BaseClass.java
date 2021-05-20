package com.automationpractice.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.test.utils.ConfigsReader;
import com.test.utils.Constants;


public class BaseClass {
	
	public static WebDriver driver;
	public static String userName, password;
	public static WebDriver setUp() 
	{
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		switch (ConfigsReader.getProperty("browser").toLowerCase()) 
		{
			case "chrome":
				System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
				driver = new FirefoxDriver();
				break;
			default:
				throw new RuntimeException("Browser is not supported!");
		}

		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(ConfigsReader.getProperty("url"));

		userName = ConfigsReader.getProperty("username");
		password = ConfigsReader.getProperty("password");
		
		PageInitializer.initialize();

		return driver;
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}


}
