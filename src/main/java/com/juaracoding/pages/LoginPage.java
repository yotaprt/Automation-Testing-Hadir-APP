package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = ".MuiButton-contained")
    private WebElement btnLogin;

     public void loginUser(String username, String password){
         this.email.sendKeys(username);
         this.password.sendKeys(password);
     }

     public void loginvalid(String username, String password){
         this.email.sendKeys(username);
         this.password.sendKeys(password);
         btnLogin.click();
     }

    public void setBtnLogin(){
        btnLogin.click();
    }


}
