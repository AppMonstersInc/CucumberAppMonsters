package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = ".o_thread_title")
    public WebElement mainPageTextVerify;
    @FindBy(xpath = "(//span[contains(text(), 'Inventory')])[1]")
    public WebElement inventoryModuleTab;





}
