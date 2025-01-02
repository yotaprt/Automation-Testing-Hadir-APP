package com.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.drivers.DriverSingleton;

public class LoginUser {
  private WebDriver driver;

  public LoginUser(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = ".MuiButton-contained")
    private WebElement btnLogin;

    @FindBy(css = ".css-ctijcz")
    private WebElement btnAbsenMasuk;

    @FindBy(css = ".css-1xarbr2")
    private WebElement btnShootCamera;

    @FindBy(xpath = "//button[contains(text(),'Allow')]")
    private WebElement btnAllow;

    @FindBy(css = "#mui-component-select-is_wfh")
    private WebElement btnTipeAbsen;

    @FindBy(xpath = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1fh5cnl']" )
    private WebElement btnTipeAbsenMasukWFO;

    @FindBy(xpath = "//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1fh5cnl']")
    private WebElement btnTipeAbsenMasukWFH;

    @FindBy(xpath = "//input[@name='notes']")
    private WebElement notes;

    public void loginUser(String username, String password){
      this.email.sendKeys(username);
      this.password.sendKeys(password);
  }

  // public void loginvalid(String username, String password){
  //     this.email.sendKeys(username);
  //     this.password.sendKeys(password);
  //     btnLogin.click();
  // }

 public void setBtnLogin(){
     btnLogin.click();
 }

 public void setBtnAbsenMasuk(){
     btnAbsenMasuk.click();
 }

 public void setBtnShootCamera(){
     btnShootCamera.click();
 }

 public void setBtnAllow(){
     btnAllow.click();
}

public void setBtnTipeAbsen(){
    btnTipeAbsen.click();
}

public void setBtnTipeAbsenMasukWFO(){
    btnTipeAbsenMasukWFO.click();
}

public void setBtnTipeAbsenMasukWFH(){
    btnTipeAbsenMasukWFH.click();
}

public void setNotes(String notes){
    this.notes.sendKeys(notes);
}

}
