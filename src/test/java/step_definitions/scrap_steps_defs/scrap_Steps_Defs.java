package step_definitions.scrap_steps_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ScarpPage;
import utilities.SeleniumUtils;

public class scrap_Steps_Defs {

    ScarpPage scarpPage = new ScarpPage();


    @Given("User should be able to click on Scrap button")
    public void user_should_be_able_to_click_on_Scrap_button() {
        scarpPage.scrapButton.click();
    }


    @Given("User should be able to click on create button")
    public void user_should_be_able_to_click_on_create_button() {
        scarpPage.createButton.click();
    }

    @Given("User should be able to see form sheet")
    public void user_should_be_able_to_see_form_sheet() {
        Assert.assertTrue("Form Sheet it's not Displayed!!",scarpPage.formSheet.isDisplayed());
        SeleniumUtils.pause(2);
    }

    @Given("Verify Product text button is correct!")
    public void verify_Product_text_button_is_correct() {
        String actualTxt = scarpPage.productButtonTxt.getText();
        String expectedTxt = "Product";

        Assert.assertTrue("WRONG PRODUCT TEXT!!!!",actualTxt.equals(expectedTxt));

    }

    @Given("User should be able to input numbers on Quantity field")
    public void user_should_be_able_to_input_numbers_on_Quantity_field() {

        scarpPage.quantityButton.clear();
        scarpPage.quantityButton.sendKeys("2.00");
    }

    @Given("Verify Quantity text button is correct!")
    public void verify_Quantity_text_button_is_correct() {

        Assert.assertTrue("Quantity button TEXT is WRONG!!",scarpPage.QuantityButtonText.getText().equals("Quantity"));
    }

    @Given("User should be able to input info on Source Document field")
    public void user_should_be_able_to_input_info_on_Source_Document_field() {

        scarpPage.sourceDocumentInputFiled.sendKeys("Example0006");

    }

    @Given("Verify Source Document text button is correct!")
    public void verify_Source_Document_text_button_is_correct() {
        Assert.assertTrue("Source Document field TEXT is WRONG!!",scarpPage.sourceDocumentText.getText().equals("Source Document"));
    }

    @Given("User should be able to click on Expected Date filed")
    public void user_should_be_able_to_click_on_Expected_Date_filed() {
        scarpPage.expectedDateField.click();
        SeleniumUtils.pause(3);

    }

    @Given("Verify Expected Date text button is correct!")
    public void verify_Expected_Date_text_button_is_correct() {
        Assert.assertTrue("Expected Date field TEXT is WRONG!!",scarpPage.expectedDateFieldText.getText().equals("Expected Date"));

    }

    @Then("User should be able to click on Discard Button")
    public void user_should_be_able_to_click_on_Discard_Button() {

        scarpPage.discardButton.click();
    }

    @Then("User should be able to click Ok on alert window")
    public void user_should_be_able_to_click_Ok_on_alert_window() {

        scarpPage.okButtonWarning.click();
    }
    /////////////////////////////////////////////////////////////////////
    // import///////////////////////////////////////////////////////////

    @Given("User should be able to click on import button")
    public void user_should_be_able_to_click_on_import_button() {
        scarpPage.importButton.click();
    }

    @Given("Verify Test Import Button is Displayed")
    public void verify_Test_Import_Button_is_Displayed() {
        Assert.assertTrue("Test Import button is Not Displayed!!",scarpPage.testImportButton.isDisplayed());
    }

    @Given("Verify Import Button in second page is Displayed")
    public void verify_Import_Button_in_second_page_is_Displayed() {
       Assert.assertTrue("Import button 2nd page is Not Displayed!!",scarpPage.importButton2ndPage.isDisplayed());
    }

    @Given("Verify Select a CSV or Excel file to import text is Displayed")
    public void verify_Select_a_CSV_or_Excel_file_to_import_text_is_Displayed() {
        Assert.assertTrue("Text is Not Displayed!!",scarpPage.verifyText.isDisplayed());
    }

