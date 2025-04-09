@Regression @AddToCart @Regression #These @Tags can be use to run testcases individually. You can see this in Testrunner file.
Feature: Add items to cart and complete checkout

  Scenario: Add two random items to the cart
    Given User is logged in to SauceDemo
    When User adds two random items to the cart
    Then The cart should reflect the correct items
    
    Scenario: Complete the checkout process
    Given Items are in the cart
    When User proceeds to checkout and fills details
    Then The checkout should be completed successfully
    