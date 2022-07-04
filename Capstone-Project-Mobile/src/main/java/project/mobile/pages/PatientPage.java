package project.mobile.pages;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import project.mobile.base.BasePageObject;

public class PatientPage extends BasePageObject {

    By patientButton(){
        return MobileBy.AccessibilityId("Patient");
    }

    By patientBackButton(){
        return MobileBy.AccessibilityId("Tombol kembali");
    }

    By updatePatientDataPage(){
        return MobileBy.AccessibilityId("Update Patient Data");
    }

    By backIcon(){
        return MobileBy.AccessibilityId("Tombol kembali");
    }

    By patientDetailButton(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"goDetailId\"])[1]");
    }

    By fieldDiagnosis(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    }

    By fieldPrescription(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    }

    By submitButton(){
        return MobileBy.AccessibilityId("Submit");
    }

    By warningOkButton(){
        return MobileBy.AccessibilityId("ok");
    }

    By noButton(){
        return MobileBy.AccessibilityId("No");
    }

    By yesButton(){
        return MobileBy.AccessibilityId("Yes");
    }

    By waitPatientPage(){
        return MobileBy.AccessibilityId("Patient");
    }

    public void clickPatientButton(){
        click(patientButton());
    }

    public void clickPatientBackButton(){
        click(patientBackButton());
    }

    public void verifyUpdatePatientDataPageDisplayed(){
        find(updatePatientDataPage());
        Assertions.assertTrue(find(updatePatientDataPage()).isDisplayed());
    }

    public void clickBackIcon(){
        click(backIcon());
    }

    public void clickPatientDetailButton(){
        click(patientDetailButton());
    }

    public void inputDiagnosis(String diagnosis) throws InterruptedException {
        swipeVertical();
        click(fieldDiagnosis());
        Thread.sleep(3000);
        clear(fieldDiagnosis());
        sendKeys(fieldDiagnosis(), diagnosis);
    }

    public void inputPrescription(String prescription) throws InterruptedException {
        find(fieldPrescription());
        click(fieldPrescription());
        Thread.sleep(3000);
        clear(fieldPrescription());
        sendKeys(fieldPrescription(), prescription);
    }

    public void tapSubmitButton(){
        click(submitButton());
    }

    public void tapOKWarningButton(){
        click(warningOkButton());
    }

    public void tapNoButton(){
        click(noButton());
    }

    public void tapYesButton(){
        click(yesButton());
    }

    public void waitVerifyPatientPageDisplayed(){
        waitUntilVisible(waitPatientPage());
        find(waitPatientPage());
        Assertions.assertTrue(find(waitPatientPage()).isDisplayed());
    }
}
