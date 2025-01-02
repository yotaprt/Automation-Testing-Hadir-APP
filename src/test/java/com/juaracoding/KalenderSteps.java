package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.KalenderPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class KalenderSteps {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static KalenderPage kalenderPage = new KalenderPage();


    public KalenderSteps(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
   
    @Given("User login menggunakan akun admin")
    public void user_login_menggunakan_akun_admin() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"I am on the login page");
        loginPage.loginvalid("admin@hadir.com","admin@hadir");
    }

    @When("User membuka Navbar")
    public void user_membuka_navbar() {
        extentTest.log(LogStatus.PASS,"User membuka Navbar");
        kalenderPage.clickMenuInManagement();
    }

    @And("User klik submenu Kalender pada bagian menu Management")
    public void user_klik_submenu_pada_bagian_menu() {
        extentTest.log(LogStatus.PASS,"User klik submenu Kalender pada bagian menu Management");
        kalenderPage.clickKalenderMenu();
    }

    @Then("User berhasil navigate ke page Kalender")
    public void user_berhasil_navigate_ke_page_kalender() throws InterruptedException {
        Thread.sleep(2000);
        // Implementasi verifikasi navigasi ke page Kalender
        extentTest.log(LogStatus.PASS,"User berhasil navigate ke page Kalender");
        Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/management/calendar");
    }

    //////////////////////////////////////////////////////////////////////////
    
    
    @Given("User login menggunakan akun admin dan berada di page Kalender")
    public void user_login_menggunakan_akun_admin_dan_berada_di_page_kalender() throws InterruptedException {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"I am on the login page");
        loginPage.loginvalid("admin@hadir.com","admin@hadir");
        Thread.sleep(2000);
        driver.get("https://magang.dikahadir.com/management/calendar");

        // Implementasi login menggunakan akun admin dan navigasi ke page Kalender
    }

    @When("User klik button Tambahkan Kalender")
    public void user_klik_button_tambahkan_kalender() {
        kalenderPage.clickAddKalender();
        // Implementasi klik button Tambahkan Kalender
    }

    @When("User memasukkan nama untuk Kalender Unit yang ingin ditambahkan")
    public void user_memasukkan_nama_untuk_kalender_unit() {
        kalenderPage.inputKalenderName().sendKeys("Kalender Baru");
        // Implementasi memasukkan nama untuk Kalender Unit
    }

    @When("User tidak mengisi field nama untuk Kalender Unit")
    public void user_tidak_mengisi_field_nama_untuk_kalender_unit() {
        kalenderPage.inputKalenderName();
        // Implementasi tidak mengisi field nama
    }

    @When("User klik button Tambah")
    public void user_klik_tambah() throws InterruptedException {
        Thread.sleep(2000);
        kalenderPage.clickSimpan();
        // Implementasi klik button Tambah
    }

    @Then("Kalender Unit baru berhasil ditambahkan")
    public void kalender_unit_baru_berhasil_ditambahkan() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(kalenderPage.getInputtedNewKalender().getText().contains("Kalender Baru"));
        // Implementasi verifikasi bahwa Kalender Unit baru berhasil ditambahkan
    }

    @Then("Kalender Unit baru gagal ditambahkan karena field nama adalah mandatory")
    public void kalender_unit_baru_gagal_ditambahkan_karena_field_nama_adalah_mandatory() {
        Assert.assertTrue(kalenderPage.getErrorText().isDisplayed());
        // Implementasi verifikasi bahwa Kalender Unit gagal ditambahkan
    }


}
