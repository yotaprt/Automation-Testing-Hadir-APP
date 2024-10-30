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

    // TCC.HR.00001
    @Given("I am on the login page")
    public void i_am_on_the_login_page(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"I am on the login page");
    }

    @When("I enter a valid username and password")
    public void i_enter_a_valid_username_and_password(){
        loginPage.loginUser("Admin","admin123");
        extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }

    @And("I click the login button")
    public void i_click_the_login_button(){
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS,"I click the login button");
    }

    @Then("I should be redirected to dashboard page")
    public void i_should_be_redirected_to_dashboard_page(){
        Assert.assertEquals(loginPage.getTxtDashboard(),"Dashboard");
        extentTest.log(LogStatus.PASS,"I should be redirected to dashboard page");
    }

    // TCC.HR.00002
    @Given("I am logout")
    public void i_am_logout(){
        loginPage.logout();
        extentTest.log(LogStatus.PASS,"I am logout");
    }

    @When("I enter a invalid username and password")
    public void i_enter_a_invalid_username_and_password(){
        loginPage.loginUser("invalid","invalid");
        extentTest.log(LogStatus.PASS,"I enter a invalid username and password");
    }

    @Then("I see message invalid credentials")
    public void i_see_message_invalid_credentials(){
        Assert.assertEquals(loginPage.getTxtInvalid(),"Invalid credentials");
        extentTest.log(LogStatus.PASS,"I see message invalid credentials");
    }

}
