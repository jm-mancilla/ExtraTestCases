package org.mancilla;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mancilla.Actions.LoginAction;
import org.mancilla.Actions.SignUpAction;
import org.mancilla.Page.LoginPage;
import org.mancilla.Page.SignUpPage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mancilla.Data.Users.*;

@ExtendWith(SerenityJUnit5Extension.class)
public class AppTest {
    @Managed
    LoginAction loginAction;
    @Managed
    SignUpAction signUpAction;
    @Managed
    LoginPage loginPage;
    @Managed
    SignUpPage signUpPage;

    @Test
    public void usersCanLogIn() throws InterruptedException {
        loginAction.accessToThePage();

        Serenity.reportThat("Then I validate that HomePage is visible", () ->
                assertThat(loginAction.checkHomePageIsVisible()));

        loginAction.clickSignUpButton();
        Serenity.reportThat("Then I validate that Signup form is visible", () ->
                assertThat(loginAction.checkSignUpFormIsVisible()));

        loginAction.firstsignUp(userStartsSignUp);
        signUpAction.setPassword(password);


        Serenity.reportThat("Then I validate that Name is filled",
                () -> assertThat(signUpAction.checkFieldNameIsNotNull()).isNotNull());
        Serenity.reportThat("Then I validate that Email is filled",
                () -> assertThat(signUpAction.checkFieldEmailIsNotNull()).isNotNull());


        signUpAction.finalSignUpForm(userEndsSignUp);

        Serenity.reportThat("Then I validate the the account was successfully created",
                () -> assertThat(signUpAction.checkAccountHasBeenCreated()).isEqualToIgnoringCase("ACCOUNT CREATED!"));


        signUpAction.clickContinueButtonForm();

        Serenity.reportThat("Then I validate that the user has been logged in",
                () -> assertThat(signUpAction.loginAsIsVisible()));

        signUpAction.clickDeleteAccount();

        Serenity.reportThat("Then I validate that the account has been deleted",
                () -> assertThat(signUpAction.checkDeletedAccountMessageIsVisible()));

        signUpAction.clickContinueButtonAftersDeletedAccount();


    }


}
