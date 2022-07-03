package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DashboardPage;
import starter.pages.DoctorPage;

public class DoctorSteps {

    @Steps
    DashboardPage dashboardPage;

    @Steps
    DoctorPage doctorPage;

    @Given("I'am at the dashboard page")
    public void iAmAtTheDashboardPage() {
        dashboardPage.openUrl();
        dashboardPage.validateOnDashboardPage();
    }

    @And("I click menu doctor")
    public void iClickMenuDoctor() {
        dashboardPage.clickMenuDoctorButton();
    }

    @When("I click Add New Doctor")
    public void iClickAddNewDoctor() {
        doctorPage.clickAddNewDoctorButton();
    }

    @And("I input valid data doctor and click submit")
    public void iInputValidDataDoctorAndClickSubmit() {
        doctorPage.inputDoctorNID();
        doctorPage.inputDoctorName();
        doctorPage.inputDateOfBirth();
        doctorPage.clickDoctorDepartmentDropdown();
        doctorPage.clickDoctorDepartmentOption();
        doctorPage.inputDoctorEmail();
        doctorPage.inputDoctorPassword();
        doctorPage.inputDoctorPhoneNumber();
        doctorPage.clickSubmitButton();
    }

    @Then("I get New Doctor has been added result")
    public void iGetNewDoctorHasBeenAddedResult() throws InterruptedException {
        doctorPage.newDoctorAdded();
    }

    @Then("I click new doctor form x button")
    public void iClickNewDoctorFormXButton() {
        doctorPage.clickNewDoctorXButton();
    }

    @When("I click Edit Doctor button")
    public void iClickEditDoctorButton() {
        doctorPage.clickEditDoctorButton();
    }

    @And("I change doctor data")
    public void iChangeDoctorData() {
        doctorPage.editDoctorPhoneNumber();
        doctorPage.clickSubmitButton();
    }

    @Then("I get Edit Doctor has been added result")
    public void iGetEditDoctorHasBeenAddedResult() {
        doctorPage.editPatientAdded();
    }

    @Then("I click Edit Doctor form x button")
    public void iClickEditDoctorFormXButton() {
        doctorPage.clickEditDoctorXButton();
    }

    @When("I click Delete Doctor icon")
    public void iClickDeleteDoctorButton() {
        doctorPage.clickDeleteDoctorIcon();
    }

    @And("I click Delete button for Delete Doctor Message")
    public void iClickDeleteDoctorFormDeleteButton() {
        doctorPage.clickDeleteDoctorButton();
    }

    @Then("I validate Doctor data is gone")
    public void iValidateDoctorDataIsGone() {
        doctorPage.deleteDoctorSuccess();
    }

    @When("I click the Delete Doctor icon")
    public void iClickTheDeleteDoctorIcon() {
        doctorPage.clickTheDeleteDoctorIcon();
    }

    @Then("I click Cancel button for Delete Doctor Message")
    public void iClickCancelButtonForDeleteDoctorMessage() {
        doctorPage.clickTheCancelDeleteDoctorButton();
    }

    @When("I input doctor NID and click search")
    public void iInputDoctorNIDAndClickSearch() {
        doctorPage.inputSearchDoctorNID();
        doctorPage.clickSearchButton();
    }

    @Then("I validate search by doctor NID")
    public void iValidateSearchByDoctorNID() {
        doctorPage.validateDoctorNIDSearchResult();
    }

    @When("I input doctor department and click search")
    public void iInputDoctorDepartmentAndClickSearch() {
        doctorPage.inputSearchDoctorDepartment();
        doctorPage.clickSearchButton();
    }

    @Then("I validate search by doctor Department")
    public void iValidateSearchByDoctorDepartment() {
        doctorPage.validateDoctorDepartmentSearchResult();
    }

    @When("I input doctor name and click search")
    public void iInputDoctorNameAndClickSearch() {
        doctorPage.inputSearchDoctorName();
        doctorPage.clickSearchButton();
    }

    @Then("I validate search by doctor name")
    public void iValidateSearchByDoctorName() {
        doctorPage.validateDoctorNameSearchResult();
    }

    @When("I input doctor phone number and click search")
    public void iInputDoctorPhoneNumberAndClickSearch() {
        doctorPage.inputSearchDoctorPhoneNumber();
        doctorPage.clickSearchButton();
    }

    @Then("I validate search by doctor phone number")
    public void iValidateSearchByDoctorPhoneNumber() {
        doctorPage.validateDoctorPhoneNumberSearchResult();
    }

    @When("I click doctor department filter dropdown")
    public void iClickDoctorDepartmentFilterDropdown() {
        doctorPage.clickFilterDropdown();
    }

    @And("I click general menu")
    public void iClickDoctorGeneral() {
        doctorPage.clickGeneralMenu();
    }

    @Then("I validate doctor list only show general department doctor")
    public void iValidateDoctorListOnlyShowGeneralDepartmentDoctor() {
        doctorPage.validateGeneralDoctor();
    }

    @And("I click neurology menu")
    public void iClickNeurologyMenu() {
        doctorPage.clickNeurologyMenu();
    }

    @Then("I validate doctor list only show neurology department doctor")
    public void iValidateDoctorListOnlyShowNeurologyDepartmentDoctor() {
        doctorPage.validateNeurologyDoctor();
    }

    @And("I click cardiology menu")
    public void iClickCardiologyMenu() {
        doctorPage.clickCardiologyMenu();
    }

    @Then("I validate doctor list only show cardiology department doctor")
    public void iValidateDoctorListOnlyShowCardiologyDepartmentDoctor() {
        doctorPage.validateCardiologyDoctor();
    }

    @And("I click pediatric menu")
    public void iClickPediatricMenu() {
        doctorPage.clickPediatricMenu();
    }

    @Then("I validate doctor list only show pediatric department doctor")
    public void iValidateDoctorListOnlyShowPediatricDepartmentDoctor() {
        doctorPage.validatePediatricDoctor();
    }

    @And("I click gynecology menu")
    public void iClickGynecologyMenu() {
        doctorPage.clickGynecologyMenu();
    }

    @Then("I validate doctor list only show gynecology department doctor")
    public void iValidateDoctorListOnlyShowGynecologyDepartmentDoctor() {
        doctorPage.validateGynecologyDoctor();
    }
}
