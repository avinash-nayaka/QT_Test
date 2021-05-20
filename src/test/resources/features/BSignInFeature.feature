Feature: Sign in feature

Scenario: Verify invalid emailid error message
	When blank email id is entered ""
	And clicked on signin button with blank email id
	Then verify blank email error message "An email address required."
	
Scenario: Verify invalid password error message
	When email id entered is "abc@yahoo.com"
	And clicked on signin button with blank password
	Then verify blank password error message "Password is required."
	
Scenario: Verify successful login with valid Email id and Password
	When valid email id is entered
	And valid password is entered
	Then click on signin button
	And Signin should be successful
	Then verify page title "My account - My Store"
	