Feature: Login

  @Login
  Scenario: Successful Login
    Given Start driver and browsers
    When Navigate to login url
    And Enter a valid Email
    And Enter a valid Password
    And Click to Sign in Button
    Then Open the logged in page

  @WomanTab
  Scenario: Woman Tab Control
    Given Open the main page
    When Click to the woman tab
    Then Log the upload information of woman tab photos

  @ManTab
  Scenario: Man Tab Control
    Given Open the main page
    When Click to the man tab
    Then Log the upload information of man tab photos

  @KidTab
  Scenario: Kid Tab Control
    Given Open the main page
    When Click to the kid tab
    Then Log the upload information of kid tab photos

  @Home&Life
  Scenario: Home&Life Tab Control
    Given Open the main page
    When Click to the home&life tab
    Then Log the upload information of home&life tab photos

  @Supermarket
  Scenario: Supermarket Tab Control
    Given Open the main page
    When Click to the supermarket tab
    Then Log the upload information of supermarket tab photos

  @Cosmetic
  Scenario: Cosmetic Tab Control
    Given Open the main page
    When Click to the cosmetic tab
    Then Log the upload information of cosmetic tab photos

  @Shoe&Bag
  Scenario: Shoe&Bag Tab Control
    Given Open the main page
    When Click to the shoe&bag tab
    Then Log the upload information of shoe&bag tab photos

  @Watch&Accessory
  Scenario: Watch&Accessory Tab Control
    Given Open the main page
    When Click to the watch&accessory tab
    Then Log the upload information of watch&accessory tab photos

  @Electronic
  Scenario: Electronic Tab Control
    Given Open the main page
    When Click to the electronic tab
    Then Log the upload information of electronic tab photos



