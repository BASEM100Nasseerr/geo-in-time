package Tests;

import Pages.po1_LoginPage;
import Utilities.DataUtils;
import Utilities.LogsUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static DriverFactory.DriverFactory.*;
import static Utilities.DataUtils.getPropertyValue;

public class TC1_LoginPage {
    private final String USERNAME = DataUtils.getJsonData("validLogin", "username");
    private final String PASSWORD = DataUtils.getJsonData("validLogin", "password");
    private final String OTP = DataUtils.getJsonData("validLogin" , "Otp");

    @BeforeMethod(alwaysRun = true)
    public void setup() throws IOException {
        //condition ? true : false
        setupDriver(DataUtils.getPropertyValue("environment", "Browser"));
        getDriver().get(DataUtils.getPropertyValue("environment", "BASE_URL"));
        getDriver().manage().timeouts().
                implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void validLoginTC() throws IOException {
        new po1_LoginPage(getDriver())
                .scroll().enterUserName(USERNAME)
                .enterPassword(PASSWORD)
                .clickOnLogin().Otp(OTP).verify();
        Assert.assertTrue(new po1_LoginPage(getDriver()).assertLoginTc(getPropertyValue("environment", "HOME_URL")));
    }


    //@AfterMethod(alwaysRun = true)
    public void quit() {
        quitDriver();
    }
}


