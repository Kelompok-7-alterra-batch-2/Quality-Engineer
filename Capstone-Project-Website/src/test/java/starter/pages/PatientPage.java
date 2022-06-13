package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class PatientPage extends PageObject {

    private By addNewPatientButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[1]/button");
    }

    private By editPatientButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/table/tbody/tr[4]/td[6]/button[1]");
    }

    private By nameField(){
        return By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div/div/input");
    }

    private By dateOfBirthField(){
        return By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/div/div/input");
    }

    private By genderButton(){
        return By.xpath("/html/body/div[2]/div[3]/div[2]/div[3]/div/label[1]/span[1]/input");
    }

    private By phoneNumberField(){
        return By.xpath("/html/body/div[2]/div[3]/div[2]/div[4]/div/div/input");
    }

    private By blodeTypeDropdownButton(){
        return By.id("mui-component-select-blood_type");
    }

    private By blodeTypeOptionButton(){
        return By.xpath("//*[@id=\"menu-blood_type\"]/div[3]/ul/li[5]");
    }

    private By cityField(){
        return By.xpath("/html/body/div[2]/div[3]/div[2]/div[6]/div/div/input");
    }

    private By addressField(){
        return By.xpath("/html/body/div[2]/div[3]/div[2]/div[7]/div/div/input");
    }

    private By submitButton(){
        return By.xpath("/html/body/div[2]/div[3]/div[3]/div/button");
    }

    private By xButton(){
        return By.xpath("/html/body/div[2]/div[3]/div[1]/button");
    }

    private By validateSuccessPatient(){
        return By.id("modal-success-description");
    }

    private By deletePatientButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/table/tbody/tr[6]/td[6]/button[2]");
    }

    private By deleteButton(){
        return By.xpath("/html/body/div[2]/div[3]/div/button[2]");
    }

    private By theDeletePatientButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/table/tbody/tr[4]/td[6]/button[2]");
    }

    private By cancelButton(){
        return By.xpath("/html/body/div[2]/div[3]/div/button[1]");
    }

    @Step
    public void clickAddNewPatientButton(){
        to(addNewPatientButton());
        $(addNewPatientButton()).click();
    }

    @Step
    public void clickEditPatientButton(){
        to(editPatientButton());
        $(editPatientButton()).click();
    }

    @Step
    public void inputName(){
        $(nameField()).type("CJ");
    }

    @Step
    public void inputDateOfBirth(){
        $(dateOfBirthField()).type("06132022");
    }

    @Step
    public void clickGenderType(){
        to(genderButton());
        $(genderButton()).click();
    }

    @Step
    public void inputPhoneNumber(){
        $(phoneNumberField()).type("0869696969420");
    }

    @Step
    public void clickBlodeTypeDropdown(){
        to(blodeTypeDropdownButton());
        $(blodeTypeDropdownButton()).click();
    }

    @Step
    public void clickBlodeTypeOption(){
        to(blodeTypeOptionButton());
        $(blodeTypeOptionButton()).click();
    }

    @Step
    public void inputCity(){
        $(cityField()).type("San Andreas");
    }

    @Step
    public void inputAddress(){
        $(addressField()).type("Andreas");
    }

    @Step
    public void clickSubmitButton(){
        to(submitButton());
        $(submitButton()).click();
    }

    @Step
    public void newPatientAdded(){
        $(validateSuccessPatient()).isDisplayed();
    }

    public void editPatientAdded(){
        $(validateSuccessPatient()).isDisplayed();
    }

    @Step
    public void clickXButton(){
        to(xButton());
        $(xButton()).click();
    }

    @Step
    public void clickDeletePatientButton(){
        to(deletePatientButton());
        $(deletePatientButton()).click();
    }

    @Step
    public void clickDeleteButton(){
        to(deleteButton());
        $(deleteButton()).click();
    }

    @Step
    public void clickTheDeleteButton(){
        to(theDeletePatientButton());
        $(theDeletePatientButton()).click();
    }

    @Step
    public void clickCancelButton(){
        to(cancelButton());
        $(cancelButton()).click();
    }
}
