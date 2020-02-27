package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InventoryFunctionality_Reporting {
    public InventoryFunctionality_Reporting(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu='363']")
    public WebElement inventoryFuncButton;
    @FindBy(css = "h4.modal-title")
    public WebElement inventoryPageMainText;
    @FindBy(xpath = "//button[@name='open_table']")
    public WebElement retrieveButton;
    @FindBy(xpath = "//input[@data-value='0']")
    public WebElement firstRadioButton;
    @FindBy(xpath = "//label[.='Current Inventory']")
    public WebElement firstRadioButtonText;
    @FindBy(xpath = "//input[@data-value='1']")
    public WebElement secondRadioButton;
    @FindBy(xpath = "//label[.='At a Specific Date']")
    public WebElement secondRadioButtonText;
    @FindBy(xpath = "//label[@for='o_field_input_34']")
    public WebElement dateText;
    @FindBy(xpath = "//span[@class='o_datepicker_button']")
    public WebElement datePickerButton;
    @FindBy(xpath = "//div[@class='o_datepicker o_field_date o_field_widget']")
    public WebElement calendarBox;
    @FindBy(css = "button[special='cancel']")
    public WebElement cancelButton;

    @FindBy(css = ".close")
    public WebElement xButton;

    @FindBy(xpath = "//button[.='Ok']")
    public WebElement okAlertButton;


}
