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

    By sidebarButton(){
        return MobileBy.AccessibilityId("Open navigation menu");
    }

    By dashboardButton(){
        return MobileBy.AccessibilityId("Dashboard");
    }

    By patientButton(){
        return MobileBy.AccessibilityId("Patient");
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
}
