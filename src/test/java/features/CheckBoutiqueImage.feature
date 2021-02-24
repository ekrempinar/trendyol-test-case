Feature: Check Boutique Images

  Scenario: Check Boutique Images
    Given Start driver and browsers
    When Go to a random boutique detail page
    Then Log the upload information of related boutique photos
