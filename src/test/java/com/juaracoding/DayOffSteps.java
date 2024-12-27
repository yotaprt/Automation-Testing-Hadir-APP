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

    @And("Click Dayoff menu in management")
    public void clickDayoffMenuInManagement() {
        dayoffPage.clickDayoffMenu();
    }

    @Then("User navigated to the Day Off page")
    public void userNavigatedToTheDayOffPage() throws InterruptedException {
        extentTest.log(LogStatus.PASS,"User navigated to the Day Off page");
        Thread.sleep(5000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/management/day-off");
    }

}
