package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {

    private WebDriver driver;

    public RecruitmentPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    private WebElement menuRecruitment;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement btnAdd;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastName;
    //*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input
    // email
    @FindBy(xpath = "(//input[@placeholder=\"Type here\"])[1]")
    private WebElement email;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement resume;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnSave;

    // 2 assert
    @FindBy(xpath = "//h6[normalize-space()='Application Stage']")
    private WebElement txtApplicationStage;
    //firstName (//p[@class="oxd-text oxd-text--p"])[1]

    public void setMenuRecruitment(){
        menuRecruitment.click();
    }

    public void addCandidate(){
        firstName.sendKeys("Juara");
        lastName.sendKeys("Coding");
        email.sendKeys("admin@juaracoding.co.id");
        resume.sendKeys("C:\\Users\\Lenovo\\Documents\\JC_RESUME.docx");
    }

    public void setBtnAdd(){
        btnAdd.click();
    }

    public void setFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setResume(String resume) {
        this.resume.sendKeys(resume);
    }

    public void setBtnSave() {
        btnSave.click();
    }

    public String getTxtApplicationStage(){
        return txtApplicationStage.getText();
    }

    // for assert add candidate

}
