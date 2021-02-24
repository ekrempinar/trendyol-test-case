Feature: Add To Basket

  Scenario: Go To The Detail Of Product And Add To Basket
    Given Start driver and browsers
    When Go to a random product detail
    And Click to add basket button
    Then Check product is added to basket