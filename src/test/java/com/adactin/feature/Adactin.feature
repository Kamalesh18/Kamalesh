Feature: Login functionality for Adactin application 
   Scenario: User enters valid username and valid password 
	Given User launches application 
	When  User enters username "SowmiyaSri" 
	And User enters password "Sowmiya05" 
	Then User clicks login button
	
	Scenario: User searches the hotel
	    Given User enter location
	    When User enters hotel name
	    And User enters room type
	    And User enters number of rooms
	    And User enters checkin date
	    And User enters checkout date
	    And User enters adults per room
	    And User enters children per room
	    Then User click search button
	    
	    Scenario: User gets to view the hotel selection page 
	        Given User selects the hotel
	        When  User clicks the submit button 
	        Then something should be asserted
	
	Scenario: User gets to view the payment page
	    Given User enters first name
	    When User enters last name
	    And User enters address
	    And User enters credit card number 
	    And User selects credit card type
	    And User selects expiry date and year
	    And User enters CVV number
	    Then User clicks submit button
	    
	    
	    Scenario: User gets to view the confirmation page
	        Given user verifies the details
	        When User clicks the logout button
	        Then something should be asserted