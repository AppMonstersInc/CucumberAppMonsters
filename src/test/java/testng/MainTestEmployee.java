package testng;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ReorderingRulesPage;
import utilities.BriteUtils;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.ArrayList;
import java.util.List;

public class MainTestEmployee {
    HomePage homePage = new HomePage();
    ReorderingRulesPage reorderingRulesPage = new ReorderingRulesPage();


    @BeforeClass
    public void login() {
        BriteUtils.login_as_employee();
    }

    //  @AfterClass
    public void close() {
        Driver.closeDriver();
    }


    /*
     Inventory Module is  displayed and navigates inside
     Inventory Module

     */
    @Test(priority = 0)
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


}
