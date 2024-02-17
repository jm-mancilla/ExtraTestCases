package org.ExtraTestCases.Actions;

import io.cucumber.java.ja.然し;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import org.ExtraTestCases.Page.ProductsPage;
import org.ExtraTestCases.Utils.Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProductsAction extends UIInteractions {
    @Managed
    ProductsPage productsPage;
    @Managed
    Utils utils;

    public static int numberOfProducts = 0;

    public void clickOnProductsOption() throws InterruptedException {
        productsPage.getProductsOption().click();
        utils.closeAds();
          }
    public boolean validateProductsPageIsOpened(){
       return productsPage.getProductsFocused().isVisible();
    }
    public boolean checkProductsListIsVisible(){
        return productsPage.getProductsList().isVisible();
    }
    public void getAllProducts() throws InterruptedException {
        List<WebElementFacade> list = productsPage.getAllProductsList();
        for (int i = 0; i < list.size(); i++) {
            utils.scrollTo(list.get(6));
            list.get(0).click();
            break;

        }
    } public boolean getProductDetails() {
        return productsPage.getProductDetails().isVisible();
    }
    public void searchProducts(){
        productsPage.getSearchProduct.sendKeys("a");
    }
    public void clickOnSearchButton(){
        productsPage.getSearchButton.click();
    }
    public String searchedProducts(){
        return productsPage.getSearchedProducts.getText();
    }
    public boolean searchedItemsAreVisible() {
        boolean visible = false;
       List<WebElementFacade> list = productsPage.getSearchedItems;
        for (int i = 0; i <list.size() ; i++) {
           if(list.size() > 0)
               visible = true;
           else
               visible = false;
       }
       return visible;
    }
    public void clickOnAddCartHoverFirstProduct() throws InterruptedException {
        List<WebElementFacade> list = productsPage.hoverPrductsList;
        List<WebElementFacade> allProductsListlist = productsPage.getAllProductsList();
        for (WebElementFacade webElementFacade:list){
            utils.mouseHover(list.get(0));
            utils.scrollTo(allProductsListlist.get(4));
            productsPage.getAddCart.get(0).click();
            numberOfProducts++;
            break;
        }
    }
    public void clickOnContinueShopping() throws InterruptedException {
        productsPage.getContinueButtonAfterAddCart.click();
    }
    public void clickOnAddCartHoverSecondProduct(){
        List<WebElementFacade> list = productsPage.hoverPrductsList;
        List<WebElementFacade> allProductsListlist = productsPage.getAllProductsList();
        for (WebElementFacade webElementFacade:list){
            utils.mouseHover(list.get(2));
            utils.scrollTo(allProductsListlist.get(4));
            productsPage.getAddCart.get(2).click();
            numberOfProducts++;
            break;
        }
        System.out.println(numberOfProducts);
    }
    public boolean numberOfProductsInCart(){
        List<WebElementFacade> list = productsPage.getItemsListInCart;
        boolean sameNumberOfProducts = false;
        for (WebElementFacade webElementFacade:list){
            if (list.size() == numberOfProducts)
                sameNumberOfProducts = true;
        }
        return sameNumberOfProducts;
    }
    }
