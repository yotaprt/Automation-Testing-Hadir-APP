package com.juaracoding;

import org.openqa.selenium.JavascriptExecutor;
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

    /////////////////////////////// 1 Scenario Menambahkan Data Aturan Cuti
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
        Utils.delay(1);
        aturanCuti.setTanggalBatasSisaCuti("15");
        Utils.delay(1);
        aturanCuti.setKalenderBulanBatasSisaCuti();
        Utils.delay(1);
        aturanCuti.setBulanBatasSisaCuti("Jun");
        Utils.delay(1);
        aturanCuti.setMaksilmalSisaCuti("12");
        Utils.delay(1);
        aturanCuti.setJumlahBulanKerjaSisaCuti("1");
        Utils.delay(1);
        aturanCuti.setBtnTambahkanAturanCuti();
    }

    @Then("Data Aturan Cuti berhasil ditambahkan")
    public void dataAturanCutiBerhasilDitambahkan() {
       extentTest.log(LogStatus.PASS, "Sukses Membuat Aturan Cuti");
    }

    ///////////////////Scenario Menambahkan data Aturan Cuti  Tanggal Batas Sisa Cuti Invalid
    @Given("Login admin dan membuka aturan cuti Negative Tanggal Batas Sisa Cuti")
    public void loginAdminDanMembukaAturanCutiNegativeTanggalBatasSisaCuti() {
        driver.get(Constants.URL);
        aturanCuti.loginUser("admin@hadir.com","admin@hadir");
        aturanCuti.setBtnManagement();
        aturanCuti.setBtnAturanCuti();
    }

    @When("Menambahkan data Aturan Cuti Tanggal Batas Sisa Cuti Invalid")
    public void menambahkandataAturanCutiTanggalBatasSisaCutiInvalid() {
        aturanCuti.setBtnTambahAturanCuti();
        aturanCuti.setTambahAturanCutiName("Aturan Cuti Invalid tanggal");
        aturanCuti.setEligiblePengaturanCutiBulan("10");
        Utils.delay(1);
        aturanCuti.TypingTanggalBatasSisaCuti("invalid tanggal");
        aturanCuti.setKalenderBulanBatasSisaCuti();
        aturanCuti.setBulanBatasSisaCuti("Jun");
        Utils.delay(1);
        aturanCuti.setMaksilmalSisaCuti("12");
        Utils.delay(1);
        aturanCuti.setJumlahBulanKerjaSisaCuti("1");
        Utils.delay(1);
    }

    @And("Tambahkan Aturan Cuti Baru Tanggal Batas Sisa Cuti Invalid")
    public void tambahkanAturanCutiBaruTanggalBatasSisaCutiInvalid() {
        aturanCuti.setBtnTambahkanAturanCuti();
    }

    @Then("Admin gagal Menambahkan Aturan Cuti Tanggal Batas Sisa Cuti Invalid")
    public void userGagalMenambahkanAturanCutiTanggalBatasSisaCutiInvalid() {
        aturanCuti.TanggalBatasSisaCutiError().isDisplayed();
       extentTest.log(LogStatus.PASS, "User gagal Menambahkan Aturan Cuti Tanggal Batas Sisa Cuti Invalid");
    }


