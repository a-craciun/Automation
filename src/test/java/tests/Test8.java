package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.Driver;

import java.util.concurrent.TimeUnit;

// On the Alerts & Modals section - Bootstrap Modal: launch the single modal example,
// build a selector for the x button, close the modal, check if the button is still displayed, what about present?

public class Test8 {
    public static Driver driver = null;

    @Test
    public void test8() {

        driver = Driver.getInstance();
        driver.navigate("https://www.seleniumeasy.com/test/");

        //click on Alerts & Modals - Bootstrap modals
        driver.webDriver.findElement(By.xpath("//a[contains(text(), 'Alerts & Modals')]")).click();
        driver.webDriver.findElement(By.xpath("//a[contains(text(), 'Bootstrap Modals')]")).click();

        //launch the single modal example
        driver.webDriver.findElement(By.xpath("//a[contains(text(), 'Launch modal')][1]")).click();

        //close the modal by clicking on x button
        driver.waitForElementToLoad(By.className("modal-content"));
        WebElement xButton =  driver.webDriver.findElement(By.xpath("//div[@class='modal-header']/h4[contains(text(),'Modal Title')]/..//button[@class = 'close']"));
        xButton.click();
        driver.webDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        //check if the button is still displayed
        if (xButton.isDisplayed()) {
            System.out.println("The button is still displayed");
            // x tot e afisat indiferent ce path ii dau, am selectat strict x de pe acest modal si tot e afisat
        } else System.out.println("The button is not displayed");

        //check if the button is still present (?? asa ??)
        if(xButton == null){
            System.out.println("The button is not present");
        } else System.out.println("The button is present");

        driver.exit();

        }
}
