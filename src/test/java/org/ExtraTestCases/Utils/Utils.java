package org.ExtraTestCases.Utils;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.ExtraTestCases.Page.ProductsPage;
import org.openqa.selenium.interactions.Actions;

public class Utils extends PageObject {
    @Managed
    ProductsPage productsPage;
    public void scrollTo (WebElementFacade webElementFacade){
        Actions actions = new Actions(this.getDriver());
        actions.scrollToElement(webElementFacade).perform();
    }

    public void closeAds() throws InterruptedException {
        Thread.sleep(1000);
        if(productsPage.getIframeAds().isVisible()) {
            this.getDriver().switchTo().frame(productsPage.getIframeAds());
            if (productsPage.getAspa().isVisible()) {
                productsPage.getAspa().click();
            } else {
                this.getDriver().switchTo().frame(productsPage.getAds());
                productsPage.getCloseAds().click();
            }
            this.getDriver().switchTo().defaultContent();
            Thread.sleep(1000);
        }
    }

    public void closeAdsAfterContactUs() throws InterruptedException {
        Thread.sleep(1000);
        if(productsPage.getAdsAfterContactUs().isVisible()) {
            this.getDriver().switchTo().frame(productsPage.getAdsAfterContactUs());
            if (productsPage.getAspa().isVisible()) {
                productsPage.getAspa().click();
            } else {
                this.getDriver().switchTo().frame(productsPage.getAds());
                productsPage.getCloseAds().click();
            }
            this.getDriver().switchTo().defaultContent();
            Thread.sleep(1000);
        }
    }
    public void mouseHover(WebElementFacade webElementFacade){
        Actions actions = new Actions(this.getDriver());
        actions.moveToElement(webElementFacade).build().perform();
    }
}