///////////////////////////////// Scenario Menambahkan data Aturan Cuti Negative Bulan Batas Sisa Cuti
@Given("Login admin dan membuka aturan cuti Negative Bulan Batas Sisa Cuti")
    public void loginAdminDanMembukaAturanCutiNegativeBulanBatasSisaCuti() {
        driver.get(Constants.URL);
        aturanCuti.loginUser("admin@hadir.com","admin@hadir");
        aturanCuti.setBtnManagement();
        aturanCuti.setBtnAturanCuti();
    }

    @When("Menambahkan data Aturan Cuti Negative Bulan Batas Sisa Cuti")
    public void menambahkandataAturanCutiNegativeBulanBatasSisaCuti() {
        aturanCuti.setBtnTambahAturanCuti();
        aturanCuti.setTambahAturanCutiName("Aturan Cuti Invalid Bulan");
        aturanCuti.setEligiblePengaturanCutiBulan("10");
        Utils.delay(1);
        aturanCuti.setKalenderTanggalBatasSisaCuti();
        Utils.delay(1);
        aturanCuti.setTanggalBatasSisaCuti("15");
        Utils.delay(1);
        aturanCuti.TypingBulanBatasSisaCuti("invalid bulan");
        Utils.delay(1);
        aturanCuti.setMaksilmalSisaCuti("12");
        Utils.delay(1);
        aturanCuti.setJumlahBulanKerjaSisaCuti("1");
        Utils.delay(1);
    }

    @And ("Tambahkan Aturan Cuti Baru Negative Bulan Batas Sisa Cuti")
    public void tambahkanAturanCutiBaruNegativeBulanBatasSisaCuti() {
        aturanCuti.setBtnTambahkanAturanCuti();
    }

    @Then("Admin Gagal Menambahkan Aturan Cuti Negative Bulan Batas Sisa Cuti")
    public void adminGagalMenambahkanAturanCutiNegativeBulanBatasSisaCuti() {
        aturanCuti.BulanBatasSisaCutiError().isDisplayed();
       extentTest.log(LogStatus.PASS, "Admin Gagal Menambahkan Aturan Cuti Negative Bulan Batas Sisa Cuti");
    }


    /////////////////////////////////////////////// Scenario Mencari data Aturan Cuti Berdasarkan Nama
    @Given("Login admin untuk mencari data Aturan Cuti")
    public void loginAdminUntukMencariDataAturanCuti() {
        driver.get(Constants.URL);
        aturanCuti.loginUser("admin@hadir.com","admin@hadir");
        aturanCuti.setBtnManagement();
        aturanCuti.setBtnAturanCuti();
    }

    @When("Mencari data Aturan Cuti")
    public void mencariDataAturanCuti() {
        aturanCuti.setSearchAturanCuti("Aturan Cuti New");
    }

    @And("Klik tombol cari data Aturan Cuti")
    public void klikTombolCariDataAturanCuti() {
        aturanCuti.setBtnSearch();
    }

    @Then("Admin Menemui data Aturan Cuti yang di cari")
    public void menampilkanDataAturanCuti() {
       extentTest.log(LogStatus.PASS, "Admin Menemui data Aturan Cuti yang di cari");
    }

    
    /////////////////////////Scenario Mereset data Aturan Cuti
    @Given("Login admin untuk mereset data Aturan Cuti")
    public void loginAdminUntukMeresetDataAturanCuti() {
        driver.get(Constants.URL);
        aturanCuti.loginUser("admin@hadir.com","admin@hadir");
        aturanCuti.setBtnManagement();
        aturanCuti.setBtnAturanCuti();
    }

    @When("Mencari data Aturan Cuti untuk direset")
    public void mencariDataAturanCutiUntukDireset() {
        aturanCuti.setSearchAturanCuti("Aturan Cuti New");
    }

    @And("Klik tombol cari data Aturan Cuti untuk mereset")
    public void klikTombolCariDataAturanCutiUntukMereset() {
        aturanCuti.setBtnSearch();
    }

    @Then("Admin Menemui data Aturan Cuti yang di cari dan telah direset")
    public void menampilkanDataAturanCutiYangDireset() {
       aturanCuti.setBtnReset();
        extentTest.log(LogStatus.PASS, "Admin Menemui data Aturan Cuti yang di cari dan telah direset");
    }

/////////////////////////Scenario Melihat detail data Aturan Cuti
@Given("Login admin untuk melihat data Aturan Cuti")
public void loginAdminUntukMelihatDataAturanCuti() {
    driver.get(Constants.URL);
    aturanCuti.loginUser("admin@hadir.com","admin@hadir");
    aturanCuti.setBtnManagement();
    aturanCuti.setBtnAturanCuti();
}

@When("Melihat data Aturan Cuti")
public void melihatDataAturanCuti() {
    aturanCuti.setBtnAksiAturanCuti();
}

@And("Klik tombol View untuk melihat detail data Aturan Cuti")
public void klikTombolViewUntukMelihatDetailDataAturanCuti() {
    aturanCuti.setBtnView();
}

@Then("Admin Berhasil membuka detail data Aturan Cuti")
public void adminberhasilmembukadetaildatataturancuti() {
    extentTest.log(LogStatus.PASS, "Admin Menemui data Aturan Cuti yang di cari dan telah direset");
}

