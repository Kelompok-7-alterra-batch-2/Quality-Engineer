package starter.module;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.RestRequests.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Department {

    String newDepartment,name;

    protected static String base_url = "https://capstone-project-hospital.herokuapp.com/";

    //    vv Start of Get All Departments vv
    @Step("I set an endpoint for GET All Departments")
    public String setAnEndpointForGetAllDepartments(){
        return base_url + "departments";
    }

    @Step("I request GET All Departments")
    public void requestGetAllDepartments(){
        given().when().get(setAnEndpointForGetAllDepartments());
    }

    @Step("I validate GET All Departments status code is {int}")
    public void validateGetAllDepartmentsStatusCode(int code){
        then().statusCode(equalTo(code));
    }
//    ^^ End of Get All Departments ^^
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    vv Start of Post Create Department vv
    @Step("I set an endpoint for POST new department")
    public String setPostEndpointNewDepartment(){
    return base_url + "departments";
}

    @Step("I request POST new department")
    public String getNewDepartment(){
        return this.newDepartment;
    }

    @Step("I request POST new department")
    public void requestPostNewDepartment(String name){
        JSONObject requestData = new JSONObject();
        if (name.equals("null")){
            this.name = "";
        } else if (name.equals("Pediatric")){
            this.name = "Pediatric";
        }

        requestData.put("name", this.name);

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().post(setPostEndpointNewDepartment());
    }

    @Step("I validate new department status code is {int}")
    public void validateNewDepartmentStatusCode(int code){
        SerenityRest.then().statusCode(code);
    }
//    ^^ End of Post Create Department ^^
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
