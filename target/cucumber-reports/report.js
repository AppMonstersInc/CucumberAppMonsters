$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "name": "As a Employee user should login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as Manager",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.step({
  "name": "As a manager i log get in  to BRITE ERP",
  "keyword": "Then "
});
formatter.match({
  "location": "login_steps.as_a_manager_i_log_get_in_to_BRITE_ERP()"
});
formatter.result({
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
formatter.uri("src/test/resources/features/wearehouse.feature");
formatter.feature({
  "name": "Inventory configuration",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.scenario({
  "name": "As a Manager I should be able to use Inventory Configuration in the home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeManager"
    }
  ]
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
  "name": "As a Manager should be able to see the Warehouse Management",
  "keyword": "And "
});
formatter.match({
  "location": "Wearehouse_stepes.as_a_Manager_should_be_able_to_see_the_Warehouse_Management()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a  manager should be able to click the Warehouse Management button",
  "keyword": "Then "
});
formatter.match({
  "location": "Wearehouse_stepes.as_a_manager_should_be_able_to_click_the_Warehouse_Management_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying warehouse button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeManager"
    }
  ]
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
  "name": "As a manager should be able to click the Wearhouse button and be navigate to the Wearhouse page",
  "keyword": "And "
});
formatter.match({
  "location": "Wearehouse_stepes.as_a_manager_should_be_able_to_click_the_Wearhouse_button_and_be_navigate_to_the_Wearhouse_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As manager should be able to see the search box",
  "keyword": "Then "
});
formatter.match({
  "location": "Wearehouse_stepes.as_manager_should_be_able_to_see_the_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Operation types",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeManager"
    }
  ]
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
  "name": "As a manager should be able to click the Operations types button and be navigate to the Operations types page",
  "keyword": "And "
});
formatter.match({
  "location": "Wearehouse_stepes.as_a_manager_should_be_able_to_click_the_Operations_types_button_and_be_navigate_to_the_Operations_types_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a manager i should be able to create",
  "keyword": "And "
});
formatter.match({
  "location": "Wearehouse_stepes.as_a_manager_i_should_be_able_to_create()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As manager i should be able to click the import button",
  "keyword": "And "
});
formatter.match({
  "location": "Wearehouse_stepes.as_manager_i_should_be_able_to_click_the_import_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a manager i should be able to click the search box",
  "keyword": "Then "
});
formatter.match({
  "location": "Wearehouse_stepes.as_a_manager_i_should_be_able_to_click_the_search_box()"
});
formatter.result({
  "status": "passed"
});
});