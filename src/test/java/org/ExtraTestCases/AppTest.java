package org.ExtraTestCases;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.ExtraTestCases.Actions.LoginAction;
import org.ExtraTestCases.Data.UserStartsSignUp;
import org.ExtraTestCases.Data.Users;
import org.ExtraTestCases.Page.LoginPage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.ExtraTestCases.Actions.ContactUsAction;
import org.ExtraTestCases.Actions.SignUpAction;
import org.ExtraTestCases.Page.SignUpPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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
    @Managed
    ContactUsAction contactUsAction;

    @Disabled("Running under cucumber")
    @Test
    public void usersCanLogIn() throws InterruptedException {
        loginAction.accessToThePage();

        Serenity.reportThat("Then I validate that HomePage is visible", () ->
                assertThat(loginAction.checkHomePageIsVisible()));

        loginAction.clickSignUpButton();
        Serenity.reportThat("Then I validate that Signup form is visible", () ->
                assertThat(loginAction.checkSignUpFormIsVisible()));

        loginAction.firstsignUp(Users.userStartsSignUp);
        signUpAction.setPassword(Users.password);


        Serenity.reportThat("Then I validate that Name is filled",
                () -> assertThat(signUpAction.checkFieldNameIsNotNull()).isNotNull());
        Serenity.reportThat("Then I validate that Email is filled",
                () -> assertThat(signUpAction.checkFieldEmailIsNotNull()).isNotNull());


        signUpAction.finalSignUpForm(Users.userEndsSignUp);

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

        List<UserStartsSignUp> lista = new ArrayList<>(Arrays.asList(Users.userStartsSignUp84, Users.userStartsSignUp85, Users.userStartsSignUp86, Users.userStartsSignUp87, Users.userStartsSignUp88, Users.userStartsSignUp89, Users.userStartsSignUp90, Users.userStartsSignUp91, Users.userStartsSignUp92, Users.userStartsSignUp93, Users.userStartsSignUp94, Users.userStartsSignUp95, Users.userStartsSignUp96, Users.userStartsSignUp97, Users.userStartsSignUp98, Users.userStartsSignUp99, Users.userStartsSignUp100));
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
    @Disabled("Running under cucumber")
    @Test
    public void usersCanLogOut(){
        loginAction.accessToThePage();
        Serenity.reportThat("Then I validate that HomePage is visible",
                ()-> assertThat(loginAction.checkHomePageIsVisible()));
        loginAction.clickSignUpButton();
        Serenity.reportThat("Then I validate that HomePage is visible",
                ()-> assertThat(loginAction.checkLoginAccountLabelIsVisible()));
        loginAction.logIn(Users.userLogin);
        Serenity.reportThat("Then I validate that Logged oin as: user is visible",
                ()-> assertThat(signUpAction.loginAsIsVisible()));
        signUpAction.clickOnLogOut();
        Serenity.reportThat("Then I validate that HomePage is visible after loggin out",
                ()-> assertThat(loginAction.checkLoginAccountLabelIsVisible()));
    }
@Disabled("Running under cucumber")
    @Test
    public void usersCanContactUs() throws InterruptedException {
        loginAction.accessToThePage();
        Serenity.reportThat("Then I validate that HomePage is visible",
                ()-> assertThat(loginAction.checkHomePageIsVisible()));
        loginAction.clickOnContactUs();

            Serenity.reportThat("Then I validate that GET IN TOUCH label is visble",
                    ()-> assertThat(loginAction.checkGetInTouchLabelIsVisible()));
            contactUsAction.fillContactUsForm(Users.userStartsSignUp);
            contactUsAction.clickOnSubmit();
            contactUsAction.clickOnAceptar();
    Serenity.reportThat("Then I validate that success message is visible",
            ()-> assertThat(contactUsAction.checkSuccessAfterAlert()));
    loginAction.clickOnHomeButton();
    Serenity.reportThat("Then I validate HomePage is visible",
                ()-> assertThat(loginAction.checkHomePageIsVisible()));


        }

    }
