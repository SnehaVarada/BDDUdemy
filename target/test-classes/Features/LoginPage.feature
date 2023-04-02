@tag
Feature: DS Algo Portal

  @tag
  Scenario: Launch application
    Given user is on login page
    When user clicks get button
    And user clicks on signin button
    And user enters username and password
    Then user clicks on login button
    Then user launches home page
