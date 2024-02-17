package org.ExtraTestCases.Actions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import org.ExtraTestCases.Page.CartPage;
import org.ExtraTestCases.Page.ProductsPage;

import java.util.List;

public class CartAction extends UIInteractions {
    @Managed
    ProductsPage productsPage;
    @Managed
    CartPage cartPage;

    public boolean itemsInfoAreVisible(){
        List<WebElementFacade> list = productsPage.getItemsListInCart;
        List<WebElementFacade> description = cartPage.getDescription;
        List<WebElementFacade> price = cartPage.getCartPrice;
        List<WebElementFacade> quantity = cartPage.getCartQuantity;
        List<WebElementFacade> total = cartPage.getCartTotal;
        boolean visibleInfo = false;
        for (int i = 0; i < list.size(); i++) {
            if(price.get(i).isVisible() && quantity.get(i).isVisible() && total.get(i).isVisible())
                visibleInfo = true;
        }
        return visibleInfo;
}
    }
