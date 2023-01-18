package PageMethods;

import CommonClasses.AbstractPageObject;
import CommonClasses.BaseMethods;
import CommonClasses.Property;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegisterPageMethods extends AbstractPageObject {
    // Locators
    private By _RegisterPageHeaderLocator = By.cssSelector("div.registration-page");
    private By _RegistrationMessageLocator = By.xpath("//div[@class='page registration-result-page']//div[@class='result']");
    private By _RegisterContinueButtonLocator = By.cssSelector("a.register-continue-button");
    private By _RegisterButtonLocator = By.xpath("//button[contains(text(),'Register')]");
    private By _GenderRadioButtonLocator = By.xpath("//div[@id='gender']//input");
    private By _FirstNameTextBoxLocator = By.id("#FirstName");
    private By _LastNameTextBoxLocator = By.id("#LastName");
    private By _DayListLocator = By.name("DateOfBirthDay");
    private By _MonthListLoactor = By.name("DateOfBirthMonth");
    private By _YearListLocator = By.name("DateOfBirthYear");
    private By _EmailTextBoxLocator = By.id("#Email");
    private By _CompanyTextBoxLoactor = By.id("#Company");
    private By _PasswordLocator = By.id("#Password");
    private By _ConfirmPasswordlocator = By.id("#ConfirmPassword");

    // Elements methods
    public WebElement RegisterPageHeader() {
        return BaseMethods.findElement(_RegisterPageHeaderLocator);
    }

    public Boolean RegisterPageHeaderIsDisplayed() {
        if (RegisterPageHeader().isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public WebElement RegistrationMessage() {
        return BaseMethods.findElement(_RegistrationMessageLocator);
    }

    public String RegistrationMessageText() {
        return RegistrationMessage().getText().trim();
    }

    public WebElement RegisterContinueButton() {
        return BaseMethods.findElement(_RegisterContinueButtonLocator);
    }

    public void ClickOnRegisterContinueButton() {
        BaseMethods.Click_Element(RegisterContinueButton());
    }

    public WebElement RegisterButton() {
        return BaseMethods.findElement(_RegisterButtonLocator);
    }

    public void ClickOnRegisterButton() {
        BaseMethods.Click_Element(RegisterButton());
    }

    public WebElement ConfirmPassword() {
        return BaseMethods.findElement(_ConfirmPasswordlocator);
    }

    public void EnterConfirmPassword(String ConfirmPassword) {
        BaseMethods.Type(ConfirmPassword(), ConfirmPassword);
    }

    public WebElement Password() {
        return BaseMethods.findElement(_PasswordLocator);
    }

    public void EnterPassword(String Password) {
        BaseMethods.Type(Password(), Password);
    }

    public WebElement CompanyName() {
        return BaseMethods.findElement(_CompanyTextBoxLoactor);
    }

    public void EnterCompanyName(String CompanyName) {
        BaseMethods.Type(CompanyName(), CompanyName);
    }

    public WebElement Email() {
        return BaseMethods.findElement(_EmailTextBoxLocator);
    }

    public void EnterEmail(String Email) {
        BaseMethods.Type(Email(), Email);
    }

    public WebElement Days() {
        return BaseMethods.findElement(_DayListLocator);
    }

    public void SelectDay(String Day) {
        Select select = new Select(Days());
        select.selectByVisibleText(Day);
    }

    public WebElement Months() {
        return BaseMethods.findElement(_MonthListLoactor);
    }

    public void SelectMonth(String Month) {
        Select select = new Select(Months());
        select.selectByVisibleText(Month);
    }

    public WebElement Years() {
        return BaseMethods.findElement(_YearListLocator);
    }

    public void SelectYear(String Year) {
        Select select = new Select(Years());
        select.selectByVisibleText(Year);
    }

    public WebElement LastName() {
        return BaseMethods.findElement(_LastNameTextBoxLocator);
    }

    public void EnterLastName(String LastName) {
        BaseMethods.Type(LastName(), LastName);
    }

    public WebElement FirstName() {
        return BaseMethods.findElement(_FirstNameTextBoxLocator);
    }

    public void EnterFirstName(String FirstName) {
        BaseMethods.Type(FirstName(), FirstName);
    }

    public List<WebElement> Genders() {
        return BaseMethods.findElements(_GenderRadioButtonLocator);
    }

    public void SelectGender(String Gender) {
        for (WebElement gender : Genders()) {
            if (gender.getAttribute("id").contains(Gender)) {
                BaseMethods.Click_Element(gender);
            }
        }
    }
}
