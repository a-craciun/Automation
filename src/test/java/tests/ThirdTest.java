package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.Driver;

public class ThirdTest {
    public static Driver driver = null;

    @Test
    public void thirdTest() {

        driver = Driver.getInstance();
        driver.maximize();
        driver.navigate("http://automationpractice.com");

        //search for dress
        driver.webDriver.findElement(By.id("search_query_top")).sendKeys("dress");

        //click on search button
        driver.webDriver.findElement(By.className("button-search")).click();

        //click on the third item on the page
        driver.webDriver.findElement(By.xpath("//ul[@class='product_list grid row']/li[3]")).click();

        //change size
        driver.webDriver.findElement(By.xpath("//select[@id='group_1']")).click();
        driver.webDriver.findElement(By.xpath("//option[contains(text(),'M')]")).click();

        //change quantity
        driver.webDriver.findElement(By.className("button-plus")).click();

        //change color
        driver.webDriver.findElement(By.id("color_8")).click();

        //click on Add to cart button
        driver.webDriver.findElement(By.id("add_to_cart")).click();

        //added this to wait for the dialog to be displayed because the test was failing for not seeing the Proceed button visible
        WebDriverWait wait = new WebDriverWait(driver.webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("layer_cart")));

        //proceed to checkout
        driver.webDriver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();

        //delete the product
        driver.webDriver.findElement(By.className("icon-trash")).click();

        driver.exit();

    }


}
