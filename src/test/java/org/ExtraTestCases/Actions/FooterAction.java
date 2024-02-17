package org.ExtraTestCases.Actions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.steps.UIInteractions;
import org.ExtraTestCases.Data.UserLogin;
import org.ExtraTestCases.Page.FooterPage;
import org.ExtraTestCases.Utils.Utils;

import java.util.concurrent.TimeUnit;

import static org.ExtraTestCases.Data.Users.userLogin;

public class FooterAction extends UIInteractions {
    @Managed
    Utils utils;
    @Managed
    FooterPage footerPage;

    public void focusOnFooter(){
        utils.scrollTo(footerPage.getSubscriptionFooter);
    }
    public String footerText(){
        return footerPage.getSubscriptionFooter.getText();
    }

    public void enterEmailAccount(){
        footerPage.enterEmailAccount.sendKeys(userLogin.getEmail());
    }
    public void clickOnArrowButton() throws InterruptedException {
        footerPage.getArrowButton.click();
    }
    public String getSubscribeTextMessage(){
        return footerPage.getSubscribeMessage.getText();
    }
}