/////////////////////////Scenario Menghapus  data Aturan Cuti
@Given("Login admin untuk menghapus data Aturan Cuti")
public void loginAdminUntukMenghapusDataAturanCuti() {
    driver.get(Constants.URL);
    aturanCuti.loginUser("admin@hadir.com","admin@hadir");
    aturanCuti.setBtnManagement();
    aturanCuti.setBtnAturanCuti();
}

@When("Admin klik aksi di titik tiga Aturan Cuti")
public void adminKlikAksiDiTitikTigaAturanCuti() {
    aturanCuti.setBtnAksiAturanCuti();
}

@And("Admin klik tombol delete untuk menghapus data Aturan Cuti")
public void adminKlikTombolDeleteUntukMenghapusDataAturanCuti() {
    aturanCuti.setBtnDelete();
    Utils.delay(3);
    aturanCuti.setBtnHapusAturanCuti();
}

@Then("Admin Berhasil Menghapus data Aturan Cuti")
public void AdminBerhasilMenghapusDataAturanCuti() {
    aturanCuti.textHapusAturanCuti().isDisplayed();
    extentTest.log(LogStatus.PASS, "Admin Menemui data Aturan Cuti yang di cari dan telah direset");
}

 /////////////////////////////// Scenario Edit Data Aturan Cuti

    @Given("Login admin dan membuka aturan cuti untuk edit data Aturan Cuti")
    public void loginAdminDanMembukaAturanCutiuntukEditDataAturanCuti() {
        driver.get(Constants.URL);
        aturanCuti.loginUser("admin@hadir.com","admin@hadir");
        aturanCuti.setBtnManagement();
        aturanCuti.setBtnAturanCuti();
    }

    @When("Admin klik aksi di titik tiga Aturan Cuti untuk edit data Aturan Cuti")
    public void adminKlikAksiDiTitikTigaAturanCutiUntukEditDataAturanCuti() {
        aturanCuti.setBtnAksiAturanCuti();
        aturanCuti.setBtnEdit();
    }

    @And("Admin edit data Aturan Cuti")
    public void adminEditDataAturanCuti() {
        aturanCuti.setEditAturanCutiName("Aturan Cuti Edit");
        aturanCuti.setEligiblePengaturanCutiBulan("2");
        Utils.delay(1);
        aturanCuti.setKalenderTanggalBatasSisaCuti();
        Utils.delay(1);
        aturanCuti.setTanggalBatasSisaCuti("18");
        Utils.delay(1);
        aturanCuti.setKalenderBulanBatasSisaCuti();
        Utils.delay(1);
        aturanCuti.setBulanBatasSisaCuti("Jan");
        Utils.delay(1);
        aturanCuti.setMaksilmalSisaCuti("10");
        Utils.delay(1);
        aturanCuti.setJumlahBulanKerjaSisaCuti("2");
        Utils.delay(1);
        aturanCuti.setBtnSimpanEditAturanCuti();
    }

    @Then("Data Aturan Cuti berhasil diedit")
    public void dataAturanCutiBerhasilDiedit() {
       aturanCuti.textEditAturanCuti().isDisplayed();
       extentTest.log(LogStatus.PASS, "Sukses Membuat Aturan Cuti");
    }

    /////////////////////////////// Scenario Edit Data Aturan Cuti Negative

    @Given("Login admin dan membuka aturan cuti untuk edit data Aturan Cuti negative")
    public void loginAdminDanMembukaAturanCutiNegative() {
        driver.get(Constants.URL);
        aturanCuti.loginUser("admin@hadir.com","admin@hadir");
        aturanCuti.setBtnManagement();
        aturanCuti.setBtnAturanCuti();
    }

    @When("Admin klik aksi di titik tiga Aturan Cuti untuk edit data Aturan Cuti negative")
    public void adminKlikAksiDiTitikTigaAturanCutiUntukEditDataAturanCutiNegative() {
        aturanCuti.setBtnAksiAturanCuti();
        aturanCuti.setBtnEdit();
    }

    @And("Admin edit data Aturan Cuti negative")
    public void adminEditDataAturanCutiNegative() {
        aturanCuti.setEditAturanCutiName("Aturan Cuti Edit Negative");
        aturanCuti.setEligiblePengaturanCutiBulan("Dua");
        Utils.delay(1);
        aturanCuti.TypingTanggalBatasSisaCuti("Sepuluh");
        Utils.delay(1);
        aturanCuti.TypingBulanBatasSisaCuti("Januari");
        Utils.delay(1);
        aturanCuti.setMaksilmalSisaCuti("Lima");
        Utils.delay(1);
        aturanCuti.setJumlahBulanKerjaSisaCuti("Tiga");
        Utils.delay(1);
        aturanCuti.setBtnSimpanEditAturanCuti();
    }

    @Then("Data Aturan Cuti Gagal Diedit")
    public void dataAturanCutiGagalDiedit() {
       aturanCuti.textErrorEditEligiblePengaturanCuti().isDisplayed();
       aturanCuti.TanggalBatasSisaCutiError().isDisplayed();
       aturanCuti.BulanBatasSisaCutiError().isDisplayed();
       aturanCuti.textErrorEditMaksimalSisaCuti().isDisplayed();
       aturanCuti.textEditJumlahBulanSisaCutiError().isDisplayed();
       extentTest.log(LogStatus.PASS, "Sukses Membuat Aturan Cuti");
    }

