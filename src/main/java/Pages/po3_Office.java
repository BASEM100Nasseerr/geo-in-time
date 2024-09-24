package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class po3_Office {

    private final WebDriver driver ;
    private final By addButton =By.cssSelector("[role=\"img\"]");
    private final By OfficeNameField=By.cssSelector("[formcontrolname=\"name\"]");
    private final By OfficeAreaField=By.cssSelector("[formcontrolname=\"area\"]");
    //private final By OfficeManagerField=By.id("mat-input-5");
    private final By countrySelectDropDown=By.id("mat-select-10");
    private final By InsideCountrySelectDropDown=By.id("");
    private final By citySelectDropDon=By.id("mat-select-12");
    private final By InsideCitySelectDropDon=By.id("");
    private final By timeZoneSelectDropDown=By.id("mat-select-14");
    private final By InsideTimeZoneSelectDropDown=By.id("");
    private final By checkBox=By.xpath("(//span[@class=\"mat-checkbox-inner-container\"])[1]");
    private final By createBtn=By.xpath("(//span[@class=\"mat-button-wrapper\"])[28]");

    public po3_Office(WebDriver driver) {
        this.driver = driver;
    }



}
