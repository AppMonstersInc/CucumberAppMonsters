package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class WarehousesPage {
    public WarehousesPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//*[@class='oe_menu_text'])[27]")
    public WebElement WarehouseManagementButton;

    @FindBy(xpath = "//a//span[contains(text(),'Warehouses')]")
    public WebElement WarehouseButton;

    @FindBy(xpath = "(//*[.='Warehouses'])[1]")
    public WebElement WarehouseText;

   @FindBy(xpath = "//*[@class='o_searchview_input']")
    public WebElement WarehouseSearchBox;


}
