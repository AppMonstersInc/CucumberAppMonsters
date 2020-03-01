@SmokeEmployee
Feature: Products module validation as an employee


  Scenario: As an employee I should be able to see Products button inside the Inventory module and when I click to products
  button I should be navigated to Products page
    And Click to inventory Module button
    And I Verify Products button is displayed
    And I click to products button
    Then I should be navigated to the products page

    Scenario: As an employee I should be able to search Items from the products page
      And Click to inventory Module button
      And I click to products button
      And I verify products page is opened
      And I verify list of products items displayed
      And I verify search box is displayed
      When I search for an item
      And I verify items listed by name as searched
      When I click to the selected item
      And I should be navigated to selected items page



