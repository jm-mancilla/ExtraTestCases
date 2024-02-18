package org.ExtraTestCases.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class ProductsPage extends PageObject {
    private final By productsOption = By.cssSelector("a[href='/products']");
    private final By productsPageOpened = By.cssSelector("a[href='/products'][style='color: orange;]");
    private final By productsList = By.cssSelector("div[class='features_items']");
    private final By allProductsList = By.cssSelector("i[class='fa fa-plus-square']");
    private final By productDetails = By.cssSelector("div[class='product-information']");
    private final By adsIframe = By.cssSelector("iframe[id='aswift_6']");
    private final By adsAfterContactUs = By.cssSelector("iframe[id='aswift_1']");
    private final By ads = By.cssSelector("iframe[id='ad_iframe']");
    private final By aspa = By.xpath("//*[@id='dismiss-button']");
    private final By closeAds = By.cssSelector("div[aria-label='Close ad']");
    //div[@id='dismiss-button']/div/span
    //*[@id="dismiss-button"]

    public WebElementFacade getProductsOption(){
        return this.find(productsOption);
    }
    public WebElementFacade getProductsFocused(){
        return this.find(productsPageOpened);
    }
    public WebElementFacade getProductsList(){
        return this.find(productsList);
    } public List<WebElementFacade> getAllProductsList(){
        return this.findAll(allProductsList);
    }
    public WebElementFacade getProductDetails(){
        return this.find(productDetails);
    }
    public WebElementFacade getAds(){
        return this.find(ads);
    }public WebElementFacade getIframeAds(){
        return this.find(adsIframe);
    }public WebElementFacade getAspa(){
        return this.find(aspa);
    }public WebElementFacade getCloseAds(){
        return this.find(closeAds);
    }
    public WebElementFacade getAdsAfterContactUs(){
        return this.find(adsAfterContactUs);
    }
    @FindBy(css = "input[id='search_product']")
    public WebElementFacade getSearchProduct;
    @FindBy(css ="button[id='submit_search']")
    public WebElementFacade getSearchButton;
    @FindBy(css = "h2[class='title text-center']")
    public WebElementFacade getSearchedProducts;
    @FindBy(css = "div[class='features_items']>div[class='col-sm-4']")
    public List<WebElementFacade> getSearchedItems;
    @FindBy(css = "i[class='fa fa-shopping-cart']")
    public List<WebElementFacade> hoverPrductsList;
    @FindBy(css = "a[class='btn btn-default add-to-cart']")
    public List<WebElementFacade> getAddCart;
    @FindBy(css = "button[class='btn btn-success close-modal btn-block']")
    public WebElementFacade getContinueButtonAfterAddCart;
    @FindBy(css = "table[id='cart_info_table'] tbody tr")
    public List<WebElementFacade> getItemsListInCart;
}
