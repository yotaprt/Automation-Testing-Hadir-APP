package com.juaracoding.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Utils;

public class AturanCuti {
  private WebDriver driver;

  public AturanCuti() {
    this.driver = DriverSingleton.getDriver();
    PageFactory.initElements(driver, this);
  }

  @FindBy(id = "email")
    private WebElement email;
    public void loginUser(String email, String password) {
      this.email.sendKeys(email);
      this.password.sendKeys(password);
      btnLogin.click();
      
    }

    @FindBy(css = ".MuiButton-root")
    private WebElement btnLogin;
    
    @FindBy(id = "password")
    private WebElement password;


    @FindBy(css = ".css-old1by > div:nth-of-type(4) .sidebar__item")
    private WebElement btnManagement;
    public void setBtnManagement() {
      btnManagement.click();
    }

    @FindBy(xpath = "//div[14]/div[@class='MuiBox-root css-1uf4d7l']")
    private WebElement btnAturanCuti;
    public void setBtnAturanCuti() {
      btnAturanCuti.click();
    }

    @FindBy(name = "search")
    private WebElement txtSearch;
    public void setTxtSearch(String NamaAturanCuti) {
      txtSearch.sendKeys(NamaAturanCuti);
    }

    @FindBy(css = ".btn-search")
    private WebElement btnSearch;
    public void setBtnSearch() {
      btnSearch.click();
    }

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-4075ia']")
    private WebElement btnTambahAturanCuti;
    public void setBtnTambahAturanCuti() {
      btnTambahAturanCuti.click();
    }

    @FindBy(xpath = "//button[.='Tambahkan']")
    private WebElement btnTambahkanAturanCuti;
    public void setBtnTambahkanAturanCuti() {
      btnTambahkanAturanCuti.click();
    }

    @FindBy(css = ".MuiButton-outlinedWarning")
    private WebElement btnReset;
    public void setBtnReset() {
      btnReset.click();
    }

    @FindBy(id = "name")
    private WebElement name;
    public void setTambahAturanCutiName(String TambahNamaAturanCuti) {
      name.sendKeys(TambahNamaAturanCuti);
    }

    @FindBy(id = "eligible_leave_total_month")
    private WebElement EligiblePengaturanCutiBulan;
    public void setEligiblePengaturanCutiBulan(String TambahEligiblePengaturanCutiBulan) {
      if (EligiblePengaturanCutiBulan.isDisplayed()) {
        EligiblePengaturanCutiBulan.sendKeys(Keys.BACK_SPACE);
        EligiblePengaturanCutiBulan.sendKeys(TambahEligiblePengaturanCutiBulan);
      }
    }

  @FindBy(xpath = "//button[.='0']" )
  private WebElement tanggalBatasSisaCuti;
  public void setTanggalBatasSisaCuti(String tanggal) {
    this.tanggalBatasSisaCuti = driver.findElement(By.xpath("//button[.='" + tanggal + "']"));
    tanggalBatasSisaCuti.click();
  }
  

    @FindBy(xpath = "//div[@class='MuiDialogContent-root css-1ty026z']//div[3]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-md0l3g']")
    private WebElement KalenderTanggalBatasSisaCuti;
    public void setKalenderTanggalBatasSisaCuti() {
      KalenderTanggalBatasSisaCuti.click();
    }

    @FindBy(xpath = "//div[@class='MuiDialogContent-root css-1ty026z']//div[4]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-md0l3g']")
    private WebElement KalenderBulanBatasSisaCuti;    
    public void setKalenderBulanBatasSisaCuti() {
      KalenderBulanBatasSisaCuti.click();
    }

    @FindBy(xpath = "//button[.='0']")
    private WebElement BulanBatasSisaCuti;
    public void setBulanBatasSisaCuti(String Bulan) {
      this.BulanBatasSisaCuti = driver.findElement(By.xpath("//button[.='" + Bulan + "']"));
      BulanBatasSisaCuti.click();
    }

    @FindBy(id = "max_carry_forward")
    private WebElement MaksilmalSisaCuti;
    public void setMaksilmalSisaCuti(String TambahMaksilmalSisaCuti) {
      MaksilmalSisaCuti.clear();
      MaksilmalSisaCuti.sendKeys(Keys.BACK_SPACE);
      MaksilmalSisaCuti.sendKeys(TambahMaksilmalSisaCuti);
  }

    @FindBy(id = "carry_forward_total_month")
    private WebElement JumlahBulanKerjaSisaCuti;

    public Object tanggalBulanBatasSisaCuti;
    public void setJumlahBulanKerjaSisaCuti(String TambahJumlahBulanKerjaSisaCuti) {
      if (JumlahBulanKerjaSisaCuti.isDisplayed()){
      JumlahBulanKerjaSisaCuti.sendKeys(Keys.BACK_SPACE);
      JumlahBulanKerjaSisaCuti.sendKeys(TambahJumlahBulanKerjaSisaCuti);
    }
  }





}
