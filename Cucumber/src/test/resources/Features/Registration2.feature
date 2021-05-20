
Feature: user must do the registartion the side before going to the login page.

  Scenario: user have to register the page in the webpage
    Given user have to come on the register the page
    When user fill the data before move login page
    And user click the registration buttton
    Then user go to the login page

