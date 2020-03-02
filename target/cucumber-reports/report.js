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
formatter.uri("src/test/resources/features/mInventory_adjustments_employee.feature");
formatter.feature({
  "name": "Inventory adjustments verification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SmokeEmployee"
    }
  ]
});
formatter.scenario({
  "name": "As a employee, I have to be able use Inventory adjustments module",
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
  "name": "As a user, Requester clicks Inventory Adjustments button",
  "keyword": "When "
});
formatter.match({
  "location": "Inventory_adjustments_employess.as_a_user_Requester_clicks_Inventory_Adjustments_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Employee has to see Create, Import and Search buttons on the landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "Inventory_adjustments_employess.employee_has_to_see_Create_Import_and_Search_buttons_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user, requester should be able to click all three buttons",
  "keyword": "And "
});
formatter.match({
  "location": "Inventory_adjustments_employess.as_a_user_requester_should_be_able_to_click_all_three_buttons()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "As a User I have to able to search products from list by using search box",
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
  "name": "As a Employee, Requester clicks Inventory Adjustments button",
  "keyword": "When "
});
formatter.match({
  "location": "Inventory_adjustments_employess.as_a_Employee_Requester_clicks_Inventory_Adjustments_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "as a user i should click the search button to type and to find exact products",
  "keyword": "When "
});
formatter.match({
  "location": "Inventory_adjustments_employess.as_a_user_i_should_click_the_search_button_to_type_and_to_find_exact_products()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search functionality should offer all products which we are trying to find",
  "keyword": "Then "
});
formatter.match({
  "location": "Inventory_adjustments_employess.search_functionality_should_offer_all_products_which_we_are_trying_to_find()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "as  a  user i can choose any of them",
  "keyword": "And "
});
formatter.match({
  "location": "Inventory_adjustments_employess.as_a_user_i_can_choose_any_of_them()"
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
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d80.0.3987.122)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-KB1GGG2I\u0027, ip: \u002710.1.10.249\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\Jurabek\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:52987}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 9d72b511622e45461ddbefe00e6f4e8c\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.getText(RemoteWebElement.java:166)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy18.getText(Unknown Source)\r\n\tat step_definitions.reorderingRules_steps.ReorderingRules_steps.verify_Reordering_Rules_Table_Is_Displayed(ReorderingRules_steps.java:96)\r\n\tat ✽.Verify Reordering Rules Table Is Displayed(src/test/resources/features/reorderingRules.feature:38)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
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