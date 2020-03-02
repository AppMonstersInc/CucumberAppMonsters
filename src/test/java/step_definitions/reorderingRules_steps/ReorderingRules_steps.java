package step_definitions.reorderingRules_steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.ReorderingRulesPage;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReorderingRules_steps {
    ReorderingRulesPage reorderingRulesPage = new ReorderingRulesPage();

    @Given("Manager|Employee on inventory module page")
    public void manager_Employee_on_inventory_module_page() {
        SeleniumUtils.pause(2);
    }

    @Given("Verify reordering rules is displayed")
    public void verify_reordering_rules_is_displayed() {
        Assert.assertTrue("Not DISPLAYED", reorderingRulesPage.reorderingRulesButton.getText().contains("Reordering Rules"));
    }

    @Then("Manager|Employee click to reordering rules button")
    public void manager_Employee_click_to_reordering_rules_button() {
        reorderingRulesPage.reorderingRulesButton.click();
    }

    @Then("Verify Reordering Rules title is displayed")
    public void verify_Reordering_Rules_title_is_displayed() {
        SeleniumUtils.pause(2);
        Assert.assertTrue("The title does not contains Reordering Rules", Driver.getDriver().getTitle().contains("Reordering Rules"));
    }

    @Then("Verify reordering rules page contains columns with Name;Product;Minimum Quantity;Maximum Quantity;")
    public void verify_reordering_rules_page_contains_columns_with_Name_Product_Minimum_Quantity_Maximum_Quantity() throws IOException {
        List<WebElement> excualList = reorderingRulesPage.listRecordSelector;
        List<String> expetedList = new ArrayList<>();
        File file = new File("src/InventoryData.xlsx");
        // System.out.println(file.exists());
        //LOAD the fine into java memory using fileInputstream

        FileInputStream fileInputStream = new FileInputStream(file);
        //LOAD THE EXCEL WORKBOOK INTO THE JAVA CLASS

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        //getting the sheet

        XSSFSheet sheet = workbook.getSheet("Sheet1");
        expetedList.add(sheet.getRow(0).getCell(0)+"");
        expetedList.add(sheet.getRow(0).getCell(1)+"");
        expetedList.add(sheet.getRow(0).getCell(2)+"");
        expetedList.add(sheet.getRow(0).getCell(3)+"");
        int count = 0;
        for (int i = 0; i < expetedList.size(); i++) {
            if (excualList.get(i).getText().equals(expetedList.get(i))) {
                count++;
            }
        }
        Assert.assertEquals( "Not all columns in the list",count, 4);
    }

    @Then("Verify reordering rules check boxes is enabled")
    public void verify_reordering_rules_check_boxes_is_enabled() {
        List<WebElement> checkBoxes = reorderingRulesPage.listOfCheckBoxes;
        int count = 0;
        for (int i = 0; i < checkBoxes.size(); i++) {
            SeleniumUtils.pause(1);
            if (!checkBoxes.get(i).isEnabled()) {
                count++;
            }
        }

        Assert.assertEquals( "Failed, all checkboxes should be enabled by default",count, 0);

    }


    @Then("Verify reordering rules headers")
    public void verify_reordering_rules_headers() {
        SeleniumUtils.pause(2);
        reorderingRulesPage.reorderingRulesButton.click();
        SeleniumUtils.pause(2);
        reorderingRulesPage.nameOfProductColumn.click();
        String actualResultHeader = reorderingRulesPage.reorderingRulesHeader.getText();
        String expectedResultHeader = "Rules";
        Assert.assertTrue( "Actual result not equal to expected one",actualResultHeader.contains(expectedResultHeader));

    }

    @Then("Verify The ProductName in Reordering Rules")
    public void verify_The_ProductName_in_Reordering_Rules() {
        reorderingRulesPage.reorderingRulesName.click();
        String actualResultHeader = reorderingRulesPage.reorderingRulesName.getText();
        String expectedResultHeader = "Name";
        Assert.assertTrue("Actual result not equal to expected one",actualResultHeader.contains(expectedResultHeader) );

    }

    @Then("Verify Reordering Rules Table Is Displayed")
    public void verify_Reordering_Rules_Table_Is_Displayed() {
        String actualTable = reorderingRulesPage.reorderingRulesTable.getText();
        SeleniumUtils.pause(2);
        Assert.assertFalse("Table is empty",actualTable.isEmpty());
    }

    @Given("Click to search box")
    public void click_to_search_box() {
        reorderingRulesPage.reorderingRulesButton.click();
    }

    @Then("Verify Search Functionality On Reordering RulesPage")
    public void verify_Search_Functionality_On_Reordering_RulesPage() {
        reorderingRulesPage.searchInput.sendKeys("Computer" + Keys.ENTER);
        List<WebElement> list = reorderingRulesPage.firstColumns;
        boolean result = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getText().contains("Computer")) {
                result = true;
            }
        }
        SeleniumUtils.pause(2);
        Assert.assertTrue("Search functionality is NOT Working",result);
    }



}
