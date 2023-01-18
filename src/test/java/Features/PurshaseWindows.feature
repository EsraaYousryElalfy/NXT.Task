Feature: PurchaseWindows

  Scenario Outline: Register a new valid user
    Given The user launched the Application
    When  The user navigates to the Register page
    And   The user registers new User Successfully
    And   The User Registered Successfully
    And   The user clicks on continue button
    When  The user navigates to the Login page
    And   The User enters login credentials
    Then  The user logged in successfully
    When  The user searches about Product as "<Product>"
    And   The user selects the search suggestion no "<Suggestion>"
    And   The user adds the "<Product>" in the cart
    And   The user complete Checkout for "<ItemsNo>"
#    Then  The purchasing processing is done successfully
    Examples:
      | Product       | Suggestion | ItemsNo |
      | windows 8 Pro | 1          | 1       |




