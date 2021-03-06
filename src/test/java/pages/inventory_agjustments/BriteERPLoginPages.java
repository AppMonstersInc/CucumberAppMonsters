package pages.inventory_agjustments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BriteERPLoginPages {
    public BriteERPLoginPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#login")
    public WebElement usernameInputBox;

    @FindBy(css = "#password")
    public WebElement passwordInputBox;
    // submit button
    @FindBy(xpath = "//button[.='Log in']")
    public WebElement submitButton;


}
