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
formatter.before({
  "status": "passed"
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
formatter.uri("src/test/resources/features/productsManager.feature");
formatter.feature({
  "name": "As a manager I should be able to create product inside products page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.scenario({
  "name": "Manager should be able to click to Products button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click to inventory Module button",
  "keyword": "Given "
});
formatter.match({
  "location": "login_steps.click_to_inventory_Module_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Products button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "poducts_manager_step_defs.verify_Products_button_is_displayed()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Products button is NOT displayed!!! Failed!\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat step_definitions.products_manager_step_defs.poducts_manager_step_defs.verify_Products_button_is_displayed(poducts_manager_step_defs.java:19)\n\tat ✽.Verify Products button is displayed(src/test/resources/features/productsManager.feature:6)\n",
  "status": "failed"
});
formatter.step({
  "name": "Manager clicks on products button",
  "keyword": "And "
});
formatter.match({
  "location": "poducts_manager_step_defs.manager_clicks_on_products_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Manager should be navigated to Products page",
  "keyword": "Then "
});
formatter.match({
  "location": "poducts_manager_step_defs.manager_should_be_navigated_to_Products_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Manager should be able to create product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeManager"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click to inventory Module button",
  "keyword": "Given "
});
formatter.match({
  "location": "login_steps.click_to_inventory_Module_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify create button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "poducts_manager_step_defs.verify_create_button_is_displayed()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[@class\u003d\u0027btn btn-primary btn-sm o-kanban-button-new btn-default\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.122)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Elenas-MacBook-Pro.local\u0027, ip: \u00272603:300a:16aa:1000:0:0:0:cc66%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: /var/folders/7m/9dch1pys7vx...}, goog:chromeOptions: {debuggerAddress: localhost:50101}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 602a816bdeeff299d434bca125c135a6\n*** Element info: {Using\u003dxpath, value\u003d//button[@class\u003d\u0027btn btn-primary btn-sm o-kanban-button-new btn-default\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\n\tat step_definitions.products_manager_step_defs.poducts_manager_step_defs.verify_create_button_is_displayed(poducts_manager_step_defs.java:40)\n\tat ✽.Verify create button is displayed(src/test/resources/features/productsManager.feature:12)\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on the create button",
  "keyword": "And "
});
formatter.match({
  "location": "poducts_manager_step_defs.click_on_the_create_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Fill out the form",
  "keyword": "And "
});
formatter.match({
  "location": "poducts_manager_step_defs.fill_out_the_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify new product is added to the list",
  "keyword": "Then "
});
formatter.match({
  "location": "poducts_manager_step_defs.verify_new_product_is_added_to_the_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
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
formatter.after({
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
formatter.after({
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