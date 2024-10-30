package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.RecruitmentPage;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RecruitmentTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static RecruitmentPage recruitmentPage = new RecruitmentPage();

    public RecruitmentTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin logged in")
    public void admin_logged_in(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.loginUser("Admin","admin123");
        loginPage.setBtnLogin();
        extentTest.log(LogStatus.PASS,"Admin logged in");
    }

    @And("Admin go to menu Recruitment")
    public void admin_go_to_menu_recruitment(){
        recruitmentPage.setMenuRecruitment();
        extentTest.log(LogStatus.PASS,"Admin go to menu Recruitment");
    }

    @When("Admin click button Add")
    public void admin_click_button_add(){
        recruitmentPage.setBtnAdd();
        extentTest.log(LogStatus.PASS,"Admin click button Add");
    }

    @And("Admin enter firstname")
    public void admin_enter_firstname(){
        recruitmentPage.setFirstName("Juara");
        extentTest.log(LogStatus.PASS,"Admin enter firstname");
    }

    @And("Admin enter lastname")
    public void admin_enter_lastname(){
        recruitmentPage.setLastName("Coding");
        extentTest.log(LogStatus.PASS,"Admin enter lastname");
    }

    @And("Admin enter email")
    public void admin_enter_email(){
        recruitmentPage.setEmail("admin@juaracoding.co.id");
        extentTest.log(LogStatus.PASS,"Admin enter email");
    }

    @And("Admin upload file resume")
    public void admin_upload_file_resume(){
        recruitmentPage.setResume("C:\\Users\\Lenovo\\Documents\\JC_RESUME.docx");
        extentTest.log(LogStatus.PASS,"Admin upload file resume");
    }

    @And("Admin click button save")
    public void admin_click_button_save(){
        recruitmentPage.setBtnSave();
        extentTest.log(LogStatus.PASS,"Admin click button save");
    }

    @Then("Admin redirect to page Application Stage")
    public void admin_redirect_to_page_application_stage(){
        Utils.delay(2);
        Assert.assertEquals(recruitmentPage.getTxtApplicationStage(),"Application Stag");
        extentTest.log(LogStatus.PASS,"Admin redirect to page Application Stage");
    }

}
