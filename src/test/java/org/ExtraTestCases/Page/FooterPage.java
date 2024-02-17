package org.ExtraTestCases.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FooterPage extends PageObject {

    @FindBy(css = "div[class='single-widget']>h2")
    public WebElementFacade getSubscriptionFooter;
    @FindBy(css = "input[id='susbscribe_email']")
    public WebElementFacade enterEmailAccount;
    @FindBy(css = "button[id='subscribe']")
    public WebElementFacade getArrowButton;
    @FindBy(css = "div[class='alert-success alert']")
    public WebElementFacade getSubscribeMessage;

}
