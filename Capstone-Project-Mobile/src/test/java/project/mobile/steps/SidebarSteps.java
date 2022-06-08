package project.mobile.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.mobile.pages.DashboardPage;
import project.mobile.pages.PatientPage;

public class SidebarSteps {
    DashboardPage dashboardPage = new DashboardPage();
    PatientPage patientPage = new PatientPage();

    @Given("I am on Dashboard page")
    public void iAmOnDashboardPage() {
        dashboardPage.verifyDashboardPageDisplayed();
    }

    @When("I click sidebar button")
    public void iClickSidebarButton() {
        dashboardPage.clickSidebarButton();
    }

    @And("I click {string} menu")
    public void iClickMenu(String menu) {
        switch (menu) {
            case "dashboard":
                dashboardPage.clickDashboardButton();
                break;
            case "patient":
                dashboardPage.clickPatientButton();
                break;
        }
    }

    @Then("I get the {string} page")
    public void iGetThePage(String result) {
        switch (result) {
            case "dashboard page":
                dashboardPage.verifyDashboardPageDisplayed();
                break;
            case "patient page":
                dashboardPage.verifyPatientPageDisplayed();
                patientPage.clickPatientBackButton();
                break;
        }
    }
}
