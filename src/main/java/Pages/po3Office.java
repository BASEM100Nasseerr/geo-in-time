package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class po3Office {

    private final WebDriver driver ;
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


    public po3Office clickOnAdd (){
        Utility.clickingOnElement(driver,addButton);
        return this ;
    }

    public po3Office clickOnOfficeName (String officeText){
        Utility.sendData(driver,OfficeNameField , "Adel");
        return this ;
    }
    public po3Office clickOnOfficeArea (String AreaText){
        Utility.sendData(driver,OfficeAreaField , "Nile");
        return this ;
    }

    public po3Office clickOnCountrySelect (){
        Utility.clickingOnElement(driver,countrySelectDropDown);
        return this ;
    }
    public po3Office clickOnInsideCountry (){
        Utility.clickingOnElement(driver,InsideCountrySelectDropDown);
        return this ;
    }

    public po3Office clickOnCitySelectDropDon (){
        Utility.clickingOnElement(driver,citySelectDropDon);
        return this ;
    }

    public po3Office clickOnInsideCitySelect (){
        Utility.clickingOnElement(driver,InsideCitySelectDropDon);
        return this ;
    }
    public po3Office clickOnTimeZoneSelect (){
        Utility.clickingOnElement(driver,timeZoneSelectDropDown);
        return this ;
    }
    public po3Office clickOnInsideTimeZone (){
        Utility.clickingOnElement(driver,InsideTimeZoneSelectDropDown);
        return this ;
    }

    public po3Office clickOnCheckBox (){
        Utility.clickingOnElement(driver,checkBox);
        return this ;
    }
    public po3Office clickOnCreateBtn (){
        Utility.clickingOnElement(driver,createBtn);
        return this ;
    }

    public po2_HomePage createOffice (String officeText , String AreaText ){
        clickOnOfficeName(officeText).clickOnOfficeArea (AreaText)
                .clickOnCountrySelect().clickOnInsideCountry().clickOnCitySelectDropDon().clickOnInsideCitySelect()
                .clickOnTimeZoneSelect().clickOnInsideTimeZone().clickOnCheckBox().clickOnCreateBtn();
        return new po2_HomePage(driver);

    }

}
