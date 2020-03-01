package step_definitions.products_manager_step_defs;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ProductsPageManager;
import utilities.Driver;
import utilities.SeleniumUtils;

public class poducts_manager_step_defs {
    ProductsPageManager productsPageManager = new ProductsPageManager();
    Faker faker = new Faker();
    String str = faker.funnyName().name();

    @Given("Verify Products button is displayed")
    public void verify_Products_button_is_displayed() {
        Assert.assertTrue("Products button is NOT displayed!!! Failed!",productsPageManager.productsButton.isDisplayed());
    }

    @Given("Manager clicks on products button")
    public void manager_clicks_on_products_button() {
        productsPageManager.productsButton.click();

        SeleniumUtils.pause(2);
    }

    @Then("Manager should be navigated to Products page")
    public void manager_should_be_navigated_to_Products_page() {
        String actualResult = Driver.getDriver().getTitle();
        String expectedResult = "Products";
        Assert.assertTrue("User is NOT on products page!!! Failed!",actualResult.contains(expectedResult));


    }

    @Given("Verify create button is displayed")
    public void verify_create_button_is_displayed() {
        Assert.assertTrue("Create button is NOT displayed!!! Fail!",productsPageManager.createButton.isDisplayed());
    }

    @Given("Click on the create button")
    public void click_on_the_create_button() {
        productsPageManager.createButton.click();
    }

    @Given("Fill out the form")
    public void fill_out_the_form() {

        productsPageManager.productsButton.click();
        productsPageManager.createButton.click();
        productsPageManager.productNameInput.sendKeys(str);
        productsPageManager.newProductSalesPrice.click();
        productsPageManager.newProductSalesPrice.clear();
        productsPageManager.newProductSalesPrice.sendKeys(faker.number().digits(2));
        productsPageManager.newProductCost.click();
        productsPageManager.newProductCost.clear();
        productsPageManager.newProductCost.sendKeys(faker.number().digits(3));
        productsPageManager.newProductSaveButton.click();

    }

    @Then("Verify new product is added to the list")
    public void verify_new_product_is_added_to_the_list() {
        productsPageManager.productsButton.click();
        SeleniumUtils.pause(2);
        productsPageManager.searchBox.click();
        productsPageManager.searchBox.sendKeys(str + Keys.ENTER);
        SeleniumUtils.pause(2);
        productsPageManager.fakeResult.click();
        SeleniumUtils.pause(2);
        Assert.assertTrue("New product is not in the list!!! Failed!",productsPageManager.fakeResultName.getText().contains(str));
    }


}
