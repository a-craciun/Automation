package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

import java.util.List;

//On the Input Forms section - checkbox demo: build a single selector for the 4 options that allows you to choose between them
// using a parameter. Check all options and search for an element that tells you all options are checked

public class Test4 {
    public static Driver driver = null;

    @Test
    public void test4() {

        driver = Driver.getInstance();
        driver.navigate("https://www.seleniumeasy.com/test/");

        //click on Input Forms - Checkbox Demo
        driver.webDriver.findElement(By.xpath("//a[contains(text(), 'Input Forms')]")).click();
        driver.webDriver.findElement(By.xpath("//a[contains(text(), 'Checkbox Demo')]")).click();

        //check all options
        selectCheckboxes("Option 1");
        selectCheckboxes("Option 2");
        selectCheckboxes("Option 3");
        selectCheckboxes("Option 4");

        WebElement uncheckAllButton = driver.webDriver.findElement(By.xpath("//input[@id='check1'][@value='Uncheck All']"));
        Assert.assertTrue(uncheckAllButton.isDisplayed());

        driver.exit();
    }

    public void selectCheckboxes(String value) {
        List<WebElement> allOptions = driver.webDriver.findElements(By.xpath("//div[@class='panel-body']/div[@class = 'checkbox']/label"));
        for (WebElement option : allOptions) {
            if (value.equals(option.getText())) {
                option.click();
                break;
            }
        }
    }
}

