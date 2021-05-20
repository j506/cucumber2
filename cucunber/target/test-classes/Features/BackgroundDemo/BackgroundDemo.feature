Feature: check homepage functionality

  Background: user is logged in
    Given User is on login
    When User enters username and password
    And  User clicks on the login button
    Then User is naviage to the homepage

  Scenario: check the logout link
    When user is clicked on welcome link
    Then logout link is dispalayed

  Scenario: verify the quick lunch toolbar  is present
    When user is clciks on dashboard link
    Then quick lunch toolbar is displayed
