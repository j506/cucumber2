Feature: feature to test login functionality

  Scenario: Check login is successfull with valid credentials
    Given user is login page
    When user enters username and password
    And click on login button
    Then user is nevigated to the home page
