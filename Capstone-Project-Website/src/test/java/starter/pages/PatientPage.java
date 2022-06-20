package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class PatientPage extends PageObject {

    private By addNewPatientButton(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]");
    }

    private By editPatientButton(){
        return By.xpath("//tbody/tr[3]/td[6]/button[1]");
    }

    private By nameField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]");
    }

    private By dateOfBirthField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/input[1]");
    }

    private By genderButton(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[3]/div[1]/label[1]/span[1]/input[1]");
    }

    private By phoneNumberField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[4]/div[1]/div[1]/input[1]");
    }

    private By blodeTypeDropdownButton(){
        return By.id("mui-component-select-blood_type");
    }

    private By blodeTypeOptionButton(){
        return By.xpath("//body/div[@id='menu-blood_type']/div[3]/ul[1]/li[5]");
    }

    private By cityField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[6]/div[1]/div[1]/input[1]");
    }

    private By addressField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[7]/div[1]/div[1]/input[1]");
    }

    private By submitButton(){
        return By.xpath("//body/div[2]/div[3]/div[3]/div[1]/button[1]");
    }

    private By xButton(){
        return By.xpath("//body/div[2]/div[3]/div[1]/button[1]");
    }

    private By validateSuccessPatient(){
        return By.id("modal-success-description");
    }

    private By deletePatientButton(){
        return By.xpath("//tbody/tr[3]/td[6]/button[2]");
    }

    private By deleteButton(){
        return By.xpath("//body/div[2]/div[3]/div[1]/button[2]");
    }

    private By theDeletePatientButton(){
        return By.xpath("//tbody/tr[3]/td[6]/button[2]");
    }

    private By cancelButton(){
        return By.xpath("//body/div[2]/div[3]/div[1]/button[1]");
    }

    private By patientPageTitle(){
        return By.xpath("//h3[contains(text(),'Patient')]");
    }

    private By newPatientXButton(){
        return By.xpath("//body/div[2]/div[3]/div[1]/button[1]");
    }

    private By searchField(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]");
    }

    private By patientName(){
        return By.xpath("//td[contains(text(),'Afwan Pratama')]");
    }

    private By searchButton(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]");
    }

    private By patientDateOfBirth(){
        return By.xpath("//tbody/tr[1]/td[3]");
    }

    private By patientGender(){
        return By.xpath("//tbody/tr[1]/td[4]");
    }

    private By patientBloodType(){
        return By.xpath("//td[contains(text(),'AB')]");
    }

    ///////////////////////////////////////////////////////////////////////////

    @Step
    public void clickAddNewPatientButton(){
        to(addNewPatientButton());
        $(addNewPatientButton()).click();
    }

    @Step
    public void clickEditPatientButton(){
        $(editPatientButton()).waitUntilEnabled();
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

    public void patientPageTitleDisplayed(){
        $(patientPageTitle()).isDisplayed();
    }

    @Step
    public void clickNewPatientXButton(){
        to(newPatientXButton());
        $(newPatientXButton()).click();
    }

    public void inputPatientName(){
        $(searchField()).type("Afwan Pratama");
    }

    @Step
    public void clickSearchButton() {
        to(searchButton());
        $(searchButton()).click();
    }

    public void validateSearchByPatientNameDisplayed(){
        $(patientName()).isDisplayed();
    }

    public void inputPatientDateOfBirth(){
        $(searchField()).type("2022-06-15");
    }

    public void validateSearchByPatientDateOfBirthDisplayed(){
        $(patientDateOfBirth()).isDisplayed();
    }

    public void inputPatientGender(){
        $(searchField()).type("Female");
    }

    public void validateSearchByPatientGenderDisplayed(){
        $(patientGender()).isDisplayed();
    }

    public void inputPatientBloodType(){
        $(searchField()).type("AB");
    }

    public void validateSearchByPatientBloodTypeDisplayed(){
        $(patientBloodType()).isDisplayed();
    }
}

