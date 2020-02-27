package step_definitions.login_steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.BriteUtils;
import utilities.Driver;
import utilities.SeleniumUtils;

public class login_steps {
    HomePage homePage = new HomePage();



    @Then("As a employee i log get in  to BRITE ERP")
    public void as_a_employee_i_log_get_in_to_BRITE_ERP() {
        BriteUtils.login_as_employee();
    }

    @Then("As a manager i log get in  to BRITE ERP")
    public void as_a_manager_i_log_get_in_to_BRITE_ERP() {
        BriteUtils.login_as_manager();
    }


    @Given("As a a employee|manager i am on Home page")
    public void as_a_a_employee_manager_i_am_on_Home_page() {
        SeleniumUtils.pause(2);
    }

    @Given("I verify if inventory Module Tab is displayed")
    public void i_verify_if_inventory_Module_Tab_is_displayed() {
        Assert.assertTrue("Not DISPLAYED", homePage.inventoryModuleTab.getText().contains("Inventory"));
    }

    @Then("Click to inventory Module button")
    public void click_to_inventory_Module_button() {

        homePage.inventoryModuleTab.click();
    }

    @Then("Close all windows")
    public void close_all_windows() {
        Driver.closeDriver();
    }

}
