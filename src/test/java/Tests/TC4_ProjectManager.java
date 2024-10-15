package Tests;

import Pages.po1_LoginPage;
import Pages.po4_ProjectManager;
import Utilities.DataUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static DriverFactory.DriverFactory.*;
import static Utilities.DataUtils.getPropertyValue;

public class TC4_ProjectManager {
    WebDriver driver = new ChromeDriver();
    public final String BASE_URL = "http://109.205.182.68:8080/geointime/#/authentication/signin" ;
    public final String Project_URL= "http://109.205.182.68:8080/geointime/#/admin/Project/All-Projects";
    public final String USERNAME = DataUtils.getJsonData("validLogin", "username");
    public final String PASSWORD = DataUtils.getJsonData("validLogin", "password");
    public final String OTP = DataUtils.getJsonData("validLogin" , "Otp");

    @BeforeMethod
    public void setup() throws IOException {

        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }


    @Test
    public void createProjectTracker() throws IOException, InterruptedException {

        //String email = "bnasser+" + generateRandomNumber() + "@acuanix.com";
        po1_LoginPage po1LoginPage = new po1_LoginPage(driver);
        po4_ProjectManager project = new po4_ProjectManager(driver);


        po1LoginPage.loginSteps(USERNAME , PASSWORD , OTP);
        project.AddProject();
  // validate of url project
        Assert.assertEquals(driver.getCurrentUrl(),Project_URL);


    }
    //@AfterMethod(alwaysRun = true)
    public void quit() {
        quitDriver();
    }
}

