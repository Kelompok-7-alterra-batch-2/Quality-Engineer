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

    @And("I input {string} password")
    public void iInputPassword(String password) throws InterruptedException {
        loginPage.inputPassword(password);
    }

    @And("I tap sign in button")
    public void iTapSignInButton() {
        loginPage.tapSignInButton();
    }

    @Then("I get the {string}")
    public void iGetThe(String result) {
        if (result.equals("dashboard page")){
            dashboardPage.verifyDashboardPageDisplayed();
        }
    }
}
