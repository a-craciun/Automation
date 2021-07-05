package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Driver;

import java.util.List;

//On the  Table section - table data search: build a single selector that can get all the elements rows

public class Test6 {
    public static Driver driver = null;

    @Test
    public void test6() {

        driver = Driver.getInstance();
        driver.navigate("https://www.seleniumeasy.com/test/");

        //click on Date pickers - JQuery Date Picker
        driver.webDriver.findElement(By.xpath("//a[contains(text(), 'Table')]")).click();
        driver.webDriver.findElement(By.xpath("//a[contains(text(), 'Table Data Search')]")).click();

        //get all the rows
        List<WebElement> rows = driver.webDriver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
        System.out.println(rows.size());

        driver.exit();

    }
}
