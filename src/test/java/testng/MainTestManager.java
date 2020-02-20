package testng;

import com.github.javafaker.Faker;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;
import utilities.BriteUtils;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MainTestManager {
    HomePage homePage = new HomePage();
    ReorderingRulesPage reorderingRulesPage = new ReorderingRulesPage();
    InventoryAdjustmentsPage inventoryAdjustmentsPage = new InventoryAdjustmentsPage();
    ProductsPageManager productsPageManager = new ProductsPageManager();
    InventoryFunctionality_Reporting inventoryFunctionality_reporting = new InventoryFunctionality_Reporting();
    ProductMoves productMoves = new ProductMoves();


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
        reorderingRulesPage.searchInput.sendKeys("computer" + Keys.ENTER);
        SeleniumUtils.pause(1);
        List<WebElement> list = reorderingRulesPage.firstColumns;
        boolean result = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().toLowerCase().contains("computer")) {
                result = true;
            }
        }
        SeleniumUtils.pause(2);
        Assert.assertTrue(result, "Search functionality is NOT Working");

    }
    /* // Jurabek
    as a manager, i can go to Inventory tab
    as a manager, i can find Inventory from Reporting page
    as a manager, i can click Inventory button
    as a manager, I should be navigated to main Inventory
     */

    @Test(priority = 15)
    public void verifyInventoryFromReports() {
        // verify Inventory functionality is displayed
        Assert.assertTrue(inventoryFunctionality_reporting.inventoryFuncButton.isDisplayed(),
                "Inventory functinality button is NOT displayed!!!");

    }

    @Test(priority = 16)
    public void verifyCancelButton() {
        // verify cancel button is clicking inside Inventory func
        inventoryFunctionality_reporting.inventoryFuncButton.click();
        inventoryFunctionality_reporting.cancelButton.click();

    }

