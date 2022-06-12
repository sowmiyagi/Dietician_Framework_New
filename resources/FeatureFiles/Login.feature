#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Sign In Form 

  
  Scenario: Sign in form is visible
    Given User is on Dietician website
    When User clicks account icon and selects sign in
    Then Sign in form should open

  
  Scenario Outline: Sign in is successful with valid credentials
    Given User is on Sign in form
    When Enters "<username>" and "<Password>"
    And user click on signin button
    Then navigates to home page

    Examples: 
      | username | password |
      |Sowmiyaabc|Sowmiya@ABC|
      |Sowmiyaxyz|Sowmiyaxyz|
      
      
    
