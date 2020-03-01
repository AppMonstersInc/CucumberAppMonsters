package step_definitions.wearhouse;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.OperationsTypesPage;
import pages.WarehousesPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class Wearehouse_stepes {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
    WarehousesPage warehousesPage = new WarehousesPage();
    OperationsTypesPage operationsTypesPage = new OperationsTypesPage();

    @Given("As a Manager should be able to see the Warehouse Management")
    public void as_a_Manager_should_be_able_to_see_the_Warehouse_Management() {
        Assert.assertTrue("Warehouse Management button is NOT displayed! ", warehousesPage.WarehouseManagementButton.isDisplayed());
    }

    @Then("As a  manager should be able to click the Warehouse Management button")
    public void as_a_manager_should_be_able_to_click_the_Warehouse_Management_button() {
        warehousesPage.WarehouseManagementButton.click();
        Assert.assertTrue("Warehouse button is NOT displayed!", warehousesPage.WarehouseButton.isDisplayed());
    }

    @Given("As a manager should be able to click the Wearhouse button and be navigate to the Wearhouse page")
    public void as_a_manager_should_be_able_to_click_the_Wearhouse_button_and_be_navigate_to_the_Wearhouse_page() {

        warehousesPage.WarehouseManagementButton.click();
        warehousesPage.WarehouseManagementButton.click();
        warehousesPage.WarehouseButton.click();
    }

    @Then("As manager should be able to see the search box")
    public void as_manager_should_be_able_to_see_the_search_box() {
        Assert.assertTrue("serech box is NOT Displayed", warehousesPage.WarehouseSearchBox.isDisplayed());
    }

    @Given("As a manager should be able to click the Operations types button and be navigate to the Operations types page")
    public void as_a_manager_should_be_able_to_click_the_Operations_types_button_and_be_navigate_to_the_Operations_types_page() {
        operationsTypesPage.OperationsTypesButton.click();

    }

    @Given("As a manager i should be able to create")
    public void as_a_manager_i_should_be_able_to_create() {
        Faker faker = new Faker();

        warehousesPage.WarehouseManagementButton.click();
        warehousesPage.WarehouseManagementButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(operationsTypesPage.operationsTypesCreateButton));
        operationsTypesPage.operationsTypesCreateButton.click();
        Assert.assertTrue("Operation types name is NOT displayed!"
                , operationsTypesPage.operationTypesNameText.isDisplayed());
        wait.until(ExpectedConditions.elementToBeClickable(operationsTypesPage.OperationTypesNameInputBox));
        operationsTypesPage.OperationTypesNameInputBox.sendKeys(
                faker.name().firstName() + Keys.ENTER);
        Assert.assertTrue("reference sequence text is NOT displayed!"
                , operationsTypesPage.referenceSequenceTextInCreate.isDisplayed());
        operationsTypesPage.ReferenceSequenceInputBox.click();
        operationsTypesPage.ReferenceSequenceInputBoxItem.click();
        Assert.assertTrue("Type of operation text is NOT displayed!"
                , operationsTypesPage.typeOfOperationText.isDisplayed());
        operationsTypesPage.TypeOfOperationInputBox.click();
        Select select = new Select(operationsTypesPage.TypeOfOperationInputBox);
        select.selectByVisibleText("Internal");
        operationsTypesPage.TypeOfOperationInputBox.click();
        Assert.assertTrue("Return text is NOT displayed!",
                operationsTypesPage.OperationTypeForReturnsText.isDisplayed());
        operationsTypesPage.operationsTypeForReturnBox.sendKeys("Chicago Warehouse" + Keys.ENTER);

        Assert.assertTrue("show detailed operations text is NOT displayed!",
                operationsTypesPage.showDetailedOperationsText.isDisplayed());
        Assert.assertTrue("show reserved text is NOT displayed!"
                , operationsTypesPage.showReservedText.isDisplayed());
        operationsTypesPage.DiscardButton.click();
        operationsTypesPage.okButton.click();

    }

    @Given("As manager i should be able to click the import button")
    public void as_manager_i_should_be_able_to_click_the_import_button() {
//        wait.until(ExpectedConditions.elementToBeClickable(warehousesPage.WarehouseManagementButton));
//         warehousesPage.WarehouseManagementButton.click();
    //    SeleniumUtils.pause(2);
        wait.until(ExpectedConditions.elementToBeClickable(operationsTypesPage.OperationsTypesButton));

          operationsTypesPage.OperationsTypesButton.click();
        SeleniumUtils.pause(2);
        operationsTypesPage.OperationsTypesImportButton.click();
        SeleniumUtils.pause(2);
        Assert.assertTrue("Import a file text is NOT displayed!"
                , operationsTypesPage.importAFileText.isDisplayed());
        SeleniumUtils.pause(2);
        Assert.assertTrue("Load file button is NOT clickable"
                , operationsTypesPage.loadFileButton.isEnabled());
        SeleniumUtils.pause(2);
        Assert.assertTrue("CSV text is NOT displayed!",
                operationsTypesPage.selectACSVText.isDisplayed());
        SeleniumUtils.pause(2);
        String expectedURLfromHelp = "https://www.odoo.com/documentation" +
                "/user/11.0/general/base_import/import_faq.html";
        String actualUrlFromHelp = operationsTypesPage.helpButton.getAttribute("href");
        Assert.assertTrue("Help url is NOT matching", actualUrlFromHelp.equals(expectedURLfromHelp));
        SeleniumUtils.pause(2);
        Assert.assertTrue("Help button is NOT Clickable!",
                operationsTypesPage.helpButton.isEnabled());
        SeleniumUtils.pause(2);
        operationsTypesPage.cancelButtonInImportPage.click();
    }

    @Then("As a manager i should be able to click the search box")
    public void as_a_manager_i_should_be_able_to_click_the_search_box() {
        SeleniumUtils.pause(3);
        operationsTypesPage.OperationsTypesButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(operationsTypesPage.searchButton));
        Assert.assertTrue("search button is NOT displayed!",
                operationsTypesPage.searchButton.isEnabled());
    }


}
