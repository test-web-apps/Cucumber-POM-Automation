Feature: Apperal & Accessories

  Scenario: Verify page title
    Given User is on the Apperel Page

  Scenario: Verify Sorting Functionality
    Given User is on Apperal & Accessories
    When User applies "Price High > low" filter
    Then Products title should be visible

  Scenario: Verify add to cart Functionality
    Given User is on the Apperel Page
    When User adds a Product to the cart
    Then Product "New Ladies High Wedge Heel Toe Thong Diamante Flip Flop Sandals"should be added to the cart
