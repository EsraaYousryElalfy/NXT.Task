package PageMethods;

import CommonClasses.AbstractPageObject;
import CommonClasses.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPageMethods extends AbstractPageObject {

    private By _AddToCurtButtonLocator = By.id("#add-to-cart-button-11");

    public Boolean ProductNameIsDisplayed(String name) {
        WebElement productName = BaseMethods.findElement(By.xpath("//div[@class='product-essential']//h1[contains(text('" + name + "'))]"));
        if (productName.isDisplayed()) { return true; }
        else { return false; }
    }

    public WebElement AddToCartButton() {
        return BaseMethods.findElement(_AddToCurtButtonLocator);
    }

    public void ClickOnAddToCart() {
        BaseMethods.Click_Element(AddToCartButton());
    }

}
