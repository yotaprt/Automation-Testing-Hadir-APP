package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.JadwalPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JadwalSteps {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static JadwalPage jadwalPage = new JadwalPage();

    public JadwalSteps(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User login menggunakan akun admin-Jadwal")
    public void user_login_menggunakan_akun_admin_jadwal() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"I am on the login page");
        loginPage.loginvalid("admin@hadir.com","admin@hadir");
        // Implementasi login menggunakan akun admin
    }

    @When("User membuka Navbar-Jadwal")
    public void user_membuka_navbar_jadwal() {
        extentTest.log(LogStatus.PASS,"User membuka Navbar");
        jadwalPage.clickMenuInManagement();
        // Implementasi membuka Navbar
    }

    @And("User klik submenu Jadwal pada bagian menu Management-Jadwal")
    public void user_klik_submenu_jadwal_pada_bagian_menu_management_jadwal() {
        extentTest.log(LogStatus.PASS,"User klik submenu Kalender pada bagian menu Management");
        jadwalPage.clickJadwalMenuInManagement();
        // Implementasi klik submenu Kalender
    }

    @Then("User berhasil navigate ke page Jadwal")
    public void UserberhasilnavigatekepageJadwal() throws InterruptedException {
        Thread.sleep(2000);
        extentTest.log(LogStatus.PASS,"User berhasil navigate ke page Jadwal");
        Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/management/schedule");
        // Implementasi verifikasi bahwa data jadwal kerja berhasil disimpan dan ditampilkan
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    /// 
    @Given("User berhasil login & berada di page Jadwal")
    public void UserberhasilloginberadadipageJadwal() throws InterruptedException {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"User berhasil login & berada di page Jadwal");
        loginPage.loginvalid("admin@hadir.com","admin@hadir");
        Thread.sleep(2000);
        driver.get("https://magang.dikahadir.com/management/schedule");
        // Implementasi login menggunakan akun admin
    }
      
    @When("User klik tombol Tambah")
    public void user_klik_tombol_tambah() {
        extentTest.log(LogStatus.PASS,"User klik tombol Tambah");
        jadwalPage.clickTambahJadwal();
        // Implementasi klik tombol Tambah
    }

    @When("User pilih Tipe Jadwal")
    public void user_pilih_tipe_jadwal() throws InterruptedException {
        extentTest.log(LogStatus.PASS,"User pilih Tipe Jadwal");
        Thread.sleep(2000);
        jadwalPage.clickTypeJadwal();
        Thread.sleep(1000);
        jadwalPage.pilihTypeJadwal();
        // Implementasi memilih Tipe Jadwal
    }

    @When("User pilih tanggal")
    public void user_pilih_tanggal() {
        extentTest.log(LogStatus.PASS,"User pilih tanggal");
        // Implementasi memilih tanggal
    }

    @When("User masukkan jadwal kerja")
    public void user_masukkan_jadwal_kerja() {
        extentTest.log(LogStatus.PASS,"User masukkan jadwal kerja");
        jadwalPage.inputNameJadwal("1Test Jadwal");
        // Implementasi memasukkan jadwal kerja
    }

    @When("User pilih hari kerja")
    public void user_pilih_hari_kerja() throws InterruptedException {
        extentTest.log(LogStatus.PASS,"User pilih hari kerja");
        jadwalPage.clickInputHariKerja();
        Thread.sleep(1000);
        jadwalPage.clickInputJumlahHariKerja();
        jadwalPage.pilihJumlahHariKerjaCSPagi();
        jadwalPage.clickTerapkan();
        // Implementasi memilih hari kerja
    }

    @When("User masukkan keterlambatan")
    public void user_masukkan_keterlambatan() {
        extentTest.log(LogStatus.PASS,"User masukkan keterlambatan");
        jadwalPage.getInputToleransiKeterlambatan().sendKeys("10");;
        // Implementasi memasukkan keterlambatan
    }

    @When("User klik tombol Simpan")
    public void user_klik_tombol_simpan() {
        extentTest.log(LogStatus.PASS,"User klik tombol Simpan");
        jadwalPage.clickSimpan();
        // Implementasi klik tombol Simpan
    }

    @Then("Jadwal baru berhasil ditambahkan & Tidak adanya error yang muncul")
    public void jadwal_baru_berhasil_ditambahkan_dan_tidak_adanya_error_yang_muncul() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(jadwalPage.getVerifyAddedJadwal().getText().contains("1Test Jadwal"));
        // Implementasi verifikasi bahwa jadwal baru berhasil ditambahkan dan tidak ada error
    }
}