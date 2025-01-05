package com.juaracoding;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.drivers.strategies.Chrome;
import com.juaracoding.pages.AbsenMasukdanKeluar;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class tesaja {
 
  private static WebDriver driver;

  private static ExtentTest extentTest;

  private static AbsenMasukdanKeluar absenmasukdankeluar = new AbsenMasukdanKeluar();

  public tesaja(){
      driver = Hooks.driver;
      extentTest = Hooks.extentTest;
  }


  @Given("Berada di halaman login")
    public void beradadihalamalogin(){
        driver.get(Constants.URLUser);
        extentTest.log(LogStatus.PASS,"Berada di halaman login");
    }

    @When("Memasukan username dan password yang valid")
    public void memasukanusernameandpasswordyangvalid(){
        absenmasukdankeluar.loginUser("dumy@test.com","12345678");
        absenmasukdankeluar.setBtnLogin();
        // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }


    @And("Melakukan Absen Masuk dengan kamera mati")
    public void melakukanabsenmasukdengankameramati(){
      Utils.delay(3);
      absenmasukdankeluar.setBtnAbsenMasukKameraMati();
      extentTest.log(LogStatus.PASS,"Akses kamera harus diizinkan");
    }

}