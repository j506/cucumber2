Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And User is on login page
    When User enters <username> and <password>
    And User click on login button
    Then User is navigated to homepage

    Examples: 
      | username  | password |
      | jagannath |    12345 |
      | raju      |    12345 |
