package org.ExtraTestCases.Actions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.ExtraTestCases.Data.UserStartsSignUp;
import org.ExtraTestCases.Data.Users;
import org.ExtraTestCases.Page.ContactUsPage;

public class ContactUsAction extends UIInteractions {
    @Managed
    ContactUsPage contactUsPage;
    @Managed
    Users users;

    @Step("And the user fill the Contact Us form")
    public void fillContactUsForm(UserStartsSignUp userStartsSignUp){
        contactUsPage.getContactUsName().sendKeys(userStartsSignUp.getName());
        contactUsPage.getContactUsEmail().sendKeys(userStartsSignUp.getEmail());
        contactUsPage.getContactUsSubject().sendKeys("Automation");
        contactUsPage.getContactUsMessage().sendKeys("This is an automation test");
        contactUsPage.getUploadFile().sendKeys(Users.filePath);
    }
    @Step("And the user click on Submit button")
    public void clickOnSubmit(){
        contactUsPage.getSubmitButton().submit();
    }
    @Step("And the user press Aceptar JS button")
    public void clickOnAceptar(){
        this.getDriver().switchTo().alert().accept();
    }
    public boolean checkSuccessAfterAlert(){
        System.out.println(contactUsPage.getContactUsSuccessAfterAlert().getText());
        return contactUsPage.getContactUsSuccessAfterAlert().isVisible();
    }
}
