package TestCases;

import K12PaymentCenter.BaseTest;
import K12PaymentCenter.pages.*;
import org.testng.annotations.Test;

public class EditStudentTest extends BaseTest {
    @Test(description = "Verify the User can Edit a not verified Student.", groups = {"AddStudentGroup"}, priority = 0)
    public void testAddVerifiedStudent() throws InterruptedException {
        Login();

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getSettingsButton().click();

        SettingsPage settingsPage = new SettingsPage(driver);
        settingsPage.getStudentsButton().click();

        StudentsPage studentsPage = new StudentsPage(driver);
        studentsPage.getAddStudentButton().click();

        AddStudentPage addStudentPage = new AddStudentPage(driver);
        addStudentPage.getLastNameTextbox().click();

        addStudentPage.getLastNameTextbox().sendKeys("TEST");
        driver.hideKeyboard();

        addStudentPage.getStudentNumberTextbox().click();
        addStudentPage.getStudentNumberTextbox().sendKeys("123456");
        driver.hideKeyboard();

        addStudentPage.getSaveButton().click();
        Thread.sleep(5000);
        addStudentPage.getAddStudentSuccessOkButton().click();

        Thread.sleep(10000);
        StudentDashboardPage studentDashboardPage = new StudentDashboardPage(driver);
        studentDashboardPage.getEditStudentButton().click();
        studentDashboardPage.getEditStudentButton().click();

       // dashboardPage = new DashboardPage(driver);
       // dashboardPage.getSettingsButton().click();

      //  Thread.sleep(10000);
      //  settingsPage = new SettingsPage(driver);
       // settingsPage.getLogoutButton().click();


    }



}
