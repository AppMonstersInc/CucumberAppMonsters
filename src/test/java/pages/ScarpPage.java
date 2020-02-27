
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.logging.XMLFormatter;

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

    // Import Button -10-
    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    // Test Import -11-
    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary o_import_button o_import_validate']")
    public WebElement testImportButton;

    // Import Button second Page -12-
    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_import_button o_import_import']")
    public WebElement importButton2ndPage;

    // 'Select a CSV or Excel file to import.' Text -13-
    @FindBy(xpath = "(//p)[1]")
    public WebElement verifyText;

    // Reload file -14-
    @FindBy(xpath = "//button[@class='btn btn-default oe_import_file_reload']")
    public WebElement reloadFileButton;

    // Load file -15-
    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement loadFileButton;


    // Input field -16-
    @FindBy(xpath = "//input[@class='oe_import_file_show form-control']")
    public WebElement inputField;

    // Help Button -17-
    @FindBy(xpath = "//a[@class='pull-right']")
    public WebElement helpButton;

    // Cancel Button -18-
    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_import_cancel']")
    public WebElement CancelButton;



    // Mangifying glass Button -19-
    @FindBy(xpath = "//span[@class='o_searchview_more fa fa-search-plus']")
    public WebElement mangifyingGlassButton;


    // Filter Button -20-
    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement filterButton;


    // Group By Button -21-
    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[4]")
    public WebElement groupByButton;

    //     -22-
// The Drop list:
// 1- Product
// 2- Location
// 3- Scrap Location
// 4- Add Custom Group
    @FindBy(xpath = "//li[@data-index='0']")
    public WebElement productSelection;
    @FindBy(xpath = "//li[@data-index='1']")
    public WebElement locationSelection;
    @FindBy(xpath = "//li[@data-index='2']")
    public WebElement scrapLocationSelector;
    @FindBy(xpath = "//li[@class='o_add_custom_group o_closed_menu']")
    public WebElement addCustomGroupSelector;


    // Favorites Button -23-
    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[5]")
    public WebElement favoritesButton;

    // Save Current Search -24-
    @FindBy(xpath = "//li[@class='o_save_search o_closed_menu']")
    public WebElement saveCurrentSearch;

    // Add to my Dashboard -25-
    @FindBy(xpath = "//li[@class='o_add_to_dashboard_link o_closed_menu']")
    public WebElement addToMyDashboard;



    // Search Input Field -26-
    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchInputField;




}
//
//(//input[@class='o_input ui-autocomplete-input'])[2]