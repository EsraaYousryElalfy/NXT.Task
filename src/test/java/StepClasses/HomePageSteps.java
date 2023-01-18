package StepClasses;

import CommonClasses.AbstractPageObject;
import PageMethods.CartPageMethods;
import PageMethods.HomePageMethods;
import PageMethods.LoginPageMethods;
import PageMethods.RegisterPageMethods;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePageSteps extends AbstractPageObject {



    @When("^The user clicks on login button$")
    public void TheUserClicksOnLoginLink() {
        HomePageMethods homePageMethods = new HomePageMethods();
        homePageMethods.ClickOnLoginLink();
        LoginPageMethods loginPageMethods = new LoginPageMethods();
        Assert.assertTrue(loginPageMethods.LoginPageHeaderIsDisplayed());
    }

    @When("^The user navigates to the Login page$")
    public void TheUserNavigatesToTheLoginPage() {
        TheUserClicksOnLoginLink();
    }

    @Then("^The user logged in successfully$")
    public void TheUserLoggedInSuccessfully() {
        HomePageMethods homePageMethods = new HomePageMethods();
        Assert.assertTrue(homePageMethods.LogoutLinkIsDisplayed());
    }

    @When("^The user clicks on register button$")
    public void TheUserClicksOnRegisterLink() {
        HomePageMethods homePageMethods = new HomePageMethods();
        homePageMethods.ClickOnRegisterLink();
        RegisterPageMethods registerPageMethods = new RegisterPageMethods();
        Assert.assertTrue(registerPageMethods.RegisterPageHeaderIsDisplayed());
    }
    @When("^The user navigates to the Register page$")
    public void TheUserNavigatesToTheRegisterPage() {
        TheUserClicksOnRegisterLink();
    }

    @When("^The user clicks on cart button$")
    public void TheUserClicksOnCartLink() {
        HomePageMethods homePageMethods = new HomePageMethods();
        homePageMethods.ClickOnCartLink();
        CartPageMethods cartPageMethods = new CartPageMethods();
        Assert.assertTrue(cartPageMethods.CartPageHeaderIsDisplayed());
    }
    @When("^The user navigates to cart page$")
    public void TheUserNavigatesToCartPage() {
        TheUserClicksOnCartLink();
    }

    @When("^The user searches about Product as \"(.*)\"$")
    public void TheUserSearchesAboutProductAs(String product) {
        HomePageMethods homePageMethods = new HomePageMethods();
        homePageMethods.EnterSearchText(product);
        homePageMethods.ClickOnSearchButton();
    }


}
