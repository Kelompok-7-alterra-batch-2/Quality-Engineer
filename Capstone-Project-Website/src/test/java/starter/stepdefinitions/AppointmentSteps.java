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

    @And("I input {string}, {string}, {string}, {string}, {string}, {string}, and click {string}")
    public void iInputValidDataAppointmentAndClickSubmit(String name, String date, String time, String department, String doctor, String reason, String submit) {
        switch (name) {
            case "Aldi":
                appointmentPage.inputName(name);
                break;
            case "null":

                break;
        }
        switch (date) {
            case "today":
//                appointmentPage.inputAppointmentDate(date);
                break;
            case "null":
                appointmentPage.nullAppointmentDate();
                break;
        }
        switch (time) {
            case "0222PM":
                appointmentPage.inputAppointmentTime(time);
                break;
            case "null":
                appointmentPage.nullAppointmentTime();
                break;
        }
        switch (department) {
            case "general":
                appointmentPage.clickDepartmentDropdownButton();
                appointmentPage.clickDepartmentOptionButton();
                break;
            case "null":

                break;
        }
        switch (doctor) {
            case "Michael":
                appointmentPage.clickDoctorDropdownButton();
                appointmentPage.clickDoctorOptionButton();
                break;
            case "null":

                break;
        }
        switch (reason) {
            case "demam":
                appointmentPage.inputAppointmentReason(reason);
                break;
            case "null":

                break;
        }
        switch (submit) {
            case "date":
                appointmentPage.submitNullDate();
                break;
            case "time":
                appointmentPage.submitNullTime();
                break;
            case "submit":
                appointmentPage.clickSubmitButton();
                break;
        }
    }

    @Then("I get New Appointment has been added {string}")
    public void iGetNewAppointmentHasBeenAddedResult(String result) throws InterruptedException {
        switch (result) {
            case "New Appointment has been added":
                appointmentPage.newAppointmentAdded();
                break;
            case "Field Patient is empty or not search yet":
                appointmentPage.nullNameError();
                break;
            case "Field Appointment Date is empty":
                appointmentPage.nullDateError();
                break;
            case "Field Appointment Time is empty":
                appointmentPage.nullTimeError();
                break;
            case "Field Department is empty":
                appointmentPage.nullDepartmentError();
                break;
            case "Field Doctor is empty":
                appointmentPage.nullDoctorError();
                break;
            case "Field Appointment Reason is empty":
                appointmentPage.nullReasonError();
                break;
        }
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

    @When("I click Appointment Department Filter Dropdown")
    public void iClickAppointmentDepartmentDropdown() {
        appointmentPage.clickFilterDropdown();
    }

    @And("I click Appointment General")
    public void iClickAppointmentGeneral() {
        appointmentPage.clickGeneralMenu();
    }

    @Then("I validate Today Appointment only show General Department Appointment")
    public void iValidateTodayAppointmentOnlyShowGeneralDepartmentAppointment() {
        appointmentPage.validateGeneralAppointment();
    }

    @And("I click Appointment Neurology")
    public void iClickAppointmentNeurology() {
        appointmentPage.clickNeurologyMenu();
    }

    @Then("I validate Today Appointment only show Neurology Department Appointment")
    public void iValidateTodayAppointmentOnlyShowNeurologyDepartmentAppointment() {
        appointmentPage.validateNeurologyAppointment();
    }

    @And("I click Appointment Cardiology")
    public void iClickAppointmentCardiology() {
        appointmentPage.clickCardiologyMenu();
    }

    @Then("I validate Today Appointment only show Cardiology Department Appointment")
    public void iValidateTodayAppointmentOnlyShowCardiologyDepartmentAppointment() {
        appointmentPage.validateCardiologyAppointment();
    }

    @And("I click Appointment Pediatric")
    public void iClickAppointmentPediatric() {
        appointmentPage.clickPediatricMenu();
    }

    @Then("I validate Today Appointment only show Pediatric Department Appointment")
    public void iValidateTodayAppointmentOnlyShowPediatricDepartmentAppointment() {
        appointmentPage.validatePediatricAppointment();
    }

    @And("I click Appointment Gynecology")
    public void iClickAppointmentGynecology() {
        appointmentPage.clickGynecologyMenu();
    }

    @Then("I validate Today Appointment only show Gynecology Department Appointment")
    public void iValidateTodayAppointmentOnlyShowGynecologyDepartmentAppointment() {
        appointmentPage.validateGynecologyAppointment();
    }

    @And("I input valid data then change date to invalid date and click submit")
    public void iInputValidDataThenChangeDateToInvalidDateAndClickSubmit() throws InterruptedException {
        appointmentPage.inputValidDataDateChange();
    }

    @Then("I get result with date change to 01-01-1920")
    public void iGetResultWithDateChangeTo() {
        appointmentPage.validateResultWithDateChange();
    }
}
