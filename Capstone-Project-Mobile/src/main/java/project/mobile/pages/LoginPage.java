package project.mobile.pages;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import project.mobile.base.BasePageObject;

public class LoginPage extends BasePageObject {

    By signInButton(){
        return MobileBy.AccessibilityId("Sign In");
    }

    By fieldEmailLogin(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    By fieldEmailLoginAgain(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    By fieldPasswordLogin(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    By fieldPasswordLoginAgain(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    By showAndHidePasswordIcon(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]/android.widget.ImageView");
    }

    By showAndHidePasswordIconAgain(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]/android.widget.ImageView");
    }

    By invalidEmail(){
        return MobileBy.AccessibilityId("Please enter a valid email address");
    }

    By invalidPassword(){
        return MobileBy.AccessibilityId("Please enter valid password!");
    }

    By shortPassword(){
        return MobileBy.AccessibilityId("Password must be at least 8 characters in length");
    }

    By nullEmail(){
        return MobileBy.AccessibilityId("Please enter your email");
    }

    By nullPassword(){
        return MobileBy.AccessibilityId("Please enter your password");
    }

    public void verifySignInButtonDisplayed(){
        Assertions.assertTrue(find(signInButton()).isDisplayed());
    }

    public void inputEmailLogin(String email) throws InterruptedException {
        click(fieldEmailLogin());
        Thread.sleep(3000);
        clear(fieldEmailLogin());
        sendKeys(fieldEmailLogin(), email);
    }

    public void tapShowPasswordIconAndInputPassword(String password) throws InterruptedException {
        click(showAndHidePasswordIcon());
        click(fieldPasswordLogin());
        Thread.sleep(3000);
        clear(fieldPasswordLogin());
        sendKeys(fieldPasswordLogin(), password);
    }

    public void tapHidePasswordIconAndTapSignInButton(){
        click(showAndHidePasswordIcon());
        click(signInButton());
    }

    public void getErrorInvalidEmail(String result){
        Assertions.assertTrue(find(invalidEmail()).isDisplayed(), result);
    }

    public void getErrorInvalidPassword(String result){
        Assertions.assertTrue(find(invalidPassword()).isDisplayed(), result);
    }

    public void getErrorShortPassword(String result){
        Assertions.assertTrue(find(shortPassword()).isDisplayed(), result);
    }

    public void getErrorNullEmail(String result) throws InterruptedException {
        Thread.sleep(3000);
        Assertions.assertTrue(find(nullEmail()).isDisplayed(), result);
    }

    public void getErrorNullPassword(String result) throws InterruptedException {
        Thread.sleep(3000);
        Assertions.assertTrue(find(nullPassword()).isDisplayed(), result);
    }

    public void loginAgain() throws InterruptedException {
        click(fieldEmailLoginAgain());
        Thread.sleep(3000);
        clear(fieldEmailLoginAgain());
        sendKeys(fieldEmailLoginAgain(), "test@gmail.com");
        click(showAndHidePasswordIconAgain());
        click(fieldPasswordLoginAgain());
        Thread.sleep(3000);
        clear(fieldPasswordLoginAgain());
        sendKeys(fieldPasswordLoginAgain(), "Test@123");
        click(showAndHidePasswordIconAgain());
        click(signInButton());
    }
}
