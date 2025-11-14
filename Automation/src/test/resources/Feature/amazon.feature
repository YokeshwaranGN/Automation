Feature: Amazon Product Cart Validation

  Scenario Outline: Verify product addition to the cart
    Given the browser is launched
    And the user searches for "<Product Name>"
    And the user selects the product from the search results
    And the product name and price are recorded
    When the user adds the product to the cart
    Then the product added to the cart should match the recorded details

  Examples:
    | Product Name |
    | iPhone       |
