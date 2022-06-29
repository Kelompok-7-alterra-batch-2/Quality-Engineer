package starter.module;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import static net.serenitybdd.rest.RestRequests.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class Admin {

    String newAdmin,updateAdmin,updateNonExistingAdmin,name,dob,password,email;

    protected static String base_url = "https://capstone-project-hospital.herokuapp.com/";

//    vv Start of Get All Users vv
    @Step("I set an endpoint for GET All Users")
    public String setAnEndpointForGetAllUsers(){
        return base_url + "admins/users";
    }

    @Step("I request GET All Users")
    public void requestGetAllUsers(){
        given().when().get(setAnEndpointForGetAllUsers());
    }

    @Step("I validate GET All Users status code is {int}")
    public void validateGetAllUsersStatusCode(int code){
        then().statusCode(equalTo(code));
    }
//    ^^ End of Get All Users ^^
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    vv Start of Get All Admins vv
    @Step("I set an endpoint for GET All Admins")
    public String setAnEndpointForGetAllAdmins(){
        return base_url + "admins";
    }

    @Step("I request GET All Admins")
    public void requestGetAllAdmins(){
        given().when().get(setAnEndpointForGetAllAdmins());
    }

    @Step("I validate GET All Admins status code is {int}")
    public void validateGetAllAdminsStatusCode(int code){
        then().statusCode(equalTo(code));
    }
//    ^^ End of Get All Admins ^^
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    vv Start of Get Existing Admin By ID vv
    @Step("I set an endpoint for GET Existing Admin By ID")
    public String setAnEndpointForGetExistingAdminByID(){
        return base_url + "admins/23";
    }

    @Step("I request GET Existing Admin By ID")
    public void requestGetExistingAdminByID(){
        given().when().get(setAnEndpointForGetExistingAdminByID());
    }

    @Step("I validate GET Existing Admin By ID status code is {int}")
    public void validateGetExistingAdminByIDStatusCode(int code){
        then().statusCode(equalTo(code));
    }
//    ^^ End of Get Existing Admin By ID ^^
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    vv Start of Get NonExisting Admin By ID vv
    @Step("I set an endpoint for GET NonExisting Admin By ID")
    public String setAnEndpointForGetNonExistingAdminByID(){
        return base_url + "admins/1";
    }

    @Step("I request GET NonExisting Admin By ID")
    public void requestGetNonExistingAdminByID(){
        given().when().get(setAnEndpointForGetNonExistingAdminByID());
    }

    @Step("I validate GET NonExisting Admin By ID status code is {int}")
    public void validateGetNonExistingAdminByIDStatusCode(int code){
        then().statusCode(equalTo(code));
    }
//    ^^ End of Get NonExisting Admin By ID ^^
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    vv Start of Post Create Admin vv
    @Step("I set an endpoint for POST new admin")
    public String setPostEndpointNewAdmin(){
        return base_url + "admins";
    }

    @Step("I request POST new admin")
    public String getNewAdmin(){
        return this.newAdmin;
    }

    @Step("I request POST new admin")
    public void requestPostNewAdmin(String name, String dob, String password, String email){
        JSONObject requestData = new JSONObject();
        if (name.equals("null")){
            this.name = "";
        } else if (name.equals("kaka")){
            this.name = "kaka";
        }

        if (dob.equals("null")){
            this.dob = "";
        } else if (dob.equals("2002-06-07")){
            this.dob = "2002-06-07";
        }

        if (password.equals("null")){
            this.password = "";
        } else if (password.equals("1234")){
            this.password = "1234";
        }

        if (email.equals("null")){
            this.email = "";
        } else if (email.equals("mail@gmail.com")){
            this.email = "mail@gmail.com";
        }

        requestData.put("name", this.name);
        requestData.put("dob", this.dob);
        requestData.put("password", this.password);
        requestData.put("email", this.email);

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().post(setPostEndpointNewAdmin());
    }

    @Step("I validate new admin status code is {int}")
    public void validateNewAdminStatusCode(int code){
        SerenityRest.then().statusCode(code);
    }
//    ^^ End of Post Create Admin ^^
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    vv Start of Put Update Existing Admin vv
    @Step("I set an endpoint for PUT update Admin")
    public String setPutEndpointUpdateAdmin(){
        return base_url + "admins/23";
    }

    @Step("I request PUT update Admin")
    public String getUpdateAdmin(){
        return this.updateAdmin;
    }

    @Step("I request PUT update Admin")
    public void requestPutUpdateAdmin(String name, String dob, String password, String email){
        JSONObject requestData = new JSONObject();
        if (name.equals("null")){
            this.name = "";
        } else if (name.equals("adik")){
            this.name = "adik";
        }

        if (dob.equals("null")){
            this.dob = "";
        } else if (dob.equals("2002-06-08")){
            this.dob = "2002-06-08";
        }

        if (password.equals("null")){
            this.password = "";
        } else if (password.equals("5678")){
            this.password = "5678";
        }

        if (email.equals("null")){
            this.email = "";
        } else if (email.equals("mail@yahoo.com")){
            this.email = "mail@yahoo.com";
        }

        requestData.put("name", this.name);
        requestData.put("dob", this.dob);
        requestData.put("password", this.password);
        requestData.put("email", this.email);

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().put(setPutEndpointUpdateAdmin());
    }

    @Step("I validate update Admin status code is {int}")
    public void validateUpdateAdminStatusCode(int code){
        SerenityRest.then().statusCode(code);
    }
//    ^^ End of Put Update Existing Admin ^^
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    vv Start of Put Update NonExisting Admin vv
    @Step("I set an endpoint for PUT update NonExisting Admin")
    public String setPutEndpointUpdateNonExistingAdmin(){
        return base_url + "admins/1";
    }

    @Step("I request PUT update NonExisting Admin")
    public String getUpdateNonExistingAdmin(){
        return this.updateNonExistingAdmin;
    }

    @Step("I request PUT update NonExisting Admin")
    public void requestPutUpdateNonExistingAdmin(String name, String dob, String password, String email){
        JSONObject requestData = new JSONObject();
        if (name.equals("null")){
            this.name = "";
        } else if (name.equals("adik")){
            this.name = "adik";
        }

        if (dob.equals("null")){
            this.dob = "";
        } else if (dob.equals("2002-06-08")){
            this.dob = "2002-06-08";
        }

        if (password.equals("null")){
            this.password = "";
        } else if (password.equals("5678")){
            this.password = "5678";
        }

        if (email.equals("null")){
            this.email = "";
        } else if (email.equals("mail@yahoo.com")){
            this.email = "mail@yahoo.com";
        }

        requestData.put("name", this.name);
        requestData.put("dob", this.dob);
        requestData.put("password", this.password);
        requestData.put("email", this.email);

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().put(setPutEndpointUpdateNonExistingAdmin());
    }

    @Step("I validate update NonExisting Admin status code is {int}")
    public void validateUpdateNonExistingAdminStatusCode(int code){
        SerenityRest.then().statusCode(code);
    }
//    ^^ End of Put Update NonExisting Admin ^^
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    vv Start of Delete Existing Admin By ID vv
    @Step("I set an endpoint for DELETE Existing Admin By ID")
    public String setAnEndpointForDeleteExistingAdminByID(){
        return base_url + "admins/91";
    }

    @Step("I request DELETE Existing Admin By ID")
    public void requestDeleteExistingAdminByID(){
        given().when().delete(setAnEndpointForDeleteExistingAdminByID());
    }

    @Step("I validate DELETE Existing Admin By ID status code is {int}")
    public void validateDeleteExistingAdminByIDStatusCode(int code){
        then().statusCode(equalTo(code));
    }
//    ^^ End of Delete Existing Admin By ID ^^
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    vv Start of Delete NonExisting Admin By ID vv
    @Step("I set an endpoint for DELETE NonExisting Admin By ID")
    public String setAnEndpointForDeleteNonExistingAdminByID(){
        return base_url + "admins/1";
    }

    @Step("I request DELETE NonExisting Admin By ID")
    public void requestDeleteNonExistingAdminByID(){
        given().when().delete(setAnEndpointForDeleteNonExistingAdminByID());
    }

    @Step("I validate DELETE NonExisting Admin By ID status code is {int}")
    public void validateDeleteNonExistingAdminByIDStatusCode(int code){
        then().statusCode(equalTo(code));
    }
//    ^^ End of Delete NonExisting Admin By ID ^^
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
