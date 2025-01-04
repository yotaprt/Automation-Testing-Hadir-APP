package com.juaracoding;

import org.openqa.selenium.WebDriver;

import com.juaracoding.pages.JadwalPage;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class JadwalTest {
  private static WebDriver driver;

    private static ExtentTest extentTest;

    private static JadwalPage jadwalPage = new JadwalPage();

    public JadwalTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Berada di halaman login admin 1")
    public void beradadihalamanlogin(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"Berada di halaman login");
    }

    @When("Memasukan email dan password")
    public void memasukanemaildanpassword(){
        jadwalPage.loginUser("admin@hadir.com","admin@hadir");
        // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }


    @And("Membuka Jadwal")
    public void membukaJadwal(){
      Utils.delay(3);
      jadwalPage.setBtnManagement();
      jadwalPage.setBtnJadwal();
      extentTest.log(LogStatus.PASS,"NotAllowedError: Permission dismissed");
    }

}
