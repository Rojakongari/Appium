Feature: Login Feature

  Scenario Outline: check login functionality with valid credentials
    Given Enter url
    When user enters <username> and <password> credentials
    And click on login button
    Then Navigates to  Homepage
    

    Examples: 
      | username | password |
      |  standard_user  | secret_sauce |
      | problem_user  | secret_sauce |
      |locked_out_user | secret_sauce |

