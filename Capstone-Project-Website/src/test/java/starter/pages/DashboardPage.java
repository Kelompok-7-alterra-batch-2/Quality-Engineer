package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class DashboardPage extends PageObject {

    private By dashboardHeader(){
        return By.xpath("//h3[contains(text(),'Dashboard')]");
    }

    private By appointmentButton(){
        return By.xpath("//p[contains(text(),'Appoinments')]");
    }

    private By appointmentHeader(){
        return By.xpath("//h3[contains(text(),'Appointment')]");
    }

    private By doctorButton(){
        return By.xpath("//p[contains(text(),'Doctors')]");
    }

    private By doctorHeader(){
        return By.xpath("//h3[contains(text(),'Doctor')]");
    }

    private By patientSidebarButton(){
        return By.xpath("//div[contains(text(),'Patient')]");
    }

    private By doctorSidebarButton(){
        return By.xpath("//div[contains(text(),'Doctor')]");
    }

    private By date(){
        return By.xpath("//h3[contains(text(),'July 11, 2022')]");
    }

    private By patientsButton(){
        return By.xpath("//p[contains(text(),'Patients')]");
    }

    private By patientHeader(){
        return By.xpath("//h3[contains(text(),'Patient')]");
    }

    @Step
    public void openUrl(){
        open();
    }

    @Step
    public void validateOnDashboardPage(){
        $(dashboardHeader()).isDisplayed();
    }

    @Step
    public void clickAppointmentButton(){
        to(appointmentButton());
        $(appointmentButton()).click();
    }

    @Step
    public void validateOnAppointmentPage(){
        $(appointmentHeader()).isDisplayed();
    }

    @Step
    public void clickDoctorButton(){
        to(doctorButton());
        $(doctorButton()).click();
    }

    @Step
    public void validateOnDoctorPage(){
        $(doctorHeader()).isDisplayed();
    }

    @Step
    public void clickMenuPatientButton(){
        to(patientSidebarButton());
        $(patientSidebarButton()).click();
    }

    @Step
    public void clickMenuDoctorButton(){
        to(doctorSidebarButton());
        $(doctorSidebarButton()).click();
    }

    @Step
    public void validateDateOnDashboardPage(){
        $(date()).isDisplayed();
    }

    @Step
    public void clickPatientButton(){
        to(patientsButton());
        $(patientsButton()).click();
    }

    @Step
    public void validateOnPatientPage(){
        $(patientHeader()).isDisplayed();
    }
}
