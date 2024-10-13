package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class po4_GreenZone {

    WebDriver driver ;
    private final By AddGreenZone = By.xpath("//mat-icon[text()='add']");
    private final By AddOffice = By.xpath("//div[@class='mat-form-field-infix ng-tns-c105-54']");
    private final By InsideOffice = By.xpath("//span[text()='adel']");
    private final By addGreenZoneMode = By.xpath("//div[@class='mat-form-field-infix ng-tns-c105-56']");
    private final By InsideGreenZone = By.xpath("//span[text()='GPS']");

    public po4_GreenZone(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAddGreenZone () {
        Utility.clickingOnElement(driver, AddGreenZone);
    }
    public void clickOnAddOffice () {
        Utility.clickingOnElement(driver, AddOffice);
    }
    public void clickOnInsideOffice () {
        Utility.clickingOnElement(driver, InsideOffice);
    }

    public void clickOnAddGreenZoneMode () {
        Utility.clickingOnElement(driver, addGreenZoneMode);
    }
    public void clickOnInsideGreenZone () {
        Utility.clickingOnElement(driver, InsideOffice);
    }

    public Void addGreenZone (){
        clickOnAddGreenZone();clickOnAddOffice();clickOnInsideOffice();clickOnAddGreenZoneMode();
        clickOnInsideGreenZone();
        return null;
    }


}


