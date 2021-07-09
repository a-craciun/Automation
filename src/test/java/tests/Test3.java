package tests;

import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;
import pages.ResultsPage;

public class Test3 extends BaseTest{

    @Test
    public void proceedToCheckoutTest() {

        HomePage homePage = new HomePage(driver.webDriver);
        ResultsPage resultsPage = new ResultsPage(driver.webDriver);
        ProductPage productPage = new ProductPage(driver.webDriver);
        CheckoutPage checkoutPage = new CheckoutPage(driver.webDriver);

        homePage.searchForItem("dress");
        homePage.clickSearchButton();

        resultsPage.clickTheThirdItem();

        productPage.changeSize();
        productPage.changeColor();
        productPage.changeQuantity();
        productPage.clickAddToCartButton();
        productPage.clickProceedToCheckout();

        checkoutPage.clickDeleteItemButton();

    }
}
