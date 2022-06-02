Feature: Functionality of Swaglabs


Background: 
Given User is present in the login page of swaglabs
When User enters the username and password of swaglabs
And User clicks the login button of swaglabs
Then User is navigated to the homepage of swaglabs

Scenario: Testing the adding to the cart functionality
Given User is present the product item
When User clicks the item 
And User clicks the checkout button
Then User will be navigated to the details page

Scenario: Testing the logout feature
Given User is logged into the swaglabs website
When User clicks the burger button of swaglabs
When User clicks the logout link of the page
Then User will be navigated back to the login page