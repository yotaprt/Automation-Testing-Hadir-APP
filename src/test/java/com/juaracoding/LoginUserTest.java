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

    //////Scenario Usename dan Password valid
    @Given("I am on the login user page")
    public void Iamontheloginuserpage(){
        driver.get(Constants.URLUser);
        extentTest.log(LogStatus.PASS,"I am on the login user page");
    }


    @When("I enter user a valid username and password")
    public void Ienteruseravalidusernameandpassword(){
        loginUser.loginUser("dumy@test.com","12345678");
        // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }

    @And("I click the login button user")
    public void Iclicktheloginbuttonuser(){
        loginUser.setBtnLogin();
    }

    @Then("I should be redirected to dashboard page user")
    public void i_should_be_redirected_to_dashboard_page()throws InterruptedException {
    Thread.sleep(5000);
    Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/apps/absent");
    extentTest.log(LogStatus.PASS,"I should be redirected to dashboard page user");
    }

    //////////////// Scenario Username yang Tidak Valid
    @Given("I am on the login user page 2")
    public void Iamontheloginuserpage2(){
        driver.get(Constants.URLUser);
        extentTest.log(LogStatus.PASS,"I am on the login user page");
    }


    @When("I enter user a valid username and password 2")
    public void Ienteruseravalidusernameandpassword2(){
        loginUser.loginUser("dumyxx@test.com","12345678");
        // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }

    @And("I click the login button user 2")
    public void Iclicktheloginbuttonuser2(){
        loginUser.setBtnLogin();
    }

    @Then("message akun tidak ditemukan")
    public void messageakuntidakditemukan()throws InterruptedException {
    Thread.sleep(3000);
    Assert.assertEquals(loginUser.getTxtEmailinvalidLoginUser(),"Akun tidak ditemukan");
    extentTest.log(LogStatus.PASS,"message akun tidak ditemukan");
    }

    //////////////// Scenario 3 Password yang Tidak Valid
    @Given("I am on the login user page 3")
    public void Iamontheloginuserpage3(){
        driver.get(Constants.URLUser);
        extentTest.log(LogStatus.PASS,"I am on the login user page");
    }


    @When("I enter user a valid username and password 3")
    public void Ienteruseravalidusernameandpassword3(){
        loginUser.loginUser("dumy@test.com","xxx12345678");
        // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }

    @And("I click the login button user 3")
    public void Iclicktheloginbuttonuser3(){
        loginUser.setBtnLogin();
    }

    @Then("Message Email atau password salah")
    public void messageemailatupasswordsalah()throws InterruptedException {
    Thread.sleep(3000);
    Assert.assertEquals(loginUser.getTxtPasswordinvalidLoginUser(),"Email atau password salah");
    extentTest.log(LogStatus.PASS,"Message Email atau password salah");
    }

}
