package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;

public class DashboardSteps {

    @Steps
    DashboardPage dashboardPage;
    
    @Given("I am on the dashboard page")
    public void iAmOnTheDashboardPage() {
        dashboardPage.openUrl();
        dashboardPage.validateOnDashboardPage();
    }

    @When("I click dashboard appointments button")
    public void iClickDashboardAppointmentsButton() {
        dashboardPage.clickAppointmentButton();
    }

    @Then("I get redirect to appointments page")
    public void iGetRedirectToAppointmentsPage() {
        dashboardPage.validateOnAppointmentPage();
    }

    @When("I click dashboard doctors button")
    public void iClickDashboardDoctorsButton() {
        dashboardPage.clickDoctorButton();
    }

    @Then("I get redirect to doctor page")
    public void iGetRedirectToDoctorPage() {
        dashboardPage.validateOnDoctorPage();
    }

    @Then("I validate date on dashboard page")
    public void iValidateDateOnDashboardPage() {
        dashboardPage.validateDateOnDashboardPage();
    }

    @When("I click dashboard patients button")
    public void iClickDashboardPatientsButton() {
        dashboardPage.clickPatientButton();
    }

    @Then("I get redirect to patient page")
    public void iGetRedirectToPatientPage() {
        dashboardPage.validateOnPatientPage();
    }
}
