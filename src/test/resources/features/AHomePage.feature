Feature: Automation Practice Home page feature

Scenario: Verify automationpractice.com home page functinality
	When Open browser and goto automationpractice home page
	Then Verify home page title
	And Verify home page logo
	
Scenario: Verify click on sign in functionality
	Given Click on Sign in link