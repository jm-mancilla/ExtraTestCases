package org.ExtraTestCases.Actions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.ExtraTestCases.Page.SignUpPage;
import org.ExtraTestCases.Data.UserEndsSignUp;

public class SignUpAction extends UIInteractions {
    @Managed
    SignUpPage signUpPage;
    @Step("And the user fill the form in order to created a new account")
    public void finalSignUpForm(UserEndsSignUp userEndsSignUp){
        signUpPage.getGender().click();
        signUpPage.getFirstName().sendKeys("");
        signUpPage.getDayPicker().click();
        signUpPage.getDayPicker().sendKeys("23");
        signUpPage.getMonthPicker().click();
        signUpPage.getMonthPicker().sendKeys("march");
        signUpPage.getYearPicker().click();
        signUpPage.getYearPicker().sendKeys("1995");
        signUpPage.getNewsletterCheckbox().click();
        signUpPage.getPartnerCheckbox().click();
        signUpPage.getMobileNumber().sendKeys("");
        signUpPage.getFirstName().sendKeys(userEndsSignUp.getFirstName());
        signUpPage.getLastName().sendKeys(userEndsSignUp.getLastName());
        signUpPage.getCompany().sendKeys(userEndsSignUp.getCompany());
        signUpPage.getAddress().sendKeys(userEndsSignUp.getAddress());
        signUpPage.getAddress2().sendKeys(userEndsSignUp.getAddress2());
        signUpPage.getMobileNumber().sendKeys("");
        signUpPage.getCountryPicker().click();
        signUpPage.getCountryPicker().sendKeys(userEndsSignUp.getCountryPicker());
        signUpPage.getState().sendKeys(userEndsSignUp.getState());
        signUpPage.getCity().sendKeys(userEndsSignUp.getCity());
        signUpPage.getZipCode().sendKeys(userEndsSignUp.getZipCode());
        signUpPage.getMobileNumber().sendKeys(userEndsSignUp.getMobileNumber());
        signUpPage.getCreateAccountButton().click();
    }
    public void setPassword(String password){
        signUpPage.getSignUpPassword().sendKeys(password);
    }
    public String checkFieldNameIsNotNull(){
        return signUpPage.getName().getText();
    } public String checkFieldEmailIsNotNull(){
        return signUpPage.getEmail().getText();
    }public String checkAccountHasBeenCreated(){
        return signUpPage.getcreatedAccount().getText();
    }
    @Step("And the user click on Continue button")
    public void clickContinueButtonForm(){
        signUpPage.getContinueButton().click();
    }
    public boolean loginAsIsVisible(){
      return signUpPage.getLoginAs().isVisible();
    }
    @Step("And the user select Delete account option")
    public void clickDeleteAccount(){
        signUpPage.getDeleteAccount().click();
    }
    public boolean checkDeletedAccountMessageIsVisible(){
      return signUpPage.getDeleteAccountMessage().isVisible();
    }
    @Step("And the user click on continue button")
    public void clickContinueButtonAftersDeletedAccount(){
        signUpPage.getContinueButtonAfterDeletedAccount().click();
    }
    @Step("And the user click on Log Out option")
    public void clickOnLogOut(){
        signUpPage.getLogOut().click();
    }
}
