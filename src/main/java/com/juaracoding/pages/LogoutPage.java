package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    private WebDriver driver;

    public LogoutPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = ".MuiButton-root")
    private WebElement btnLogin;

    @FindBy(css = ".css-uajqx8")
    private WebElement btnLogout;

    @FindBy( css = ".MuiButton-textInherit")
    private WebElement profile;


     public void loginUser(String username, String password){
         this.email.sendKeys(username);
         this.password.sendKeys(password);
     }

    public void setBtnLogin(){
        btnLogin.click();
    }

    public void setBtnLogout(){
        btnLogout.click();
    }

    public void setBtnProfile(){
        profile.click();
    }

}
