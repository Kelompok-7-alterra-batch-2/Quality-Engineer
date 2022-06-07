package starter.stepdefinitions;

import io.cucumber.java.en.And;
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

    @When("I click edit button")
    public void iClickEditButton() {
        dashboardPage.clickEditButton();
    }

    @Then("I get the result")
    public void iGetTheResult() {
        dashboardPage.editPopUpAppears();
    }

    @And("I click cancel")
    public void iClickCancel() {
        dashboardPage.clickCancelButton();
    }

    @When("I click delete button")
    public void iClickDeleteButton() {
        dashboardPage.clickDeleteButton();
    }

    @And("I get the popup")
    public void iGetThePopup() {
        dashboardPage.deletePopUpAppears();
    }

    @Then("I click {string} button")
    public void iClickButton(String button) {
        switch (button) {
            case "delete":
                dashboardPage.clickAgainDeleteButton();
                break;
            case "cancel":
                dashboardPage.clickAgainCancelButton();
                break;
        }
    }

    @And("I get {string}")
    public void iGet(String result) {
        switch (result) {
            case "Row has been deleted":
                dashboardPage.deleteSuccess();
                break;
            case "Appointment's Today":
                dashboardPage.cancelDelete();
                break;
        }
    }
}
