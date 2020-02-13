package testng;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ReorderingRulesPage;
import utilities.BriteUtils;
import utilities.Driver;
import utilities.SeleniumUtils;

public class MainTestEmployee {
    HomePage homePage = new HomePage();
    ReorderingRulesPage reorderingRulesPage = new ReorderingRulesPage();


    @BeforeClass
    public void login() {
        BriteUtils.login_as_employee();
    }

    @AfterClass
    public void close() {
        Driver.getDriver().quit();
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


}
