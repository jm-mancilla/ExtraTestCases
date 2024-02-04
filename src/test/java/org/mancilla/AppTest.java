package org.mancilla;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mancilla.Actions.LoginPageAction;
import org.mancilla.Actions.UserEndsSignUpAction;
import org.mancilla.Actions.UserStartsSignUpAction;
import org.mancilla.Data.UserStartsSignUp;
import org.mancilla.Page.LoginPage;
import org.mancilla.Page.SignUpPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mancilla.Data.Users.*;

@ExtendWith(SerenityJUnit5Extension.class)
public class AppTest
{
    @Managed
    LoginPageAction loginPageAction;
    @Managed
    UserStartsSignUpAction userStartsSignUpAction;
    @Managed
    UserEndsSignUpAction userEndsSignUpAction;
  @Managed
  LoginPage loginPage;
  @Managed
    SignUpPage signUpPage;

 @Test
  public void usersCanLogIn() throws InterruptedException {
   loginPageAction.openPage();

     Serenity.reportThat("Then I validate that HomePage is visible", ()->
              assertThat(loginPage.getHomePage().getText()).isEqualToIgnoringCase("HOME"));

     loginPage.clickOnSignUpButton().click();
     Serenity.reportThat("Then I validate that Signup form is visible", ()->
             assertThat(loginPage.signUpFormIsVisible().getText()).isEqualToIgnoringCase("New User Signup!"));

    userStartsSignUpAction.firstsignUp(userStartsSignUp);
    signUpPage.getSignUpPassword().sendKeys(password);


    Serenity.reportThat("Then I validate that Name is filled",
            ()-> assertThat(userStartsSignUp.getName()).isNotNull());
    Serenity.reportThat("Then I validate that Email is filled",
            ()-> assertThat(userStartsSignUp.getEmail()).isNotNull());



    userEndsSignUpAction.finalSignUpForm(userEndsSignUp);

    Serenity.reportThat("Then I validate the the account was successfully created",
            ()-> assertThat(signUpPage.getcreatedAccount().getText()).isEqualToIgnoringCase("ACCOUNT CREATED!"));
     System.out.println(signUpPage.getcreatedAccount().getText());

     signUpPage.getContinueButton().click();

     Serenity.reportThat("Then I validate that the user has been logged in",
             ()-> assertThat(signUpPage.getLoginAs().isVisible()));

     signUpPage.getDeleteAccount().click();

     Serenity.reportThat("Then I validate that the account has been deleted",
             ()-> assertThat(signUpPage.getDeleteAccountMessage().isVisible()));

     signUpPage.getContinueButtonAfterDeletedAccount().click();

//    TimeUnit.SECONDS.sleep(1000000000);

 }


}
