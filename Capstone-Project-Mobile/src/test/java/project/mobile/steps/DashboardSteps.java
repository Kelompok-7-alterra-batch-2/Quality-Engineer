package project.mobile.steps;

import io.cucumber.java.en.And;
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
//      patientPage.clickPatientBackButton();
    }

    @And("I click < icon on Update Patient Data form")
    public void iClickIconOnUpdatePatientDataForm() {
        patientPage.clickBackIcon();
    }

    @When("I click see more > button on Patients Today")
    public void iClickSeeMoreButtonOnPatientsToday() {
        dashboardPage.clickSeeMorePatientButton();
    }

    @Then("I am on patient page")
    public void iAmOnPatientPage() {
        dashboardPage.verifyPatientPageDisplayed();
    }

    @And("I click < icon on Patient Page")
    public void iClickIconOnPatientPage() {
        dashboardPage.clickBackIcon();
    }

    @When("I click > icon on Finished Patients list")
    public void iClickIconOnFinishedPatientsList() {
        dashboardPage.clickFinishedPatientIcon();
    }

    @Then("I am on Finished Patients Data page")
    public void iAmOnFinishedPatientsDataPage() {
        dashboardPage.verifyFinishedPatientPageDisplayed();
    }

    @And("I click < icon on Finished Patients Data form")
    public void iClickIconOnFinishedPatientsDataForm() {
        dashboardPage.clickBackIcon();
    }

    @When("I click see more > button on Finished Consultation")
    public void iClickSeeMoreButtonOnFinishedConsultation() {
        dashboardPage.clickSeeMoreFinishedConsultationButton();
    }

    @Then("I am on Finished Consultation Patient page")
    public void iAmOnFinishedConsultationPatientPage() {
        dashboardPage.verifyFinishedConsultationPatientPageDisplayed();
    }

    @And("I click < icon on Finished Consultation Patient Page")
    public void iClickIconOnFinishedConsultationPatientPage() {
        dashboardPage.clickBackIcon();
    }

    @Then("I validate doctor name on dashboard page is correct")
    public void iValidateDoctorNameOnDashboardPageIsCorrect() {
        dashboardPage.verifyDoctorNameOnDashboardPageIsCorrect();
    }

    @Then("I validate date on dashboard page is correct")
    public void iValidateDateOnDashboardPageIsCorrect() {
        dashboardPage.verifyDateOnDashboardPageIsCorrect();
    }

    @Then("I validate total appointments on dashboard page is correct")
    public void iValidateTotalAppointmentsOnDashboardPageIsCorrect() {
        dashboardPage.verifyTotalAppointmentOnDashboardPageIsCorrect();
    }
}
