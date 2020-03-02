@SmokeEmployee @SmokeManager
Feature: As User I should be able to Create, Import and use Searching func


    Scenario: Verify Create Scrap Products buttons
      Given User should be able to click on Scrap button
      And User should be able to click on create button
      And  User should be able to see form sheet
      And Verify Product text button is correct!
      And User should be able to input numbers on Quantity field
      And Verify Quantity text button is correct!
      And User should be able to input info on Source Document field
      And Verify Source Document text button is correct!
      And User should be able to click on Expected Date filed
      And Verify Expected Date text button is correct!
      Then User should be able to click on Discard Button
      And User should be able to click Ok on alert window

    Scenario: Verify Import Scrap products buttons
      Given User should be able to click on Scrap button
      And User should be able to click on import button
      And Verify Test Import Button is Displayed
      And Verify Import Button in second page is Displayed
      And Verify Select a CSV or Excel file to import text is Displayed
      And Verify Reload File Button is Displayed
      And Verify Load File Button is Displayed
      And Verify Input Field is Displayed
      And Verify Help Button is Displayed
      And Verify Cancel Button is Displayed

     Scenario: Verify Scrap Search Buttons
       Given User should be able to click on Scrap button
       And User should be able to click on MangifyingGlass Button
       And User should be able to click on Filter Button
       And User should be able to click on Group By Button
       And Verify Product Selection is Displayed
       And Verify Location Selection is Displayed
       And Verify Scrap Location Selector is Displayed
       And Verify Add Custom Group Selector is Displayed
       And User should be able to click Favorites Button
       And Verify Save Current Search is Displayed
       And Verify Add To My Dashboard is Displayed
       Then User should be able to write in Search Input Field and click ENTER