/* // Jurabek
    as a manager, i can go to Inventory tab
    as a manager, i can find Inventory from Reporting page
    as a manager, i can click Inventory button
    as a manager, I should be navigated to main Inventory
     */


    /*
    as manager i should click "At a specific Data"
    as a manager i should be able to see text below Compute
    as a manager i should be able to see todays date on the calendar
    as a manager i should be able to click calendar button
     */
    @Test(priority = 17)
    public void InventoryReportPage() {
        //  as a manager i can click to inventory button
        inventoryFunctionality_reporting.inventoryFuncButton.click();
        // as a manager i can see "Inventory Report" text
        Assert.assertTrue(inventoryFunctionality_reporting.inventoryPageMainText.isDisplayed(),
                "Inventory text is NOT displayed!!!");
        //as a manager i can click to Retrieve button
        inventoryFunctionality_reporting.retrieveButton.click();
        //Current Inventory button has to be selected by default
        inventoryFunctionality_reporting.inventoryFuncButton.click();
        Assert.assertTrue(inventoryFunctionality_reporting.firstRadioButton.isSelected(),
                "By default first radio button is NOT selected!!!");
        // "Current Inventory" text is displayed
        Assert.assertTrue(inventoryFunctionality_reporting.firstRadioButtonText.isDisplayed(),
                "First button text is NOT displayed!!!");
        // Second radio button should not be selected
        Assert.assertFalse(inventoryFunctionality_reporting.secondRadioButton.isSelected(),
                "Second radio button IS SELECTED!!!");
        //  Second radio button text is displayed
        Assert.assertTrue(inventoryFunctionality_reporting.secondRadioButtonText.isDisplayed(),
                "Second button text is NOT displayed!!!");
        inventoryFunctionality_reporting.cancelButton.click();

    }

    @Test(priority = 18) // JK
    public void inventoryModulePageCalendarCheck() {
        inventoryFunctionality_reporting.inventoryFuncButton.click();
        inventoryFunctionality_reporting.secondRadioButton.click();
        Assert.assertTrue(inventoryFunctionality_reporting.secondRadioButtonText.isDisplayed(),
                "Calendar date text is NOT displayed!");
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//
//        Assert.assertTrue(inventoryFunctionality_reporting.calendarBox.getText().equals(now),
//                "Calendar date is NOT matching");
        inventoryFunctionality_reporting.calendarBox.click();
        inventoryFunctionality_reporting.xButton.click();
    }


    // As a manager I should be able to create product inside products page
    @Test(priority = 19)//Sultan
    public void productsButtonVerification() {
        // Verify Productions button is displayed
        Assert.assertTrue(productsPageManager.productsButton.isDisplayed(), "Products button is NOT displayed");
    }


    @Test(priority = 20)//Sultan
    public void productsPageVerification() {
        //    Verify Productions button is displayed
        //    Manager should be able to see Products button at the Inventory page
        //    Click to the Products button
        //    Manager sholud be navigated to Products page
        productsPageManager.productsButton.click();
        SeleniumUtils.pause(1);
        String actualResult = productsPageManager.headerOfProducts.getText();
        String expectedResult = "Products";
        SeleniumUtils.pause(2);

        Assert.assertTrue(actualResult.contains(expectedResult), "User is NOT navigated to PRODUCTS PAGE");
    }

    @Test(priority = 21)//Sultan
    public void createButtonVerification() {
        //    Verify create button is  displayed
        //    Manager should be navigated to create product page
        productsPageManager.productsButton.click();
        Assert.assertTrue(productsPageManager.createButton.isDisplayed(), "Create Button is not displayed");
    }

    @Test(priority = 22)//Sultan
    public void createFormVerification() {
        //    Manager should be able to to fill out form to create product
        productsPageManager.productsButton.click();
        SeleniumUtils.pause(2);
        productsPageManager.createButton.click();
        SeleniumUtils.pause(2);
        Assert.assertTrue(productsPageManager.createForm.isDisplayed(), "Create form is NOT displayed");
    }

    @Test(priority = 23)//Sultan
    public void validateCreateNewProduct() {
        //    Click to save	Verify that product is added to the products list
        Faker faker = new Faker();
        String str = faker.funnyName().name();
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
        productsPageManager.productsButton.click();
        SeleniumUtils.pause(2);
        productsPageManager.searchBox.click();
        productsPageManager.searchBox.sendKeys(str + Keys.ENTER);
        SeleniumUtils.pause(2);
        productsPageManager.fakeResult.click();
        SeleniumUtils.pause(2);
        Assert.assertTrue(productsPageManager.fakeResultName.getText().contains(str), "Created item is NOT in the list");
    }

    @Test(priority = 24)
    public void Create_Scrap_Products() {
        ScarpPage scarpPage = new ScarpPage();
        SeleniumUtils.pause(2);
        scarpPage.scrapButton.click();
        //User its on Scrap home Page!!
        SeleniumUtils.pause(2);
        scarpPage.createButton.click();
        //User should see in form Sheet
        Assert.assertTrue(scarpPage.formSheet.isDisplayed(), "Form Sheet it's not Displayed!!");
        SeleniumUtils.pause(2);
        //----------------------------------\\
        //Product text button is correct!

        String actualTxt = scarpPage.productButtonTxt.getText();
        String expectedTxt = "Product";

        Assert.assertTrue(actualTxt.equals(expectedTxt), "WRONG PRODUCT TEXT!!!!");
        //--------------------------------------------//
        // Quantity Button!

        scarpPage.quantityButton.clear();
        scarpPage.quantityButton.sendKeys("2.00");
        Assert.assertTrue(scarpPage.QuantityButtonText.getText().equals("Quantity"), "Quantity button TEXT is WRONG!!");
        //----------------------------------------------\\
        // Source Document!

        scarpPage.sourceDocumentInputFiled.sendKeys("Example0006");
        Assert.assertTrue(scarpPage.sourceDocumentText.getText().equals("Source Document"), "Source Document field TEXT is WRONG!!");

        //--------------------------------------------------\\
        // Expected Date!
        scarpPage.expectedDateField.click();
        SeleniumUtils.pause(3);
        Assert.assertTrue(scarpPage.expectedDateFieldText.getText().equals("Expected Date"), "Expected Date field TEXT is WRONG!!");
        //-----------------------------------------------------\\
        // Save button!

        scarpPage.discardButton.click();

        scarpPage.okButtonWarning.click();

        SeleniumUtils.pause(3);
    }


    @Test(priority = 25)
    public void Import_Scrap_Products() {
        ScarpPage scarpPage = new ScarpPage();
        scarpPage.scrapButton.click();
        scarpPage.importButton.click();
        //------------------------------------\\
        // User should be able to see Test Import Button!

        Assert.assertTrue(scarpPage.testImportButton.isDisplayed(), "Test Import button is Not Displayed!!");
        //---------------------------------------------\\
        // User should be able to see The Import Button in 2nd Page!

        Assert.assertTrue(scarpPage.importButton2ndPage.isDisplayed(), "Import button 2nd page is Not Displayed!!");
        //-----------------------------------------------\\
        //User should be able to verify, 'Select a CSV or Excel file to import.'
        Assert.assertTrue(scarpPage.verifyText.isDisplayed(), "Text is Not Displayed!!");
        //-----------------------------------------------------\\
        // User should be able to see Reload file!
        Assert.assertTrue(scarpPage.reloadFileButton.isDisplayed(), "Reload file is Not Displayed!!");
        //-------------------------------------------------------\\
        // User should be able to see Load Button!
        Assert.assertTrue(scarpPage.loadFileButton.isDisplayed(), "Load Button is Not Displayed!!");
        //------------------------------------------------------------\\
        // User should be able to see the Input Field!
        Assert.assertTrue(scarpPage.inputField.isDisplayed(), "Input Field is Not Displayed!!");
        //-----------------------------------------------------------------\\
        // User should able to see Help Button!
        Assert.assertTrue(scarpPage.helpButton.isDisplayed(), "Help Button is Not Displayed!!");
        //-----------------------------------------------------------------\\
        // User should be able see Cancel!
        Assert.assertTrue(scarpPage.CancelButton.isDisplayed(), "Cancel Button is Not Displayed");

        SeleniumUtils.pause(2);
    }

    @Test(priority = 26)
    public void ScrapSearchButtonsVerify() {
        ScarpPage scarpPage = new ScarpPage();
        scarpPage.scrapButton.click();
        //---------------------------------------\\
        scarpPage.mangifyingGlassButton.click();
        SeleniumUtils.pause(3);
        scarpPage.filterButton.click();

        //------------------------------------------------------------------\\
        scarpPage.groupByButton.click();

        Assert.assertTrue(scarpPage.productSelection.isDisplayed(), "Product Select is Not Displayed!!");
        Assert.assertTrue(scarpPage.locationSelection.isDisplayed(), "Location Select is Not Displayed!!");
        Assert.assertTrue(scarpPage.scrapLocationSelector.isDisplayed(), "Scrap Select is Not Displayed!!");
        Assert.assertTrue(scarpPage.addCustomGroupSelector.isDisplayed(), "Add Custom Select is Not Displayed");
        //--------------------------------------------------------------\\
        scarpPage.favoritesButton.click();

        Assert.assertTrue(scarpPage.saveCurrentSearch.isDisplayed(), "Save Current Search is Not Displayed!!");
        Assert.assertTrue(scarpPage.addToMyDashboard.isDisplayed(), "Add to my Dashboard is Not Displayed!!");
        //------------------------------------------------------------\\
        scarpPage.searchInputField.sendKeys("apple" + Keys.ENTER);

    }

    @Test(priority = 27)  //Roman
    public void productMoveButton() {
        // Manager should be able to click on "Product Moves" functionality
        productMoves.productMovesButton.click();
        Assert.assertTrue(productMoves.productMovesButton.isDisplayed(), "Product Moves functionality is NOT displayed");
        productMoves.allCheckBoxSelector.click();
        SeleniumUtils.pause(2);
        productMoves.actionButton.click();
        SeleniumUtils.pause(2);
        productMoves.exportButton.click();
        SeleniumUtils.pause(2);
        productMoves.importCompatibleRadioButton.isSelected();
        Assert.assertTrue(productMoves.importCompatibleRadioButton.isEnabled(), "Radio Button is not enabled");
        SeleniumUtils.pause(2);
        productMoves.exportFormatsCsvRadioButton.isSelected();
        SeleniumUtils.pause(2);
        Assert.assertTrue(productMoves.exportToFileButton.isDisplayed(), "Export to file Button is not displayed");
        SeleniumUtils.pause(2);
        productMoves.addFieldButton.isDisplayed();
        Assert.assertTrue(productMoves.addFieldButton.isDisplayed(), "Add field button is not displayed");
        SeleniumUtils.pause(2);
        Assert.assertTrue(productMoves.removeFieldButton.isDisplayed(), "Remove field button is not displayed");
        SeleniumUtils.pause(2);
        Assert.assertTrue(productMoves.removeAllFieldButton.isDisplayed(), "Remove all file button is not displayed");
        SeleniumUtils.pause(2);
        Assert.assertTrue(productMoves.moveUpButton.isDisplayed(), "Move up button is not displayed");
        SeleniumUtils.pause(2);
        Assert.assertTrue(productMoves.moveDownButton.isDisplayed(), "Move down button is not displayed");
        SeleniumUtils.pause(2);
        Assert.assertTrue(productMoves.saveFieldsListButton.isDisplayed(), "Save field list button is not displayed");
        SeleniumUtils.pause(2);
        Assert.assertTrue(productMoves.exportAllDataRadioButton.isDisplayed(), "Export all data radio button is not displayed");
        SeleniumUtils.pause(2);
        Assert.assertTrue(productMoves.excelRadioButton.isDisplayed(), "Excel radio button is not displayed");
        SeleniumUtils.pause(2);
        productMoves.closeButton.click();
        SeleniumUtils.pause(2);
    }

    @Test(priority = 28) //Roman
    public void table() {
        // Manager should be able to see "table"
        productMoves.productMovesButton.click();
        Assert.assertTrue(productMoves.table.isDisplayed(), "Table is not displayed");
        SeleniumUtils.pause(3);
    }

    @Test(priority = 29)  //Roman
    public void productMovesText() {
        // Manager should be able to see "Product Moves text"
        productMoves.productMovesButton.click();
        String actualTextHeader = productMoves.productMovesText.getText();
        String expectedTextHeader = "Product Moves";
        Assert.assertTrue(actualTextHeader.contains(expectedTextHeader), "Actual value does not equal to expected value ");
        SeleniumUtils.pause(3);


    }


}



