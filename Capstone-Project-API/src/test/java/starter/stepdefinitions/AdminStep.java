package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.module.Admin;

public class AdminStep {

    public String newAdmin,updateAdmin,updateNonExistingAdmin;

    @Steps
    Admin admin;

    @Given("I set an endpoint for GET All Users")
    public void iSetAnEndpointForGETAllUsers() {
        admin.setAnEndpointForGetAllUsers();
    }

    @When("I request GET All Users")
    public void iRequestGETAllUsers() {
        admin.requestGetAllUsers();
    }

    @Then("I validate GET All Users status code is {int}")
    public void iValidateGETAllUsersStatusCodeIs(int code) {
        admin.validateGetAllUsersStatusCode(code);
    }

    @Given("I set an endpoint for GET All Admins")
    public void iSetAnEndpointForGETAllAdmins() {
        admin.setAnEndpointForGetAllAdmins();
    }

    @When("I request GET All Admins")
    public void iRequestGETAllAdmins() {
        admin.requestGetAllAdmins();
    }

    @Then("I validate GET All Admins status code is {int}")
    public void iValidateGETAllAdminsStatusCodeIs(int code) {
        admin.validateGetAllAdminsStatusCode(code);
    }

    @Given("I set an endpoint for GET Existing Admin By ID")
    public void iSetAnEndpointForGETExistingAdminByID() {
        admin.setAnEndpointForGetExistingAdminByID();
    }

    @When("I request GET Existing Admin By ID")
    public void iRequestGETExistingAdminByID() {
        admin.requestGetExistingAdminByID();
    }

    @Then("I validate GET Existing Admin By ID status code is {int}")
    public void iValidateGETExistingAdminByIDStatusCodeIs(int code) {
        admin.validateGetExistingAdminByIDStatusCode(code);
    }

    @Given("I set an endpoint for GET NonExisting Admin By ID")
    public void iSetAnEndpointForGETNonExistingAdminByID() {
        admin.setAnEndpointForGetNonExistingAdminByID();
    }

    @When("I request GET NonExisting Admin By ID")
    public void iRequestGETNonExistingAdminByID() {
        admin.requestGetNonExistingAdminByID();
    }

    @Then("I validate GET NonExisting Admin By ID status code is {int}")
    public void iValidateGETNonExistingAdminByIDStatusCodeIs(int code) {
        admin.validateGetNonExistingAdminByIDStatusCode(code);
    }

    @Given("I set an endpoint for POST new admin with {string},{string},{string}and{string}")
    public void iSetAnEndpointForPOSTNewAdminWithAnd(String name, String dob, String password, String email) {
        admin.requestPostNewAdmin(name, dob, password, email);
    }

    @When("I request POST new admin")
    public void iRequestPOSTNewAdmin() {
        this.newAdmin = admin.getNewAdmin();
    }

    @Then("I validate new admin status code is {int}")
    public void iValidateNewAdminStatusCodeIsStatus_code(int code) {
        admin.validateNewAdminStatusCode(code);
    }

    @Given("I set an endpoint for PUT update existing admin with {string},{string},{string}and{string}")
    public void iSetAnEndpointForPUTUpdateExistingAdminWith(String name, String dob, String password, String email) {
        admin.requestPutUpdateAdmin(name, dob, password, email);
    }

    @When("I request PUT update existing admin")
    public void iRequestPUTUpdateExistingAdmin() {
        this.updateAdmin = admin.getUpdateAdmin();
    }

    @Then("I validate update existing admin status code is {int}")
    public void iValidateUpdateExistingAdminStatusCodeIsStatus_code(int code) {
        admin.validateUpdateAdminStatusCode(code);
    }

    @Given("I set an endpoint for PUT update nonexisting admin with {string},{string},{string}and{string}")
    public void iSetAnEndpointForPUTUpdateNonexistingAdminWithAnd(String name, String dob, String password, String email) {
        admin.requestPutUpdateNonExistingAdmin(name, dob, password, email);
    }

    @When("I request PUT update nonexisting admin")
    public void iRequestPUTUpdateNonexistingAdmin() {
        this.updateNonExistingAdmin = admin.getUpdateNonExistingAdmin();
    }

    @Then("I validate update nonexisting admin status code is {int}")
    public void iValidateUpdateNonexistingAdminStatusCodeIsStatus_code(int code) {
        admin.validateUpdateNonExistingAdminStatusCode(code);
    }

    @Given("I set an endpoint for DELETE Existing Admin By ID")
    public void iSetAnEndpointForDELETEExistingAdminByID() {
        admin.setAnEndpointForDeleteExistingAdminByID();
    }

    @When("I request DELETE Existing Admin By ID")
    public void iRequestDELETEExistingAdminByID() {
        admin.requestDeleteExistingAdminByID();
    }

    @Then("I validate DELETE Existing Admin By ID status code is {int}")
    public void iValidateDELETEExistingAdminByIDStatusCodeIs(int code) {
        admin.validateDeleteExistingAdminByIDStatusCode(code);
    }

    @Given("I set an endpoint for DELETE NonExisting Admin By ID")
    public void iSetAnEndpointForDELETENonExistingAdminByID() {
        admin.setAnEndpointForDeleteNonExistingAdminByID();
    }

    @When("I request DELETE NonExisting Admin By ID")
    public void iRequestDELETENonExistingAdminByID() {
        admin.requestDeleteNonExistingAdminByID();
    }

    @Then("I validate DELETE NonExisting Admin By ID status code is {int}")
    public void iValidateDELETENonExistingAdminByIDStatusCodeIs(int code) {
        admin.validateDeleteNonExistingAdminByIDStatusCode(code);
    }
}
