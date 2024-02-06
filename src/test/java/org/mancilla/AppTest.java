package org.mancilla;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mancilla.Actions.LoginAction;
import org.mancilla.Actions.SignUpAction;
import org.mancilla.Data.UserEndsSignUp;
import org.mancilla.Data.UserStartsSignUp;
import org.mancilla.Data.Users;
import org.mancilla.Page.LoginPage;
import org.mancilla.Page.SignUpPage;
import org.openqa.selenium.By;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        /* --Disabled block since the next text will need the current user created--
        signUpAction.clickDeleteAccount();

        Serenity.reportThat("Then I validate that the account has been deleted",
                () -> assertThat(signUpAction.checkDeletedAccountMessageIsVisible()));

        signUpAction.clickContinueButtonAftersDeletedAccount();
*/

    }
    @Disabled("Disabled since it's just to delete a lot of accounts")
    @Test
    public void deleteExcessiveAccounts(){

        List<UserStartsSignUp> lista = new ArrayList<>(Arrays.asList(userStartsSignUp84,userStartsSignUp85,userStartsSignUp86,userStartsSignUp87,userStartsSignUp88,userStartsSignUp89,userStartsSignUp90,userStartsSignUp91,userStartsSignUp92,userStartsSignUp93,userStartsSignUp94,userStartsSignUp95,userStartsSignUp96,userStartsSignUp97,userStartsSignUp98,userStartsSignUp99,userStartsSignUp100));
        int position = 0;
        loginAction.accessToThePage();

        loginAction.clickSignUpButton();

        for (int i = position; i < lista.size(); i++) {
            loginPage.getLoginEmail().sendKeys(lista.get(i).getEmail());
            loginPage.getLoginPassword().sendKeys("admin");
            loginPage.clickLoginButton().click();

            while (loginPage.getLoginError().isCurrentlyVisible()) {
                position = i;
                if (loginPage.getLoginEmail().getAttribute("value").isEmpty()) {
                    position++;
                    loginPage.getLoginEmail().sendKeys(lista.get(position).getEmail());
                    loginPage.getLoginPassword().sendKeys("admin");
                    loginPage.clickLoginButton().click();
                    i = position;
                } else {
                    loginPage.getLoginEmail().clear();
                    loginPage.getLoginPassword().clear();
                    position++;
                    loginPage.getLoginEmail().sendKeys(lista.get(position).getEmail());
                    loginPage.getLoginPassword().sendKeys("admin");
                    loginPage.clickLoginButton().click();
                    i = position;
                }
            }


            signUpAction.clickDeleteAccount();
            signUpAction.clickContinueButtonAftersDeletedAccount();
            loginAction.clickSignUpButton();

        }
    }
    @Test
    public void usersCanLogOut(){
        loginAction.accessToThePage();
        Serenity.reportThat("Then I validate that HomePage is visible",
                ()-> assertThat(loginAction.checkHomePageIsVisible()));
        loginAction.clickSignUpButton();
        Serenity.reportThat("Then I validate that HomePage is visible",
                ()-> assertThat(loginAction.checkLoginAccountLabelIsVisible()));
        loginAction.logIn(userLogin);
        Serenity.reportThat("Then I validate that Logged oin as: user is visible",
                ()-> assertThat(signUpAction.loginAsIsVisible()));
        signUpAction.clickOnLogOut();
        Serenity.reportThat("Then I validate that HomePage is visible after loggin out",
                ()-> assertThat(loginAction.checkLoginAccountLabelIsVisible()));
    }


}
