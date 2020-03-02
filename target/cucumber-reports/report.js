$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "name": "As a Employee user should login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as Employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a employee i log get in  to BRITE ERP",
  "keyword": "Then "
});
formatter.match({
  "location": "login_steps.as_a_employee_i_log_get_in_to_BRITE_ERP()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify home page BRITE ERP",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    },
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a a employee|manager i am on Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "login_steps.as_a_a_employee_manager_i_am_on_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if inventory Module Tab is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.i_verify_if_inventory_Module_Tab_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click to inventory Module button",
  "keyword": "Then "
});
formatter.match({
  "location": "login_steps.click_to_inventory_Module_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/productsEmployee.feature");
formatter.feature({
  "name": "Products module validation as an employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SmokeEmployee"
    }
  ]
});
formatter.scenario({
  "name": "As an employee I should be able to see Products button inside the Inventory module and when I click to products",
  "description": "  button I should be navigated to Products page",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click to inventory Module button",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.click_to_inventory_Module_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Verify Products button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Products_employee_step_defs.i_Verify_Products_button_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click to products button",
  "keyword": "And "
});
formatter.match({
  "location": "Products_employee_step_defs.i_click_to_products_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be navigated to the products page",
  "keyword": "Then "
});
formatter.match({
  "location": "Products_employee_step_defs.i_should_be_navigated_to_the_products_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "As an employee I should be able to search Items from the products page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click to inventory Module button",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.click_to_inventory_Module_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click to products button",
  "keyword": "And "
});
formatter.match({
  "location": "Products_employee_step_defs.i_click_to_products_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify products page is opened",
  "keyword": "And "
});
formatter.match({
  "location": "Products_employee_step_defs.i_verify_products_page_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify list of products items displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Products_employee_step_defs.i_verify_list_of_products_items_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify search box is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Products_employee_step_defs.i_verify_search_box_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for an item",
  "keyword": "When "
});
formatter.match({
  "location": "Products_employee_step_defs.i_search_for_an_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify items listed by name as searched",
  "keyword": "And "
});
formatter.match({
  "location": "Products_employee_step_defs.i_verify_items_listed_by_name_as_searched()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click to the selected item",
  "keyword": "When "
});
formatter.match({
  "location": "Products_employee_step_defs.i_click_to_the_selected_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be navigated to selected items page",
  "keyword": "And "
});
formatter.match({
  "location": "Products_employee_step_defs.i_should_be_navigated_to_selected_items_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/reorderingRules.feature");
formatter.feature({
  "name": "As a Manager|Employee i should able to use reordering rules functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Reordering RulesButton is displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    },
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Manager|Employee on inventory module page",
  "keyword": "Given "
});
formatter.match({
  "location": "ReorderingRules_steps.manager_Employee_on_inventory_module_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify reordering rules is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "ReorderingRules_steps.verify_reordering_rules_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Manager|Employee click to reordering rules button",
  "keyword": "Then "
});
formatter.match({
  "location": "ReorderingRules_steps.manager_Employee_click_to_reordering_rules_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Reordering Rules Window",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    },
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Manager|Employee click to reordering rules button",
  "keyword": "Given "
});
formatter.match({
  "location": "ReorderingRules_steps.manager_Employee_click_to_reordering_rules_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Reordering Rules title is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ReorderingRules_steps.verify_Reordering_Rules_title_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the reordering Rules page have select columns with",
  "description": "  Name;Product;Minimum Quantity;Maximum Quantity;",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    },
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Manager|Employee click to reordering rules button",
  "keyword": "Given "
});
formatter.match({
  "location": "ReorderingRules_steps.manager_Employee_click_to_reordering_rules_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify reordering rules page contains columns with Name;Product;Minimum Quantity;Maximum Quantity;",
  "keyword": "Then "
});
formatter.match({
  "location": "ReorderingRules_steps.verify_reordering_rules_page_contains_columns_with_Name_Product_Minimum_Quantity_Maximum_Quantity()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Checkboxes Does Not Selected",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    },
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Manager|Employee click to reordering rules button",
  "keyword": "Given "
});
formatter.match({
  "location": "ReorderingRules_steps.manager_Employee_click_to_reordering_rules_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify reordering rules check boxes is enabled",
  "keyword": "Then "
});
formatter.match({
  "location": "ReorderingRules_steps.verify_reordering_rules_check_boxes_is_enabled()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate The Reordering Rules Header",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    },
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Manager|Employee click to reordering rules button",
  "keyword": "Given "
});
formatter.match({
  "location": "ReorderingRules_steps.manager_Employee_click_to_reordering_rules_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify reordering rules headers",
  "keyword": "Then "
});
formatter.match({
  "location": "ReorderingRules_steps.verify_reordering_rules_headers()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate The ProductName in Reordering Rules",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    },
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Manager|Employee click to reordering rules button",
  "keyword": "Given "
});
formatter.match({
  "location": "ReorderingRules_steps.manager_Employee_click_to_reordering_rules_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify The ProductName in Reordering Rules",
  "keyword": "Then "
});
formatter.match({
  "location": "ReorderingRules_steps.verify_The_ProductName_in_Reordering_Rules()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Reordering Rules Table Is Displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    },
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Manager|Employee click to reordering rules button",
  "keyword": "Given "
});
formatter.match({
  "location": "ReorderingRules_steps.manager_Employee_click_to_reordering_rules_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Reordering Rules Table Is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ReorderingRules_steps.verify_Reordering_Rules_Table_Is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Search Functionality On Reordering RulesPage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    },
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Manager|Employee click to reordering rules button",
  "keyword": "Given "
});
formatter.match({
  "location": "ReorderingRules_steps.manager_Employee_click_to_reordering_rules_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click to search box",
  "keyword": "And "
});
formatter.match({
  "location": "ReorderingRules_steps.click_to_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Search Functionality On Reordering RulesPage",
  "keyword": "Then "
});
formatter.match({
  "location": "ReorderingRules_steps.verify_Search_Functionality_On_Reordering_RulesPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/runScheduler.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SmokeEmployee"
    }
  ]
});
formatter.scenario({
  "name": "Verify Run Scheduler button is displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see Run scheduler button",
  "keyword": "And "
});
formatter.match({
  "location": "Run_Scheduler_steps.the_user_should_be_able_to_see_Run_scheduler_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Run Scheduler button is clickable",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to click",
  "keyword": "Given "
});
formatter.match({
  "location": "Run_Scheduler_steps.user_should_be_able_to_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "accept pop ups",
  "keyword": "And "
});
formatter.match({
  "location": "Run_Scheduler_steps.accept_pop_ups()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able tp see list",
  "keyword": "Then "
});
formatter.match({
  "location": "Run_Scheduler_steps.user_should_be_able_tp_see_list()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/transfers.feature");
formatter.feature({
  "name": "As a user I should be able to click transfers button to use transfers functionalities.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SmokeEmployee"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a employee i log get in  to BRITE ERP",
  "keyword": "When "
});
formatter.match({
  "location": "login_steps.as_a_employee_i_log_get_in_to_BRITE_ERP()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a a employee|manager i am on Home page",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.as_a_a_employee_manager_i_am_on_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if inventory Module Tab is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.i_verify_if_inventory_Module_Tab_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click to inventory Module button",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.click_to_inventory_Module_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the transfer button.",
  "keyword": "And "
});
formatter.match({
  "location": "Transfers_steps.the_user_clicks_the_transfer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verification of Transfer button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    }
  ]
});
formatter.step({
  "name": "the user should be able to see all stocks.",
  "keyword": "Then "
});
formatter.match({
  "location": "Transfers_steps.the_user_should_be_able_to_see_all_stocks()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a employee i log get in  to BRITE ERP",
  "keyword": "When "
});
formatter.match({
  "location": "login_steps.as_a_employee_i_log_get_in_to_BRITE_ERP()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a a employee|manager i am on Home page",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.as_a_a_employee_manager_i_am_on_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if inventory Module Tab is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.i_verify_if_inventory_Module_Tab_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click to inventory Module button",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.click_to_inventory_Module_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the transfer button.",
  "keyword": "And "
});
formatter.match({
  "location": "Transfers_steps.the_user_clicks_the_transfer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of create button on Transfer page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    }
  ]
});
formatter.step({
  "name": "the user clicks create button.",
  "keyword": "And "
});
formatter.match({
  "location": "Transfers_steps.the_user_clicks_create_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the new stock form should be open.",
  "keyword": "Then "
});
formatter.match({
  "location": "Transfers_steps.theNewStockFormShouldBeOpen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a employee i log get in  to BRITE ERP",
  "keyword": "When "
});
formatter.match({
  "location": "login_steps.as_a_employee_i_log_get_in_to_BRITE_ERP()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a a employee|manager i am on Home page",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.as_a_a_employee_manager_i_am_on_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if inventory Module Tab is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.i_verify_if_inventory_Module_Tab_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click to inventory Module button",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.click_to_inventory_Module_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the transfer button.",
  "keyword": "And "
});
formatter.match({
  "location": "Transfers_steps.the_user_clicks_the_transfer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation of search button on Transfer page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    }
  ]
});
formatter.step({
  "name": "the user click search button.",
  "keyword": "When "
});
formatter.match({
  "location": "Transfers_steps.the_user_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to write and click the search box button.",
  "keyword": "And "
});
formatter.match({
  "location": "Transfers_steps.the_user_should_be_able_to_write_and_click_the_search_box_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a employee i log get in  to BRITE ERP",
  "keyword": "When "
});
formatter.match({
  "location": "login_steps.as_a_employee_i_log_get_in_to_BRITE_ERP()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a a employee|manager i am on Home page",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.as_a_a_employee_manager_i_am_on_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if inventory Module Tab is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.i_verify_if_inventory_Module_Tab_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click to inventory Module button",
  "keyword": "And "
});
formatter.match({
  "location": "login_steps.click_to_inventory_Module_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the transfer button.",
  "keyword": "And "
});
formatter.match({
  "location": "Transfers_steps.the_user_clicks_the_transfer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verification of delete button on Transfer Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    }
  ]
});
formatter.step({
  "name": "the user chooses any item.",
  "keyword": "When "
});
formatter.match({
  "location": "Transfers_steps.the_user_chooses_any_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "action button should displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "Transfers_steps.action_button_should_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the action button.",
  "keyword": "When "
});
formatter.match({
  "location": "Transfers_steps.the_user_clicks_the_action_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see the export and delete modules button.",
  "keyword": "And "
});
formatter.match({
  "location": "Transfers_steps.the_user_should_be_able_to_see_the_export_and_delete_modules_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to click the delete button.",
  "keyword": "Then "
});
formatter.match({
  "location": "Transfers_steps.the_user_should_be_able_to_click_the_delete_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/zCloseDriver.feature");
formatter.feature({
  "name": "close driver",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Close all windows after test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeEmployee"
    },
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Close all windows logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Close.close_all_windows_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});