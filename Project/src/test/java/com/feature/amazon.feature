Feature: E-Commerce Purchase

Scenario: User wants to order Iphone13 through Amazon 
    Given User wants to open the website
    When  User wants to click the Sigin Button
    Then  User can proceed to next page
    
Scenario: User wants to sigin the amazon
    Given User should enter the vaild email id or mobile number
    When  User wants to click the continue button
    Then  User can get into the next page
    
Scenario: User wants to provide some details
    Given User should enter the valid passcode
    When  User wants to click the signIn button
    Then  User will get into the amazon website
    
Scenario: User wants to search for their requirement
    Given User wants to enter iphone13 in the searchbox
    When  User should click the search button
    Then  User can show the results
    
Scenario: User wants to select the desired item
    Given User should click the desired item
    When  User will directed to next page
    
Scenario: User wants to buy the selected item
    Given User wants to click the buy now option
    When  User can get into the payment page
    
Scenario: User wants to do the payment
    Given User wants to click the procced to payment button
    Then  User will get into next page
    
Scenario: User wants to provide delivery address
    Given User should select the use this address button
    Then  User will directed to payment page

Scenario: User wants to provide payment details
    Given User want to click cvv button
    When  User should enter the cvv number
    Then  User will proceed to confirm the order
    
Scenario: User wants to quit the order
    Given User shoul click the logout icon
    Then  User logged out successfully
     
     
     
     
     
     
     
     
     
     