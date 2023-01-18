package StepClasses;

import CommonClasses.AbstractPageObject;
import PageMethods.CheckoutPageMethods;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CheckoutPageSteps extends AbstractPageObject {

    @When("^The user complete Checkout for \"(.*)\"$")
    public void TheUserCompleteCheckout(int no) {
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps.TheUserNavigatesToCartPage();
        CheckoutPageMethods checkoutPageMethods = new CheckoutPageMethods();
        Assert.assertTrue(checkoutPageMethods.CartItemSize()==no);
        checkoutPageMethods.ClickOnTermsAndConditions();
        checkoutPageMethods.ClickOnCheckoutButton();
        Assert.assertTrue(checkoutPageMethods.CheckoutPageHeaderIsDiplayed());
    }
}
