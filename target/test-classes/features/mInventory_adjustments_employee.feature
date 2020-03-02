
@SmokeEmployee
Feature: Inventory adjustments verification

  Scenario: As a employee, I have to be able use Inventory adjustments module
    When As a user, Requester clicks Inventory Adjustments button
    Then Employee has to see Create, Import and Search buttons on the landing page
    And As a user, requester should be able to click all three buttons

    Scenario: As a User I have to able to search products from list by using search box
      When As a Employee, Requester clicks Inventory Adjustments button
      When as a user i should click the search button to type and to find exact products
      Then search functionality should offer all products which we are trying to find
      And as  a  user i can choose any of them