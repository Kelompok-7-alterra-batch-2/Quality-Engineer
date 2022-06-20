package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.time.Duration;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class AppointmentPage extends PageObject {

    private By appointmentButton(){
        return By.xpath("//div[contains(text(),'Appointment')]");
    }

    private By addNewAppointmentButton(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]");
    }

    private By yesButton(){
        return By.xpath("//body/div[2]/div[3]/div[2]/button[1]");
    }

    private By nameField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]");
    }

    private By departmentDropdownButton(){
        return By.id("mui-component-select-department");
    }

    private By departmentOptionButton(){
        return By.xpath("//body/div[@id='menu-department']/div[3]/ul[1]/li[2]");
    }

    private By appointmentDateField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[3]/div[1]/div[1]/input[1]");
    }

    private By appointmentTimeField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[4]/div[1]/div[1]/input[1]");
    }

    private By doctorDropdownButton(){
        return By.id("mui-component-select-doctor");
    }

    private By doctorOptionButton(){
        return By.xpath("//body/div[@id='menu-doctor']/div[3]/ul[1]/li[2]");
    }

    private By AppointmentReasonField(){
        return By.xpath("//textarea[@id='custom-input']");
    }

    private By submitButton(){
        return By.xpath("//body/div[2]/div[3]/div[3]/div[1]/button[1]");
    }

    private By validateSuccessAppointment(){
        return By.id("modal-success-description");
    }

    private By xIcon(){
        return By.xpath("//body/div[2]/div[3]/div[1]/button[1]");
    }

    private By validateAppointmentCancel(){
        return By.xpath("//h3[contains(text(),'Appointment')]");
    }

    private By editAppointmentIcon(){
        return By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/button[1]");
    }

    private By editAppointmentSubmitButton(){
        return By.xpath("//body/div[2]/div[3]/div[3]/div[1]/button[1]");
    }

    private By validateSuccessEditAppointment(){
        return By.id("modal-success-description");
    }

    private By theXIcon(){
        return By.xpath("//body/div[2]/div[3]/div[1]/button[1]");
    }

    private By validateExitEditAppointmentForm(){
        return By.xpath("//h3[contains(text(),'Appointment')]");
    }

    private By deleteAppointmentIcon(){
        return By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/button[2]");
    }

    private By deleteAppointmentButton(){
        return By.xpath("//body/div[2]/div[3]/div[1]/button[2]");
    }

    private By validateAppointmentDeleted(){
        return By.xpath("//h2[contains(text(),'Today Appointment')]");
    }

    private By theDeleteAppointmentIcon(){
        return By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/button[2]");
    }

    private By theCancelDeleteAppointmentButton(){
        return By.xpath("//body/div[2]/div[3]/div[1]/button[1]");
    }

    private By validateExitDeleteAppointmentMessage(){
        return By.xpath("//h2[contains(text(),'Today Appointment')]");
    }

    private By noButton(){
        return By.xpath("//body/div[2]/div[3]/div[2]/button[2]");
    }

    private By filterButton(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]");
    }

    private By generalMenu(){
        return By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[3]");
    }

    private By generalTitle(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[3]/div[1]/h3[1]");
    }

    private By neurologyMenu(){
        return By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[4]");
    }

    private By neurologyTitle(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[3]/div[1]/h3[1]");
    }

    private By cardiologyMenu(){
        return By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[5]");
    }

    private By cardiologyTitle(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[3]/div[1]/h3[1]");
    }

    private By pediatricMenu(){
        return By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[6]");
    }

    private By pediatricTitle(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[3]/div[1]/h3[1]");
    }

    private By gynecologyMenu(){
        return By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[7]");
    }

    private By gynecologyTitle(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[3]/div[1]/h3[1]");
    }

    /////////////////////////////////////////////////////////////////////////////

    @Step
    public void clickMenuAppointmentButton(){
        to(appointmentButton());
        $(appointmentButton()).click();
    }

    @Step
    public void clickAddNewAppointmentButton(){
        to(addNewAppointmentButton());
        $(addNewAppointmentButton()).click();
    }

    @Step
    public void clickYesButton(){
        to(yesButton());
        $(yesButton()).click();
    }

    @Step
    public void inputName(){
        $(nameField()).type("CJ");
    }

    @Step
    public void clickDepartmentDropdownButton(){
        to(departmentDropdownButton());
        $(departmentDropdownButton()).click();
    }

    @Step
    public void clickDepartmentOptionButton(){
        to(departmentOptionButton());
        $(departmentOptionButton()).click();
        Duration waitDuration = Duration.ofSeconds(5);
        getDriver().manage().timeouts().implicitlyWait(waitDuration);
    }

    @Step
    public void inputAppointmentDate(){
        $(appointmentDateField()).type("06152022");
    }

    @Step
    public void inputAppointmentTime(){
        $(appointmentTimeField()).type("0222PM");
    }

    @Step
    public void clickDoctorDropdownButton(){
        to(doctorDropdownButton());
        $(doctorDropdownButton()).click();
    }

    @Step
    public void clickDoctorOptionButton(){
        to(doctorOptionButton());
        $(doctorOptionButton()).click();
        Duration waitDuration = Duration.ofSeconds(5);
        getDriver().manage().timeouts().implicitlyWait(waitDuration);
    }

    @Step
    public void inputAppointmentReason(){
        $(AppointmentReasonField()).type("Smoke to much weed");
    }

    @Step
    public void clickSubmitButton(){
        to(submitButton());
        $(submitButton()).click();
    }

    @Step
    public void newAppointmentAdded(){
        $(validateSuccessAppointment()).isDisplayed();
    }

    @Step
    public void clickXIcon(){
        to(xIcon());
        $(xIcon()).click();
    }

    @Step
    public void newAppointmentCancel(){
        $(validateAppointmentCancel()).isDisplayed();
    }

    @Step
    public void clickEditAppointmentIcon(){
        to(editAppointmentIcon());
        $(editAppointmentIcon()).click();
    }

    @Step
    public void editAppointmentReason(){
        $(AppointmentReasonField()).click();
        $(AppointmentReasonField()).clear();
        $(AppointmentReasonField()).type("Cant Follow The Damn Train");
    }

    @Step
    public void clickEditSubmitButton(){
        to(editAppointmentSubmitButton());
        $(editAppointmentSubmitButton()).click();
    }

    @Step
    public void editAppointmentAdded(){
        $(validateSuccessEditAppointment()).isDisplayed();
    }

    @Step
    public void clickTheXIcon(){
        to(theXIcon());
        $(theXIcon()).click();
    }

    @Step
    public void exitEditAppointmentForm(){
        $(validateExitEditAppointmentForm()).isDisplayed();
    }

    @Step
    public void clickDeleteAppointmentIcon(){
        to(deleteAppointmentIcon());
        $(deleteAppointmentIcon()).click();
    }

    @Step
    public void clickDeleteAppointmentButton(){
        to(deleteAppointmentButton());
        $(deleteAppointmentButton()).click();
    }

    @Step
    public void appointmentDeleted(){
        $(deleteAppointmentButton()).waitUntilNotVisible();
        $(validateAppointmentDeleted()).isDisplayed();
    }

    @Step
    public void clickTheDeleteAppointmentIcon(){
        to(theDeleteAppointmentIcon());
        $(theDeleteAppointmentIcon()).click();
    }

    @Step
    public void clickTheCancelDeleteAppointmentButton(){
        to(theCancelDeleteAppointmentButton());
        $(theCancelDeleteAppointmentButton()).click();
    }

    @Step
    public void exitDeleteAppointmentMessage(){
        $(validateExitDeleteAppointmentMessage()).isDisplayed();
    }

    @Step
    public void clickNoButton(){
        to(noButton());
        $(noButton()).click();
    }

    @Step
    public void clickFilterDropdown(){
        to(filterButton());
        $(filterButton()).click();
    }

    @Step
    public void clickGeneralMenu(){
        to(generalMenu());
        $(generalMenu()).click();
    }

    @Step
    public void validateGeneralAppointment(){
        $(generalTitle()).waitUntilVisible();
        $(generalTitle()).isDisplayed();
    }

    @Step
    public void clickNeurologyMenu(){
        to(neurologyMenu());
        $(neurologyMenu()).click();
    }

    @Step
    public void validateNeurologyAppointment(){
        $(neurologyTitle()).waitUntilVisible();
        $(neurologyTitle()).isDisplayed();
    }

    @Step
    public void clickCardiologyMenu(){
        to(cardiologyMenu());
        $(cardiologyMenu()).click();
    }

    @Step
    public void validateCardiologyAppointment(){
        $(cardiologyTitle()).waitUntilVisible();
        $(cardiologyTitle()).isDisplayed();
    }

    @Step
    public void clickPediatricMenu(){
        to(pediatricMenu());
        $(pediatricMenu()).click();
    }

    @Step
    public void validatePediatricAppointment(){
        $(pediatricTitle()).waitUntilVisible();
        $(pediatricTitle()).isDisplayed();
    }

    @Step
    public void clickGynecologyMenu(){
        to(gynecologyMenu());
        $(gynecologyMenu()).click();
    }

    @Step
    public void validateGynecologyAppointment(){
        $(gynecologyTitle()).waitUntilVisible();
        $(gynecologyTitle()).isDisplayed();
    }
}
