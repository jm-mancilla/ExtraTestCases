package org.mancilla.Page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.mancilla.Data.UserEndsSignUp;
import org.mancilla.Data.UserStartsSignUp;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

@DefaultUrl("https://automationexercise.com/")
public class SignUpPage extends PageObject {

    private final By radioGenderMr = By.cssSelector("input#id_gender1");
    private final By name = By.cssSelector("input[data-qa='name']");
    private final By email = By.cssSelector("input[data-qa='email']");
    private final By signUpPassword = By.cssSelector("input[data-qa='password']");
    private final By dayPicker = By.cssSelector("select[data-qa='days']");
    private final By monthPicker = By.cssSelector("select[data-qa='months']");
    private final By yearPicker = By.cssSelector("select[data-qa='years']");
    private final By newsletterCheckbox = By.cssSelector("input#newsletter");
    private final By partnerCheckbox = By.cssSelector("input#optin");
    private final By firstName = By.cssSelector("input[data-qa='first_name']");
    private final By lastName = By.cssSelector("input[data-qa='last_name']");
    private final By company = By.cssSelector("input[data-qa='company']");
    private final By address = By.cssSelector("input[data-qa='address']");
    private final By address2 = By.cssSelector("input[data-qa='address2']");
    private final By countryPicker = By.cssSelector("select[data-qa='country']");
    private final By state = By.cssSelector("input[data-qa='state']");
    private final By city = By.cssSelector("input[data-qa='city']");
    private final By zipCode = By.cssSelector("input[data-qa='zipcode']");
    private final By mobileNumber = By.cssSelector("input[data-qa='mobile_number']");
    private final By accountCreated = By.cssSelector("h2[data-qa='account-created']");
    private final By createAccountButton = By.cssSelector("button[data-qa='create-account']");
    private final By continueButtonAfterCreatedAccount = By.cssSelector("a[data-qa='continue-button']");
    private final By continueButtonAfterDeletedAccount = By.cssSelector("a[data-qa='continue-button']");

    private final By loginAs = By.cssSelector("i[class='fa fa-user']");
    private final By deleteAccount = By.cssSelector("i[class='fa fa-trash-o']");
    private final By logOut = By.cssSelector("i[class='fa fa-lock']");
    private final By accountHasBeenDeleted = By.cssSelector("h2[data-qa='account-deleted']");


    public WebElementFacade getName(){
        return this.find(name);
    } public WebElementFacade getEmail(){
        return this.find(email);
    }
    public WebElementFacade getSignUpPassword(){
       return this.find(signUpPassword);
    }

    public WebElementFacade getDayPicker(){
        return this.find(dayPicker);
    }
    public WebElementFacade getMonthPicker(){
        return this.find(monthPicker);
    }
    public WebElementFacade getYearPicker(){
        return this.find(yearPicker);
    }
    public WebElementFacade getGender(){
        return this.find(radioGenderMr);
    }
    public WebElementFacade getNewsletterCheckbox(){
        return this.find(newsletterCheckbox);
    } public WebElementFacade getCity(){
        return this.find(city);
    }
    public WebElementFacade getFirstName(){
        return this.find(firstName);
    }public WebElementFacade getLastName(){
        return this.find(lastName);
    }public WebElementFacade getCompany(){
        return this.find(company);
    }public WebElementFacade getAddress(){
        return this.find(address);
    }public WebElementFacade getAddress2(){
        return this.find(address2);
    }public WebElementFacade getCountryPicker(){
        return this.find(countryPicker);
    }public WebElementFacade getState(){
        return this.find(state);
    }public WebElementFacade getMobileNumber(){
        return this.find(mobileNumber);
    }public WebElementFacade getPartnerCheckbox(){
        return this.find(partnerCheckbox);
    }public WebElementFacade getCreateAccountButton(){
        return this.find(createAccountButton);
    }public WebElementFacade getZipCode(){
        return this.find(zipCode);
    }public WebElementFacade getcreatedAccount(){
        return this.find(accountCreated);
    }public WebElementFacade getContinueButton(){
        return this.find(continueButtonAfterCreatedAccount);
    }public WebElementFacade getLoginAs(){
        return this.find(loginAs);
    }
    public WebElementFacade getDeleteAccount(){
        return this.find(deleteAccount);
    }public WebElementFacade getDeleteAccountMessage(){
        return this.find(accountHasBeenDeleted);
    }public WebElementFacade getContinueButtonAfterDeletedAccount(){
        return this.find(continueButtonAfterDeletedAccount);
    }public WebElementFacade getLogOut(){
        return this.find(logOut);
    }




}
