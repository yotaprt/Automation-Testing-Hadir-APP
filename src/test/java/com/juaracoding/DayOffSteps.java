package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.DayOffPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DayOffSteps {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static DayOffPage dayoffPage = new DayOffPage();

    public DayOffSteps(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @Given("User Successfully Login")
    public void userSuccessfullyLogin() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"I am on the login page");
        loginPage.loginvalid("admin@hadir.com","admin@hadir");
    }

    @When("User open navbar menu")
    public void userOpenNavbarMenu() {
        extentTest.log(LogStatus.PASS,"User open navbar menu");
        dayoffPage.clickDayoffMenuInManagement();
    }

    @And("User clicks on the Day off menu under Management")
    public void UserclicksontheDayoffmenuunderManagement() {
        dayoffPage.clickDayoffMenu();
    }

    @Then("User navigated to the Day Off page")
    public void userNavigatedToTheDayOffPage() throws InterruptedException {
        extentTest.log(LogStatus.PASS,"User navigated to the Day Off page");
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/management/day-off");
    }

    //////////////////////////////////////////////////////////////////////////


    @Then("The system displays Cuti Bersama and Cuti Nasional data on the Day Off page")
    public void theSystemDisplaysCutiBersamaAndCutiNasionalDataOnTheDayOffPage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(dayoffPage.isCutiBersamaVisible(), "Cuti Bersama Visible");
        Assert.assertTrue(dayoffPage.isLiburanNasionalVisible(), "Liburan Nasional Visible");
        // Assert.assertTrue(dayoffPage.dayoffNavBar.isDisplayed());
    }

    @Then("The system displays Cuti Bersama and Cuti Nasional data with Date and Description columns completely")
    public void theSystemDisplaysCutiBersamaAndCutiNasionalDataWithDateAndDescriptionColumnsCompletely() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(dayoffPage.isTglCutBerVisible(), "Tanggal Cuti Bersama Visible");
        Assert.assertTrue(dayoffPage.isDescCutBerVisible(), "Deskripsi Cuti Bersama Visible");
        
    }

    @Then("The system displays complete and correct Cuti Bersama and Cuti Nasional date")
    public void theSystemDisplaysCompleteAndCorrectCutiBersamaAndCutiNasionalDate()throws InterruptedException  {
        Assert.assertTrue(dayoffPage.isTglCutBerVisible(), "Tanggal Cuti Bersama Visible");
        Assert.assertTrue(dayoffPage.isDescCutBerVisible(), "Deskripsi Cuti Bersama Visible");
        // Assert.assertTrue(dayoffPage.CutiBersamaTableVisible(), "Cuti Bersama Table Visible");
        // Assert.assertTrue(dayoffPage.LiburanNasionalTableVisible(), "Liburan Nasional Table Visible");
        Thread.sleep(2000);
    }
}