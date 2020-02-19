package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
import java.util.logging.XMLFormatter;

public class TransferPage {


    public TransferPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//a[@data-action-id='490']")
    public WebElement transferButton;

    @FindBy(xpath = "//div[@class='table-responsive']")
    public List<WebElement> allTransferList;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List <WebElement> allClickButton;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

   @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

   @FindBy(xpath = "//div[@class='o_form_sheet']")
   public WebElement newStockForm;

   ////div[@class='btn-group o_dropdown open']/button
   @FindBy(xpath = "//div[@class='o_cp_sidebar']/div/div[2]")
    public WebElement actionButton;

   @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

   @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement firstButton;

   @FindBy(xpath = "//div[@class='btn-group o_dropdown open']/ul/li[2]")
    public WebElement deleteButton;



}
