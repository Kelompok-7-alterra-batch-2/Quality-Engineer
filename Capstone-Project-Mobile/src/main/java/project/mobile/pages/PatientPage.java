package project.mobile.pages;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import project.mobile.base.BasePageObject;

public class PatientPage extends BasePageObject {

    By dashboardPage(){
        return MobileBy.AccessibilityId("Welcome,");
    }

    By sidebarPage(){
        return MobileBy.AccessibilityId("Care Hospital");
    }

    By sidebarButton(){
        return MobileBy.AccessibilityId("Open navigation menu");
    }

    By dashboardButton(){
        return MobileBy.AccessibilityId("Dashboard");
    }
    By patientButton(){
        return MobileBy.AccessibilityId("Patient");
    }

    By patientBackButton(){
        return MobileBy.AccessibilityId("Tombol kembali");
    }

    public void verifyDashboardPageDisplayed(){
        Assertions.assertTrue(find(dashboardPage()).isDisplayed());
    }

    public void verifySidebarDisplayed(){
        Assertions.assertTrue(find(sidebarPage()).isDisplayed());
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

    public void clickPatientBackButton(){
        click(patientBackButton());
    }
}
