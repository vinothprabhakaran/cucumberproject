Feature: Hotel Booking In Adactin Application

Scenario Outline: To Test The Login Page By using Correct Username and Password
Given  User Launch The Application In The Browser
When  User Enter The Below "<Username>" and "<Password>"

And  User check The Credintials
Then User Click The Login Page It Navigate To The Search Hotel Page


Examples:
|Username|Password|
|AAA|123|
|BBB|345|
|vinothprabhakaran|vinovetri|
|vvv|555|


 Scenario: To Test The Search Hotel Page By Giving Correct Inputs
When User the select the location that are given in the location Field
And User Select The Hotels That Are Given In The Hotels  Field
And User Select The Room type That Are Available in Room Type Field
And User Select How Many Room That User Wants In Number Of Rooms Field
And User Select Enter The Valid Check In Date IN Check In Field
And User Select Enter The Valid Check Out Date IN Check Out Field
And User Select The How Many Adults Per Room In Adults Per Room Field
And User Select The How Many Children Per Room In Children Per Room Field
Then User Click The Search Button and It Navigate to Search Hotel Page

Scenario: To Test The Search Hotel Page Functionality
When User Enter Into The Search hotel page user select radio button
And Click The Continue Then It Navigate To Book Hotel Page

Scenario: To Test The Book Hotel Page By Using Valid Inputs
When User Enter The Valid First Name In The First Name Field
And User Enter The Valid Last Name In The Last Name Field
And User Enter The Valid Address In Address Field
And User Enter The Valid 16 Digit Credit Card Number In Credit Card Number Field
And User Select The Card Type In  Credit Card Type Drop Down Field
And User Select The Card ExpiryMonth In ExpiryMonth Drop Down Field
And User Select The Card ExpiryYear In ExpiryYear Drop Down Field
And User Enter The Valid CVV Number In CVV Field
Then User Click The Book Now Button And It Navigate To Booking Confirmation Page

Scenario: To Verify The User That Hotel Booking Confirmation And Logout
When  Hotel Booking Is Done It Take Some Time To Conformation
Then  Hotel Booking Confirmed Then User Click The Logout Button And It Navigate To Login Page
