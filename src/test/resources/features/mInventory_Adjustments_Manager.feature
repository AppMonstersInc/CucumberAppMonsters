
@SmokeManager
Feature:As a Manager I have to be able use, manage Intentory Adjustments

  Scenario: As a manager, i can use Inventory Adjustments
When As a Manager, Requester clicks Inventory Adjustments button
Then Requester has to see Create, Import and Search buttons on the landing page
And As a manager, requester should be able to click all three buttons

  Scenario: Search functionality for managers
    When As a Manager, Requester clicks Inventory Adjustments button
    When as a manager i should click the search button to type and to find exact products
    And search funclitonalty should offer all products which we are trying to find
    Then as  a  manager i can choose any of them