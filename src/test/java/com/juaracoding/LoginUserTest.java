package com.juaracoding;

import com.juaracoding.pages.LoginUser;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginUserTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginUser loginUser = new LoginUser();

    public LoginUserTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("I am on the login user page")
    public void Iamontheloginuserpage(){
        driver.get(Constants.URLUser);
        extentTest.log(LogStatus.PASS,"I am on the login user page");
    }


    @When("I enter user a valid username and password")
    public void Ienteruseravalidusernameandpassword(){
        loginUser.loginUser("dumy@test.com","12345678");
        extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }

    @And("I click the login button user")
    public void Iclicktheloginbuttonuser(){
        loginUser.setBtnLogin();
        extentTest.log(LogStatus.PASS,"I click the login button user");
    }

    @Then("I should be redirected to dashboard page user")
    public void i_should_be_redirected_to_dashboard_page()throws InterruptedException {
    Thread.sleep(5000);
    Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/apps/absent");
    extentTest.log(LogStatus.PASS,"I should be redirected to dashboard page user");
    }
}
