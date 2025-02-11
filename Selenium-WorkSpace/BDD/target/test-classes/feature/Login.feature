Feature: Login functionality

  Scenario Outline: check login functionality with valid credentials
    Given User is on login page
    When user enters <username> and <password> credentials
    And click on login button
    Then user navigated to  homepage

    Examples: 
      | username | password |
      | Admin    | admin123 |