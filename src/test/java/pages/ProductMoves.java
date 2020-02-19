package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductMoves {
    public ProductMoves (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[contains(text(),'Product Moves')])")
    public WebElement productMovesButton;

    @FindBy(xpath = "//div[@class='o_searchview']")
    public WebElement searchBoxProductMoves;

    @FindBy(xpath = "(//*[.='Product Moves'])[2]")
    public WebElement productMovesText;

    @FindBy(xpath = "//table")
    public WebElement table;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement alertCloseButton;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[1]")
    public WebElement okButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement allCheckBoxSelector;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement actionButton;

    @FindBy(xpath = "(//a[@data-section='other'])[1]")
    public WebElement exportButton;

    @FindBy(xpath = "(//input[@name='o_import_compat_name'])[1]")
    public WebElement importCompatibleRadioButton;

    @FindBy(xpath = "(//input[@name='o_export_format_name'])[1]")
    public WebElement exportFormatsCsvRadioButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement exportToFileButton;


    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_add_field']")
    public WebElement addFieldButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_remove_field']")
    public WebElement removeFieldButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_remove_all_field']")
    public WebElement removeAllFieldButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_move_up']")
    public WebElement moveUpButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_move_down']")
    public WebElement moveDownButton;

    @FindBy(xpath = "//a[@class='pull-right o_toggle_save_list']")
    public WebElement saveFieldsListButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default']")
    public WebElement closeButton;

    @FindBy(xpath = "(//input[@name='o_import_compat_name'])[2]")
    public WebElement exportAllDataRadioButton;

    @FindBy(xpath = "(//input[@name='o_export_format_name'])[2]")
    public WebElement excelRadioButton;







}





