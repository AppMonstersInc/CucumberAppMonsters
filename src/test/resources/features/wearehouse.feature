@SmokeManager
Feature: Inventory configuration

  Scenario: As a Manager I should be able to use Inventory Configuration in the home page
    Given Manager|Employee on inventory module page
    And  As a Manager should be able to see the Warehouse Management
    Then As a  manager should be able to click the Warehouse Management button


  Scenario: Verifying warehouse button
    Given Manager|Employee on inventory module page
    And As a manager should be able to click the Wearhouse button and be navigate to the Wearhouse page
    Then As manager should be able to see the search box


  Scenario: Verify Operation types
    Given Manager|Employee on inventory module page
    And As a manager should be able to click the Operations types button and be navigate to the Operations types page
    And As a manager i should be able to create
    And As manager i should be able to click the import button
    Then As a manager i should be able to click the search box


