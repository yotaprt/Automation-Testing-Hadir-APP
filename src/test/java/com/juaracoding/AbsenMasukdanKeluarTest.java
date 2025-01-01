package com.juaracoding;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.juaracoding.drivers.strategies.Chrome;
import com.juaracoding.pages.AbsenMasukdanKeluar;
import com.juaracoding.pages.LoginUser;
import com.juaracoding.utils.Constants;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AbsenMasukdanKeluarTest {
  private static WebDriver driver;
  ChromeOptions options;
    private static ExtentTest extentTest;

    private static AbsenMasukdanKeluar absenmasukdankeluar = new AbsenMasukdanKeluar();

    public AbsenMasukdanKeluarTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
  

    //////////////Scenario 1 Berhasil Absen Masuk WFO
@Given("Berada di halaman login WFO")
    public void beradadiloginwfo(){
        driver.get(Constants.URLUser);
        extentTest.log(LogStatus.PASS,"Berada di halaman login WFO");
    }


    @When("Memasukan username dan password yang valid WFO")
    public void memasukanusernameandpasswordyangvalidwfo(){
        absenmasukdankeluar.loginUser("dumy@test.com","12345678");
        absenmasukdankeluar.setBtnLogin();
        // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }

    @And("Melakukan Absen Masuk WFO")
    public void melakukanabsenmasukwfo(){
      absenmasukdankeluar.setBtnAbsenMasuk();
      absenmasukdankeluar.setBtnShootCamera();
      Utils.delay(3);
      absenmasukdankeluar.setBtnTipeAbsen();
      Utils.delay(3);
      absenmasukdankeluar.setBtnTipeAbsenMasukWFO();
      Utils.delay(3);
      absenmasukdankeluar.setNotes("Absen Masuk WFO");
      // Utils.delay(2);
      // absenmasukdankeluar.setBtnSubmitAbsenMasuk();
    }

    // @Then("I should be redirected to dashboard page user")
    // public void i_should_be_redirected_to_dashboard_page()throws InterruptedException {
    // Thread.sleep(5000);
    // Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/apps/absent");
    // extentTest.log(LogStatus.PASS,"I should be redirected to dashboard page user");
    // }


    ////////////Scenario 2 Berhasil Absen Masuk WFH
    @Given("Berada di halaman login WFH")
    public void beradadiloginwfh(){
        driver.get(Constants.URLUser);
        extentTest.log(LogStatus.PASS,"Berada di halaman login WFH");
    }


    @When("Memasukan username dan password yang valid WFH")
    public void MemasukanusernamedanpasswordyangvalidWFH(){
      absenmasukdankeluar.loginUser("dumy@test.com","12345678");
      absenmasukdankeluar.setBtnLogin();
        // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
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
      // Utils.delay(2);
      // absenmasukdankeluar.setBtnSubmitAbsenMasuk();
    }


    /////////////// Scenario 3 Absen masuk Negative
    // @Given("Berada di halaman login")
    // public void beradadilogin(){
    //   System.setProperty("webdriver.chrome.driver", "./chromedriver-win64/chromedriver.exe");
    //     driver = new ChromeDriver();
    //     driver.get("https://magang.dikahadir.com/absen/login"); 
    //     ChromeOptions options = new ChromeOptions();
    //     Map<String, Object> prefs = new HashMap<>();
    //     prefs.put("profile.default_content_setting_values.geolocation", 2);
    //     prefs.put("profile.default_content_setting_values.media_stream_camera", 2);
    //     options.setExperimentalOption("prefs", prefs);
    //     options.setExperimentalOption("useAutomationExtension", false);
    //     options.addArguments("--no-sandbox");
 
    //     extentTest.log(LogStatus.PASS,"Berada di halaman login WFO");
    // }


    // @When("Memasukan username dan password yang valid")
    // public void memasukanusernameandpasswordyangvalid(){
    //     absenmasukdankeluar.loginUser("dumy@test.com","12345678");
    //     absenmasukdankeluar.setBtnLogin();
    //     // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    // }


    // @And("Melakukan Absen Masuk dengan kamera mati")
    // public void melakukanabsenmasukdengankameramati(){
    //   absenmasukdankeluar.setBtnAbsenMasuk();
    //   absenmasukdankeluar.setBtnShootCamera();
    //   Utils.delay(3);
    //   absenmasukdankeluar.setBtnTipeAbsen();
    //   Utils.delay(3);
    //   absenmasukdankeluar.setBtnTipeAbsenMasukWFO();
    //   Utils.delay(3);
    //   absenmasukdankeluar.setNotes("Absen Masuk WFO");
    // }


    /////////////////////////////Scenario 4 Absen Keluar
    
    @Given("Berada di halaman login absen keluar")
    public void beradadihalamanloginabsenkeluar(){
        driver.get(Constants.URLUser);
        extentTest.log(LogStatus.PASS,"Berada di halaman login absen keluar");
    }


    @When("Memasukan username dan password yang valid untuk absen keluar")
    public void Memasukanusernamedanpasswordyangvaliduntukabsenkeluar() {
      absenmasukdankeluar.loginUser("zaki@test.com","zakiyanto123");
      absenmasukdankeluar.setBtnLogin();
        // extentTest.log(LogStatus.PASS,"I enter a valid username and password");
    }

    @And("Melakukan Absen Keluar")
    public void MelakukanAbsenKeluar()throws InterruptedException {
      Thread.sleep(3000);
      ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
      absenmasukdankeluar.setBtnAbsenKeluar();
      Utils.delay(3);
      absenmasukdankeluar.setNotesAbsenKeluar("Absen Keluar Pulang");
      // Utils.delay(2);
      // absenmasukdankeluar.setBtnAbsenKeluarPulang();
    }
}
