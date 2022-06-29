package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.module.Doctor;

public class DoctorStep {

    public String newDoctor,updateAdmin,updateNonExistingAdmin;

    @Steps
    Doctor doctor;

    @Given("I set an endpoint for GET All Doctors")
    public void iSetAnEndpointForGETAllDoctors() {
        doctor.setAnEndpointForGetAllDoctors();
    }

    @When("I request GET All Doctors")
    public void iRequestGETAllDoctors() {
        doctor.requestGetAllDoctors();
    }

    @Then("I validate GET All Doctors status code is {int}")
    public void iValidateGETAllDoctorsStatusCodeIs(int code) {
        doctor.validateGetAllDoctorsStatusCode(code);
    }

    @Given("I set an endpoint for GET Existing Doctor By ID")
    public void iSetAnEndpointForGETExistingDoctorByID() {
        doctor.setAnEndpointForGetExistingDoctorByID();
    }

    @When("I request GET Existing Doctor By ID")
    public void iRequestGETExistingDoctorByID() {
        doctor.requestGetExistingDoctorByID();
    }

    @Then("I validate GET Existing Doctor By ID status code is {int}")
    public void iValidateGETExistingDoctorByIDStatusCodeIs(int code) {
        doctor.validateGetExistingDoctorByIDStatusCode(code);
    }

    @Given("I set an endpoint for GET NonExisting Doctor By ID")
    public void iSetAnEndpointForGETNonExistingDoctorByID() {
        doctor.setAnEndpointForGetNonExistingDoctorsByID();
    }

    @When("I request GET NonExisting Doctor By ID")
    public void iRequestGETNonExistingDoctorByID() {
        doctor.requestGetNonExistingDoctorsByID();
    }

    @Then("I validate GET NonExisting Doctor By ID status code is {int}")
    public void iValidateGETNonExistingDoctorByIDStatusCodeIs(int code) {
        doctor.validateGetNonExistingDoctorsByIDStatusCode(code);
    }

    @Given("I set an endpoint for POST new doctor")
    public void iSetAnEndpointForPOSTNewDoctor() {
        doctor.setPostEndpointNewDoctor();

    }

    @When("I request POST new doctor with {string},{string},{string},{string},{string},{string},{string}")
    public void iRequestPOSTNewDoctorWith(String name, String dob, String password, String email, String availableFrom, String availableTo, String department_id) throws Exception {
        doctor.requestPostNewDoctor(name, dob, password, email, availableFrom, availableTo, department_id);
    }



    @Then("I validate new doctor status code is {int}")
    public void iValidateNewDoctorStatusCodeIsStatus_code(int code) {
        doctor.validateNewDoctorStatusCode(code);
    }
}
