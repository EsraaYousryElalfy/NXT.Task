package PageMethods;

import CommonClasses.AbstractPageObject;
import CommonClasses.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckoutPageMethods extends AbstractPageObject {
    private By _CartItemsLocator = By.cssSelector("div.order-summary-content table.cart thead tr");
    private By _CheckoutButtonLocator = By.id("#checkout");
    private By _TermsAndConditionCheckBoxLocator = By.id("#termsofservice");
    private By _CheckOutPageHeaderLocator = By.cssSelector("div.page.checkout-page");

    public List<WebElement> CartItems() {
        return BaseMethods.findElements(_CartItemsLocator);
    }

    public int CartItemSize() {
        return CartItems().size();
    }

    public WebElement CheckoutButton() { return BaseMethods.findElement(_CheckoutButtonLocator); }

    public void ClickOnCheckoutButton() { BaseMethods.Click_Element(CheckoutButton());}

    public WebElement TermsAndConditionsCheckBox() { return BaseMethods.findElement(_TermsAndConditionCheckBoxLocator); }

    public void ClickOnTermsAndConditions() { BaseMethods.Click_Element(TermsAndConditionsCheckBox());}

    public WebElement CheckOutPageHeader() { return BaseMethods.findElement(_CheckOutPageHeaderLocator); }

    public Boolean CheckoutPageHeaderIsDiplayed() {
        if(CheckOutPageHeader().isDisplayed()) { return true; }
        else { return false; }
    }
}
