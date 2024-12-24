package com.juaracoding.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.drivers.DriverSingleton;


public class HistoryAbsensi {
  private WebDriver driver;

  public HistoryAbsensi() {
    this.driver = DriverSingleton.getDriver();
    PageFactory.initElements(driver, this);
  }

  @FindBy(id = "email")
  private WebElement email;

  @FindBy(id = "password")
  private WebElement password;

  @FindBy(css = ".MuiButton-contained")
  private WebElement btnLogin;

  @FindBy(css = ".css-1smsyc3")
  private WebElement btnHistoryAbsensi;

  @FindBy(xpath = "//div[@class='MuiBox-root css-1dovkig']/div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-isbt42']/div[1]//div[@class='MuiBox-root css-11uwjng']")
  private WebElement btnAbsensi;

  public void loginUser(String username, String password) {
    this.email.sendKeys(username);
    this.password.sendKeys(password);
    btnLogin.click();
  }

  public void setBtnLogin() {
    btnLogin.click();
  }

  public void setBtnHistoryAbsensi() {
    btnHistoryAbsensi.click();
  }

  public void setBtnAbsensi(){
  btnAbsensi.click();
  }


//   public void setBtnHistoryAbsensi() {
//     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnHistoryAbsensi);
//     btnHistoryAbsensi.click();
//   }


//   public void setBtnAbsensi() {
//     // Scroll ke elemen
//     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnAbsensi);

//     // Tunggu elemen siap
//     WebDriverWait wait = new WebDriverWait(driver, 10);
//     wait.until(ExpectedConditions.elementToBeClickable(btnAbsensi));

//     // Klik dengan JavaScript
//     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnAbsensi);
// }
}
