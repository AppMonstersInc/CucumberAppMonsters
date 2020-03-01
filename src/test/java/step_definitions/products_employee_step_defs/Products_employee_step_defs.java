package step_definitions.products_employee_step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.ProductsPageEmployee;
import utilities.Driver;
import utilities.SeleniumUtils;

public class Products_employee_step_defs {
    ProductsPageEmployee productsPageEmployee = new ProductsPageEmployee();

    @Given("I Verify Products button is displayed")
    public void i_Verify_Products_button_is_displayed() {
        Assert.assertTrue("Products button is NOT displayed!!! Failed",productsPageEmployee.productsButton.isDisplayed());
    }

    @Given("I click to products button")
    public void i_click_to_products_button() {
       productsPageEmployee.productsButton.click();
        SeleniumUtils.pause(3);
    }

    @Then("I should be navigated to the products page")
    public void i_should_be_navigated_to_the_products_page() {
        String actualResult = Driver.getDriver().getTitle();
        String expectedResult = "Products";
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Products"));
    }
    @Given("I verify products page is opened")
    public void i_verify_products_page_is_opened() {
        String actualResult = Driver.getDriver().getTitle();
        String expectedResult = "Products";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedResult));
    }

    @Given("I verify list of products items displayed")
    public void i_verify_list_of_products_items_displayed() {
       Assert.assertTrue("List of items is NOT displayed!!! Failed!",productsPageEmployee.itemsList.isDisplayed());
    }

    @Given("I verify search box is displayed")
    public void i_verify_search_box_is_displayed() {
        Assert.assertTrue("Search box is NOT displayed!!! Failed!",productsPageEmployee.searchBoxInput.isDisplayed());
    }

    @When("I search for an item")
    public void i_search_for_an_item() {
        productsPageEmployee.searchBoxInput.sendKeys("book");
        productsPageEmployee.searchedItemButton.click();

    }

    @When("I verify items listed by name as searched")
    public void i_verify_items_listed_by_name_as_searched() {
        Assert.assertTrue("Searched items are not displayed!!! Failed!!!",productsPageEmployee.searchedItemList.isDisplayed());
    }

    @When("I click to the selected item")
    public void i_click_to_the_selected_item() {
        productsPageEmployee.searchedItemList.click();

    }

    @When("I should be navigated to selected items page")
    public void i_should_be_navigated_to_selected_items_page() {
        Assert.assertTrue(productsPageEmployee.searchedItemForm.isDisplayed());

    }

}
