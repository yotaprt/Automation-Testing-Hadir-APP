package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.IzinTerlambatpage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class IzinTerlambatSteps {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static IzinTerlambatpage izinTerlambatpage = new IzinTerlambatpage();

    public IzinTerlambatSteps(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    

    @And("User click on the Izin Terlambat menu under Laporan")
    public void UserclickontheIzinTerlambatmenuunderLaporan() {
        izinTerlambatpage.clicknavbarLaporan();
        izinTerlambatpage.clicknavbarIzinTerlambat();
        extentTest.log(LogStatus.PASS,"User click on the Izin Terlambat menu under Laporan");
    }

    @Then("User navigated to the Laporan Izin Terlambat page")
    public void UsernavigatedtotheLaporanIzinTerlambapage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://magang.dikahadir.com/laporan/izin-terlambat");
        extentTest.log(LogStatus.PASS,"User navigated to the Laporan Izin Terlambat page");
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    


    @When("User navigate to Laporan Izin Terlambat page")
    public void user_navigate_to_laporan_izin_terlambat_page() {
        extentTest.log(LogStatus.PASS,"User navigate to Laporan Izin Terlambat page");
        driver.get("https://magang.dikahadir.com/laporan/izin-terlambat");
        // Implementasi navigasi ke halaman Laporan Izin Terlambat
    }

    @Then("The table should displaying column of user")
    public void the_table_should_displaying_columns_of_user() {
        extentTest.log(LogStatus.PASS,"The table should displaying column of user");
        izinTerlambatpage.iscolumnNamaUserVisible();
        // Implementasi verifikasi bahwa tabel menampilkan kolom User
    }

    @And("Displaying Nama Upliner column")
    public void displaying_nama_upliner_columns() {
        extentTest.log(LogStatus.PASS,"Displaying Nama Upliner column");
        izinTerlambatpage.iscolumnNamaUplinerVisible();
        // Implementasi verifikasi bahwa tabel menampilkan kolom Nama Upliner
    }

    @And("Displaying Unit column")
    public void displaying_unit_columns() {
        extentTest.log(LogStatus.PASS,"Displaying Unit columns");
        izinTerlambatpage.iscolumnUnitVisible();
        // Implementasi verifikasi bahwa tabel menampilkan kolom Unit
    }

    @And("Displaying Tanggal Izin column")
    public void displaying_tanggal_izin_columns() {
        extentTest.log(LogStatus.PASS,"Displaying Tanggal Izin column");

    }

    @And("Displaying Status column")
    public void displaying_notes_status() {
        extentTest.log(LogStatus.PASS,"Displaying Status column");
        izinTerlambatpage.iscolumnStatusVisible();
    }

    //////////////////////////////////////////////////////////////
    @Given("The user has successfully logged in as an admin")
    public void the_user_has_successfully_logged_in_as_admin() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"User has successfully logged in as an admin");
        loginPage.loginvalid("admin@hadir.com","admin@hadir");
    }

    @When("The user navigates to the Laporan Izin Terlambat page")
    public void the_user_navigates_to_late_permission_report_page() {
        extentTest.log(LogStatus.PASS,"The user navigates to the Laporan Izin Terlambat page");
        driver.get("https://magang.dikahadir.com/laporan/izin-terlambat");
        // Implementasi navigasi ke halaman Laporan Izin Terlambat
    }

    @And("The user inputs the User's name in the Search field")
    public void the_user_inputs_user_name_in_search_field() {
        extentTest.log(LogStatus.PASS,"The user inputs the User's name in the Search field");
        izinTerlambatpage.getInputSearch().sendKeys("zack");
        // Implementasi memasukkan nama pengguna di field pencarian
    }

    @And("The user clicks Search button")
    public void the_user_clicks_the_search_button() {
        extentTest.log(LogStatus.PASS,"The user clicks the Search button");
        izinTerlambatpage.clickBtnSearch();
    }

    @And("The user inputs the unknown User's name in the Search field")
    public void the_user_inputs_unknown_user_name_in_search_field() {
        extentTest.log(LogStatus.PASS,"The user inputs the unknown User's name in the Search field");
        izinTerlambatpage.getInputSearch().sendKeys("$%^&*");
        // Implementasi memasukkan nama pengguna di field pencarian
    }

    @Then("The system displays data that matches the searched User name")
    public void the_system_displays_data_that_matches_searched_user_name() throws InterruptedException {
        Thread.sleep(2000);
        extentTest.log(LogStatus.PASS,"The system displays data that matches the searched User's name");
        izinTerlambatpage.verifySearchResult();
        // Implementasi verifikasi bahwa sistem menampilkan data yang sesuai dengan nama pengguna yang dicari
    }
    @Then("The system displays tables with empty data")
    public void Thesystemdisplaystableswithemptydata() throws InterruptedException {
        Thread.sleep(2000);
        extentTest.log(LogStatus.PASS,"Then The system displays tables with empty data");

        Assert.assertFalse(izinTerlambatpage.verifyFirstRownotfound());
        // Implementasi verifikasi bahwa sistem menampilkan data yang sesuai dengan nama pengguna yang dicari
    }
}