package step_definitions.transfers_steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.TransferPage;
import utilities.SeleniumUtils;

import static org.junit.Assert.assertTrue;

public class Transfers_steps {

    TransferPage transferPage=new TransferPage();
    Faker faker=new Faker();

    @When("the user clicks the transfer button.")
    public void the_user_clicks_the_transfer_button() {
        transferPage.transferButton.click();
        SeleniumUtils.pause(2);
    }

    @Then("the user should be able to see all stocks.")
    public void the_user_should_be_able_to_see_all_stocks() {
        Assert.assertFalse("All information did'nt displayed",transferPage.allTransferList.isEmpty());
    }

    @When("the user clicks create button.")
    public void the_user_clicks_create_button() {
        transferPage.createButton.click();
    }

    @Then("the new stock form should be open.")
    public void theNewStockFormShouldBeOpen() {
        Assert.assertTrue("New Form did'nt displayed", transferPage.newStockForm.isDisplayed());
    }

    @When("the user click search button.")
    public void the_user_click_search_button() {
        assertTrue("Search box did'nt displayed",transferPage.searchBox.isDisplayed());
    }

    @When("the user should be able to write and click the search box button.")
    public void the_user_should_be_able_to_write_and_click_the_search_box_button() {

    }

    @When("the user chooses any item.")
    public void the_user_chooses_any_item() {
        transferPage.firstButton.click();
    }

    @Then("action button should displayed.")
    public void action_button_should_displayed() {

    }

    @When("the user clicks the action button.")
    public void the_user_clicks_the_action_button() {
        transferPage.actionButton.click();
    }

    @When("the user should be able to see the export and delete modules button.")
    public void the_user_should_be_able_to_see_the_export_and_delete_modules_button() {
        Assert.assertTrue("delete button didn't displayed ",transferPage.deleteButton.isDisplayed());
    }

    @Then("the user should be able to click the delete button.")
    public void the_user_should_be_able_to_click_the_delete_button() {

    }



}
