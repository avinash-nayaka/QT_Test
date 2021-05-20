Feature: My Account feature

Scenario: Verify user name is updated correctly
	When user clicks account information link 
	Then user clicks my personal information option
	And user updates first name "abc"
	And user clicks save button
	Then user verifies success message "Your personal information has been successfully updated."

