package StepClasses;

import CommonClasses.AbstractPageObject;
import CommonClasses.BaseMethods;
import CommonClasses.Property;
import PageMethods.HomePageMethods;
import PageMethods.RegisterPageMethods;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterPageSteps extends AbstractPageObject {

    @When("^The user registers new User Successfully$")
    public void TheUserRegistersNewUserSuccessfully() {
        RegisterPageMethods registerPageMethods = new RegisterPageMethods();
        registerPageMethods.SelectGender(Property.getProperty("Gender"));
        registerPageMethods.EnterFirstName(Property.getProperty("FirstName"));
        registerPageMethods.EnterLastName(Property.getProperty("LastName"));
        registerPageMethods.SelectDay(Property.getProperty("Day"));
        registerPageMethods.SelectDay(Property.getProperty("Month"));
        registerPageMethods.SelectDay(Property.getProperty("Year"));
        registerPageMethods.EnterEmail(Property.getProperty("Email"));
        registerPageMethods.EnterCompanyName(Property.getProperty("CompanyName"));
        registerPageMethods.EnterPassword(Property.getProperty("Password"));
        registerPageMethods.EnterConfirmPassword(Property.getProperty("ConfirmPassword"));
        registerPageMethods.ClickOnRegisterButton();
    }

    @Then("The User Registered Successfully")
    public void TheUserRegisteredSuccessfully() {
        RegisterPageMethods registerPageMethods = new RegisterPageMethods();
        Assert.assertEquals("Your registration completed" , registerPageMethods.RegistrationMessageText());
    }

    @When("^The user clicks on continue button$")
    public void TheUserClicksOnContinueButton() {
        RegisterPageMethods registerPageMethods = new RegisterPageMethods();
        registerPageMethods.ClickOnRegisterContinueButton();
        HomePageMethods homePageMethods = new HomePageMethods();
        Assert.assertTrue(homePageMethods.TopicTitleIsDisplayed());
    }
}
