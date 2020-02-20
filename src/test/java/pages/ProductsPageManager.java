package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPageManager {
    public ProductsPageManager(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[contains(text(), 'Product')])[1]")
    public WebElement productsButton;

    @FindBy(xpath = "(//*[@class='active'])[3]")
    public WebElement headerOfProducts;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(xpath = "//*[@class='o_form_sheet']")
    public WebElement createForm;

    @FindBy(xpath = "//*[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement productNameInput;

    @FindBy(css = "#o_field_input_488")
    public WebElement newProductSalesPrice;

    @FindBy(css = "#o_field_input_492")
    public WebElement newProductCost;

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement newProductSaveButton;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary'])[1]")
    public WebElement okButton;

    @FindBy(xpath = "//*[@class='oe_kanban_global_click o_kanban_record']")
    public WebElement fakeResult;

    @FindBy(xpath = "//*[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement fakeResultName;
}
