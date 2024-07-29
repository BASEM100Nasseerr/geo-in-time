package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Random;

public class po2_HomePage {
    private final WebDriver driver;
    private final By trustBrowser = By.cssSelector("div button[style=\"background-color: #11e497;\"] span.mat-button-wrapper");
    private final By EmployeeManagement = By.cssSelector("a[test-id=\"Employees Management\"]");
    private final By allEmployee = By.cssSelector("a[test-id=\"All Employees\"]");
    private final By addEmployee = By.cssSelector("div button[test-id=\"addEmployeeButton\"] span [role=\"img\"]");
    private final By firstName = By.cssSelector("input[formcontrolname=\"firstName\"]");
    private final By lastName = By.cssSelector("input[formcontrolname=\"lastName\"]");
    private final By employeeTitle = By.cssSelector("input[formcontrolname=\"title\"]");
    private final By phoneNumber = By.xpath("(//div[@class=\"iti__selected-flag\"])[1]");
    private final By enetrYourNumber = By.xpath("(//input[@formcontrolname=\"number\"])[1]");
    private final By email = By.cssSelector("input[formcontrolname=\"email\"]");
    private final By password = By.cssSelector("input[formcontrolname=\"password\"]");
    private final By birthDate = By.cssSelector("input[formcontrolname=\"birthDate\"]");
    private final By hiringDate = By.cssSelector("input[formcontrolname=\"joiningDate\"]");
    //private final  By nationality = By.id("mat-select-46");
    // private final  By nationalityCountry = By.("");

    private final By gender = By.xpath("//span [@class=\"mat-select-placeholder mat-select-min-line ng-tns-c159-39 ng-star-inserted\"]");
    private final By isnideGender = By.xpath("(//span [@class=\"mat-option-text\"])[1]");
    private final By office = By.xpath("//span [@class=\"mat-select-placeholder mat-select-min-line ng-tns-c159-43 ng-star-inserted\"]");
    private final By isnideOffice = By.xpath("(//span [@class=\"mat-option-text\"])[1]");
    // private final  By Team = By.id("");
    //private final  By WorkPlan = By.id("");
    // private final  By role = By.cssSelector("");

    public po2_HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public po2_HomePage clcikOnTrust() {
        Utility.clickingOnElement(driver, By.cssSelector("div button[style=\"background-color: #11e497;\"] span.mat-button-wrapper"));
        return this;
    }

    public po2_HomePage clcikOnEmployeeManagement() {
        Utility.clickingOnElement(driver, By.cssSelector("a[test-id=\"Employees Management\"]"));
        return this;
    }

    public po2_HomePage clickOnAllEmployee() {

        Utility.clickingOnElement(driver, By.cssSelector("a[test-id=\"All Employees\"]"));
        return this;
    }

    public po2_HomePage clcikOnAddEmployee() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        Utility.clickingOnElement(driver, By.cssSelector("div button[test-id=\"addEmployeeButton\"] span [role=\"img\"]"));
        return this;
    }

    public po2_HomePage enterFirstName(String firstname) {
        Utility.sendData(driver, firstName, firstname);
        return this;
    }

    public po2_HomePage enterLastName(String lastname) {
        Utility.sendData(driver, lastName, lastname);
        return this;
    }

    public po2_HomePage title(String employeetitle) {
        Utility.sendData(driver, employeeTitle, employeetitle);
        return this;
    }

    public po2_HomePage number(String numberPhone) {

        Utility.clickingOnElement(driver, phoneNumber);
        Utility.clickingOnElement(driver, By.xpath("(//span[@class=\"iti__country-name\"])[2]"));
        Utility.sendData(driver, enetrYourNumber, numberPhone);
        return this;
    }

    public po2_HomePage enterEmail(String emailtext) {
        Utility.sendData(driver, email, emailtext);
        return this;
    }

    public po2_HomePage enterPassword(String passwordtext) {
        Utility.sendData(driver, password, passwordtext);
        return this;
    }

    public po2_HomePage enterBirthDate(String birthtext) {
        Utility.sendData(driver, birthDate, birthtext);
        return this;
    }

    public po2_HomePage enterHiringDate(String hiringtext) {
        Utility.sendData(driver, hiringDate, hiringtext);
        return this;
    }

    public po2_HomePage enterNationality() {
        //driver.findElement(nationality).click();
        return this;
    }

    // public pages.po2_HomePage selectCountry ()
    {
        // driver.findElement(nationalityCountry).click();
        //  return this ;
    }

    public po2_HomePage enterGender() {
        Utility.clickingOnElement(driver, gender);
        return this;
    }

    public po2_HomePage enterInsideGender() {
        Utility.clickingOnElement(driver, isnideGender);
        return this;
    }

    public po2_HomePage enterOffice() {
        Utility.clickingOnElement(driver, office);
        return this;
    }

    public po2_HomePage enterInsideOffice() {
        Utility.clickingOnElement(driver, isnideOffice);
        return this;
    }

    public po2_HomePage enterTeam() {
        //  driver.findElement(Team).isSelected();
        return this;
    }

    public po2_HomePage enterRole(String title) {
        // driver.findElement(role).sendKeys();
        return this;
    }

    public po2_HomePage AddEmployee() throws InterruptedException {
        return clcikOnTrust().clcikOnEmployeeManagement().clickOnAllEmployee()
                .clcikOnAddEmployee().enterFirstName("basem").enterLastName("naser").title("Acc").
                enterEmail(emaill).enterPassword("Bb$3062014").enterBirthDate("2000/02/02")
                .enterHiringDate("2024/05/05").
                number(phone).enterGender()
                .enterInsideGender().enterOffice().enterInsideOffice();
    }

    String emaill = "bnasser+" + generateRandomNumber() + "@acuanix.com";

    public static String generateRandomNumber() {
        Random randomOTP = new Random();
        int num = randomOTP.nextInt(9999);
        return String.format("%04d", num);
    }

    String phone = "0112581" + generateRandomNumber();

    public static String generateRandomPhoneNumber() {
        Random randomOTP = new Random();
        int num = randomOTP.nextInt(9999);
        return String.format("%04d", num);

    }

}
