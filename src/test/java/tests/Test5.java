package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.Driver;

//On the Date pickers section - JQuery date picker, build selectors for one of the fields that allows you to pick a date

public class Test5 {
    public static Driver driver = null;

    @Test
    public void test5() {

        driver = Driver.getInstance();
        driver.navigate("https://www.seleniumeasy.com/test/");

        //click on Date pickers - JQuery Date Picker
        driver.webDriver.findElement(By.xpath("//a[contains(text(), 'Date pickers')]")).click();
        driver.webDriver.findElement(By.xpath("//a[contains(text(), 'JQuery Date Picker')]")).click();

        //click on From field
        driver.webDriver.findElement(By.id("from")).click();

        //select month
        driver.webDriver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[4]")).click();

        //select date
        driver.webDriver.findElement(By.xpath("//tbody/tr[5]/td[6]")).click();

        driver.exit();

    }
}