/////////////////////////Scenario Menambahkan detail data Aturan Cuti
@Given("Login admin untuk menambahkan detail data Aturan Cuti")
public void loginAdminUntukMemanmbahkanDetailDataAturanCuti() {
    driver.get(Constants.URL);
    aturanCuti.loginUser("admin@hadir.com","admin@hadir");
    aturanCuti.setBtnManagement();
    aturanCuti.setBtnAturanCuti();
}


@When("Menambahkan data Aturan Cuti untuk menambahkan detail data Aturan Cuti")
public void melihatDetailDataAturanCuti() {
    aturanCuti.setBtnAksiAturanCuti();
    aturanCuti.setBtnView();
    Utils.delay(1);
    aturanCuti.setBtnTambahkanDetailAturanCuti();
}

@And("Admin menambahkan detail aturan cuti")
public void menambahkanDetailDataAturanCuti() {
    aturanCuti.setDetailMinimalBulanBekerja("3");
    aturanCuti.setDetailTotalCuti("2");
    aturanCuti.setBtnSubmitTambahkanDetailAturanCuti();

}

@Then("Admin Berhasil Menambahkan detail data Aturan Cuti")
public void adminBerhasilMenambahkanDetailDataAturanCuti() {
    aturanCuti.textTambahDetailAturanCuti().isDisplayed();
    extentTest.log(LogStatus.PASS, "Admin Berhasil menambahkan detail data Aturan Cuti");
}


///////////////////////////////////////// Scenario Menambahkan detail data Aturan Cuti Invalid
@Given("Login admin untuk menambahkan detail data Aturan Cuti Invalid")
public void loginAdminUntukMenambahkanDetailDataAturanCutiInvalid() {
    driver.get(Constants.URL);
    aturanCuti.loginUser("admin@hadir.com","admin@hadir");
    aturanCuti.setBtnManagement();
    aturanCuti.setBtnAturanCuti();
}

@When("Menambahkan data Aturan Cuti untuk menambahkan detail data Aturan Cuti Invalid")
public void menambahkandataaturancutiuntukmenambahkandetaildataaturancutiinvalid() {
    aturanCuti.setBtnAksiAturanCuti();
    aturanCuti.setBtnView();
    Utils.delay(1);
    aturanCuti.setBtnTambahkanDetailAturanCuti();
}

@And("Admin menambahkan detail aturan cuti Invalid")
public void menambahkanDetailDataAturanCutiinvalid() {
    aturanCuti.setDetailMinimalBulanBekerja("Invalid");
    aturanCuti.setDetailTotalCuti("");
    aturanCuti.setBtnSubmitTambahkanDetailAturanCuti();

}

@Then("Admin Gagal Menambahkan detail data Aturan Cuti Invalid")
public void admingagalMenambahkanDetailDataAturanCutiInvalid() {
    aturanCuti.textDetailMinimalBulanBekerjaError().isDisplayed();
    aturanCuti.textDetailTotalCutiError().isDisplayed();
    extentTest.log(LogStatus.PASS, "Admin Gagal Menambahkan detail data Aturan Cuti");
}

////////////////////////Scenario Menghapus detail data Aturan Cuti 
@Given("Login admin untuk Menghapus data detail Aturan Cuti")
public void LoginadminuntukMenghapusdatadetailAturanCuti () {
    driver.get(Constants.URL);
    aturanCuti.loginUser("admin@hadir.com","admin@hadir");
    aturanCuti.setBtnManagement();
    aturanCuti.setBtnAturanCuti();
}

