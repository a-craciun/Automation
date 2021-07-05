package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

//On the List Box section: JQuery list box: add two values from the left list (only one selector for all values) to the right box,
// make sure the value is in the second field (the fields have different selectors) then remove one of the added values

public class Test9 {
    public static Driver driver = null;

    @Test
    public void test9() {

        driver = Driver.getInstance();
        driver.navigate("https://www.seleniumeasy.com/test/");

        //click on List Box - JQuery List Box
        driver.webDriver.findElement(By.xpath("//a[contains(text(), 'List Box')]")).click();
        driver.webDriver.findElement(By.xpath("//a[contains(text(), 'JQuery List Box')]")).click();

        //define elements
        WebElement addButton = driver.webDriver.findElement(By.xpath("//button[@class='pAdd btn btn-primary btn-sm']"));
        WebElement removeButton = driver.webDriver.findElement(By.xpath("//button[@class = 'pRemove btn btn-primary btn-sm']"));
        WebElement leftList = driver.webDriver.findElement(By.xpath("//select[@class = 'form-control pickListSelect pickData']"));
        WebElement rightList = driver.webDriver.findElement(By.xpath("//select[@class = 'form-control pickListSelect pickListResult']"));

        //add items from left to right
        getItemFromList(leftList, "Alice");
        addButton.click();
        getItemFromList(leftList, "Luiza");
        addButton.click();

        Assert.assertTrue(rightList.getText().contains("Luiza"));
        Assert.assertTrue(rightList.getText().contains("Alice"));

        //remove item from right
        getItemFromList(rightList, "Alice");
        removeButton.click();

        driver.exit();

    }

    public void getItemFromList(WebElement pickList, String value) {
        Select select = new Select(pickList);
        select.selectByVisibleText(value);
    }
}
