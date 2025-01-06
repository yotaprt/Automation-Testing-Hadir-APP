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
        extentTest.log(LogStatus.PASS,"User klik button Tambahkan Kalender");
        // Implementasi klik button Tambahkan Kalender
    }

    @When("User memasukkan nama untuk {string} yang ingin ditambahkan")
    public void user_memasukkan_nama_untuk_kalender_unit(String kalenderUnit) {
        kalenderPage.inputKalenderName().sendKeys(kalenderUnit);
        extentTest.log(LogStatus.PASS,"User memasukkan nama untuk Kalender Unit yang ingin ditambahkan");
        // Implementasi memasukkan nama untuk Kalender Unit
    }

    @When("User tidak mengisi field nama untuk Kalender Unit")
    public void user_tidak_mengisi_field_nama_untuk_kalender_unit() {
        kalenderPage.inputKalenderName();
        extentTest.log(LogStatus.PASS,"User tidak mengisi field nama untuk Kalender Unit");
        // Implementasi tidak mengisi field nama
    }

    @When("User klik button Tambah")
    public void user_klik_tambah() throws InterruptedException {
        Thread.sleep(2000);
        kalenderPage.clickSimpan();
        extentTest.log(LogStatus.PASS,"User klik button Tambah");
        // Implementasi klik button Tambah
    }

    @Then("{string} baru berhasil ditambahkan")
    public void kalender_unit_baru_berhasil_ditambahkan(String kalenderUnit) throws InterruptedException {
        Thread.sleep(2000);
        kalenderPage.verifyNamaKalenderUnit(kalenderUnit);
        extentTest.log(LogStatus.PASS,"Kalender Unit baru berhasil ditambahkan");
        // Implementasi verifikasi bahwa Kalender Unit baru berhasil ditambahkan
    }

    @Then("Kalender Unit baru gagal ditambahkan karena field nama adalah mandatory")
    public void kalender_unit_baru_gagal_ditambahkan_karena_field_nama_adalah_mandatory() {
        Assert.assertTrue(kalenderPage.getErrorText().isDisplayed());
        extentTest.log(LogStatus.PASS,"Kalender Unit baru gagal ditambahkan karena field nama adalah mandatory");
        // Implementasi verifikasi bahwa Kalender Unit gagal ditambahkan
    }

    /////////////////////////////////////////////////////////////////////////
    @When("User masukkan nama {string} yang ingin dicari pada field Search")
    public void user_masukkan_nama_yang_ingin_dicari_pada_field_search(String kalenderUnit) {
        kalenderPage.getInputSearch().sendKeys(kalenderUnit);
        extentTest.log(LogStatus.PASS,"User masukkan nama Kalender Unit yang ingin dicari pada field Search");
        // Implementasi memasukkan nama Kalender Unit yang ingin dicari pada field Search
    }

    @And("User klik button Search")
    public void user_klik_button_search() {
        kalenderPage.clickBtnSearch();
        extentTest.log(LogStatus.PASS,"User klik button Search");
        // Implementasi klik button Search
    }

    @Then("{string} yang ditampilkan pada table sesuai dengan nama yang diinputkan pada field Search")
    public void kalender_unit_yang_ditampilkan_pada_table_sesuai_dengan_nama_yang_diinputkan(String kalenderUnit) throws InterruptedException {
        Thread.sleep(1000);
        kalenderPage.verifyNamaKalenderUnit(kalenderUnit);
        extentTest.log(LogStatus.PASS,"Kalender Unit yang ditampilkan pada table sesuai dengan nama yang diinputkan pada field Search");
        // Implementasi verifikasi bahwa Kalender Unit yang ditampilkan sesuai dengan nama yang dicari
    }

    ////////////////////////////////////////////////////////////////////////
      @When("User masukkan nama Kalender Unit yang ingin dicari pada field Search")
    public void user_masukkan_namakalenderunit_yang_ingin_dicari_pada_field_search() {
        kalenderPage.getInputSearch().sendKeys("zack");
        extentTest.log(LogStatus.PASS,"User masukkan nama Kalender Unit yang ingin dicari pada field Search");
        // Implementasi memasukkan nama Kalender Unit yang ingin dicari pada field Search
    }

    @And("User klik button Reset")
    public void user_klik_button_Reset() {
        kalenderPage.clickReset();
        extentTest.log(LogStatus.PASS,"User klik button Reset");
        // Implementasi klik button Search
    }

    @Then("Data table ter-reset ulang seperti kondisi awal")
    public void data_table_ter_reset_ulang_sebagai_kondisi_awal() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://magang.dikahadir.com/management/calendar");
        extentTest.log(LogStatus.PASS,"Data table ter-reset ulang seperti kondisi awal");
        // Implementasi verifikasi bahwa data table ter-reset ulang seperti kondisi awal
    }
}
