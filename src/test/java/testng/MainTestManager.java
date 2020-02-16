package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InventoryAdjustmentsPage;
import pages.ReorderingRulesPage;
import utilities.BriteUtils;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.ArrayList;
import java.util.List;

public class MainTestManager {
    HomePage homePage = new HomePage();
    ReorderingRulesPage reorderingRulesPage = new ReorderingRulesPage();
    InventoryAdjustmentsPage inventoryAdjustmentsPage = new InventoryAdjustmentsPage();

    @BeforeClass
    public void login() {
        BriteUtils.login_as_manager();
    }

    @AfterClass
    public void close() {
        Driver.closeDriver();
    }

    /* This test logs in as employee and verify if
     Inventory Module is  displayed and navigates inside
     Inventory Module

     */
    @BeforeClass
    public void verifyHomePage() {
        SeleniumUtils.pause(2);
        Assert.assertTrue(homePage.inventoryModuleTab.getText().contains("Inventory"), "Not DISPLAYED");
        homePage.inventoryModuleTab.click();
    }

    /*  Verify the reordering Rules Rules is displayed

     */
    @Test(priority = 1)
    public void verifyReorderingRulesButton() {
        SeleniumUtils.pause(2);
        Assert.assertTrue(reorderingRulesPage.reorderingRulesButton.getText().contains("Reordering Rules"), "Not DISPLAYED");

    }

