package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonTabs {


    private WebDriver driver ;
    private final By EmployeeManagement = By.cssSelector("a[test-id=\"Employees Management\"]");
    private final By allEmployee = By.cssSelector("a[test-id=\"All Employees\"]");

    private final By Team = By.cssSelector("a[test-id=\"Teams\"]");

    private final By Teams = By.cssSelector("a[test-id=\"Teams\"]");
    private final By DaysOffHolidays = By.cssSelector("a[test-id=\"Days-off & Holidays\"]");

    private final By DaysOffType = By.xpath("//span[text()='Days-off Types '] ");
    private final By HolidayCCalendar = By.xpath("//span[text()=' Holidays Calendar '] ");
    private final By AttendanceReport = By.xpath("//span[text()='Attendance Reports ']");
    private final By DailyAttendance = By.cssSelector("a[test-id=\"Daily Attendance\"]");
    private final By DailyAttendanceWorkPlan = By.xpath("");
    private final By DailyAttendanceShift = By.xpath("");
    private final By MonthlyAttendance=By.xpath("//span[text()=' Monthly Attendance Sheet ']");

    private final By MonthlyAttendanceWorkPlan = By.xpath("");
    private final By MonthlyAttendanceShift = By.xpath("");

    private final By EmployerAttendanceTracker = By.xpath("");

}
