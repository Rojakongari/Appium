Feature: Check home page functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the homepage

  Scenario: verify homepage
    Then OrangeHRM image is displayed

  Scenario: click on Admin
    When user clicks on Admin
    Then Admin page is displayed
