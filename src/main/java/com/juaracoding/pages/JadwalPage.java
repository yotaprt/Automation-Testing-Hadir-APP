package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JadwalPage {

    private WebDriver driver;

    public JadwalPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".button-add")
    private WebElement btnTambahJadwal;

    @FindBy(id = "typeJadwal")
    private WebElement inputTypeJadwal;

    @FindBy(xpath = "//li[.='Jadwal kerja tetap']")
    private WebElement typeJadwalKerjaTetap;

    @FindBy(id = "nameJadwal")
    private WebElement inputNameJadwal;
    
    @FindBy(id = "name")
    private WebElement inputHariKerja;

    @FindBy(xpath = "//body[1]//div[@class='MuiBox-root css-0']/div[1]//div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-1cbz1az']")
    private WebElement inputJumlahHariKerja;

    @FindBy(xpath = "//li[.='CS Pagi']")
    private WebElement JumlahHariKerjaCSPagi;

    @FindBy(xpath = "//button[.='Terapkan']")
    private WebElement btnTerapkan;

    @FindBy(id = "t_keterlambatan")
    private WebElement inputToleransiKeterlambatan;

    @FindBy(xpath = "//button[.='Tambah']")
    private WebElement btnSimpan;

    @FindBy(xpath = "//tbody[@class='MuiTableBody-root css-1xnox0e']/tr[1]//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeLarge css-1ro73q1']")
    private WebElement btnActionJadwal;

    @FindBy(xpath = "//div[@class='MuiPopover-root MuiMenu-root MuiModal-root css-1sucic7']//li[.='Detail']")
    private WebElement btnDetailsAction;

    @FindBy(xpath = "//div[@class='MuiPopover-root MuiMenu-root MuiModal-root css-1sucic7']//li[.='Edit']")
    private WebElement btnEditAction;

    @FindBy(xpath = "//div[@class='MuiPopover-root MuiMenu-root MuiModal-root css-1sucic7']//li[.='Delete']")
    private WebElement btnDeleteAction;

    @FindBy(id = "search")
    private WebElement inputSearch;

    @FindBy(css = ".MuiButton-containedSizeSmall")
    private WebElement btnSearch;

    @FindBy(css = ".css-old1by > div:nth-of-type(4) .sidebar__item")
    private WebElement managementNavBar;

    @FindBy(xpath = "//div[12]/div[@class='MuiBox-root css-1pd2x36']")
    private WebElement JadwalNavBar;

    @FindBy(css = ".MuiTableBody-root > tr:nth-of-type(1) > td:nth-of-type(1)")
    private WebElement verifyAddedJadwal;

    public void clickMenuInManagement(){
        managementNavBar.click();
    }

    public void clickJadwalMenuInManagement(){
        JadwalNavBar.click();
    }

    public void clickTambahJadwal(){
        btnTambahJadwal.click();    
    }

    public void clickJadwal(){
        btnActionJadwal.click();    
    }

    public void clickDetailJadwal(){
        btnDetailsAction.click();    
    }

    public void clickEditJadwal(){    
        btnEditAction.click();    
    }

    public void clickDeleteJadwal(){    
        btnDeleteAction.click();    
    }

    public void clickTypeJadwal() {
        inputTypeJadwal.click();;
    }

    public void pilihTypeJadwal() {
        typeJadwalKerjaTetap.click();
    }

    public void inputNameJadwal(String nameJadwal) {
        inputNameJadwal.sendKeys(nameJadwal);
    }

    public void clickInputHariKerja() {
        inputHariKerja.click();;
    }

    public void clickInputJumlahHariKerja() {
        inputJumlahHariKerja.click();
    }

    public void pilihJumlahHariKerjaCSPagi() {
        JumlahHariKerjaCSPagi.click();;
    }

    public WebElement getInputToleransiKeterlambatan() {
        return inputToleransiKeterlambatan;
    }

    public void clickTerapkan() {
        btnTerapkan.click();
    }

    public void clickSimpan() {
        btnSimpan.click();
    }

    public WebElement getVerifyAddedJadwal() {
        return verifyAddedJadwal;
    }
    
}
