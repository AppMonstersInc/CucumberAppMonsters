package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.logging.XMLFormatter;

public class OperationsTypesPage {

    public OperationsTypesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//a//span[contains(text(),'Operations Types')]")
    public WebElement OperationsTypesButton;

    @FindBy(xpath = "//li[.='All Operations']")
    public WebElement allOperationsText;

    @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm o_list_button_add'])")
    public WebElement operationsTypesCreateButton;

    @FindBy(xpath = "//th[.='Operation Types Name']")
    public WebElement operationTypesNameText;

    @FindBy(xpath = "//th[.='Reference Sequence']")
    public WebElement referenceSequenceTextFromTable;


    @FindBy(xpath = "//label[.='Type of Operation']")
    public WebElement typeOfOperationText;

    @FindBy(xpath = "//label[.='Show Detailed Operations']")
    public WebElement showDetailedOperationsText;

    @FindBy(xpath = "//label[.='Show Reserved']")
    public WebElement showReservedText;

    @FindBy(xpath = "//th[.='Warehouse']")
    public WebElement warehouseText;


    @FindBy(xpath= "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement OperationTypesNameInputBox;

    @FindBy(xpath = "//label[.='Reference Sequence']")
    public WebElement referenceSequenceTextInCreate;

    @FindBy(xpath = "//*[@name='sequence_id']")
    public WebElement ReferenceSequenceInputBox;

    @FindBy(xpath = "//li//a[.='12345']")
    public WebElement ReferenceSequenceInputBoxItem;

    @FindBy(xpath = "//select[@class='o_input o_field_widget o_required_modifier']")
    public WebElement TypeOfOperationInputBox;

    @FindBy(xpath = "//option[.='Customers']")
    public WebElement TypeOfOperationInputBoxItem;

    @FindBy(xpath = "(//*[@class='o_form_label'])[1]")
    public WebElement OperationTypeForReturnsText;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[3]")
    public WebElement operationsTypeForReturnBox;

    @FindBy(xpath = "//li[.='Chicago Warehouse: Delivery Orders']")
    public WebElement operationsTypeForReturnBoxItem;





    @FindBy(xpath = "//button[contains(text(),'Discard')]")
    public WebElement DiscardButton;

    @FindBy(xpath = "(//div//button[contains(text(), 'Save')])[1]")
    public WebElement SaveButton;

    @FindBy(xpath = "//button//span[.='Ok']")
    public WebElement okButton;

    @FindBy(xpath = "//ol//li//a[.='All Operations']")
    public WebElement allOperationsVerifyTextLast;


    @FindBy(xpath = "(//*[@class='btn btn-sm btn-default o_button_import'])")
    public WebElement OperationsTypesImportButton;

    @FindBy(xpath = "(//*[@class='o_searchview_input'])")
    public WebElement OperationsTypesSearchBox;

    @FindBy(xpath = "//li[.='Import a File']")
    public WebElement importAFileText;

    @FindBy(xpath = "//div//p[contains(text(), 'Select a CSV')]")
    public WebElement selectACSVText;

    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement loadFileButton;

    @FindBy(xpath = "//a[.='Help']")
    public WebElement helpButton;

    @FindBy(xpath = "//button[.='Cancel']")
    public WebElement cancelButtonInImportPage;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchButton;

    public String operationTextButton="Operation Types" ;

}
