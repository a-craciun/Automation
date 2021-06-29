package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.Driver;

public class FirstTest {

    public static Driver driver = null;

    @Test
    public void firstTest(){
        driver = Driver.getInstance();
        driver.maximize();
        driver.navigate("http://automationpractice.com");

        //search for dress
        driver.webDriver.findElement(By.id("search_query_top")).sendKeys("dress");

        //click on search button
        driver.webDriver.findElement(By.className("button-search")).click();

        //click on the first item on the page
        driver.webDriver.findElement(By.xpath("//ul[@class='product_list grid row']/li[1]")).click();

        //click on Add to cart button
        driver.webDriver.findElement(By.id("add_to_cart")).click();

        driver.exit();

    }
}
