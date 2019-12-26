Feature: End to end scenarios for placing orders
	
	@Orders @One
	Scenario: Verify whether user is able to place an order
	  Given I login to the application 
	  When I add any product to Bag and checkout
	  And I place an order
	  Then I should see that the order is placed successfully