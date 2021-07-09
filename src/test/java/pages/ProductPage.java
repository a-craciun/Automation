package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "add_to_cart")
    WebElement addToCartButton;

    @FindBy(id = "color_to_pick_list")
    List<WebElement> colorList;

    @FindBy(className = "button-plus")
    WebElement increaseQtyBtn;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    WebElement proceedToCheckout;

    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    public void changeSize() {
        driver.findElement(By.xpath("//select[@id='group_1']")).click();
        driver.findElement(By.xpath("//option[contains(text(),'L')]")).click();
    }

    public void changeColor()  {
        List<WebElement> selectedColor = driver.findElements(By.xpath("//ul[@id='color_to_pick_list']/li[@class = 'selected']"));
        if (selectedColor.size() > 0){
            colorList.get(colorList.size() - 1).click();
        }
    }

    public void changeQuantity() {
        increaseQtyBtn.click();
    }

    public void clickProceedToCheckout() {
        waitForElementToLoad(By.id("layer_cart"));
        proceedToCheckout.click();
    }
}
