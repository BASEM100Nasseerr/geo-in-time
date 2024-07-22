package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class po1_LoginPage {
    private WebDriver driver ;
    private final By username = By.id("email");
    private final By password = By.id("password");
    private final By login = By.id("submit");
    private final  By enterOtp = By.id("otp");
    private final By verifyOtp = By.id("sendcode");

    public po1_LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }


    public po1_LoginPage enterUserName (String usernameText)
    {
        Utility.sendData(driver,username ,usernameText);
        return this ;
    }

    public po1_LoginPage enterPassword (String passwordText)
    {
        Utility.sendData(driver , password , passwordText);
        return this ;
    }
    public po1_LoginPage scroll ()
    {
       Utility.scrolling(driver, By.id("submit"));
        return this ;
    }
    public po1_LoginPage clickOnLogin ()
    {
        Utility.clickingOnElement(driver , login);
        return this ;
    }
    public po1_LoginPage Otp (String OtpText)
    {
       /* driver.findElement(enterOtp).sendKeys(OtpText);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
        Utility.sendData(driver , enterOtp , OtpText);
        return this ;
    }
    public po2_HomePage verify  ()

    {
      Utility.clickingOnElement(driver , By.id("sendcode"));
        return new po2_HomePage(driver);
    }
    public Boolean assertLoginTc(String urlText) {
        return driver.getCurrentUrl().equals(urlText);
    }

    public po2_HomePage loginSteps (String usernameText , String passwordText , String OtpText)
    {
        return enterUserName(usernameText)
                .enterPassword(passwordText).scroll()
                .clickOnLogin().Otp(OtpText).verify();
    }


}