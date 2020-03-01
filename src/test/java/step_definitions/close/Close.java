package step_definitions.close;

import cucumber.api.java.en.Then;
import utilities.Driver;

public class Close {
    @Then("Close all windows logged in")
    public void close_all_windows_logged_in() {
        Driver.closeDriver();
    }


}
