package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.PatientPage;

public class PatientSteps {

    @Steps
    DashboardPage dashboardPage;

    @Steps
    PatientPage patientPage;

    @Given("I am at the dashboard page")
    public void iAmAtTheDashboardPage() {
        dashboardPage.openUrl();
        dashboardPage.validateOnDashboardPage();
    }

    @And("I click menu patient")
    public void iClickMenuPatient() {
        dashboardPage.clickMenuPatientButton();
    }

    @When("I click Add New Patient")
    public void iClickAddNewPatient() {
        patientPage.clickAddNewPatientButton();
    }

    @And("I input valid data patient and click submit")
    public void iInputValidDataPatientAndClickSubmit() {
        patientPage.inputName();
        patientPage.inputDateOfBirth();
        patientPage.clickGenderType();
        patientPage.inputPhoneNumber();
        patientPage.clickBlodeTypeDropdown();
        patientPage.clickBlodeTypeOption();
        patientPage.inputCity();
        patientPage.inputAddress();
        patientPage.clickSubmitButton();
    }

    @Then("I get New Patient has been added result")
    public void iGetNewPatientHasBeenAddedResult() {
        patientPage.newPatientAdded();
    }

    @When("I click Edit Patient button")
    public void iClickEditPatientButton() {
        patientPage.clickEditPatientButton();
    }

    @And("I change patient data")
    public void iChangePatientData() {
        patientPage.clickBlodeTypeDropdown();
        patientPage.clickBlodeTypeOption();
        patientPage.clickSubmitButton();
    }

    @Then("I get Edit Patient has been added result")
    public void iGetEditPatientHasBeenAddedResult() {
        patientPage.editPatientAdded();
    }

    @Then("I click x button")
    public void iClickXButton() {
        patientPage.clickXButton();
    }

    @When("I click Delete Patient button")
    public void iClickDeletePatientButton() {
        patientPage.clickDeletePatientButton();
    }

    @Then("I click Delete button")
    public void iClickDeleteButton() {
        patientPage.clickDeleteButton();
    }

    @When("I click the Delete Patient button")
    public void iClickTheDeletePatientButton() {
        patientPage.clickTheDeleteButton();
    }

    @Then("I click Cancel button")
    public void iClickCancelButton() {
        patientPage.clickCancelButton();
    }
}
