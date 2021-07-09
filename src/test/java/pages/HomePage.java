package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "search_query_top")
    WebElement searchField;

    @FindBy(className = "button-search")
    WebElement searchButton;

    public void searchForItem(String item) {
        searchField.sendKeys(item);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

}
