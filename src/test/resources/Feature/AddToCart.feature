Feature: AddTocart feature

  Scenario Outline: check login functionality with valid credentials
    Given Launch page
    When user enter <username> and <password> credentials
    And give click on login button
    Then Navigate to  Homepage
    Then Click on selected product
    Then Add product to cart
    Then Verify product in cart

    Examples: 
      | username | password |
      |  standard_user  | secret_sauce |
    
     
