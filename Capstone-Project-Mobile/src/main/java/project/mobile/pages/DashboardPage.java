package project.mobile.pages;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import project.mobile.base.BasePageObject;

public class DashboardPage extends BasePageObject {

    By dashboardPage(){
        return MobileBy.AccessibilityId("Care Hospital");
    }

    By patientPage(){
        return MobileBy.AccessibilityId("Patient");
    }

    By finishedConsultationPatientPage(){
        return MobileBy.AccessibilityId("Finished Consultation Patient");
    }

    By dashboardDoctorName(){
        return MobileBy.AccessibilityId("Dr. Oscar Oktorian");
    }

    By dashboardDate(){
        return MobileBy.AccessibilityId("July, 19 2022");
    }

    By dashboardTotalAppointment(){
        return MobileBy.AccessibilityId("2 Appointments");
    }

    By finishedPatientPage(){
        return MobileBy.AccessibilityId("Finished Patient Data");
    }

    By sidebarButton(){
        return MobileBy.AccessibilityId("Open navigation menu");
    }

    By patientIcon(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"goDetailId\"])[1]");
    }

    By finishedPatientIcon(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"goDetailId\"])[3]");
    }

    By seeMorePatientButton(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"See More\"])[1]");
    }

    By seeMoreFinishedConsultationButton(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"See More\"])[2]");
    }

    By backIcon(){
        return MobileBy.AccessibilityId("Tombol kembali");
    }

    By dashboardButton(){
        return MobileBy.AccessibilityId("Dashboard");
    }

    By patientButton(){
        return MobileBy.AccessibilityId("Patient");
    }

    By logOutButton(){
        return MobileBy.AccessibilityId("Log Out");
    }

    public void verifyDashboardPageDisplayed(){
        Assertions.assertTrue(find(dashboardPage()).isDisplayed());
    }

    public void verifyPatientPageDisplayed(){
        Assertions.assertTrue(find(patientPage()).isDisplayed());
    }

    public void clickSidebarButton(){
        click(sidebarButton());
    }

    public void clickDashboardButton(){
        click(dashboardButton());
    }

    public void clickPatientButton(){
        click(patientButton());
    }

    public void clickPatientIcon(){
        click(patientIcon());
    }

    public void clickLogOutButton(){
        click(logOutButton());
    }

    public void clickSeeMorePatientButton(){
        click(seeMorePatientButton());
    }

    public void clickBackIcon(){
        click(backIcon());
    }

    public void clickFinishedPatientIcon(){
        click(finishedPatientIcon());
    }

    public void verifyFinishedPatientPageDisplayed(){
        Assertions.assertTrue(find(finishedPatientPage()).isDisplayed());
    }

    public void clickSeeMoreFinishedConsultationButton(){
        click(seeMoreFinishedConsultationButton());
    }

    public void verifyFinishedConsultationPatientPageDisplayed(){
        Assertions.assertTrue(find(finishedConsultationPatientPage()).isDisplayed());
    }

    public void verifyDoctorNameOnDashboardPageIsCorrect(){
        Assertions.assertTrue(find(dashboardDoctorName()).isDisplayed());
    }

    public void verifyDateOnDashboardPageIsCorrect(){
        Assertions.assertTrue(find(dashboardDate()).isDisplayed());
    }

    public void verifyTotalAppointmentOnDashboardPageIsCorrect(){
        Assertions.assertTrue(find(dashboardTotalAppointment()).isDisplayed());
    }
}
