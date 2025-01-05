package com.juaracoding;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import com.juaracoding.drivers.strategies.Chrome;
import com.juaracoding.pages.AbsenMasukdanKeluar;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import okhttp3.internal.Util;


public class AbsenMasukdanKeluarTest {
  private static WebDriver driver;
    private static ExtentTest extentTest;

    private static AbsenMasukdanKeluar absenmasukdankeluar = new AbsenMasukdanKeluar();

    // private static Chrome chromeDriver = new Chrome();

    public AbsenMasukdanKeluarTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
  
//////////////Scenario 1 Berhasil Absen Masuk tanpa selfie
@Given("Berada di halaman login tanpa selfie")
public void beradadihalamanlogintanpaselfie(){
    driver.get(Constants.URLUser);
    extentTest.log(LogStatus.PASS,"Berada di halaman login tanpa selfie");
  
}


@When("Memasukan username dan password yang valid tanpa selfie")
public void memasukanusernameandpasswordyangvalidtanpaselfie(){
    absenmasukdankeluar.loginUser("dumy1@test.com","12345678");
    absenmasukdankeluar.setBtnLogin();
    extentTest.log(LogStatus.PASS,"Memasukan username dan password yang valid tanpa selfie");
}

@And("Melakukan Absen Masuk tanpa selfie")
public void melakukanabsenmasuktanpaselfie(){
  Utils.delay(1);
  absenmasukdankeluar.setBtnAbsenMasukNonselfie();
  Utils.delay(3);
  absenmasukdankeluar.setBtnTipeAbsen();
  Utils.delay(1);
  absenmasukdankeluar.setBtnTipeAbsenMasukWFO();
  Utils.delay(2);
  absenmasukdankeluar.setNotes("Absen Masuk tanpa selfie");
  Utils.delay(2);
  absenmasukdankeluar.setBtnSubmitAbsenMasuk();
  extentTest.log(LogStatus.PASS,"User melakukan absen masuk tanpa selfie");
}

   @Then("User berhasil melakukan absen masuk tanpa selfie")
    public void i_should_be_redirected_to_dashboard_page()throws InterruptedException {
    Thread.sleep(5000);
    Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/apps/absent");
    extentTest.log(LogStatus.PASS,"User berhasil melakukan absen masuk tanpa selfie");
    }

    //////////////Scenario 2 Berhasil Absen Masuk WFO
    @Given("Berada di halaman login WFO")
    public void beradadiloginwfo(){
        driver.get(Constants.URLUser);
        extentTest.log(LogStatus.PASS,"Berada di halaman login WFO");
      
    }


    @When("Memasukan username dan password yang valid WFO")
    public void memasukanusernameandpasswordyangvalidwfo(){
        absenmasukdankeluar.loginUser("dumy@test.com","12345678");
        absenmasukdankeluar.setBtnLogin();
        extentTest.log(LogStatus.PASS,"Memasukan username dan password yang valid WFO");
    }

    @And("Melakukan Absen Masuk WFO")
    public void melakukanabsenmasukwfo(){
      absenmasukdankeluar.setBtnAbsenMasuk();
      Utils.delay(3);
      absenmasukdankeluar.setBtnShootCamera();
      Utils.delay(3);
      absenmasukdankeluar.setBtnTipeAbsen();
      Utils.delay(3);
      absenmasukdankeluar.setBtnTipeAbsenMasukWFO();
      Utils.delay(3);
      absenmasukdankeluar.setNotes("Absen Masuk WFO");
      Utils.delay(2);
      absenmasukdankeluar.setBtnSubmitAbsenMasuk();
      extentTest.log(LogStatus.PASS,"User melakukan absen masuk WFO");
    }

    @Then("User berhasil melakukan absen masuk WFO")
    public void i_should_be_redirected_to_dashboard_page_WFO()throws InterruptedException {
    Thread.sleep(5000);
    Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/apps/absent");
    extentTest.log(LogStatus.PASS,"User berhasil melakukan absen masuk WFO");
    }


  //   ////////////Scenario 3 Berhasil Absen Masuk WFH
    @Given("Berada di halaman login WFH")
    public void beradadiloginwfh(){
        driver.get(Constants.URLUser);
        extentTest.log(LogStatus.PASS,"Berada di halaman login WFH");
    }


