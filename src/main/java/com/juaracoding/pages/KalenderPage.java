package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KalenderPage {

    private WebDriver driver;

    public KalenderPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".css-old1by > div:nth-of-type(4) .sidebar__item")
    private WebElement managementNavBar;

    @FindBy(xpath = "//div[13]/div[@class='MuiBox-root css-1pd2x36']")
    private WebElement kalenderNavBar;

    @FindBy(css = ".button-add")
    private WebElement btnAddKalender;

    @FindBy(id = "name")
    private WebElement inputKalenderName;

    @FindBy(css = ".css-4075ia")
    private WebElement btnSimpan;

    @FindBy(xpath = "//h6[.='Kalender Baru']")
    private WebElement inputtedNewKalender;

    @FindBy(id = "name-helper-text")
    private WebElement errorText;

    @FindBy(id = "search")
    private WebElement inputSearch;

    @FindBy(css = ".MuiButton-containedSizeSmall")
    private WebElement btnSearch;

    @FindBy(css = ".MuiButton-textWarning")
    private WebElement btnReset;

    public void clickMenuInManagement(){
        managementNavBar.click();    
    }

    public void clickKalenderMenu(){
        kalenderNavBar.click();    
    }

    public void clickAddKalender() {
        btnAddKalender.click();;
    }

    public WebElement inputKalenderName() {
        return inputKalenderName;
    }

    public WebElement getInputtedNewKalender() {
        return inputtedNewKalender;
    }

    public WebElement getErrorText() {    
        return errorText;
    }

    public WebElement getInputSearch() {
        return inputSearch;
    }

    public void clickBtnSearch() {
        btnSearch.click();
    }   

    public void clickReset() {
        btnReset.click();
    }

    public void clickSimpan() {
        btnSimpan.click();;
    }

    //  @FindBy(xpath = "//h6[.='zack']")
    // private WebElement NamaKalenderUnit;

    public void verifyNamaKalenderUnit(String nama) {
      WebElement NamaKalenderUnit = driver.findElement(By.xpath("//h6[.='" + nama + "']"));
      NamaKalenderUnit.isDisplayed();
    }
}
