package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DayOffPage {

    private WebDriver driver;

    public DayOffPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[.='Cuti Bersama']")
    private WebElement CutiBersama;

    @FindBy(xpath = "//h3[.='Liburan Nasional']")
    private WebElement LiburanNasional;

    @FindBy(xpath = "//div[@class='MuiBox-root css-76jx17']/div[1]//h5[.='Tanggal']")
    private WebElement tglCutBer;

    @FindBy(xpath = "//div[@class='MuiBox-root css-76jx17']/div[1]//h5[.='Deskripsi']")
    private WebElement descCutBer;

    @FindBy(xpath = "//div[@class='MuiBox-root css-76jx17']/div[2]//h5[.='Tanggal']")
    private WebElement tglLibNas;

    @FindBy(xpath = "//div[@class='MuiBox-root css-76jx17']/div[2]//h5[.='Deskripsi']")
    private WebElement descLibNas;

    @FindBy(css = ".css-old1by > div:nth-of-type(4) .sidebar__item")
    private WebElement managementNavBar;

    @FindBy(xpath = "//div[15]/div[@class='MuiBox-root css-1pd2x36']")
    private WebElement dayoffNavBar;


    public void clickDayoffMenuInManagement(){
        managementNavBar.click();    
    }

    public void clickDayoffMenu(){
        dayoffNavBar.click();    
    }

}
