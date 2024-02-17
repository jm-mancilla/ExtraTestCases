package org.ExtraTestCases.Page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.ExtraTestCases.Data.UserStartsSignUp;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("https://automationexercise.com/")
public class LoginPage extends PageObject {

    @Managed
    UserStartsSignUp userSignUp;
    private final By homePage = By.cssSelector("a[href='/'][style='color: orange;']");
    private final By signUpLogin = By.cssSelector("a[href='/login']");
    private final By signUpForm = By.cssSelector("div.signup-form > h2");
    private final By signUpName = By.cssSelector("input[name='name']");
    private final By signUpEmail = By.cssSelector("input[data-qa='signup-email']");
    private final By signUpButton = By.cssSelector("button[data-qa='signup-button']");
    private final By loginEmail = By.cssSelector("input[data-qa='login-email']");
   private final By loginPassword = By.cssSelector("input[data-qa='login-password']");
   private final By errorLogin = By.cssSelector("p[style='color: red;']");
   private final By loginButton = By.cssSelector("button[data-qa='login-button']");
   private final By loginAccountLabel = By.cssSelector("div.login-form>h2");
   private final By contactUs = By.cssSelector("i[class='fa fa-envelope']");
   private final By getInTouchLabel = By.cssSelector("h2[class='title text-center']");
   private final By getHomeButton = By.cssSelector("i[class='fa fa-angle-double-left']");

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
    public WebElementFacade getLoginEmail(){return this.find(loginEmail);}
    public WebElementFacade getLoginPassword(){return this.find(loginPassword);}
    public WebElementFacade getLoginError(){return this.find(errorLogin);}
    public WebElementFacade clickLoginButton(){return this.find(loginButton);}
    public WebElementFacade checkLoinAccountLabelIsVisible(){return this.find(loginAccountLabel);}
    public WebElementFacade contactUs(){return this.find(contactUs);}
    public List<WebElementFacade> contactUsLabels(){return this.findAll(getInTouchLabel);}
    public WebElementFacade getHomeButton(){
        return this.find(getHomeButton);
    }

    @FindBy(css = "a[href='/view_cart']")
    public WebElementFacade getCartOption;

}
