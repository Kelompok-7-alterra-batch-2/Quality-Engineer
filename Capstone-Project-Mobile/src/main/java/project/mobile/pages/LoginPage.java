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

    By fieldPasswordLogin(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    public void verifySignInButtonDisplayed(){
        Assertions.assertTrue(find(signInButton()).isDisplayed());
    }

    public void inputEmailLogin(String email) throws InterruptedException {
        click(fieldEmailLogin());
        Thread.sleep(3000);
        sendKeys(fieldEmailLogin(), email);
    }

    public void inputPassword(String password) throws InterruptedException {
        click(fieldPasswordLogin());
        Thread.sleep(3000);
        sendKeys(fieldPasswordLogin(), password);
    }

    public void tapSignInButton(){
        click(signInButton());
    }
}
