package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ScarpPage {

    public ScarpPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


// Scarp Button-1-
    @FindBy(xpath = "(//span[contains(text(),'Scrap')])[1]")
    public WebElement scrapButton;


// Create Button -2-
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

// Form Sheet -3-

    @FindBy(xpath = "//div[@class='o_form_sheet']")
    public WebElement formSheet;

//  Product drop list -4-
    @FindBy(xpath = "//label[@class='o_form_label o_required_modifier']")
    public WebElement productButtonTxt;

    @FindBy(css = "#ui-id-44")
    public WebElement selectingProduct;

    @FindBy(css = "#o_field_input_3022")
    public WebElement ProductSelectButton;

// Quantity Button -5-
    @FindBy(xpath = "//input[@class='o_field_float o_field_number o_field_widget o_input o_required_modifier']")
    public WebElement quantityButton;

    @FindBy(xpath = "(//label[@class='o_form_label'])[1]")
    public WebElement QuantityButtonText;


//  Source Document input filed -6-
    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input']")
    public WebElement sourceDocumentInputFiled;

    @FindBy(xpath = "(//label[@class='o_form_label'])[2]")
    public WebElement sourceDocumentText;

// Expected Date field -7-
    @FindBy(xpath = "//input[@class='o_datepicker_input o_input']")
    public WebElement expectedDateField;

    @FindBy(xpath = "(//label[@class='o_form_label'])[3]")
    public WebElement expectedDateFieldText;

// Save Button -8-
    @FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
    public WebElement saveButton;

// Discard button
@FindBy(xpath = "(//button[contains(text(),'Discard')])[1]")
public WebElement discardButton;

// Ok Button -9-
    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement okButtonWarning;

}

//(//input[@class='o_input ui-autocomplete-input'])[2]