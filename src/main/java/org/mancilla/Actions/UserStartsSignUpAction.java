package org.mancilla.Actions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.mancilla.Data.UserStartsSignUp;
import org.mancilla.Page.LoginPage;

public class UserStartsSignUpAction extends UIInteractions {

    @Managed
    LoginPage loginPage;
    @Step("And the user start filling the sign up")
    public void firstsignUp(UserStartsSignUp userStartsSignUp){
        loginPage.getSignUpName().sendKeys(userStartsSignUp.getName());
        loginPage.getSignUpEmail().sendKeys(userStartsSignUp.getEmail());
        loginPage.getSignUpButton().click();
    }
}
