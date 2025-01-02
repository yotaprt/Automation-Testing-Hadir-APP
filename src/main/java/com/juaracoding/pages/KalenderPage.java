package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
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

    public void clickSimpan() {
        btnSimpan.click();;
    }
}
