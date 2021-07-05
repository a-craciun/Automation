package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

import java.util.List;
//On the same section for the bottom table get the state of the filters buttons, click filter then get the state again

public class Test7 {
    public static Driver driver = null;

    @Test
    public void test7() {

        driver = Driver.getInstance();
        driver.navigate("https://www.seleniumeasy.com/test/");

        //click on Date pickers - JQuery Date Picker
        driver.webDriver.findElement(By.xpath("//a[contains(text(), 'Table')]")).click();
        driver.webDriver.findElement(By.xpath("//a[contains(text(), 'Table Data Search')]")).click();

        //get ell filters
        List<WebElement> filters = driver.webDriver.findElements(By.xpath("//tr[@class='filters']/th/input"));
        System.out.println(filters.size());

        //assert filters are disabled
        for (WebElement filter : filters) {
            Assert.assertEquals(filter.getAttribute("disabled"), "true");
        }

        //assert filters are enabled
        driver.webDriver.findElement(By.xpath("//button[@class='btn btn-default btn-xs btn-filter']")).click();
        for (WebElement filter : filters) {
            Assert.assertEquals(filter.isEnabled(), true);
        }

        driver.exit();

    }
}
