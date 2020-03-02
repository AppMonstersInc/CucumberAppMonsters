package step_definitions.Inventory_Adjustments_Manager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.inventory_agjustments.*;
import utilities.SeleniumUtils;

public class Inventory_Adjustments_manager {
    InventoryModulePage inventoryModulePage = new InventoryModulePage();
    InsideInventoryAdjustmentsPage insideInventoryAdjustmentsPage= new InsideInventoryAdjustmentsPage();
    InsideSearchAfterSearch insideSearchAfterSearch = new InsideSearchAfterSearch();
    AsUsermainPage asUsermainPage = new AsUsermainPage();
    AsUserInventoryAdjustmentsPage asUserInventoryAdjustmentsPage = new AsUserInventoryAdjustmentsPage();
    @When("As a Manager, Requester clicks Inventory Adjustments button")
    public void as_a_Manager_Requester_clicks_Inventory_Adjustments_button() {
    inventoryModulePage.inventoryAdjustmentsButton.click();
        Assert.assertTrue("Inventory Adjustments FAILED!",
                inventoryModulePage.inventoryAdjustmentsVerify.isDisplayed());
    }

    @Then("Requester has to see Create, Import and Search buttons on the landing page")
    public void requester_has_to_see_Create_Import_and_Search_buttons_on_the_landing_page() {
    Assert.assertTrue("Create button is NOT displayed!",
            insideInventoryAdjustmentsPage.createButtonVerify.isEnabled());
    Assert.assertTrue("Import button is NOT displayed!",
            insideInventoryAdjustmentsPage.importButtonVerify.isEnabled());
    Assert.assertTrue("Search box is NOT working or NOT displayed!",
            insideInventoryAdjustmentsPage.searchBoxVerify.isEnabled());
    }

    @Then("As a manager, requester should be able to click all three buttons")
    public void as_a_manager_requester_should_be_able_to_click_all_three_buttons() {
        // inside inventory adjsutments module create button is displayed
        Assert.assertTrue("Create button is NOT displayed!!!",
                insideInventoryAdjustmentsPage.createButtonVerify.isDisplayed());
        // click to create button
        insideInventoryAdjustmentsPage.createButtonVerify.click();
        // accept alert button
        insideInventoryAdjustmentsPage.alertAcceptButton.click();
        // click to import button
        insideInventoryAdjustmentsPage.importButtonVerify.click();
        // to go back to inventory adjustments page
        insideInventoryAdjustmentsPage.cancelButtonPress.click();
        // search button verify
        Assert.assertTrue("search button is NOT displayed!!!",
                insideInventoryAdjustmentsPage.searchBoxVerify.isDisplayed());
        insideInventoryAdjustmentsPage.searchBoxVerify.click();
    }

    @When("as a manager i should click the search button to type and to find exact products")
    public void as_a_manager_i_should_click_the_search_button_to_type_and_to_find_exact_products() {
        inventoryModulePage.inventoryAdjustmentsButton.click();
        // go to search button
        Assert.assertTrue("Search button is NOT displayed!!!",
                insideInventoryAdjustmentsPage.searchBoxVerify.isDisplayed());



    }

    @When("search funclitonalty should offer all products which we are trying to find")
    public void search_funclitonalty_should_offer_all_products_which_we_are_trying_to_find() {
// search any kind of item
        SeleniumUtils.pause(2);
        insideInventoryAdjustmentsPage.searchBoxVerify.sendKeys("apple" + Keys.ENTER + Keys.ENTER);
    }

    @Then("as  a  manager i can choose any of them")
    public void as_a_manager_i_can_choose_any_of_them() {
        Assert.assertTrue("First item is NOT displayed!!!",
                insideSearchAfterSearch.firstTextVerify.isDisplayed());
    }
}
