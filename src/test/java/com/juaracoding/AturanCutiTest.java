package com.juaracoding;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.pages.AturanCuti;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AturanCutiTest {
  private static WebDriver driver;

    private static ExtentTest extentTest;

    private static AturanCuti aturanCuti = new AturanCuti();

    public AturanCutiTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Berada di halaman login admin aturan cuti")
    public void beradadihalamanloginadminaturancuti(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"Berada di halaman login");
    }

    @When("Memasukan email dan password aturan cuti")
    public void memasukanemaildanpasswordaturancuti(){
        aturanCuti.loginUser("admin@hadir.com","admin@hadir");
        // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }


    @And("Membuka Aturan Cuti")
    public void membukaAturanCuti() {
      Utils.delay(3);
      aturanCuti.setBtnManagement();
      aturanCuti.setBtnAturanCuti();
      Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/dashboards/pending");
    }

    ///////////////////////////////
    @Given("Login admin dan membuka aturan cuti")
    public void loginAdminDanMembukaAturanCuti() {
        driver.get(Constants.URL);
        aturanCuti.loginUser("admin@hadir.com","admin@hadir");
        aturanCuti.setBtnManagement();
        aturanCuti.setBtnAturanCuti();
    }

    @When("Menambahkan data Aturan Cuti")
    public void menambahkandataAturanCuti() {
        aturanCuti.setBtnTambahAturanCuti();
        aturanCuti.setTambahAturanCutiName("Aturan Cuti New");
        aturanCuti.setEligiblePengaturanCutiBulan("10");
        Utils.delay(1);
        aturanCuti.setKalenderTanggalBatasSisaCuti();
        aturanCuti.setTanggalBatasSisaCuti("15");
        aturanCuti.setKalenderBulanBatasSisaCuti();
        aturanCuti.setBulanBatasSisaCuti("Jun");
        Utils.delay(1);
        aturanCuti.setMaksilmalSisaCuti("12");
        Utils.delay(1);
        aturanCuti.setJumlahBulanKerjaSisaCuti("1");
        Utils.delay(1);
        aturanCuti.setBtnTambahkanAturanCuti();
    }

     @When("Menambahkan invalid data Aturan Cuti")
    public void menambahkaninvaliddataAturanCuti() {
        aturanCuti.setBtnTambahAturanCuti();
        aturanCuti.setTambahAturanCutiName("Aturan Cuti New");
        aturanCuti.setEligiblePengaturanCutiBulan("10");
        Utils.delay(1);
        aturanCuti.inputTglBatasSisaCuti().sendKeys(Keys.BACK_SPACE);
        aturanCuti.inputTglBatasSisaCuti().sendKeys("ccss");
        // aturanCuti.setTanggalBatasSisaCuti("15");
        aturanCuti.setKalenderBulanBatasSisaCuti();
        aturanCuti.setBulanBatasSisaCuti("Jun");
        Utils.delay(1);
        aturanCuti.setMaksilmalSisaCuti("12");
        Utils.delay(1);
        aturanCuti.setJumlahBulanKerjaSisaCuti("1");
        Utils.delay(1);
        aturanCuti.setBtnTambahkanAturanCuti();
    }

    @Then("User gagal menambahkan Aturan Cuti & Muncul error message")
    public void UsergagalmenambahkanAturanCutiMunculerrormessage() {
        aturanCuti.errorTglBatasSisaCuti().isDisplayed();
       extentTest.log(LogStatus.PASS, "User gagal menambahkan Aturan Cuti & Muncul error message");
    }
    
}


