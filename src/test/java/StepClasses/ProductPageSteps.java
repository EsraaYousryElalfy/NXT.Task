package StepClasses;

import CommonClasses.AbstractPageObject;
import PageMethods.ProductPageMethods;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ProductPageSteps extends AbstractPageObject {

    @When("^The user adds the \"(.*)\" in the cart$")
    public void TheUserAddsTheInTheCart(String name) {
        ProductPageMethods productPageMethods = new ProductPageMethods();
        Assert.assertTrue(productPageMethods.ProductNameIsDisplayed(name));
        productPageMethods.ClickOnAddToCart();
    }
}
