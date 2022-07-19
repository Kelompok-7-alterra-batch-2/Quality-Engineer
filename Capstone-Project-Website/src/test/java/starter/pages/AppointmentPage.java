package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class AppointmentPage extends PageObject {

    private By appointmentButton(){
        return By.xpath("//div[contains(text(),'Appointment')]");
    }

    private By addNewAppointmentButton(){
        return By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/button[1]");
    }

    private By yesButton(){
        return By.xpath("//body/div[2]/div[3]/div[2]/button[1]");
    }

    private By nameField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
    }

    private By searchButton(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
    }

    private By patientName(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]");
    }

    private By departmentDropdownButton(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[4]/div[1]/div[1]");
    }

    private By departmentOptionButton(){
        return By.xpath("//body/div[@id='menu-department_id']/div[3]/ul[1]/li[2]");
    }

    private By appointmentDateField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/input[1]");
    }

    private By appointmentTimeField(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[3]/div[1]/div[1]/input[1]");
    }

    private By doctorDropdownButton(){
        return By.xpath("//body/div[2]/div[3]/div[2]/div[5]/div[1]/div[1]");
    }

    private By doctorOptionButton(){
        return By.xpath("///body/div[@id='menu-doctor_id']/div[3]/ul[1]/li[2]");
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

    private By nullName(){
        return By.xpath("//p[contains(text(),'Field Patient is empty or not search yet')]");
    }

    private By nullDate(){
        return By.xpath("//p[contains(text(),'Field Appointment Date is empty')]");
    }

    private By nullTime(){
        return By.xpath("//p[contains(text(),'Field Appointment Time is empty')]");
    }

    private By nullDepartment(){
        return By.xpath("//p[contains(text(),'Field Department is empty')]");
    }

    private By nullDoctor(){
        return By.xpath("//p[contains(text(),'Field Doctor is empty')]");
    }

    private By nullReason(){
        return By.xpath("//p[contains(text(),'Field Appointment Reason is empty')]");
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
    public void inputName(String name){
        $(nameField()).type(name);
        $(searchButton()).click();
        $(patientName()).click();
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
    public void inputAppointmentDate(String date){
        $(appointmentDateField()).type(date);
    }

    @Step
    public void nullAppointmentDate(){
        $(appointmentDateField()).doubleClick();
        $(appointmentDateField()).clear();
    }

    @Step
    public void inputAppointmentTime(String time){
        $(appointmentTimeField()).type(time);
    }

    @Step
    public void nullAppointmentTime(){
        $(appointmentTimeField()).doubleClick();
        $(appointmentTimeField()).clear();
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
    public void inputAppointmentReason(String reason){
        $(AppointmentReasonField()).type(reason);
    }

    @Step
    public void submitNullDate(){
        $(appointmentDateField()).doubleClick();
        $(appointmentDateField()).clear();
        to(submitButton());
        $(submitButton()).click();
    }

    @Step
    public void submitNullTime(){
        $(appointmentTimeField()).doubleClick();
        $(appointmentTimeField()).clear();
        to(submitButton());
        $(submitButton()).click();
    }

    @Step
    public void clickSubmitButton(){
        to(submitButton());
        $(submitButton()).click();
    }

    @Step
    public void newAppointmentAdded() throws InterruptedException {
        Thread.sleep(5000);
        $(validateSuccessAppointment()).isDisplayed();
    }

    @Step
    public void nullNameError() {
        to(nullName());
        $(nullName()).isDisplayed();
    }

    @Step
    public void nullDateError() {
        to(nullDate());
        $(nullDate()).isDisplayed();
    }

    @Step
    public void nullTimeError() {
        to(nullTime());
        $(nullTime()).isDisplayed();
    }

    @Step
    public void nullDepartmentError() {
        to(nullDepartment());
        $(nullDepartment()).isDisplayed();
    }

    @Step
    public void nullDoctorError() {
        to(nullDoctor());
        $(nullDoctor()).isDisplayed();
    }

    @Step
    public void nullReasonError() {
        to(nullReason());
        $(nullReason()).isDisplayed();
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
        $(AppointmentReasonField()).type(Keys.chord(Keys.CONTROL, "a",Keys.DELETE));
        $(AppointmentReasonField()).type("Heart Break");
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
    public void validateNeurologyAppointment() {
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

    @Step
    public void inputValidDataDateChange() throws InterruptedException {
        $(nameField()).type("Aldi");

        $(searchButton()).click();

        $(patientName()).waitUntilVisible();

        $(patientName()).click();

        $(appointmentTimeField()).type("0222PM");

        to(departmentDropdownButton());
        $(departmentDropdownButton()).click();

        to(departmentOptionButton());
        $(departmentOptionButton()).click();

        to(doctorDropdownButton());
        $(doctorDropdownButton()).click();

        Thread.sleep(3000);
        to(doctorOptionButton());
        $(doctorOptionButton()).click();

        $(AppointmentReasonField()).type("Demam");

        to(appointmentDateField());
        $(appointmentDateField()).type("01010001");

        to(submitButton());
        $(submitButton()).click();
    }

    @Step
    public void validateResultWithDateChange(){
//        $(validateSuccessAppointment()).waitUntilVisible();
        $(validateSuccessAppointment()).isDisplayed();
    }
}
