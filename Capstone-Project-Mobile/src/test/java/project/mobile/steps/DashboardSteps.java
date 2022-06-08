package project.mobile.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.mobile.pages.DashboardPage;
import project.mobile.pages.PatientPage;

public class DashboardSteps {

    DashboardPage dashboardPage = new DashboardPage();
    PatientPage patientPage = new PatientPage();

    @Given("I am at the Dashboard page")
    public void iAmAtTheDashboardPage() {
        dashboardPage.verifyDashboardPageDisplayed();
    }

    @When("I click > icon on Patients Today list")
    public void iClickIconOnPatientsTodayList() {
        dashboardPage.clickPatientIcon();
    }

    @Then("I am on update patient data page")
    public void iAmOnUpdatePatientDataPage() {
        patientPage.verifyUpdatePatientDataPageDisplayed();
        patientPage.clickBackIcon();
        patientPage.clickPatientBackButton();
    }
}
