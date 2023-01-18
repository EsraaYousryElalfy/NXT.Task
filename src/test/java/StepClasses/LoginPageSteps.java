package StepClasses;

import CommonClasses.AbstractPageObject;
import CommonClasses.Property;
import PageMethods.HomePageMethods;
import PageMethods.LoginPageMethods;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageSteps extends AbstractPageObject {

    @When("^The User enters login credentials$")
    public void TheUserEntersLoginCredentials() {
        LoginPageMethods loginPageMethods = new LoginPageMethods();
        loginPageMethods.EnterLoginEmail(Property.getProperty("Email"));
        loginPageMethods.EnterLoginPassword(Property.getProperty("Password"));
        loginPageMethods.ClickOnLogInButton();
    }
}
