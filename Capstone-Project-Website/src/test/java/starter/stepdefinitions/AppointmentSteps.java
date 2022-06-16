package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.AppointmentPage;

public class AppointmentSteps {

    @Steps
    AppointmentPage appointmentPage;

    @And("I click menu Appointment")
    public void iClickMenuAppointment() {
        appointmentPage.clickMenuAppointmentButton();
    }

    @When("I click Add New Appointment")
    public void iClickAddNewAppointment() {
        appointmentPage.clickAddNewAppointmentButton();
    }

    @And("I click yes button")
    public void iClickYesButton() {
        appointmentPage.clickYesButton();
    }

    @And("I input valid data Appointment and click submit")
    public void iInputValidDataAppointmentAndClickSubmit() {
        appointmentPage.inputName();
        appointmentPage.clickDepartmentDropdownButton();
        appointmentPage.clickDepartmentOptionButton();
        appointmentPage.inputAppointmentDate();
        appointmentPage.inputAppointmentTime();
        appointmentPage.clickDoctorDropdownButton();
        appointmentPage.clickDoctorOptionButton();
        appointmentPage.inputAppointmentReason();
        appointmentPage.clickSubmitButton();
    }

    @Then("I get New Appointment has been added result")
    public void iGetNewAppointmentHasBeenAddedResult() {
        appointmentPage.newAppointmentAdded();
    }

    @And("I click x icon")
    public void iClickXIcon() {
        appointmentPage.clickXIcon();
    }

    @Then("I exit from Appointment form")
    public void iExitFromAppointmentForm() {
        appointmentPage.newAppointmentCancel();
    }

    @When("I click edit Appointment icon")
    public void iClickEditAppointmentIcon() {
        appointmentPage.clickEditAppointmentIcon();
    }

    @And("I edit Appointment data and click submit")
    public void iEditAppointmentDataAndClickSubmit() {
        appointmentPage.editAppointmentReason();
        appointmentPage.clickEditSubmitButton();
    }

    @Then("I get Edit Appointment has been added result")
    public void iGetEditAppointmentHasBeenAddedResult() {
        appointmentPage.editAppointmentAdded();
    }

    @And("I click the x button")
    public void iClickTheXButton() {
        appointmentPage.clickTheXIcon();
    }

    @Then("I exit edit Appointment form")
    public void iExitEditAppointmentForm() {
        appointmentPage.exitEditAppointmentForm();
    }

    @When("I click delete Appointment icon")
    public void iClickDeleteAppointmentIcon() {
        appointmentPage.clickDeleteAppointmentIcon();
    }

    @And("I click the Appointment delete button")
    public void iClickTheDeleteButton() {
        appointmentPage.clickDeleteAppointmentButton();
    }

    @Then("I validate Appointment success deleted")
    public void iValidateAppointmentSuccessDeleted() {
        appointmentPage.appointmentDeleted();
    }

    @When("I click the delete Appointment icon")
    public void iClickTheDeleteAppointmentIcon() {
        appointmentPage.clickTheDeleteAppointmentIcon();
    }

    @And("I click the Appointment cancel button")
    public void iClickTheAppointmentCancelButton() {
        appointmentPage.clickTheCancelDeleteAppointmentButton();
    }

    @Then("I exit delete Appointment option message")
    public void iExitDeleteAppointmentOptionMessage() {
        appointmentPage.exitDeleteAppointmentMessage();
    }

    @And("I click no button")
    public void iClickNoButton() {
        appointmentPage.clickNoButton();
    }
}
