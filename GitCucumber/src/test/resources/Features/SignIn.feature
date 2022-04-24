#Author :  Komal
#Description : Task is to cerate new Repository on Github for which user must first sign in
# Verify user able to sign in with valid credentials
Feature: To test the Gihub UI

  Background: user is logged in

  Scenario Outline: 
    
    Given User is on Signin page
    When user enters <username> and <password>
    And click on sign in
    Then user is navigated to the main page

    Examples: 
      | username | password |
      | KDP-Test | New@2341 |

  Scenario: Verify issue dashboard is present
    Given User is on Signin page
    When user enters <username> and <password>
    And click on sign in
    And user clicks on issues link
    Then issues dashboard is displayed
 Examples: 
      | username | password |
      | KDP-Test | New@2341 |
  Scenario: Verify create new repository is enabled
  Given User is on Signin page
    When user enters <username> and <password>
    And click on sign in
    And user clicks on New repository
    Then create new repository header is displayed
Examples: 
      | username | password |
      | KDP-Test | New@2341 |