package step_definitions.runSchedule_steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.RunSchedulerPage;
import pages.TransferPage;

public class Run_Scheduler_steps {
   RunSchedulerPage runSchedulerPage = new RunSchedulerPage();
    @Given("the user should be able to see Run scheduler button")
    public void the_user_should_be_able_to_see_Run_scheduler_button() {
      runSchedulerPage.runSchedulerDisplayed.isDisplayed();
    }

    @Given("User should be able to click")
    public void user_should_be_able_to_click() {
      runSchedulerPage.runSchedulerClickable.click();
    }

    @Given("accept pop ups")
    public void accept_pop_ups() {

        runSchedulerPage.verifyButtonAccepting.click();
    }

    @Then("User should be able tp see list")
    public void user_should_be_able_tp_see_list() {
       runSchedulerPage.runSchedulerClickable.isEnabled();
    }




}
