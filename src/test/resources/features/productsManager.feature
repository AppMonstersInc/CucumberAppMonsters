@SmokeManager
Feature:As a manager I should be able to create product inside products page

  Scenario:Manager should be able to click to Products button
    Given Click to inventory Module button
    And Verify Products button is displayed
    And Manager clicks on products button
    Then Manager should be navigated to Products page

  Scenario:Manager should be able to create product
    Given Click to inventory Module button
    And Verify create button is displayed
    And Click on the create button
    And Fill out the form
    Then Verify new product is added to the list