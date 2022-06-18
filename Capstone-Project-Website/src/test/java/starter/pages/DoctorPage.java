package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class DoctorPage extends PageObject {

    private By addNewDoctorButton(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]");
    }

    private By doctorNameField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]");
    }

    private By doctorNIDField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/input[1]");
    }

    private By departmentDropdownButton(){
        return By.id("mui-component-select-department");
    }

    private By departmentOptionButton(){
        return By.xpath("//body/div[@id='menu-department']/div[3]/ul[1]/li[6]");
    }

    private By doctorEmailField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[4]/div[1]/div[1]/input[1]");
    }

    private By doctorPasswordField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[5]/div[1]/div[1]/input[1]");
    }

    private By doctorPhoneNumberField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[6]/div[1]/div[1]/input[1]");
    }

    private By submitButton(){
        return By.xpath("//body/div[2]/div[3]/div[3]/div[1]/button[1]");
    }

    private By validateSuccessDoctor(){
        return By.id("modal-success-description");
    }

    private By newDoctorAddedDoneButton(){
        return By.xpath("//body/div[3]/div[3]/div[2]/button[1]");
    }

    private By newDoctorXButton(){
        return By.xpath("//body/div[2]/div[3]/div[1]/button[1]");
    }

    private By editDoctorButton(){
        return By.xpath("//tbody/tr[8]/td[5]/button[1]");
    }

    private By validateSuccessEditDoctor(){
        return By.id("modal-success-description");
    }

    private By editDoctorXButton(){
        return By.xpath("//body/div[2]/div[3]/div[1]/button[1]");
    }

    private By deleteDoctorIcon(){
        return By.xpath("//tbody/tr[8]/td[5]/button[2]");
    }

    private By deleteDoctorButton(){
        return By.xpath("//body/div[2]/div[3]/div[1]/button[2]");
    }

    private By validateDoctorDeleted(){
        return By.xpath("//h3[contains(text(),'Doctor')]");
    }

    private By theDeleteDoctorIcon(){
        return By.xpath("//tbody/tr[7]/td[5]/button[2]");
    }

    private By cancelDeleteDoctorButton(){
        return By.xpath("//body/div[2]/div[3]/div[1]/button[1]");
    }

    private By searchField(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]");
    }

    private By searchButton(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]");
    }

    private By validateDoctorNID(){
        return By.xpath("//td[contains(text(),'5')]");
    }

    private By validateDoctorDepartment(){
        return By.xpath("//td[contains(text(),'neurology')]");
    }

    private By validateDoctorName(){
        return By.xpath("//td[contains(text(),'Dr. Crazy')]");
    }

    private By validateDoctorPhoneNumber(){
        return By.xpath("//td[contains(text(),'023141241')]");
    }

    ////////////////////////////////////////////////////////////////////////////

    @Step
    public void clickAddNewDoctorButton(){
        to(addNewDoctorButton());
        $(addNewDoctorButton()).click();
    }

    @Step
    public void inputDoctorName(){
        $(doctorNameField()).type("Dr.Johhny Sins");
    }

    @Step
    public void inputDoctorNID(){
        $(doctorNIDField()).type("69");
    }

    @Step
    public void clickDoctorDepartmentDropdown(){
        to(departmentDropdownButton());
        $(departmentDropdownButton()).click();
    }

    @Step
    public void clickDoctorDepartmentOption(){
        to(departmentOptionButton());
        $(departmentOptionButton()).click();
    }

    @Step
    public void inputDoctorEmail(){
        $(doctorEmailField()).type("jhnnysins@gmail.com");
    }

    @Step
    public void inputDoctorPassword(){
        $(doctorPasswordField()).type("jhnnysins69420");
    }

    @Step
    public void inputDoctorPhoneNumber(){
        $(doctorPhoneNumberField()).type("7034314200");
    }

    @Step
    public void clickSubmitButton(){
        to(submitButton());
        $(submitButton()).click();
    }

    @Step
    public void newDoctorAdded(){
        $(validateSuccessDoctor()).isDisplayed();
    }

    @Step
    public void clickNewDoctorXButton(){
        to(newDoctorXButton());
        $(newDoctorXButton()).click();
    }

    @Step
    public void clickEditDoctorButton(){
        to(editDoctorButton());
        $(editDoctorButton()).click();
    }

    @Step
    public void editDoctorPhoneNumber(){
        $(doctorPhoneNumberField()).click();
        $(doctorPhoneNumberField()).clear();
        $(doctorPhoneNumberField()).type("703431XXXX");
    }

    public void editPatientAdded(){
        $(validateSuccessEditDoctor()).isDisplayed();
    }

    @Step
    public void clickEditDoctorXButton(){
        to(editDoctorXButton());
        $(editDoctorXButton()).click();
    }

    @Step
    public void clickDeleteDoctorIcon(){
        to(deleteDoctorIcon());
        $(deleteDoctorIcon()).click();
    }

    @Step
    public void clickDeleteDoctorButton(){
        to(deleteDoctorButton());
        $(deleteDoctorButton()).click();
    }

    public void deleteDoctorSuccess(){
        $(validateDoctorDeleted()).isDisplayed();
    }

    @Step
    public void clickTheDeleteDoctorIcon(){
        to(theDeleteDoctorIcon());
        $(theDeleteDoctorIcon()).click();
    }

    @Step
    public void clickTheCancelDeleteDoctorButton(){
        to(cancelDeleteDoctorButton());
        $(cancelDeleteDoctorButton()).click();
    }

    @Step
    public void clickSearchButton(){
        to(searchButton());
        $(searchButton()).click();
    }

    public void inputSearchDoctorNID(){
        $(searchField()).type("5");
    }

    public void validateDoctorNIDSearchResult(){
        $(validateDoctorNID()).isDisplayed();
    }

    public void inputSearchDoctorDepartment(){
        $(searchField()).type("neurology");
    }

    public void validateDoctorDepartmentSearchResult(){
        $(validateDoctorDepartment()).isDisplayed();
    }

    public void inputSearchDoctorName(){
        $(searchField()).type("Dr. Crazy");
    }

    public void validateDoctorNameSearchResult(){
        $(validateDoctorName()).isDisplayed();
    }

    public void inputSearchDoctorPhoneNumber(){
        $(searchField()).type("023141241");
    }

    public void validateDoctorPhoneNumberSearchResult(){
        $(validateDoctorPhoneNumber()).isDisplayed();
    }
}