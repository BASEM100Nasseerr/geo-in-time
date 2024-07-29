package Pages;

import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class po3_ProjectManager {
    private final WebDriver driver ;

private final By ProjectTracker = By.xpath("//span[@class=\"hide-menu\"])[8]");
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


    public po3_ProjectManager (WebDriver driver) {this.driver = driver ;}
    public po3_ProjectManager ClickOnProjectTracker ()
    {
        Utility.clickingOnElement(driver , ProjectTracker);
        return this ;
    }
    public po3_ProjectManager ClickOnAllProject ()
    {
        Utility.clickingOnElement(driver , AllProject);
        return this ;
    }
    public po3_ProjectManager ClickOnCreateNewProject ()
    {
        Utility.clickingOnElement(driver , CreateNewProject);
        return this ;
    }

    public po3_ProjectManager EnterProjectName (String projectName)
    {
        Utility.sendData(driver , ProjectName , projectName );
        return this ;
    }
    public po3_ProjectManager ClickOnProjectStatus ()
    {
        Utility.clickingOnElement(driver , ProjectStatus);
        return this ;
    }
    public po3_ProjectManager ClickOnchooseTheStatus ()
    {
        Utility.clickingOnElement(driver , chooseTheStatus);
        return this ;
    }
    public po3_ProjectManager ClickOnProjectPriority ()
    {
        Utility.clickingOnElement(driver , ProjectPriority);
        return this ;
    }
    public po3_ProjectManager ClickOnChooseThePriority ()
    {
        Utility.clickingOnElement(driver , ChooseThePriority);
        return this ;
    }
    public po3_ProjectManager AddProject ()
    {
        return ClickOnProjectTracker().ClickOnAllProject().ClickOnCreateNewProject().EnterProjectName("project1")
                .ClickOnProjectStatus().ClickOnchooseTheStatus().ClickOnProjectPriority().ClickOnChooseThePriority();
    }
}
