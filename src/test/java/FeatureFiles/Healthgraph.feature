Feature: Health graph QA Automation Assignment

Scenario: Verify search functionality for the multiple locality and description tag for the property

  Given user Launch the Application
  
  When user Buying the Desired Property
  
  And user Select the City
  
  And user Enter Locality in Search Box
  
  And user Select the Apartment Types
  
  And user Click Search button and Navigates To Property Listing Page
  
  And user ScrollDown the Property Page into Desired Property
  
  And user Click The Desired Property and Navigates To Property Description Page
  
  And user ScrollDown the Selected Property Page into Description Section
  
  Then user Confirm Whether The Description Present Or Not
  
  And user Validating the TestCases