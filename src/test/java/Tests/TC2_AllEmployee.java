package Tests;

import Pages.po1_LoginPage;
import Pages.po2_AllEmployee;

import Utilities.DataUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

    WebDriver driver = new ChromeDriver();
    public final String BASE_URL = "http://109.205.182.68:8080/geointime/#/authentication/signin" ;
    private final String USERNAME = DataUtils.getJsonData("validLogin", "username");
    private final String PASSWORD = DataUtils.getJsonData("validLogin", "password");
    private final String OTP = DataUtils.getJsonData("validLogin" , "Otp");
    public final String Employee_URL= "http://109.205.182.68:8080/geointime/#/admin/employees/allEmployees";
    @BeforeMethod(alwaysRun = true)
    public void setup() throws IOException {
        //condition ? true : false
        driver.get(BASE_URL);
        driver.manage().window().maximize();

    }

    @Test
    public void validLoginTC() throws IOException, InterruptedException {
        po1_LoginPage po1LoginPage = new po1_LoginPage(driver);
        po2_AllEmployee AddEmployee = new po2_AllEmployee(driver);


        po1LoginPage.loginSteps(USERNAME , PASSWORD , OTP);
        AddEmployee.AddEmployee();
        // validate the url of employee page
        Assert.assertEquals(driver.getCurrentUrl(), Employee_URL);

    }



    //@AfterMethod(alwaysRun = true)
    public void quit() {
        quitDriver();
    }
}



