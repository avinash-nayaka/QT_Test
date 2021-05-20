package com.automationpractice.steps;


import com.automationpractice.testbase.BaseClass;
import com.test.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks 
{
	public static void start() {
		BaseClass.setUp();
	}

	@After
	public static void end(Scenario scenario) {
		
		byte[] picture;
		if (scenario.isFailed()) {
			// take screenshot and save it in /failed
			picture = CommonMethods.takeScreenshot("failed/" + scenario.getName());
			
		} else {
			// take screenshot and put it in /passed folder

			picture = CommonMethods.takeScreenshot("passed/" + scenario.getName());
		}

		scenario.attach(picture, "image/png", scenario.getName());

	}
	
}
