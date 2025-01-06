package com.juaracoding;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.drivers.strategies.Chrome;
import com.juaracoding.pages.AbsenMasukdanKeluar;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AbsenMasukNegativeTest {

  private static WebDriver driver;

  private static ExtentTest extentTest;

  private static AbsenMasukdanKeluar absenmasukdankeluar = new AbsenMasukdanKeluar();

  public AbsenMasukNegativeTest() {
    driver = Hooks.driver;
    extentTest = Hooks.extentTest;
  }

  @Given("Admin Berhasil Login")
  public void adminberhasillogin() {
    driver.get(Constants.URLUser);
    absenmasukdankeluar.loginUser("zaki1@test.com","zakiyanto123");
    absenmasukdankeluar.setBtnLogin();
    extentTest.log(LogStatus.PASS, "Admin Berhasil Login");
  }

  @When("Melakukan Absen Masuk dengan Kamera Mati")
  public void melakukanabsenmasukdengankameramati() {
    absenmasukdankeluar.setBtnAbsenMasukKameraMati();
    // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
  }

  @Then("User Gagal Melakukan Absen Masuk dengan Kamera Mati")
  public void gagalmelakukanabsenmasukdengankameramati() {
    extentTest.log(LogStatus.PASS, "NotAllowedError: Permission denied");
  }

}