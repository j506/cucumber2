Feature: feature to test Googlesearch functionality

  Scenario: validate googlesearch  is working
    Given browser is open
    And user is on googlesearch page
    When user enters a text in searchbox
    And hits enters
    Then user is navigating to the search results