    @Given("Verify Reload File Button is Displayed")
    public void verify_Reload_File_Button_is_Displayed() {
        Assert.assertTrue("Reload file is Not Displayed!!",scarpPage.reloadFileButton.isDisplayed());
    }

    @Given("Verify Load File Button is Displayed")
    public void verify_Load_File_Button_is_Displayed() {
       Assert.assertTrue("Load Button is Not Displayed!!",scarpPage.loadFileButton.isDisplayed());
    }

    @Given("Verify Input Field is Displayed")
    public void verify_Input_Field_is_Displayed() {
       Assert.assertTrue("Input Field is Not Displayed!!",scarpPage.inputField.isDisplayed());
    }

    @Given("Verify Help Button is Displayed")
    public void verify_Help_Button_is_Displayed() {
        Assert.assertTrue("Help Button is Not Displayed!!",scarpPage.helpButton.isDisplayed());
    }

    @Given("Verify Cancel Button is Displayed")
    public void verify_Cancel_Button_is_Displayed() {
       Assert.assertTrue("Cancel Button is Not Displayed",scarpPage.CancelButton.isDisplayed());
        SeleniumUtils.pause(2);
    }
    /////////////////////////////////////////////////////////////////////
    ///Scrap Search Buttons Verify//////////////////////////////////////


    @Given("User should be able to click on MangifyingGlass Button")
    public void user_should_be_able_to_click_on_MangifyingGlass_Button() {
        scarpPage.mangifyingGlassButton.click();
    }

    @Given("User should be able to click on Filter Button")
    public void user_should_be_able_to_click_on_Filter_Button() {
        SeleniumUtils.pause(3);
        scarpPage.filterButton.click();
    }

    @Given("User should be able to click on Group By Button")
    public void user_should_be_able_to_click_on_Group_By_Button() {
        scarpPage.groupByButton.click();

    }

    @Given("Verify Product Selection is Displayed")
    public void verify_Product_Selection_is_Displayed() {
        Assert.assertTrue("Product Select is Not Displayed!!",scarpPage.productSelection.isDisplayed());
    }

    @Given("Verify Location Selection is Displayed")
    public void verify_Location_Selection_is_Displayed() {
        Assert.assertTrue("Location Select is Not Displayed!!",scarpPage.locationSelection.isDisplayed());
    }

    @Given("Verify Scrap Location Selector is Displayed")
    public void verify_Scrap_Location_Selector_is_Displayed() {
       Assert.assertTrue("Scrap Select is Not Displayed!!",scarpPage.scrapLocationSelector.isDisplayed());
    }

    @Given("Verify Add Custom Group Selector is Displayed")
    public void verify_Add_Custom_Group_Selector_is_Displayed() {
        Assert.assertTrue("Add Custom Select is Not Displayed",scarpPage.addCustomGroupSelector.isDisplayed());
    }

    @Given("User should be able to click Favorites Button")
    public void user_should_be_able_to_click_Favorites_Button() {
        scarpPage.favoritesButton.click();
    }

    @Given("Verify Save Current Search is Displayed")
    public void verify_Save_Current_Search_is_Displayed() {
        Assert.assertTrue("Save Current Search is Not Displayed!!",scarpPage.saveCurrentSearch.isDisplayed());
    }

    @Given("Verify Add To My Dashboard is Displayed")
    public void verify_Add_To_My_Dashboard_is_Displayed() {
       Assert.assertTrue("Add to my Dashboard is Not Displayed!!",scarpPage.addToMyDashboard.isDisplayed());
    }

    @Then("User should be able to write in Search Input Field and click ENTER")
    public void user_should_be_able_to_write_in_Search_Input_Field_and_click_ENTER() {
        scarpPage.searchInputField.sendKeys("apple" + Keys.ENTER);
    }

}
