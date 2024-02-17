package org.ExtraTestCases.Page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ContactUsPage extends PageObject {
    private final By contactUsName = By.cssSelector("input[data-qa='name']");
    private final By contactUsEmail = By.cssSelector("input[data-qa='email']");
    private final By contactUsSubject = By.cssSelector("input[data-qa='subject']");
    private final By contactUsMessage = By.cssSelector("textarea[data-qa='message']");
    private final By contactUsUploadFileButton = By.cssSelector("input[class='form-control'][name='upload_file']");
    private final By contactUsSubmitButton = By.cssSelector("input[data-qa='submit-button']");
    private final By JSButtonAceptar = By.xpath("//button[contains(.,'OK']");
    private final By contactUsSuccessfully = By.cssSelector("div[class='status alert alert-success']");

    public WebElementFacade getContactUsName(){
        return this.find(contactUsName);
    } public WebElementFacade getContactUsEmail(){
        return this.find(contactUsEmail);
    }public WebElementFacade getContactUsSubject(){
        return this.find(contactUsSubject);
    }public WebElementFacade getContactUsMessage(){
        return this.find(contactUsMessage);
    }public WebElementFacade getUploadFile(){
        return this.find(contactUsUploadFileButton);
    }public WebElementFacade getSubmitButton(){
        return this.find(contactUsSubmitButton);
    }public WebElementFacade getJSAceptarButton(){
        return this.find(JSButtonAceptar);
    }
    public WebElementFacade getContactUsSuccessAfterAlert(){
        return this.find(contactUsSuccessfully);
    }

}