    /*  Verify the reordering Rules title page contains Reordering Rules

     */
    @Test(priority = 2)
    public void verifyReorderingRulesWindow() {
        reorderingRulesPage.reorderingRulesButton.click();
        SeleniumUtils.pause(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Reordering Rules"));
    }


    /*  Verify the reordering Rules page have select columns with
    Name;Product;Minimum Quantity;Maximum Quantity;

     */
    @Test(priority = 3)
    public void verifyReorderingSelectElements() {
        reorderingRulesPage.reorderingRulesButton.click();
        List<WebElement> excualList = reorderingRulesPage.listRecordSelector;
        List<String> expetedList = new ArrayList<>();
        expetedList.add("Name");
        expetedList.add("Product");
        expetedList.add("Minimum Quantity");
        expetedList.add("Maximum Quantity");
        int count = 0;
        for (int i = 0; i < expetedList.size(); i++) {
            if (excualList.get(i).getText().equals(expetedList.get(i))) {
                count++;
            }
        }
        SeleniumUtils.pause(2);
        Assert.assertEquals(count, 4, "Not all columns in the list");

    }

    /*  Verify the reordering Rules page have all checkboxes is enabled by default
     */
    @Test(priority = 4)
    public void verifyCheckboxesDoesNotSelected() {
        SeleniumUtils.pause(2);
        reorderingRulesPage.reorderingRulesButton.click();
        List<WebElement> checkBoxes = reorderingRulesPage.listOfCheckBoxes;
        int count = 0;
        for (int i = 0; i < checkBoxes.size(); i++) {
            if (!checkBoxes.get(i).isEnabled()) {
                count++;
            }
        }

        Assert.assertEquals(count, 0, "Failed, all checkboxes should be enabled by default");

    }

    /*
    manager should see inventory adjustments from Dash Op in the left side
    manager should be able to click Inventory Adjustments button
    manager has to see import, create and search button
    as a manager when i click above three buttons, i have to be able to use them
     */
    @Test(priority = 5)  // Jurabek
    public void inventoryAdjustButton() {
        homePage.inventoryModuleTab.click();
        // verify inventory adjustments button
        SeleniumUtils.pause(2);
        Assert.assertTrue(inventoryAdjustmentsPage.inventoryModuleDisplayVerify.isDisplayed(),
                "Inventory Adjustments module is NOT displayed!!!");
        // inventory adjustments click
        inventoryAdjustmentsPage.inventoryAdjustmentsButton.click();
    }

    @Test(priority = 6)
    public void createButton() {
        // inside inventory adjsutments module create button is displayed
        Assert.assertTrue(inventoryAdjustmentsPage.createButtonVerify.isDisplayed(),
                "Create button is NOT displayed!!!");
        // click to create button
        inventoryAdjustmentsPage.createButtonVerify.click();
        // accept alert button
        inventoryAdjustmentsPage.alertAcceptButton.click();
    }

    @Test(priority = 7)
    public void importButton() {
        // click to import button
        inventoryAdjustmentsPage.importButtonVerify.click();
        // to go back to inventory adjustments page
        inventoryAdjustmentsPage.cancelButtonPress.click();
    }

    @Test(priority = 8)
    public void searchBox() {
        // search button verify
        Assert.assertTrue(inventoryAdjustmentsPage.searchBoxVerify.isDisplayed(),
                "search button is NOT displayed!!!");
        inventoryAdjustmentsPage.searchBoxVerify.click();

    }

    /*
    as a manager i can navigate to search button in the inventory adjustments page
    as a manager when i click search button it should allow us to search products
    as a manager when i should type search button
    as a manager i can click the any offered products to choose
     */
    @Test(priority = 9) // Jurabek
    public void searchButtonVerifyManager() {
        // go to Inventory page to start from the beginning
        //  homePage.inventoryModuleTab.click();
//        inventoryAdjustmentsPage.inventoryAdjustmentsButton.click();
//        // go to inventory adjustments module again
//        Assert.assertTrue(inventoryAdjustmentsPage.inventoryModuleDisplayVerify.isDisplayed(),
//                "Inventory Adjustments button is NOT displayed!");
        inventoryAdjustmentsPage.inventoryAdjustmentsButton.click();
        // go to search button
        Assert.assertTrue(inventoryAdjustmentsPage.searchBoxVerify.isDisplayed(),
                "Search button is NOT displayed!!!");
        // search any kind of item
        SeleniumUtils.pause(2);
        inventoryAdjustmentsPage.searchBoxVerify.sendKeys("apple" + Keys.ENTER + Keys.ENTER);
        Assert.assertTrue(inventoryAdjustmentsPage.firstTextVerify.isDisplayed(),
                "First item is NOT displayed!!!");

    }


    @Test(priority = 10)
    public void validateTheProductRulesHeader() {
        SeleniumUtils.pause(2);
        reorderingRulesPage.reorderingRulesButton.click();
        SeleniumUtils.pause(2);
        reorderingRulesPage.nameOfProductColumn.click();
        String actualResultHeader = reorderingRulesPage.reorderingRulesHeader.getText();
        String expectedResultHeader = "Rules";
        Assert.assertTrue(actualResultHeader.contains(expectedResultHeader), "Actual result not equal to expected one");

    }

    @Test(priority = 11)
    public void validateTheProductName() {
        reorderingRulesPage.reorderingRulesButton.click();
        reorderingRulesPage.reorderingRulesName.click();
        String actualResultHeader = reorderingRulesPage.reorderingRulesName.getText();
        String expectedResultHeader = "Name";
        Assert.assertTrue(actualResultHeader.contains(expectedResultHeader), "Actual result not equal to expected one");

    }

    @Test(priority = 12)
    public void verifyReorderingRulesTableIsDisplayed() {
        reorderingRulesPage.reorderingRulesButton.click();
        String actualTable = reorderingRulesPage.reorderingRulesTable.getText();
        Assert.assertFalse(actualTable.isEmpty());
    }

    @Test(priority = 13)
    public void validateCreateReorderingRules() {
        reorderingRulesPage.reorderingRulesButton.click();
        //Not able to automate,there is a bag
    }

    @Test(priority = 14)
    public void verifySearchFunctionalityOnReorderingRulesPage() {
        reorderingRulesPage.reorderingRulesButton.click();
        reorderingRulesPage.searchInput.sendKeys("Computer" + Keys.ENTER);
        List<WebElement> list = reorderingRulesPage.firstColumns;
        boolean result = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().contains("Computer")) {
                result = true;
            }
        }
        SeleniumUtils.pause(2);
        Assert.assertTrue(result, "Search functionality is NOT Working");

    }

}
