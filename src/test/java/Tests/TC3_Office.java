package Tests;

import Pages.po1_LoginPage;
import Pages.po3Office;
import Utilities.DataUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class TC3_Office {

    public final String BASE_URL = "http://109.205.182.68:8080/geointime/#/authentication/signin" ;
    public final String Office_URL= "http://109.205.182.68:8080/geointime/#/admin/office/manage-office";
    public final String USERNAME = DataUtils.getJsonData("validLogin", "username");
    public final String PASSWORD = DataUtils.getJsonData("validLogin", "password");
    public final String OTP = DataUtils.getJsonData("validLogin" , "Otp");
    WebDriver driver = new ChromeDriver();
    @BeforeMethod
    public void setup() throws IOException {

        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @Test
    public void validLoginTC() throws IOException, InterruptedException {
        po1_LoginPage po1LoginPage = new po1_LoginPage(driver);
        po1LoginPage.loginSteps(USERNAME , PASSWORD , OTP);

        po3Office office= new po3Office(driver);
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        office.createOffice("Egypt"+ timeStamp , "cairo " + timeStamp);

        // validate no sane office name

// // validate the url of office page
        Assert.assertEquals(driver.getCurrentUrl(),Office_URL);


    }

}
