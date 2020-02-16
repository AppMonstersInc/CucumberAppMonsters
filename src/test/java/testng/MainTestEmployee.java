package testng;


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

public class MainTestEmployee {
    HomePage homePage = new HomePage();
    ReorderingRulesPage reorderingRulesPage = new ReorderingRulesPage();
    InventoryAdjustmentsPage inventoryAdjustmentsPage = new InventoryAdjustmentsPage();

    @BeforeClass
    public void login() {
        BriteUtils.login_as_employee();
    }

      @AfterClass
    public void close() {
        Driver.closeDriver();
    }


    /*
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

        Assert.assertEquals(count, 4, "Not all columns in the list");

    }

    /*  Verify the reordering Rules page have all checkboxes is enabled by default
     */
    @Test(priority = 4)
    public void verifyCheckboxesDoesNotSelected() {
        List<WebElement> checkBoxes = reorderingRulesPage.listOfCheckBoxes;
        int count = 0;
        for (int i = 0; i < checkBoxes.size(); i++) {
            if (!checkBoxes.get(i).isEnabled()) {
                count++;
            }
        }

        Assert.assertEquals(count, 0, "Failed, all checkboxes should be enabled by default");

    }

    @Test(priority = 5)    // Jurabek
    public void inventoryAdjustButton() {
        homePage.inventoryModuleTab.click();
        // verify inventory adjustments button
        SeleniumUtils.pause(2);
        Assert.assertTrue(inventoryAdjustmentsPage.inventoryModuleDisplayVerify.isDisplayed(),
                "Inventory Adjustments module is NOT displayed!!!");
        // inventory adjustments click
        inventoryAdjustmentsPage.inventoryAdjustmentsButton.click();
    }
        @Test (priority =6 )
                public void createButton(){
        // inside inventory adjsutments module create button is displayed
        Assert.assertTrue(inventoryAdjustmentsPage.createButtonVerify.isDisplayed(),
                "Create button is NOT displayed!!!");
        // click to create button
        inventoryAdjustmentsPage.createButtonVerify.click();
        // accept alert button
        inventoryAdjustmentsPage.alertAcceptButton.click();
        // click to import button
    }
        @Test (priority =7 )
                public void importButton() {
            inventoryAdjustmentsPage.importButtonVerify.click();
            // to go back to inventory adjustments page
            inventoryAdjustmentsPage.cancelButtonPress.click();
            // search button verify
        }
        @Test(priority = 8)
                public void searchBox(){
        Assert.assertTrue(inventoryAdjustmentsPage.searchBoxVerify.isDisplayed(),
                "search button is NOT displayed!!!");
        inventoryAdjustmentsPage.searchBoxVerify.click();

    }
    /*
    as a user i can navigate to search button in the inventory adjustments page
    as auser when i click search button it should allow us to search products
    as a user when i should type search button
    as a user i can click the offered products to choose
     */
    @Test(priority = 9)   // Jurabek
    public void searchBoxVerifyUser(){
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






}
