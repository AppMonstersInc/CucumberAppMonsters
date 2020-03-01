@SmokeEmployee
Feature:As a user I should be able to click transfers button to use transfers functionalities.

  Background:
    When As a employee i log get in  to BRITE ERP
    And As a a employee|manager i am on Home page
    And I verify if inventory Module Tab is displayed
    And Click to inventory Module button
    And the user clicks the transfer button.


  Scenario:Verification of Transfer button
    Then the user should be able to see all stocks.


  Scenario: Validation of create button on Transfer page

    And the user clicks create button.
    Then the new stock form should be open.

  Scenario: Validation of search button on Transfer page
    When the user click search button.
    And the user should be able to write and click the search box button.


  Scenario: Verification of delete button on Transfer Page
    When the user chooses any item.
    Then action button should displayed.
    When the user clicks the action button.
    And the user should be able to see the export and delete modules button.
    Then the user should be able to click the delete button.