Feature: Order verification feature

Scenario: Verify purchased order
	When user clicks my account link
	Then user clicks order history and details options
	And user verifies purchased order from order reference