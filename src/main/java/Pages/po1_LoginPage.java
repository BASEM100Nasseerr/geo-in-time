package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class po1_LoginPage {
    private  WebDriver driver ;
    private final By username = By.id("email");
    private final By password = By.id("password");
    private final By login = By.id("submit");
    private final  By enterOtp = By.id("otp");
    private final By verifyOtp = By.id("sendcode");

    public po1_LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }


    public void enterUserName (String usernameText)
    {
        Utility.sendData(driver,username ,usernameText);

    }

    public void  enterPassword (String passwordText)
    {
        Utility.sendData(driver , password , passwordText);

    }
    public void scroll ()
    {
       Utility.scrolling(driver, By.id("submit"));

    }
    public void clickOnLogin ()
    {
        Utility.clickingOnElement(driver , login);

    }
    public void Otp (String OtpText)
    {

        Utility.sendData(driver , enterOtp , OtpText);

    }
    public void verify  ()

    {
      Utility.clickingOnElement(driver , By.id("sendcode"));
    }


    public void loginSteps (String usernameText , String passwordText , String OtpText)
    {
         enterUserName(usernameText);
                enterPassword(passwordText);scroll()
                ;clickOnLogin();Otp(OtpText);verify();

    }


}