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
});