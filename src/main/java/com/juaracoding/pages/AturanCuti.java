package com.juaracoding.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Utils;

import io.cucumber.java.an.E;
import io.cucumber.java.it.Ma;

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

    @FindBy(id = "name")
    private WebElement editName;
    public void setEditAturanCutiName(String EditNamaAturanCuti) {
      editName.sendKeys(Keys.chord(Keys.CONTROL,"a"));
      editName.sendKeys(Keys.BACK_SPACE);
      editName.sendKeys(EditNamaAturanCuti);
    }

    @FindBy(id = "eligible_leave_total_month")
    private WebElement EligiblePengaturanCutiBulan;
    public void setEligiblePengaturanCutiBulan(String TambahEligiblePengaturanCutiBulan) {
      if (EligiblePengaturanCutiBulan.isDisplayed()) {
        EligiblePengaturanCutiBulan.sendKeys(Keys.chord(Keys.CONTROL,"a"));
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
      MaksilmalSisaCuti.sendKeys(Keys.chord(Keys.CONTROL,"a"));
      MaksilmalSisaCuti.sendKeys(Keys.BACK_SPACE);
      MaksilmalSisaCuti.sendKeys(TambahMaksilmalSisaCuti);
  }

    @FindBy(id = "carry_forward_total_month")
    private WebElement JumlahBulanKerjaSisaCuti;

    public Object tanggalBulanBatasSisaCuti;
    public void setJumlahBulanKerjaSisaCuti(String TambahJumlahBulanKerjaSisaCuti) {
      if (JumlahBulanKerjaSisaCuti.isDisplayed()){
      JumlahBulanKerjaSisaCuti.sendKeys(Keys.chord(Keys.CONTROL,"a"));
      JumlahBulanKerjaSisaCuti.sendKeys(Keys.BACK_SPACE);
      JumlahBulanKerjaSisaCuti.sendKeys(TambahJumlahBulanKerjaSisaCuti);
    }
  }

  @FindBy(css = "[placeholder='d']")
  private WebElement TypingTanggalBatasSisaCuti;
  public void TypingTanggalBatasSisaCuti(String tanggaltyping) {
    TypingTanggalBatasSisaCuti.sendKeys(Keys.chord(Keys.CONTROL,"a"));
    TypingTanggalBatasSisaCuti.sendKeys(Keys.BACK_SPACE);
    TypingTanggalBatasSisaCuti.sendKeys(tanggaltyping);
}

@FindBy(css = "[placeholder='m']")
private WebElement TypingBulanBatasSisaCuti;
public void TypingBulanBatasSisaCuti(String bulantyping) {
  TypingBulanBatasSisaCuti.sendKeys(Keys.chord(Keys.CONTROL,"a"));
  TypingBulanBatasSisaCuti.sendKeys(Keys.BACK_SPACE);
  TypingBulanBatasSisaCuti.sendKeys(bulantyping);
}

@FindBy(xpath = "//p[.='Maksimal sisa cuti harus diisi!']")
private WebElement bulanBatasSisaCutiError;
public WebElement BulanBatasSisaCutiError() {
  return bulanBatasSisaCutiError;
}

  @FindBy(xpath = "//p[.='Tanggal batas sisa cuti harus diisi!']")
  private WebElement TanggalBatasSisaCutiError;
  public WebElement TanggalBatasSisaCutiError() {
    return TanggalBatasSisaCutiError;
  }

  @FindBy(name = "search")
  private WebElement search;
  public void setSearchAturanCuti(String searchnameaturancuti) {
    search.sendKeys(searchnameaturancuti);
  }

  @FindBy(css = ".btn-search")
  private WebElement btnSearch;
  public void setBtnSearch() {
    btnSearch.click();
  }

  @FindBy(name = "search")
  private WebElement searchNamaAturanCuti;
  public void setSearchNamaAturanCuti(String searchnameaturancuti) {
    searchNamaAturanCuti.sendKeys(searchnameaturancuti);
  }

  @FindBy(css = ".btn-search")
  private WebElement btnSearchNamaAturanCuti;
  public void setBtnSearchNamaAturanCuti() {
    btnSearchNamaAturanCuti.click();
  }

  @FindBy(xpath = "//tbody[@class='MuiTableBody-root css-1xnox0e']/tr[1]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeLarge css-1ro73q1']")
  private WebElement btnAksiAturanCuti;
  public void setBtnAksiAturanCuti() {
    btnAksiAturanCuti.click();
  }

  @FindBy(xpath = "//div[@class='MuiPopover-root MuiMenu-root MuiModal-root css-1sucic7']//li[.='View']")
  private WebElement btnView;
  public void setBtnView() {
    btnView.click();
  }

  @FindBy(xpath = "//div[@class='MuiPopover-root MuiMenu-root MuiModal-root css-1sucic7']//li[.='Edit']")
  private WebElement btnEdit;
  public void setBtnEdit() {
    btnEdit.click();
  }

  @FindBy(xpath = "//div[@class='MuiPopover-root MuiMenu-root MuiModal-root css-1sucic7']//li[.='Delete']")
  private WebElement btnDelete;
  public void setBtnDelete() {
    btnDelete.click();
  }

  @FindBy(css = ".MuiButton-outlinedDanger")
  private WebElement btnHapusAturanCuti;
  public void setBtnHapusAturanCuti() {
    btnHapusAturanCuti.click();
  }
  
  @FindBy(css = ".MuiSnackbarContent-message")
  private WebElement textHapusAturanCuti;
  public WebElement textHapusAturanCuti() {
    return textHapusAturanCuti;
  }

  @FindBy(css = ".MuiSnackbarContent-message")
  private WebElement textEditAturanCuti;
  public WebElement textEditAturanCuti() {
    return textEditAturanCuti;
  }

  @FindBy(xpath = "//div[@class='MuiPopover-root MuiMenu-root MuiModal-root css-1sucic7']//li[.='Edit']")
  private WebElement btnEditAturanCuti;
  public void setBtnEditAturanCuti() {
    btnEditAturanCuti.click();
  }

  @FindBy(xpath = "//button[.='Simpan']")
  private WebElement btnSimpanEditAturanCuti;
  public void setBtnSimpanEditAturanCuti() {
    btnSimpanEditAturanCuti.click();
  }
  
  @FindBy(id = "eligible_leave_total_month-helper-text")
  private WebElement textEditEligiblePengaturanCuti;
  public WebElement textErrorEditEligiblePengaturanCuti() {
    return textEditEligiblePengaturanCuti;
  }
  
    @FindBy(id = "max_carry_forward-helper-text")
    private WebElement textEditMaksimalSisaCutiError;
    public WebElement textErrorEditMaksimalSisaCuti() {
      return textEditMaksimalSisaCutiError;
    }

    @FindBy(id = "carry_forward_total_month-helper-text")
    private WebElement textEditJumlahBulanSisaCutiError;
    public WebElement textEditJumlahBulanSisaCutiError() {
      return textEditJumlahBulanSisaCutiError;
    }

    @FindBy(css = ".css-4075ia")
    private WebElement btnTambahkanDetailAturanCuti;
    public void setBtnTambahkanDetailAturanCuti() {
      btnTambahkanDetailAturanCuti.click();
    }

    @FindBy(id = "total_month_greater")
    private WebElement  detailMinimalBulanBekerja;
    public void setDetailMinimalBulanBekerja(String inputminimalBulanBekerja) {
      detailMinimalBulanBekerja.sendKeys(Keys.chord(Keys.CONTROL,"a"));
      detailMinimalBulanBekerja.sendKeys(Keys.BACK_SPACE);
      detailMinimalBulanBekerja.sendKeys(inputminimalBulanBekerja);
    }

    @FindBy(id = "total_leave")
    private WebElement detailTotalCuti;
    public void setDetailTotalCuti(String inputtotalCuti) {
      detailTotalCuti.sendKeys(Keys.chord(Keys.CONTROL,"a"));
      detailTotalCuti.sendKeys(Keys.BACK_SPACE);
      detailTotalCuti.sendKeys(inputtotalCuti);
    }

    @FindBy(xpath = "//button[.='Tambahkan']")
    private WebElement btnSubmitTambahkanDetailAturanCuti;
    public void setBtnSubmitTambahkanDetailAturanCuti() {
      btnSubmitTambahkanDetailAturanCuti.click();
    }

    @FindBy(css = ".MuiSnackbarContent-message")
    private WebElement textTambahDetailAturanCuti;
    public WebElement textTambahDetailAturanCuti() {
      return textTambahDetailAturanCuti;
    }

    @FindBy(id = "total_month_greater-helper-text")
    private WebElement textDetailMinimalBulanBekerjaError;
    public WebElement textDetailMinimalBulanBekerjaError() {
      return textDetailMinimalBulanBekerjaError;
    }

    @FindBy(id = "total_leave-helper-text")
    private WebElement textDetailTotalCutiError;
    public WebElement textDetailTotalCutiError() {
      return textDetailTotalCutiError;
    }

    @FindBy(xpath = "//tbody[@class='MuiTableBody-root css-1xnox0e']/tr[1]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeLarge css-1ro73q1']")
    private WebElement btnAksiDetailAturanCuti;
    public void setBtnAksiDetailAturanCuti() {
      btnAksiDetailAturanCuti.click();
    }

    @FindBy(xpath = "//div[@class='MuiPopover-root MuiMenu-root MuiModal-root css-1sucic7']//li[.='Delete']")
    private WebElement btnDeleteDetailAturanCuti;
    public void setBtnDeleteDetailAturanCuti() {
      btnDeleteDetailAturanCuti.click();
    }

    @FindBy(css = ".MuiButton-outlinedDanger")
    private WebElement btnConfirmDeleteDetailAturanCuti;
    public void setBtnConfirmDeleteDetailAturanCuti() {
      btnConfirmDeleteDetailAturanCuti.click();
    }

    @FindBy(xpath = "//div[@class='MuiPopover-root MuiMenu-root MuiModal-root css-1sucic7']//li[.='Edit']")
    private WebElement btnEditDetailAturanCuti;
    public void setBtnEditDetailAturanCuti() {
      btnEditDetailAturanCuti.click();
    }
    
    @FindBy(xpath = "//button[.='Simpan']")
    private WebElement btnSubmitEditDetailAturanCuti;
    public void setBtnSubmitEditDetailAturanCuti() {
      btnSubmitEditDetailAturanCuti.click();
    } 
  }
