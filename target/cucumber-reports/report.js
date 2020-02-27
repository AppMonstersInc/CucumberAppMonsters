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
});