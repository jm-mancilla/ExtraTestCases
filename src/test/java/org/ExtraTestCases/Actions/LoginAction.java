package org.ExtraTestCases.Actions;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import org.ExtraTestCases.Data.UserLogin;
import org.ExtraTestCases.Data.UserStartsSignUp;
import org.ExtraTestCases.Page.LoginPage;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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
    @Step("And the user click on Contact Us option")
    public void clickOnContactUs(){
        loginPage.contactUs().click();
    }
    public boolean checkGetInTouchLabelIsVisible(){
        List<WebElementFacade> list = loginPage.contactUsLabels();
        List<String> aux = new ArrayList<>();
        boolean visible= false;
        for (int i = 0; i <list.size() ; i++){
           if( list.get(i).getText().equalsIgnoreCase("GET IN TOUCH")){
               System.out.println("visible");
               visible = loginPage.contactUsLabels().get(i).isVisible();
               aux.add(list.get(i).getText());
           } else {
               visible = false;
           }

        }
        System.out.println(aux);
        return visible;
    }

    public void clickOnHomeButton(){
        loginPage.getHomeButton().click();
    }
    public void clickOnCartOption(){
        loginPage.getCartOption.click();
    }
}
