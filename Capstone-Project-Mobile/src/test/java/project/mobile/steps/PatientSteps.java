package project.mobile.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.mobile.pages.DashboardPage;
import project.mobile.pages.PatientPage;

public class PatientSteps {

    PatientPage patientPage = new PatientPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("I am on the Dashboard page")
    public void iAmOnTheDashboardPage() {
        dashboardPage.verifyDashboardPageDisplayed();
    }

    @When("I click the sidebar button")
    public void iClickTheSidebarButton() {
        dashboardPage.clickSidebarButton();
    }

    @And("I click patient sidebar menu")
    public void iClickPatientSidebarMenu() {
        patientPage.clickPatientButton();
    }

    @And("I click back button on patient page")
    public void iClickBackButtonOnPatientPage() {
        patientPage.clickPatientBackButton();
    }

    @Then("I am back to Dashboard page")
    public void iAmBackToDashboardPage() {
        dashboardPage.verifyDashboardPageDisplayed();
    }

    @And("I tap the > icon on Patient Page patient")
    public void iTapTheIconOnPatientPagePatient() {
        patientPage.clickPatientDetailButton();
    }

    @Then("I am on the Update Patient Data page")
    public void iAmOnTheUpdatePatientDataPage() {
        patientPage.verifyUpdatePatientDataPageDisplayed();
        patientPage.clickBackIcon();
        patientPage.clickBackIcon();
        patientPage.clickDashboardButton();
    }

    @When("I input {string} Diagnosis")
    public void iInputDiagnosis(String diagnosis) throws InterruptedException {
        patientPage.inputDiagnosis(diagnosis);
    }

    @And("I input {string} Prescription")
    public void iInputPrescription(String prescription) throws InterruptedException {
        patientPage.inputPrescription(prescription);
    }

    @And("I tap submit button")
    public void iTapSubmitButton() {
        patientPage.tapSubmitButton();
    }

    @And("I tap {string} submit button")
    public void iTapSubmitButton(String submit) {
        switch (submit) {
            case "Confirm":
                patientPage.tapSubmitButton();
                patientPage.tapYesButton();
                break;
            case "Cancel":
                patientPage.tapSubmitButton();
                patientPage.tapNoButton();
                break;
            case "Warning":
                patientPage.tapSubmitButton();
                patientPage.tapOKWarningButton();
                break;
        }
    }

    @Then("I get update patient {string}")
    public void iGetUpdatePatient(String result) {
        switch (result) {
            case "Finished Consultation":
                patientPage.waitVerifyPatientPageDisplayed();
                patientPage.clickBackIcon();
                break;
            case "Update Patient Data":
                patientPage.verifyUpdatePatientDataPageDisplayed();
                patientPage.clickBackIcon();
                patientPage.clickBackIcon();
                break;
        }
    }

    @And("I tap the search field at Patient Page")
    public void iTapTheSearchFieldAtPatientPage() {
        patientPage.clickSearchField();
    }

    @And("I input patient name and tap the search button")
    public void iInputPatientNameAndTapTheSearchButton() {
        patientPage.searchPatient();
    }

    @Then("I get result inputed patient name appear")
    public void iGetResultInputedPatientNameAppear() {
        patientPage.verifyPatientNameDisplayed();
    }

//    @And("I scroll to {string}")
//    public void iScrollTo(String bottom) {
//        patientPage.scrollAndClick(bottom);
//    }
}
