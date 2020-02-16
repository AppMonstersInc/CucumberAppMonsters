package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class ReorderingRulesPage {
    public ReorderingRulesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Reordering Rules')]")
    public WebElement reorderingRulesButton;

    @FindBy(xpath = "//*[@class='o_column_sortable']")
    public List<WebElement> listRecordSelector;

    @FindBy(xpath = "//*[@type='checkbox']")
    public List<WebElement> listOfCheckBoxes;

    @FindBy(xpath = "(//table//tr//td)[2]")
    public WebElement nameOfProductColumn;

    @FindBy(xpath = "//*[@class='o_horizontal_separator']")
    public WebElement reorderingRulesHeader;

    @FindBy(xpath = " (//*[contains(text(),'Name')])[2]")
    public WebElement reorderingRulesName;

    @FindBy(xpath = " (//*[contains(text(),'Name')])[2]")
    public WebElement reorderingRulesTable;

    @FindBy(xpath = "//*[@class='o_searchview_input']")
    public WebElement searchInput;

    @FindBy(xpath = "//*[@class='o_data_cell o_required_modifier'][1]")
    public List<WebElement> firstColumns;


}
