package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IzinTerlambatpage {

    private WebDriver driver;

    public IzinTerlambatpage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search")
    private WebElement inputSearch;

    @FindBy(css = ".MuiButton-containedSizeSmall")
    private WebElement btnSearch;

    @FindBy(css = ".MuiButton-textWarning")
    private WebElement btnReset;

    @FindBy(css = ".MuiButton-containedSecondary")
    private WebElement btnFilter;

    @FindBy(id = "job_departement")
    private WebElement inputFilter;

    @FindBy(xpath = "//th[.='NAMA USER']")
    private WebElement columnNamaUser;

    @FindBy(xpath = "//th[.='NAMA UPLINER']")
    private WebElement columnNamaUpliner;

    @FindBy(xpath = "//th[.='UNIT']")
    private WebElement columnUnit;

    @FindBy(xpath = "//th[.='STATUS']")
    private WebElement columnStatus;

    @FindBy(xpath = "//div[@class='MuiBox-root css-old1by']//div[@class='MuiBox-root css-zb4pxb']/div[.='Izin Terlambat']")
    private WebElement navbarIzinTerlambat;

    @FindBy(xpath = "//div[@class='MuiBox-root css-old1by']//div[@class='sidebar__wrapper MuiBox-root css-1tkg8nm']/div[.='Laporan']")
    private WebElement navbarLaporan;

    @FindBy(xpath = "//td[.='zack']")
    private WebElement SearchResult;

    @FindBy(xpath = "//tr[@class='MuiTableRow-root MuiTableRow-hover css-9arnca']")
    private WebElement FirstRow;

    public boolean iscolumnNamaUserVisible() {
        return columnNamaUser.isDisplayed();
    }

    public boolean iscolumnunitVisible() {
        return columnUnit.isDisplayed();
    }

    public boolean iscolumnNamaUplinerVisible() {
        return columnNamaUpliner.isDisplayed();
    }

    public boolean iscolumnUnitVisible() {
        return columnUnit.isDisplayed();
    }

    public boolean iscolumnStatusVisible() {
        return columnStatus.isDisplayed();
    }

    public void clickBtnFilter(){
        btnFilter.click();    
    }

    public void clickBtnReset(){
        btnReset.click();    
    }

    public void clickBtnSearch(){
        btnSearch.click();    
    }

    public void clicknavbarIzinTerlambat() {
        navbarIzinTerlambat.click();
    }

    public void clicknavbarLaporan() {
        navbarLaporan.click();
    }

    public WebElement getInputSearch() {
        return inputSearch;
    }

    public boolean verifySearchResult() {
        return SearchResult.isDisplayed();
    }

    public boolean verifyFirstRownotfound() {
       try{
            return FirstRow.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

}
