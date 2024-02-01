package org.mancilla;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mancilla.Page.LoginPage;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mancilla.Data.Users.userSignUp;

@ExtendWith(SerenityJUnit5Extension.class)
public class AppTest
{

  @Managed
  LoginPage loginPage;

 @Test
  public void usersCanLogIn() throws InterruptedException {
   this.loginPage.openPage();

     Serenity.reportThat("Then I validate that HomePage is visible", ()->
              assertThat(loginPage.getHomePage().getText()).isEqualToIgnoringCase("HOME"));

     loginPage.clickOnSignUpButton().click();
     Serenity.reportThat("Then I validate that Signup form is visible", ()->
             assertThat(loginPage.signUpFormIsVisible().getText()).isEqualToIgnoringCase("New User Signup!"));

    loginPage.signUp(userSignUp);

     TimeUnit.SECONDS.sleep(5);
 }

}
