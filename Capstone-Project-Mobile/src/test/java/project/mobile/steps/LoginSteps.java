package project.mobile.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.mobile.pages.DashboardPage;
import project.mobile.pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.verifySignInButtonDisplayed();
    }

    @When("I input {string} email")
    public void iInputEmail(String email) throws InterruptedException {
        loginPage.inputEmailLogin(email);
    }

    @And("I tap show password icon and input {string} password")
    public void iTapShowPasswordIconAndInputPassword(String password) throws InterruptedException {
        loginPage.tapShowPasswordIconAndInputPassword(password);
    }

    @And("I tap hide password icon and tap sign in button")
    public void iTapHidePasswordIconAndTapSignInButton() {
        loginPage.tapHidePasswordIconAndTapSignInButton();
    }

    @Then("I get the {string}")
    public void iGetThe(String result) throws InterruptedException {
        switch (result) {
            case "dashboard page":
                dashboardPage.verifyDashboardPageDisplayed();
                break;
            case "Please enter a valid email address":
                loginPage.getErrorInvalidEmail(result);
                break;
            case "Please enter valid password!":
                loginPage.getErrorInvalidPassword(result);
                break;
            case "Password must be at least 8 characters in length":
                loginPage.getErrorShortPassword(result);
                break;
            case "Please enter your email":
                loginPage.getErrorNullEmail(result);
                break;
            case "Please enter your password":
                loginPage.getErrorNullPassword(result);
                break;
        }
    }

    @And("I login again for next test")
    public void iLoginAgainForNextTest() throws InterruptedException {
        loginPage.loginAgain();
    }
}