    @When("Memasukan username dan password yang valid WFH")
    public void MemasukanusernamedanpasswordyangvalidWFH(){
      absenmasukdankeluar.loginUser("zaki@test.com","zakiyanto123");
      absenmasukdankeluar.setBtnLogin();
        extentTest.log(LogStatus.PASS,"Memasukan username dan password yang valid WFH");
    }

    @And("Melakukan Absen Masuk WFH")
    public void MelakukanAbsenMasukWFH(){
      absenmasukdankeluar.setBtnAbsenMasuk();
      absenmasukdankeluar.setBtnShootCamera();
      Utils.delay(3);
      absenmasukdankeluar.setBtnTipeAbsen();
      Utils.delay(3);
      absenmasukdankeluar.setBtnTipeAbsenMasukWFH();
      Utils.delay(3);
      absenmasukdankeluar.setNotes("Absen Masuk WFH");
      Utils.delay(2);
      absenmasukdankeluar.setBtnSubmitAbsenMasuk();
      extentTest.log(LogStatus.PASS,"User melakukan absen masuk WFH");
    }

      @Then("User berhasil melakukan absen masuk WFH")
    public void i_should_be_redirected_to_dashboard_page_WFH()throws InterruptedException {
    Thread.sleep(5000);
    Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/apps/absent");
    extentTest.log(LogStatus.PASS,"User berhasil melakukan absen masuk WFH");
    }

    /////////////////////////////Scenario 4 Absen Keluar
    
    @Given("Berada di halaman login absen keluar")
    public void beradadihalamanloginabsenkeluar(){
        driver.get(Constants.URLUser);
        extentTest.log(LogStatus.PASS,"Berada di halaman login absen keluar");
    }


    @When("Memasukan username dan password yang valid untuk absen keluar")
    public void Memasukanusernamedanpasswordyangvaliduntukabsenkeluar() {
      absenmasukdankeluar.loginUser("dumy1@test.com","12345678");
      absenmasukdankeluar.setBtnLogin();
        extentTest.log(LogStatus.PASS,"Memasukan username dan password yang valid untuk absen keluar");
    }

    @And("Melakukan Absen Keluar")
    public void MelakukanAbsenKeluar()throws InterruptedException {
      Thread.sleep(3000);
      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
      absenmasukdankeluar.setBtnAbsenKeluar();
      Utils.delay(3);
      absenmasukdankeluar.setNotesAbsenKeluar("Absen Pulang");
      Utils.delay(3);
      absenmasukdankeluar.setBtnAbsenKeluarPulang();
      extentTest.log(LogStatus.PASS,"User melakukan absen keluar");
    }
    
    @Then("User berhasil melakukan absen keluar")
    public void Userberhasilmelakukanabsenkeluar()throws InterruptedException {
      Thread.sleep(5000);
      Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/apps/absent");
      extentTest.log(LogStatus.PASS,"User berhasil melakukan absen keluar");
    }

    //////////////////////////// Scenario 5 Absen Keluar Tanpa Note
    @Given("Berada di halaman login absen keluar tanpa note")
    public void beradadihalamanloginabsenkeluartanpanote(){
        driver.get(Constants.URLUser);
        extentTest.log(LogStatus.PASS,"Berada di halaman login absen keluar");
    }


    @When("Memasukan username dan password yang valid untuk absen keluar tanpa note")
    public void Memasukanusernamedanpasswordyangvaliduntukabsenkeluartanpanote() {
      absenmasukdankeluar.loginUser("zaki@test.com","zakiyanto123");
      absenmasukdankeluar.setBtnLogin();
        extentTest.log(LogStatus.PASS,"Memasukan username dan password yang valid untuk absen keluar tanpa note");
    }

    @And("Melakukan Absen Keluar tanpa note")
    public void MelakukanAbsenKeluarTanpaNote()throws InterruptedException {
      Thread.sleep(3000);
      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
      absenmasukdankeluar.setBtnAbsenKeluar();
      Utils.delay(3);
      absenmasukdankeluar.setBtnAbsenKeluarPulang();
      extentTest.log(LogStatus.PASS,"Melakukan Absen Keluar tanpa note");
    }

    @Then("User berhasil melakukan absen keluar tanpa note")
    public void Userberhasilmelakukanabsenkeluartanpanote()throws InterruptedException {
      Thread.sleep(5000);
      Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/apps/absent");
      extentTest.log(LogStatus.PASS,"User berhasil melakukan absen keluar tanpa note");
    }
}
