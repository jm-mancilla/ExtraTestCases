package org.ExtraTestCases.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends PageObject {
    @FindBy(css = "td[class='cart_description']")
    public List<WebElementFacade> getDescription;
    @FindBy(css = "td[class='cart_price']")
    public List<WebElementFacade> getCartPrice;
    @FindBy(css = "td[class='cart_quantity']")
    public List<WebElementFacade> getCartQuantity;
    @FindBy(css = "td[class='cart_total']")
    public List<WebElementFacade> getCartTotal;
}
