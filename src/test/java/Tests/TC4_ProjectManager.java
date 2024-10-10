package Tests;

import Pages.po1_LoginPage;
import Pages.po4_ProjectManager;
import Utilities.DataUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static DriverFactory.DriverFactory.*;
import static Utilities.DataUtils.getPropertyValue;

public class TC4_ProjectManager {
    WebDriver driver;
    public final String BASE_URL = "http://109.205.182.68:8080/geointime/#/authentication/signin" ;
    public final String HOME_URL= "http://109.205.182.68:8080/geointime/#/admin/dashboard/mainyyyy";
    public final String Project_URL= "http://109.205.182.68:8080/geointime/#/admin/Project/All-Projects";
    public final String USERNAME = DataUtils.getJsonData("validLogin", "username");
    public final String PASSWORD = DataUtils.getJsonData("validLogin", "password");
    public final String OTP = DataUtils.getJsonData("validLogin" , "Otp");

    @BeforeMethod(alwaysRun = true)
    public void setup() throws IOException {
        //condition ? true : false
        public void setup() throws IOException {
            //condition ? true : false
            driver.get(BASE_URL);
        }
    }
    @Test
    public void createProjectTracker() throws IOException, InterruptedException {

        //String email = "bnasser+" + generateRandomNumber() + "@acuanix.com";
        po1_LoginPage po1LoginPage = new po1_LoginPage(driver);
        po4_ProjectManager project = new po4_ProjectManager(driver);

        po1LoginPage.loginSteps(USERNAME , PASSWORD , OTP);
        project.AddProject();



    }
    //@AfterMethod(alwaysRun = true)
    public void quit() {
        quitDriver();
    }
}

