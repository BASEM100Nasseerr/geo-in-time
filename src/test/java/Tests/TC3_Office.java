package Tests;

import Pages.po1_LoginPage;
import Utilities.DataUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC3_Office {

    public final String BASE_URL = "http://109.205.182.68:8080/geointime/#/authentication/signin" ;
    public final String HOME_URL= "http://109.205.182.68:8080/geointime/#/admin/dashboard/mainyyyy";
    public final String USERNAME = DataUtils.getJsonData("validLogin", "username");
    public final String PASSWORD = DataUtils.getJsonData("validLogin", "password");
    public final String OTP = DataUtils.getJsonData("validLogin" , "Otp");
    WebDriver driver ;
    @BeforeMethod
    public void setup() throws IOException {
        //condition ? true : false
        driver.get(BASE_URL);
    }

    @Test
    public void validLoginTC() throws IOException {
        po1_LoginPage po1LoginPage = new po1_LoginPage(driver);
        po1LoginPage.loginSteps(USERNAME , PASSWORD , OTP);
        p





    }

}
