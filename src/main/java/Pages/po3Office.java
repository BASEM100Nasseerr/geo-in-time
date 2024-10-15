package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class po3Office {

    private final WebDriver driver ;
    private final By configuration =By.xpath("//a[text()='Configuration']");
    private final By office =By.xpath("//span[text()=' Offices ']");
    private final By addButton =By.cssSelector("[role=\"img\"]");
    private final By OfficeNameField=By.cssSelector("[formcontrolname=\"name\"]");
    private final By OfficeAreaField=By.cssSelector("[formcontrolname=\"area\"]");
    //private final By OfficeManagerField=By.id("mat-input-5");
    private final By countrySelectDropDown=By.xpath("//mat-select[@formcontrolname='country']");
    private final By InsideCountrySelectDropDown=By.xpath("//span[text()='Egypt ']");
    private final By citySelectDropDon=By.xpath("//mat-select[@formcontrolname='city']");
        private final By InsideCitySelectDropDon=By.xpath("//span[text()='Cairo']");
    private final By timeZoneSelectDropDown=By.xpath("//mat-select[@formcontrolname='timeZone']");
    private final By InsideTimeZoneSelectDropDown=By.xpath("(//span[text()='Africa/Cairo'])[1]");
    private final By checkBox=By.xpath("(//span[@class=\"mat-checkbox-inner-container\"])[1]");
    private final By createBtn=By.xpath("(//span[@class=\"mat-button-wrapper\"])[28]");

    public po3Office(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnConfiguration () throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(10));
        Utility.clickingOnElement(driver,configuration);

    }
    public void clickOnOffice (){
        Utility.clickingOnElement(driver,office);

    }
    public void clickOnAdd (){
        Utility.clickingOnElement(driver,addButton);

    }

    public void clickOnOfficeName (String officeText){
        Utility.sendData(driver,OfficeNameField , "Adel");

    }
    public void clickOnOfficeArea (String AreaText){
        Utility.sendData(driver,OfficeAreaField , "Nile");

    }

    public void clickOnCountrySelect (){
        Utility.clickingOnElement(driver,countrySelectDropDown);

    }
    public void clickOnInsideCountry (){
        Utility.clickingOnElement(driver,InsideCountrySelectDropDown);

    }

    public void clickOnCitySelectDropDon (){
        Utility.clickingOnElement(driver,citySelectDropDon);

    }

    public void clickOnInsideCitySelect (){
        Utility.clickingOnElement(driver,InsideCitySelectDropDon);

    }
    public void clickOnTimeZoneSelect (){
        Utility.clickingOnElement(driver,timeZoneSelectDropDown);

    }
    public void clickOnInsideTimeZone (){
        Utility.clickingOnElement(driver,InsideTimeZoneSelectDropDown);

    }

    public void clickOnCheckBox (){
        Utility.clickingOnElement(driver,checkBox);

    }
    public void clickOnCreateBtn (){
        Utility.clickingOnElement(driver,createBtn);

    }

    public void createOffice (String officeText , String AreaText ) throws InterruptedException {


       clickOnConfiguration();clickOnOffice();clickOnOfficeName(officeText);clickOnOfficeArea (AreaText)
                ;clickOnCountrySelect();clickOnInsideCountry();clickOnCitySelectDropDon();clickOnInsideCitySelect()
                ;clickOnTimeZoneSelect();clickOnInsideTimeZone();clickOnCheckBox();clickOnCreateBtn();

    }

}
