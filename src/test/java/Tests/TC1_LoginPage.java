package Tests;

import Pages.po1_LoginPage;
import Utilities.DataUtils;
import Utilities.LogsUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static DriverFactory.DriverFactory.*;
import static Utilities.DataUtils.getPropertyValue;

public class TC1_LoginPage {
    WebDriver driver ;

    public final String USERNAME = DataUtils.getJsonData("validLogin", "username");
    public final String PASSWORD = DataUtils.getJsonData("validLogin", "password");
    public final String OTP = DataUtils.getJsonData("validLogin" , "Otp");
    public final String BASE_URL = "http://109.205.182.68:8080/geointime/#/authentication/signin" ;
    public final String HOME_URL= "http://109.205.182.68:8080/geointime/#/admin/dashboard/mainyyyy";


    @BeforeMethod
    public void setup() throws IOException {
        //condition ? true : false
        driver.get(BASE_URL);
    }

    @Test
    public void validLoginTC() throws IOException {
        po1_LoginPage po1LoginPage = new po1_LoginPage(driver);

// validate the url of login page
        Assert.assertEquals(driver.getCurrentUrl(),BASE_URL);
        po1LoginPage.loginSteps(USERNAME , PASSWORD , OTP);

        // validate the url of Home page
        Assert.assertEquals(driver.getCurrentUrl(), HOME_URL);


    }
    public Boolean assertLoginTc(String urlText) {
        return driver.getCurrentUrl().equals(urlText);
    }

    //@AfterMethod(alwaysRun = true)
    public void quit() {
        quitDriver();
    }
}


