package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ReorderingRulesPage {
    public ReorderingRulesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(),'Reordering Rules')]")
    public WebElement reorderingRulesButton;

    @FindBy(xpath = "//*[@class='o_column_sortable']")
    public List<WebElement> listRecordSelector;

    @FindBy(xpath = "//*[@type='checkbox']")
    public List<WebElement> listOfCheckBoxes;
}
