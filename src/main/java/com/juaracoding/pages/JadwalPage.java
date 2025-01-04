package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.drivers.DriverSingleton;

public class JadwalPage {
  private WebDriver driver;

  public JadwalPage() {
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


    @FindBy(xpath = "//div[@class='MuiBox-root css-old1by']//div[@class='sidebar__wrapper MuiBox-root css-1tkg8nm']/div[.='Management']")
    private WebElement btnManagement;
    public void setBtnManagement() {
      btnManagement.click();
    }

    @FindBy(xpath = "//p[.='Jadwal']")
    private WebElement btnJadwal;
    public void setBtnJadwal() {
      btnJadwal.click();
    }

    @FindBy(css = ".button-add")
    private WebElement btnTambahJadwal;
    public void setBtnTambahJadwal() {
      btnTambahJadwal.click();
    }



}
