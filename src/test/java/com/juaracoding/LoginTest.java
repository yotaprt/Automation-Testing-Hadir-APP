package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @Given("I am on the login page")
    public void i_am_on_the_login_page(){
        driver.get(Constants.URL);
        Assert.assertEquals(driver.getCurrentUrl(), Constants.URL);
        extentTest.log(LogStatus.PASS, "I am on the login page");
    }

    @Given("I am logged in with email {string} and password {string}")
    public void i_am_logged_in_with_email_and_password(String email, String password) {
        driver.get(Constants.URL);
        Assert.assertEquals(driver.getCurrentUrl(), Constants.URL);
        loginPage.loginUser(email, password);
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS, "I am logged in with email "+email+" and password "+password);
    }

    @When("I enter email {string} and password {string}")
    public void i_enter_email_and_password(String email, String password){
        loginPage.loginUser(email, password);
        extentTest.log(LogStatus.PASS, "I enter email "+email+" and password "+password);
    }

    @And("I click the login button")
    public void i_click_the_login_button(){
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS, "I click the login button");
    }

    @Then("I should be redirected to dashboard page")
    public void i_should_be_redirected_to_dashboard_page() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/dashboards/pending");
        extentTest.log(LogStatus.PASS, "I should be redirected to dashboard page");
    }

    @Then("User failed to login")
    public void user_failed_to_login() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/authentication/login");
        extentTest.log(LogStatus.PASS, "User failed to login");
    }

    

}
