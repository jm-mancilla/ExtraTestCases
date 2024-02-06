package org.mancilla.Actions;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.mancilla.Data.UserLogin;
import org.mancilla.Data.UserStartsSignUp;
import org.mancilla.Page.LoginPage;

@DefaultUrl("https://automationexercise.com")
public class LoginAction extends UIInteractions {
    @Managed
    LoginPage loginPage;
    @Managed
    UserLogin userLogin;
    @Step("And the user start filling the sign up")
    public void firstsignUp(UserStartsSignUp userStartsSignUp){
        loginPage.getSignUpName().sendKeys(userStartsSignUp.getName());
        loginPage.getSignUpEmail().sendKeys(userStartsSignUp.getEmail());
        loginPage.getSignUpButton().click();
    }

@Step("Given the user access to AutomationExercises page")
    public void accessToThePage(){
        loginPage.openPage();
    }
    public String checkHomePageIsVisible(){
       return loginPage.getHomePage().getText();
    }
    public void clickSignUpButton(){
        loginPage.clickOnSignUpButton().click();
    }
    public String checkSignUpFormIsVisible(){
        return loginPage.signUpFormIsVisible().getText();
    }
    public boolean checkLoginAccountLabelIsVisible(){
        return loginPage.checkLoinAccountLabelIsVisible().isVisible();
    }
    @Step("And the user performs the login")
    public void logIn(UserLogin userLogin){
        loginPage.getLoginEmail().sendKeys(userLogin.getEmail());
        loginPage.getLoginPassword().sendKeys(userLogin.getPassword());
        loginPage.clickLoginButton().click();
    }
}
