Feature: As a Employee user should login
 @SmokeEmployee
  Scenario: Login as Employee
    Then As a employee i log get in  to BRITE ERP
  @SmokeManager
  Scenario: Login as Manager
    Then As a manager i log get in  to BRITE ERP
  @SmokeEmployee  @SmokeManager
    Scenario: Verify home page BRITE ERP
     Given As a a employee|manager i am on Home page
      And I verify if inventory Module Tab is displayed
      Then Click to inventory Module button
