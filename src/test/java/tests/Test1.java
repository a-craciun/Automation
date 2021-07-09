package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.ResultsPage;

public class Test1 extends BaseTest {

    @Test
    public void addToCartTest() {
        HomePage homePage = new HomePage(driver.webDriver);
        ResultsPage resultsPage = new ResultsPage(driver.webDriver);
        ProductPage productPage = new ProductPage(driver.webDriver);

        homePage.searchForItem("dress");
        homePage.clickSearchButton();
        resultsPage.clickTheFirstItem();
        productPage.clickAddToCartButton();

    }
}
