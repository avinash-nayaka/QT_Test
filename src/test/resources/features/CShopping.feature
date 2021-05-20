Feature: Shopping T-Shirt and verify order feature 

Scenario: Verify T-Shirt selection functionality 
	When user logged in successfully 
	Then user clicked on tshirts link in menu 
	Then user selected the required shirt 
	
Scenario: Verify T-shirt buying functinality 
	When user clicked on add to cart button 
	And user clicked on proceeded to checkout button 
	Then user checked the shirt and payment summary 
	
Scenario: Verify add new delivery address functionality 
	When user clicked on add a new address button 
	Then user enters First name "abc" 
	Then user enters Last name "def" 
	Then user enters Address "abc" 
	Then user enters City "asas" 
	Then user selects state from dropdown "Alabama" 
	Then user eneter zipcode "00000"
	Then user eneters home phone "999999999" 
	And user eneters address reference "My address" 
	Then user clicks on save button 
	
Scenario: Verify delivery address functionality 
	When user chooses delivery address dropdown reference "My address" 
	Then user clicked on proceeded to checkout button in address page 
	
Scenario: Verify shipping functionality 
	When user clicks on terms check box 
	Then user clicked on proceeded to checkout button in shipping page 
	
Scenario: Verify choose payment functionality 
	When user selects pay by bank wire option 
	And user clicked on I confirm my order button 
	Then user gets the order reference number 
	
	
	
	
	