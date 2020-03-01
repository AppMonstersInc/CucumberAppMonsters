package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RunSchedulerPage {

    public RunSchedulerPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Run Scheduler')]")
    public WebElement runSchedulerDisplayed;


    @FindBy (xpath = "//a[@data-action-id='483']")
    public WebElement runSchedulerClickable;

    @FindBy (xpath ="//button[@type='object']" )
    public  WebElement verifyButtonAccepting;


    }



