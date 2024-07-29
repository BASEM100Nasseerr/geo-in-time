package Tests;

import Pages.po1_LoginPage;
import Utilities.DataUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.UUID;

import static DriverFactory.DriverFactory.*;
import static Utilities.DataUtils.getPropertyValue;

public class TC2_AllEmployee {
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
    public void validLoginTC() throws IOException, InterruptedException {


        //String email = "bnasser+" + generateRandomNumber() + "@acuanix.com";
        new po1_LoginPage(getDriver())
                .scroll().enterUserName(USERNAME)
                .enterPassword(PASSWORD)
                .clickOnLogin().Otp(OTP).verify().clcikOnTrust().AddEmployee();
        Assert.assertTrue(new po1_LoginPage(getDriver()).assertLoginTc(getPropertyValue("environment", "EMPLOYEE_URL")));
    }

 // bassem

  /*  public static String generateRandomNumber() {
        Random randomOTP = new Random();
        int num = randomOTP.nextInt(9999);
        return String.format("%04d", num);
    }*/

    //@AfterMethod(alwaysRun = true)
    public void quit() {
        quitDriver();
    }
}



