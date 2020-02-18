package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPageEmployee {
    public ProductsPageEmployee(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[contains(text(), 'Product')])[1]")
    public WebElement productsButton;

    @FindBy(xpath = "//*[@class='o_kanban_view o_kanban_ungrouped']")
    public WebElement itemsList;

    @FindBy(xpath = "//*[@class='o_searchview_input']")
    public WebElement searchBoxInput;

    @FindBy(xpath = "//*[@class='o_kanban_view o_kanban_ungrouped']")
    public WebElement searchedItemList;

    @FindBy(xpath = "//*[@class='oe_kanban_global_click o_kanban_record']")
    public WebElement searchedItemButton;

    @FindBy (xpath = "//*[@class='o_form_sheet']")
    public WebElement searchedItemForm;

}