@When("Admin klik aksi di titik tiga untuk menghapus data Detail Aturan Cuti")
public void AdminklikaksidititiktigauntukmenghapusdataDetailAturanCuti() {
    aturanCuti.setBtnAksiAturanCuti();
    aturanCuti.setBtnView();
    Utils.delay(1);
}

@And("Admin klik tombol delete untuk menghapus data Detail Aturan Cuti")
public void AdminkliktomboldeleteuntukmenghapusdataDetailAturanCuti() {
    aturanCuti.setBtnAksiDetailAturanCuti();
    Utils.delay(1);
    aturanCuti.setBtnDeleteDetailAturanCuti();
    Utils.delay(1);
    aturanCuti.setBtnConfirmDeleteDetailAturanCuti();

}

@Then("Admin Berhasil Menghapus data Detail Aturan Cuti")
public void AdminBerhasilMenghapusdataDetailAturanCuti() {
    extentTest.log(LogStatus.PASS, "Admin Berhasil Menghapus data Detail Aturan Cuti");
}

/////////////////////////Scenario Edit detail data Aturan Cuti
@Given("Login admin untuk Edit data detail Aturan Cuti")
public void loginAdminUntukEditDataDetailAturanCuti() {
    driver.get(Constants.URL);
    aturanCuti.loginUser("admin@hadir.com","admin@hadir");
    aturanCuti.setBtnManagement();
    aturanCuti.setBtnAturanCuti();
}

@When("Admin klik aksi di titik tiga untuk Edit data Detail Aturan Cuti")
public void adminKlikAksiDiTitikTigaUntukEditDataDetailAturanCuti() {
    aturanCuti.setBtnAksiAturanCuti();
    aturanCuti.setBtnView();
    Utils.delay(1);
    aturanCuti.setBtnAksiDetailAturanCuti();
    Utils.delay(1);
    aturanCuti.setBtnEditDetailAturanCuti();
}

@And("Admin Edit data Detail Aturan Cuti")
public void adminEditDataDetailAturanCuti() {
    aturanCuti.setDetailMinimalBulanBekerja("5");
    aturanCuti.setDetailTotalCuti("6");
    aturanCuti.setBtnSubmitEditDetailAturanCuti();

}

@Then("Admin Berhasil Edit data Detail Aturan Cuti")
public void adminBerhasilEditDataDetailAturanCuti() {
    aturanCuti.textTambahDetailAturanCuti().isDisplayed();
    extentTest.log(LogStatus.PASS, "Admin Berhasil Edit data Detail Aturan Cuti");
}

////////////////////////Scenario Edit detail data Aturan Cuti
@Given("Login admin untuk Edit data detail Aturan Cuti Invalid")
public void loginAdminUntukEditDataDetailAturanCutiInvalid() {
    driver.get(Constants.URL);
    aturanCuti.loginUser("admin@hadir.com","admin@hadir");
    aturanCuti.setBtnManagement();
    aturanCuti.setBtnAturanCuti();
}

@When("Admin klik aksi di titik tiga untuk Edit data Detail Aturan Cuti Invalid")
public void adminKlikAksiDiTitikTigaUntukEditDataDetailAturanCutiInvalid() {
    aturanCuti.setBtnAksiAturanCuti();
    aturanCuti.setBtnView();
    Utils.delay(1);
    aturanCuti.setBtnAksiDetailAturanCuti();
    Utils.delay(1);
    aturanCuti.setBtnEditDetailAturanCuti();
}

@And("Admin Edit data Detail Aturan Cuti Invalid")
public void adminEditDataDetailAturanCutiInvalid() {
    aturanCuti.setDetailMinimalBulanBekerja("Invalid");
    aturanCuti.setDetailTotalCuti("");
    aturanCuti.setBtnSubmitEditDetailAturanCuti();

}

@Then("Admin Gagal Edit data Detail Aturan Cuti")
public void adminGagalEditDataDetailAturanCuti() {
    aturanCuti.textDetailMinimalBulanBekerjaError().isDisplayed();
    aturanCuti.textDetailTotalCutiError().isDisplayed();
    extentTest.log(LogStatus.PASS, "Admin Berhasil Edit data Detail Aturan Cuti");
}



}
