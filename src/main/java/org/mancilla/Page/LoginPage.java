package org.mancilla.Page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.mancilla.Data.UserLogin;
import org.mancilla.Data.UserSignUp;
import org.openqa.selenium.By;

@DefaultUrl("https://automationexercise.com/")
public class LoginPage extends PageObject {

    @Managed
    UserSignUp userSignUp;
    private final By homePage = By.cssSelector("a[href='/'][style='color: orange;']");
    private final By signUpLogin = By.cssSelector("a[href='/login']");
    private final By signUpForm = By.cssSelector("div.signup-form > h2");
    private final By signUpName = By.cssSelector("input[name='name']");
    private final By signUpEmail = By.cssSelector("input[data-qa='signup-email']");
    private final By signUpButton = By.cssSelector("button[data-qa='signup-button']");

    public void openPage(){
        this.open();
    }

    public WebElementFacade getHomePage(){
        return this.find(homePage);
    }
    public WebElementFacade clickOnSignUpButton(){
        return this.find(signUpLogin);
    }
    public WebElementFacade signUpFormIsVisible(){
        return this.find(signUpForm);
    }
    public WebElementFacade getSignUpName(){
        return this.find(signUpName);
    }
    public WebElementFacade getSignUpEmail(){
        return this.find(signUpEmail);
    }
    public WebElementFacade getSignUpButton(){
        return this.find(signUpButton);
    }

    public void signUp(UserSignUp userSignUp){
        this.getSignUpName().sendKeys(userSignUp.getName());
        this.getSignUpEmail().sendKeys(userSignUp.getEmail());
        this.getSignUpButton().click();
    }


}
