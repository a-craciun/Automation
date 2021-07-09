package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends BasePage {

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class='product_list grid row']/li[1]")
    WebElement firstItem;

    @FindBy(xpath = "//ul[@class='product_list grid row']/li[2]")
    WebElement secondItem;

    @FindBy(xpath = "//ul[@class='product_list grid row']/li[3]")
    WebElement thirdItem;

    public void clickTheFirstItem() {
        firstItem.click();
    }

    public void clickTheSecondItem() {
        secondItem.click();
    }

    public void clickTheThirdItem() {
        thirdItem.click();
    }

}
