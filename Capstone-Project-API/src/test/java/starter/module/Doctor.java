package starter.module;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;

import java.io.File;
import java.nio.charset.StandardCharsets;

import static net.serenitybdd.rest.RestRequests.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Doctor {

    String newDoctor;
    String updateAdmin;
    String updateNonExistingAdmin;
    String name;
    String dob;
    String password;
    String email;
    String availableFrom;
    String availableTo;
    String department_id;

    protected static String base_url = "https://capstone-project-hospital.herokuapp.com/";

    //    vv Start of Get All Doctors vv
    @Step("I set an endpoint for GET All Doctors")
    public String setAnEndpointForGetAllDoctors(){
        return base_url + "doctors";
    }

    @Step("I request GET All Doctors")
    public void requestGetAllDoctors(){
        given().when().get(setAnEndpointForGetAllDoctors());
    }

    @Step("I validate GET All Doctors status code is {int}")
    public void validateGetAllDoctorsStatusCode(int code){
        then().statusCode(equalTo(code));
    }
//    ^^ End of Get All Doctors ^^
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    vv Start of Get Existing Doctors By ID vv
    @Step("I set an endpoint for GET Existing Doctor By ID")
    public String setAnEndpointForGetExistingDoctorByID(){
    return base_url + "doctors/3";
    }

    @Step("I request GET Existing Doctor By ID")
    public void requestGetExistingDoctorByID(){
        given().when().get(setAnEndpointForGetExistingDoctorByID());
    }

    @Step("I validate GET Existing Doctor By ID status code is {int}")
    public void validateGetExistingDoctorByIDStatusCode(int code){
        then().statusCode(equalTo(code));
    }
//    ^^ End of Get Existing Doctors By ID ^^
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    vv Start of Get NonExisting Doctors By ID vv
    @Step("I set an endpoint for GET NonExisting Doctors By ID")
    public String setAnEndpointForGetNonExistingDoctorsByID(){
    return base_url + "doctors/1";
    }

    @Step("I request GET NonExisting Doctors By ID")
    public void requestGetNonExistingDoctorsByID(){
        given().when().get(setAnEndpointForGetNonExistingDoctorsByID());
    }

    @Step("I validate GET NonExisting Doctors By ID status code is {int}")
    public void validateGetNonExistingDoctorsByIDStatusCode(int code){
        then().statusCode(equalTo(code));
    }
//    ^^ End of Get NonExisting Doctors By ID ^^
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    vv Start of Post Create Doctor vv
    @Step("I set an endpoint for POST new Doctor")
    public String setPostEndpointNewDoctor(){
        return base_url + "doctors";
    }

//    @Step("I request POST new Doctor")
//    public String getNewDoctor(){
//        return this.newDoctor;
//    }
//
//    @Step("I request POST new Doctor")
//    public void requestPostNewDoctor(String name, String dob, String password, String email, String availableFrom, String availableTo, String department_id){
//        JSONObject requestData = new JSONObject();
//        if (name.equals("null")){
//            this.name = "";
//        } else if (name.equals("kaka")){
//            this.name = "kaka";
//        }
//
//        if (dob.equals("null")){
//            this.dob = "";
//        } else if (dob.equals("2002-06-07")){
//            this.dob = "2002-06-07";
//        }
//
//        if (password.equals("null")){
//            this.password = "";
//        } else if (password.equals("1234")){
//            this.password = "1234";
//        }
//
//        if (email.equals("null")){
//            this.email = "";
//        } else if (email.equals("mail@gmail.com")){
//            this.email = "mail@gmail.com";
//        }
//
//        if (availableFrom.equals("null")){
//            this.availableFrom = "";
//        } else if (availableFrom.equals("12:12:12")){
//            this.availableFrom = "12:12:12";
//        }
//
//        if (availableTo.equals("null")){
//            this.availableTo = "";
//        } else if (availableTo.equals("06:06:06")){
//            this.availableTo = "06:06:06";
//        }
//
//        if (department_id.equals("null")){
//            this.department_id = "";
//        } else if (department_id.equals("1")){
//            this.department_id = 1;
//        }
//
//        requestData.put("name", this.name);
//        requestData.put("dob", this.dob);
//        requestData.put("password", this.password);
//        requestData.put("email", this.email);
//        requestData.put("availableFrom", this.availableFrom);
//        requestData.put("availableTo", this.availableTo);
//        requestData.put("department_id", this.department_id);
//
//        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
//        SerenityRest.when().post(setPostEndpointNewDoctor());
//    }

    @Step("I request POST new Doctor")
    public void requestPostNewDoctor(String name, String dob, String password, String email, String availableFrom, String availableTo, String department_id) throws Exception{
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(bodyNewDoctor(name, dob, password, email, availableFrom, availableTo, department_id))
                .when().post(setPostEndpointNewDoctor());
    }

    @Step("Build request new Doctor")
    public JSONObject bodyNewDoctor(String name, String dob, String password, String email, String availableFrom, String availableTo, String department_id){
        JSONObject body = new JSONObject();

        if (name.equals("null")){
            body.put("name", "");
        } else if (name.equals("kaka")){
            body.put("name", "kaka");
        }

        if (dob.equals("null")){
            body.put("dob", "");
        } else if (dob.equals("2002-06-07")){
            body.put("dob", "2002-06-07");
        }

        if (password.equals("null")){
            body.put("password", "");
        } else if (password.equals("1234")){
            body.put("password", "1234");
        }

        if (email.equals("null")){
            body.put("email", "");
        } else if (email.equals("mail@gmail.com")){
            body.put("email", "mail@gmail.com");
        }

        if (availableFrom.equals("null")){
            body.put("availableFrom", "");
        } else if (availableFrom.equals("12:12:12")){
            body.put("availableFrom", "12:12:12");
        }

        if (availableTo.equals("null")){
            body.put("availableTo", "");
        } else if (availableTo.equals("06:06:06")){
            body.put("availableTo", "06:06:06");
        }

        if (department_id.equals("null")){
            body.put("department_id", "");
        } else if (department_id.equals("1")){
            body.put("department_id", 1);
        }
        return body;
    }

    @Step("I validate new Doctor status code is {int}")
    public void validateNewDoctorStatusCode(int code){
        SerenityRest.then().statusCode(code);
    }
//    ^^ End of Post Create Admin ^^
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
