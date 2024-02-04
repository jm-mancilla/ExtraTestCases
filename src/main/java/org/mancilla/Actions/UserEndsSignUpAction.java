package org.mancilla.Actions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.mancilla.Data.UserEndsSignUp;
import org.mancilla.Page.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserEndsSignUpAction extends UIInteractions {
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
}
