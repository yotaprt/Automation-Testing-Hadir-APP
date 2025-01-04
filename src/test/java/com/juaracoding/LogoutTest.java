package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.LogoutPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogoutTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static LogoutPage logoutPage = new LogoutPage();

    public LogoutTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @Given("User already logged in")
    public void Useralreadyloggedin(){
        driver.get(Constants.URL);
        loginPage.loginvalid("admin@hadir.com","admin@hadir");
        extentTest.log(LogStatus.PASS,"User already logged in");
        // extentTest.log(LogStatus.PASS,"I am on the login page");
    }

    @When("User click proflie")
    public void KlikUserProfile(){
        logoutPage.setBtnProfile();
        extentTest.log(LogStatus.PASS,"User click proflie");
        // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }

    @And("User click logout button")
    public void Userclicklogoutbutton() throws InterruptedException {
        Thread.sleep(2000);
        logoutPage.setBtnLogout();
        extentTest.log(LogStatus.PASS,"User click logout button");
    }

    @Then("User navigated to the login page")
    public void Usernavigatedtotheloginpage()throws InterruptedException {
        Thread.sleep(2000);
        extentTest.log(LogStatus.PASS,"User navigated to the login page");
        Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/authentication/login");
    }
}
