package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.module.Department;

public class DepartmentStep {

    public String newDepartment;

    @Steps
    Department department;

    @Given("I set an endpoint for GET All Departments")
    public void iSetAnEndpointForGETAllDepartments() {
        department.setAnEndpointForGetAllDepartments();
    }

    @When("I request GET All Departments")
    public void iRequestGETAllDepartments() {
        department.requestGetAllDepartments();
    }

    @Then("I validate GET All Departments status code is {int}")
    public void iValidateGETAllDepartmentsStatusCodeIs(int code) {
        department.validateGetAllDepartmentsStatusCode(code);
    }

    @Given("I set an endpoint for POST new department with {string}")
    public void iSetAnEndpointForPOSTNewDepartmentWith(String name) {
        department.requestPostNewDepartment(name);
    }

    @When("I request POST new department")
    public void iRequestPOSTNewDepartment() {
        this.newDepartment = department.getNewDepartment();
    }

    @Then("I validate new department status code is {int}")
    public void iValidateNewDepartmentStatusCodeIsStatus_code(int code) {
        department.validateNewDepartmentStatusCode(code);
    }
}
