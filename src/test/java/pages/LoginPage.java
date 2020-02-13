package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id ='login']")
    public WebElement loginInput;
    @FindBy(xpath = "//*[@id = 'password']")
    public WebElement passwordInput;
    @FindBy(xpath = "//*[@class = 'btn btn-primary']")
    public WebElement loginButton;

}
