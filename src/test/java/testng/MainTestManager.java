package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.BriteUtils;
import utilities.Driver;
import utilities.SeleniumUtils;

public class MainTestManager {
    HomePage homePage = new HomePage();


    @BeforeClass
    public void login() {
        BriteUtils.login_as_manager();
    }

    @AfterClass
    public void close(){
        Driver.getDriver().quit();
    }

    /* This test logs in as employee and verify if
     Inventory Module is  displayed and navigates inside
     Inventory Module

     */
    @Test(priority = 0  )
    public void verifyHomePage() {
        SeleniumUtils.pause(2);
        Assert.assertTrue(homePage.inventoryModuleTab.getText().contains("Inventory"), "Not DISPLAYED");
        homePage.inventoryModuleTab.click();
    }

}
