package testng;

import com.github.javafaker.Faker;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.InventoryAdjustmentsPage;
import pages.ProductsPageManager;
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
    ProductsPageManager productsPageManager = new ProductsPageManager();

    @BeforeClass
    public void login() {
        BriteUtils.login_as_manager();
    }

//    @AfterClass
//    public void close(){
//        Driver.closeDriver();
//    }

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
            public void searchBox(){
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
    public void searchButtonVerifyManager(){
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

    // As a manager I should be able to create product inside products page
    @Test (priority = 10)//Sultan
    public void productsButtonVerification(){
        // Verify Productions button is displayed
        Assert.assertTrue(productsPageManager.productsButton.isDisplayed(),"Products button is NOT displayed");
    }


    @Test (priority = 11)//Sultan
    public void productsPageVerification(){
        //    Verify Productions button is displayed
        //    Manager should be able to see Products button at the Inventory page
        //    Click to the Products button
        //    Manager sholud be navigated to Products page
        productsPageManager.productsButton.click();
        String actualResult = productsPageManager.headerOfProducts.getText();
        String expectedResult = "Products";
        SeleniumUtils.pause(2);

        Assert.assertTrue(actualResult.contains(expectedResult),"User is NOT navigated to PRODUCTS PAGE");
    }

    @Test (priority = 12)//Sultan
    public void createButtonVerification(){
        //    Verify create button is  displayed
        //    Manager should be navigated to create product page
        productsPageManager.productsButton.click();
        Assert.assertTrue(productsPageManager.createButton.isDisplayed(),"Create Button is not displayed");
    }

    @Test (priority = 13)//Sultan
    public void createFormVerification(){
        //    Manager should be able to to fill out form to create product
        productsPageManager.productsButton.click();
        SeleniumUtils.pause(2);
        productsPageManager.createButton.click();
        SeleniumUtils.pause(2);
        Assert.assertTrue(productsPageManager.createForm.isDisplayed(),"Create form is NOT displayed");
    }
    @Test (priority = 14)//Sultan
    public void validateCreateNewProduct(){
        //    Click to save	Verify that product is added to the products list
        Faker faker = new Faker();
        String str = faker.company().name();
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
        productsPageManager.searchBox.sendKeys(str+Keys.ENTER);
        SeleniumUtils.pause(2);
        productsPageManager.fakeResult.click();
        SeleniumUtils.pause(2);
        Assert.assertTrue(productsPageManager.fakeResultName.getText().contains(str),"Created item is NOT in the list");
    }







}
