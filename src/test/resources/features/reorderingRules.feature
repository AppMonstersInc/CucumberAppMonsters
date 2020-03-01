Feature: As a Manager|Employee i should able to use reordering rules functionality

  @SmokeEmployee  @SmokeManager
  Scenario: Verify Reordering RulesButton is displayed
    Given Manager|Employee on inventory module page
    And Verify reordering rules is displayed
    Then Manager|Employee click to reordering rules button

  @SmokeEmployee  @SmokeManager
  Scenario: Verify Reordering Rules Window
    Given Manager|Employee click to reordering rules button
    Then Verify Reordering Rules title is displayed

  @SmokeEmployee  @SmokeManager
  Scenario: Verify the reordering Rules page have select columns with
  Name;Product;Minimum Quantity;Maximum Quantity;
    Given Manager|Employee click to reordering rules button
    Then Verify reordering rules page contains columns with Name;Product;Minimum Quantity;Maximum Quantity;

  @SmokeEmployee  @SmokeManager
  Scenario: Verify Checkboxes Does Not Selected
    Given Manager|Employee click to reordering rules button
    Then Verify reordering rules check boxes is enabled

  @SmokeEmployee  @SmokeManager
  Scenario: Validate The Reordering Rules Header
    Given Manager|Employee click to reordering rules button
    Then Verify reordering rules headers

  @SmokeEmployee  @SmokeManager
  Scenario: Validate The ProductName in Reordering Rules
    Given Manager|Employee click to reordering rules button
    Then Verify The ProductName in Reordering Rules

  @SmokeEmployee  @SmokeManager
  Scenario: Verify Reordering Rules Table Is Displayed
    Given Manager|Employee click to reordering rules button
    Then Verify Reordering Rules Table Is Displayed

  @SmokeEmployee  @SmokeManager
  Scenario: Verify Search Functionality On Reordering RulesPage
    Given Manager|Employee click to reordering rules button
    And Click to search box
    Then Verify Search Functionality On Reordering RulesPage



