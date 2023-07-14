Feature: Checkout feature

  @Checkout
  Scenario Outline: To verify that checkout is working from search page
    Given user is in the Homepage
    When user click on search textbox and enters "<query>"
    Then the text "Welcome to Kapiva!" should be on the login page
    Examples:
      |  query |
      | get    |
      | shila  |