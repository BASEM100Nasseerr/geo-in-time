package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class po4_ProjectManager {
    private final WebDriver driver;

    private final By ProjectTracker = By.xpath("//a[text()='Project Tracker']");
    private final By AllProject = By.xpath("//a[@test-id=\"All Projects\"]");
    private final By CreateNewProject = By.xpath("(//span[@class=\"mat-button-wrapper\"])[6]");
    private final By ProjectName = By.xpath("input[formcontrolname=\"projectName\"]");
    private final By ProjectStatus = By.xpath("//span [@class=\"mat-select-placeholder mat-select-min-line ng-tns-c159-534 ng-star-inserted\"]");
    private final By chooseTheStatus = By.xpath("(//span[@class=\"mat-option-text\"])[2]");
    private final By ProjectManager = By.cssSelector("");
    private final By ChoosesProjectManager = By.cssSelector("");
    private final By ProjectStartDate = By.cssSelector("");
    private final By ProjectDueDate = By.cssSelector("");
    private final By ProjectPriority = By.xpath("//span [@class=\"mat-select-placeholder mat-select-min-line ng-tns-c159-521 ng-star-inserted\"]");
    private final By ChooseThePriority = By.xpath("(//span [@class=\"mat-option-text\"])[2]");
    private final By office = By.xpath("");
    private final By isnideOffice = By.xpath("");
    private final By Employees = By.xpath("");
    private final By isnideEmployee = By.xpath("");


    public po4_ProjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickOnProjectTracker() {
        Utility.clickingOnElement(driver, ProjectTracker);

    }

    public void ClickOnAllProject() {
        Utility.clickingOnElement(driver, AllProject);

    }

    public void ClickOnCreateNewProject() {
        Utility.clickingOnElement(driver, CreateNewProject);

    }

    public void EnterProjectName(String projectName) {
        Utility.sendData(driver, ProjectName, projectName);

    }

    public void ClickOnProjectStatus() {
        Utility.clickingOnElement(driver, ProjectStatus);

    }

    public void ClickOnchooseTheStatus() {
        Utility.clickingOnElement(driver, chooseTheStatus);

    }

    public void ClickOnProjectStartDate() {
        Utility.clickingOnElement(driver, ProjectStartDate);

    }

    public void ClickOnProjectDueDate() {
        Utility.clickingOnElement(driver, ProjectDueDate);

    }


    public void ClickOnProjectPriority() {
        Utility.clickingOnElement(driver, ProjectPriority);

    }

    public void ClickOnChooseThePriority() {
        Utility.clickingOnElement(driver, ChooseThePriority);

    }

    public void AddProject() {
        ClickOnProjectTracker();
        ClickOnAllProject();
        ClickOnCreateNewProject();
        EnterProjectName("project1")
        ;
        ClickOnProjectStatus();
        ClickOnchooseTheStatus();
        ClickOnProjectPriority();
        ClickOnChooseThePriority();

    }
}