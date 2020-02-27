package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InventoryAdjustmentsPage {
    public InventoryAdjustmentsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@data-menu='347']")
    public WebElement inventoryModuleDisplayVerify;

    @FindBy(xpath = "//a[@data-menu='370']")
    public WebElement inventoryAdjustmentsButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButtonVerify;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButtonVerify;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBoxVerify;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement alertAcceptButton;

    @FindBy(xpath = "//button[.='Cancel']")
    public WebElement cancelButtonPress;

    @FindBy(xpath = "(//td[.='INV: Apple MacBookAir'])[1]")
    public WebElement firstTextVerify;
}
