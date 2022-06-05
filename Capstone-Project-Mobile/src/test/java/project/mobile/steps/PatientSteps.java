package project.mobile.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.mobile.pages.PatientPage;

public class PatientSteps {

    PatientPage patientPage = new PatientPage();

    @Given("I am on the Dashboard page")
    public void iAmOnTheDashboardPage() {
        patientPage.verifyDashboardPageDisplayed();
    }

    @When("I click the sidebar button")
    public void iClickTheSidebarButton() {
        patientPage.clickSidebarButton();
    }

    @And("I click patient sidebar menu")
    public void iClickPatientSidebarMenu() {
        patientPage.clickPatientButton();
    }

    @And("I click back button on patient page")
    public void iClickBackButtonOnPatientPage() {
        patientPage.clickPatientBackButton();
    }

    @Then("I am on sidebar menu page")
    public void iAmOnSidebarMenuPage() {
        patientPage.verifySidebarDisplayed();
        patientPage.clickDashboardButton();
    }
}
