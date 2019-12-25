Feature: Registraition functionality scenarios

	@Register @One
  Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
    	| FirstName | golan 									|
    	| LastName  | hammer 								|
    	| Email			| golanhammer1@gmail.com |
    	| Telephone	| 9212345678						|
    	| Password	| hammer12345								|
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see that the User Account has successfully created