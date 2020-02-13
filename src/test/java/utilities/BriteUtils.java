package utilities;

import pages.LoginPage;

public class BriteUtils {

    static LoginPage loginPage ;


    public static void login_as_employee() {
        loginPage = new LoginPage();
        Driver.getDriver().get(Config.getProperty("inventoryUrl"));
        loginPage.loginInput.sendKeys(Config.getProperty("employeeUsername"));
        loginPage.passwordInput.sendKeys(Config.getProperty("employeePassword"));
        loginPage.loginButton.click();


    }

    public static void login_as_manager() {
        loginPage = new LoginPage();
        Driver.getDriver().get(Config.getProperty("inventoryUrl"));
        loginPage.loginInput.sendKeys(Config.getProperty("managerUsername"));
        loginPage.passwordInput.sendKeys(Config.getProperty("managerPassword"));
        loginPage.loginButton.click();
    }
}
