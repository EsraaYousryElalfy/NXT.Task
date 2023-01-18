package StepClasses;

import PageMethods.CommonMethods;
import PageMethods.HomePageMethods;
import cucumber.api.java.en.Given;
import org.junit.Assert;

public class PageNavigationStepClasses {

    @Given("^The user launched the Application$")
    public static void theUserHasLaunchedTheApplication() throws Exception {
        CommonMethods.TheUserHasLaunchedTheNopCommerceApplication();
        HomePageMethods homePageMethods = new HomePageMethods();
        Assert.assertTrue(homePageMethods.PageHeaderIsDisplayed());
    }

    @Given("^The user launched the Login Page$")
    public static void theUserHasLaunchedTheLoginPage() throws Exception {
        theUserHasLaunchedTheApplication();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps.TheUserNavigatesToTheLoginPage();
    }

    @Given("^The user launched the Register Page$")
    public static void theUserHasLaunchedTheRegisterPage() throws Exception {
        theUserHasLaunchedTheApplication();
        HomePageSteps homePageSteps = new HomePageSteps();
        homePageSteps.TheUserNavigatesToTheRegisterPage();
    }
}
