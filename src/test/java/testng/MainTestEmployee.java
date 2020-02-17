package testng;



import com.github.javafaker.Faker;
import org.apache.commons.lang3.builder.ToStringExclude;

import com.google.common.base.Verify;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.*;

import pages.HomePage;
import pages.InventoryAdjustmentsPage;
import pages.ProductsPageEmployee;
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

    TransferPage transferPage=new TransferPage();
    Faker faker=new Faker();

    ProductsPageEmployee productsPageEmployee = new ProductsPageEmployee();


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

    @Test(priority = 5)
    public void validateTheProductRulesHeader() {
        SeleniumUtils.pause(2);
        reorderingRulesPage.reorderingRulesButton.click();
        SeleniumUtils.pause(2);
        reorderingRulesPage.nameOfProductColumn.click();
        String actualResultHeader = reorderingRulesPage.reorderingRulesHeader.getText();
        String expectedResultHeader = "Rules";
        Assert.assertTrue(actualResultHeader.contains(expectedResultHeader), "Actual result not equal to expected one");

    }

    @Test(priority = 6)
    public void validateTheProductName() {
        reorderingRulesPage.reorderingRulesButton.click();
        reorderingRulesPage.reorderingRulesName.click();
        String actualResultHeader = reorderingRulesPage.reorderingRulesName.getText();
        String expectedResultHeader = "Name";
        Assert.assertTrue(actualResultHeader.contains(expectedResultHeader), "Actual result not equal to expected one");

    }

    @Test(priority = 7)
    public void verifyReorderingRulesTableIsDisplayed() {
        reorderingRulesPage.reorderingRulesButton.click();
        String actualTable = reorderingRulesPage.reorderingRulesTable.getText();
        SeleniumUtils.pause(2);
        Assert.assertFalse(actualTable.isEmpty());
    }

    @Test(priority = 8)
    public void verifySearchFunctionalityOnReorderingRulesPage() {
        reorderingRulesPage.reorderingRulesButton.click();
        reorderingRulesPage.searchInput.sendKeys("Computer" + Keys.ENTER);
        List<WebElement> list = reorderingRulesPage.firstColumns;
        boolean result = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().contains("Computer")) {
                result = true;
            }
        }
        SeleniumUtils.pause(2);
        Assert.assertTrue(result, "Search functionality is NOT Working");

    }

    @Test(priority = 9)    // Jurabek
    public void inventoryAdjustButton() {
        homePage.inventoryModuleTab.click();
        // verify inventory adjustments button
        SeleniumUtils.pause(2);
        Assert.assertTrue(inventoryAdjustmentsPage.inventoryModuleDisplayVerify.isDisplayed(),
                "Inventory Adjustments module is NOT displayed!!!");
        // inventory adjustments click
        inventoryAdjustmentsPage.inventoryAdjustmentsButton.click();
    }
        @Test (priority =10 )
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
        @Test (priority =11 )
                public void importButton() {
            inventoryAdjustmentsPage.importButtonVerify.click();
            // to go back to inventory adjustments page
            inventoryAdjustmentsPage.cancelButtonPress.click();
            // search button verify
        }
        @Test(priority = 12)
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
    @Test(priority = 13)   // Jurabek
    public void searchBoxVerifyUser() {
        inventoryAdjustmentsPage.inventoryAdjustmentsButton.click();
        // go to search button
        Assert.assertTrue(inventoryAdjustmentsPage.searchBoxVerify.isDisplayed(),
                "Search button is NOT displayed!!!");
        // search any kind of item
        SeleniumUtils.pause(2);
        inventoryAdjustmentsPage.searchBoxVerify.sendKeys("apple" + Keys.ENTER + Keys.ENTER);
        Assert.assertTrue(inventoryAdjustmentsPage.firstTextVerify.isDisplayed(),
                "First item is NOT displayed!!!");

        SeleniumUtils.pause(2);
    }
    //<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>\\

    // $$ Moe.H $$ //

    // Create Scrap Products

    @Test(priority = 14)
    public void Create_Scrap_Products(){
        ScarpPage scarpPage = new ScarpPage();
SeleniumUtils.pause(2);
        scarpPage.scrapButton.click();
        //User its on Scrap home Page!!
        SeleniumUtils.pause(2);
        scarpPage.createButton.click();
        //User should see in form Sheet
        Assert.assertTrue(scarpPage.formSheet.isDisplayed(),"Form Sheet it's not Displayed!!");
        SeleniumUtils.pause(2);
        //----------------------------------\\
        //Product text button is correct!

        String actualTxt = scarpPage.productButtonTxt.getText();
        String expectedTxt = "Product";

        Assert.assertTrue(actualTxt.equals(expectedTxt),"WRONG PRODUCT TEXT!!!!");
        //--------------------------------------------//
        // Quantity	Button!

        scarpPage.quantityButton.clear();
        scarpPage.quantityButton.sendKeys("2.00");
        Assert.assertTrue(scarpPage.QuantityButtonText.getText().equals("Quantity"),"Quantity button TEXT is WRONG!!");
        //----------------------------------------------\\
        // Source Document!

        scarpPage.sourceDocumentInputFiled.sendKeys("Example0006");
        Assert.assertTrue(scarpPage.sourceDocumentText.getText().equals("Source Document"),"Source Document field TEXT is WRONG!!");

        //--------------------------------------------------\\
        // Expected Date!
        scarpPage.expectedDateField.click();
        SeleniumUtils.pause(3);
        Assert.assertTrue(scarpPage.expectedDateFieldText.getText().equals("Expected Date"),"Expected Date field TEXT is WRONG!!");
        //-----------------------------------------------------\\
        // Save button!

        scarpPage.discardButton.click();

        scarpPage.okButtonWarning.click();


    }

    @Test (priority = 15)
    public void verifyTransferButton(){

        transferPage.transferButton.click();
        SeleniumUtils.pause(2);

        Assert.assertFalse(transferPage.allTransferList.isEmpty(),"All information did'nt displayed");

    }
    @Test (priority = 16)
    public void VerifysearchBoxinTransfers(){

        Assert.assertTrue(transferPage.searchBox.isDisplayed(),"Search box did'nt displayed");

    }


    @Test(priority = 17)
    public void ValidationOfDeleteButton() {
        transferPage.firstButton.click();


      transferPage.actionButton.click();

        Assert.assertTrue(transferPage.deleteButton.isDisplayed(), "delete button didnt displayed ");

    }
    @Test (priority = 18)
    public void ValidationCreateButtoninTransfers(){

        transferPage.createButton.click();

        Assert.assertTrue(transferPage.newStockForm.isDisplayed(),"New Form did'nt displayed");

    }



    // As an employee I should be able to see Products button inside the Inventory module
    @Test(priority = 19) //Sultan
    // Verify Products button is displayed
    public void productsButtonVerification(){
        Assert.assertTrue(productsPageEmployee.productsButton.isDisplayed(),"Products button is NOT DISPLAYED");
    }

    @Test(priority = 20) // Sultan
    // Verify Products page is opened
    // Verify list of products items displayed
    public void verificationOfInsideProductsPage(){
        productsPageEmployee.productsButton.click();
        Assert.assertTrue(productsPageEmployee.itemsList.isDisplayed(),"List of items is NOT Displayed");
    }

    @Test(priority = 21) //Sultan
    public void searchBoxVerification(){
        // Verify search box is displayed
        productsPageEmployee.productsButton.click();
        Assert.assertTrue(productsPageEmployee.searchBoxInput.isDisplayed(),"Search box input is not displayed");
    }

    @Test(priority = 22)//Sultan
    public void searchBoxInputValidation(){
        // Verify items listed by name as searched
        productsPageEmployee.productsButton.click();
        productsPageEmployee.searchBoxInput.sendKeys("book");
        Assert.assertTrue(productsPageEmployee.searchedItemList.isDisplayed(),"Searched item list is not displayed");
    }

    @Test(priority = 23) //Sultan
    public void searchedItemVerification(){
        // Click to the selected item
        // Employee should be navigated to selected items page
        productsPageEmployee.productsButton.click();
        SeleniumUtils.pause(2);
        productsPageEmployee.searchBoxInput.sendKeys("book");
        productsPageEmployee.searchedItemButton.click();
        Assert.assertTrue(productsPageEmployee.searchedItemForm.isDisplayed(),"Searched item description is NOT displayed");
    }







}
