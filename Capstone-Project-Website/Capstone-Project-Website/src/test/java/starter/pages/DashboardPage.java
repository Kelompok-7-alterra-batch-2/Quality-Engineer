package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.actions.Scroll.to;

public class DashboardPage extends PageObject {

    private By dashboardHeader(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/h3");
    }

    private By editButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div/table/tbody/tr[1]/td[7]/button[1]");
    }

    private By cancelButton(){
        return By.xpath("/html/body/div[2]/div[3]/button");
    }

    private By cancelButtonAgain(){
        return By.xpath("/html/body/div[2]/div[3]/div/button[1]");
    }

    private By deleteButton(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div/table/tbody/tr[1]/td[7]/button[2]");
    }

    private By deleteButtonAgain(){
        return By.xpath("/html/body/div[2]/div[3]/div/button[2]");
    }

    private By editPopUp(){
        return By.id("modal-edit-title");
    }

    private By deletePopUp(){
        return By.id("modal-delete-title");
    }

    private By deleteSuccessMessage(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div/table/tbody/tr[1]/div");
    }

    private By validateCancelDelete(){
        return By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/p");
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
    public void clickEditButton(){
        to(editButton());
        $(editButton()).click();
    }

    @Step
    public void editPopUpAppears(){
        $(editPopUp()).isDisplayed();
    }

    @Step
    public void clickCancelButton(){
        to(cancelButton());
        $(cancelButton()).click();
    }

    @Step
    public void clickAgainCancelButton(){
        to(cancelButtonAgain());
        $(cancelButtonAgain()).click();
    }

    @Step
    public void clickDeleteButton(){
        to(deleteButton());
        $(deleteButton()).click();
    }

    @Step
    public void clickAgainDeleteButton(){
        to(deleteButtonAgain());
        $(deleteButtonAgain()).click();
    }

    @Step
    public void deletePopUpAppears(){
        $(deletePopUp()).isDisplayed();
    }

    @Step
    public void deleteSuccess(){
        $(deleteSuccessMessage()).isDisplayed();
    }

    @Step
    public void cancelDelete(){
        to(validateCancelDelete());
        $(validateCancelDelete()).isDisplayed();
    }
}
