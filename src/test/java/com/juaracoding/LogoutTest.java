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


    @Given("Admin telah login")
    public void Admintelahlogin(){
        driver.get(Constants.URL);
        loginPage.loginvalid("admin@hadir.com","admin@hadir");
        // extentTest.log(LogStatus.PASS,"I am on the login page");
    }

    @When("Klik User Profile")
    public void KlikUserProfile(){
        logoutPage.setBtnProfile();
        // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }

    @Then("Klik tombol Log Out")
    public void i_should_be_redirected_to_dashboard_page()throws InterruptedException {
    logoutPage.setBtnLogout();
    extentTest.log(LogStatus.PASS,"I should be redirected to dashboard page");
    }
}
