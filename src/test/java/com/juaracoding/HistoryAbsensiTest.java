package com.juaracoding;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.pages.HistoryAbsensi;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HistoryAbsensiTest {
    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static HistoryAbsensi historyAbsensi = new HistoryAbsensi();

    public HistoryAbsensiTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("I am on the login user")
    public void Iamontheloginuser() {
        driver.get(Constants.URLUser);
        extentTest.log(LogStatus.PASS, "I am on the login user");
    }

    @When("I enter user a valid username and password and login")
    public void Ienteruseravalidusernameandpasswordandlogin() {
        historyAbsensi.loginUser("dumy@test.com", "12345678");
        historyAbsensi.setBtnLogin();
        // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }

    @And("I click the login button selengkapnya")
    public void Iclicktheloginbuttonselengkapnya() {
         historyAbsensi.setBtnHistoryAbsensi();
    }

    @Then("I should be redirected to dashboard history absensi")
    public void Ishouldberedirectedtodashboardhistoryabsensi() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/apps/absent/activity");
        extentTest.log(LogStatus.PASS, "I should be redirected to dashboard history absensi");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("I am on the login user absensi")
    public void Iamontheloginuserabsensi(){
    driver.get(Constants.URLUser);
    extentTest.log(LogStatus.PASS,"I am on the login user page");
    }

    @When("I enter user a valid username and password and login absensi")
    public void Ienteruseravalidusernameandpasswordandloginabsensi(){
    historyAbsensi.loginUser("dumy@test.com","12345678");
    historyAbsensi.setBtnLogin();
    // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }

    @And("I click the login button absensi")
    public void Iclicktheloginbuttonselengkapnyaabsensi() {
    historyAbsensi.setBtnAbsensi();
    }

    @Then("I should be redirected to dashboard history absensi 2")
    public void Ishouldberedirectedtodashboardhistoryabsensiabsensi()throws
    InterruptedException {
    Thread.sleep(5000);
    Assert.assertEquals(driver.getCurrentUrl(),
    "https://magang.dikahadir.com/apps/absent/activity");
    extentTest.log(LogStatus.PASS,"I should be redirected to dashboard history absensi");
    }

}
