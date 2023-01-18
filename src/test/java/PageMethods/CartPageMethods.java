package PageMethods;

import CommonClasses.AbstractPageObject;
import CommonClasses.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPageMethods extends AbstractPageObject {
    private By _CartPageHeaderLocator = By.cssSelector("div.shopping-cart-page");

    public WebElement CartPageHeader() {
        return BaseMethods.findElement(_CartPageHeaderLocator);
    }

    public Boolean CartPageHeaderIsDisplayed() {
        if (CartPageHeader().isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
}
