package PageMethods;

import CommonClasses.AbstractPageObject;
import CommonClasses.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageMethods extends AbstractPageObject {

    private By _EmailTextBoxLocator = By.xpath("");
    private By _PasswordTextBoxLocator = By.xpath("");
    private By _LoginButtonLocator = By.xpath("");
    private By _LoginPageHeaderLocator = By.cssSelector("div.login-page");

    public WebElement EmailTextBox() {
        return BaseMethods.findElement(_EmailTextBoxLocator);
    }
    public WebElement PasswordTextBox() { return BaseMethods.findElement(_PasswordTextBoxLocator); }
    public WebElement LoginButton() { return BaseMethods.findElement(_LoginButtonLocator);}
    public WebElement LoginPageHeader() {
        return BaseMethods.findElement(_LoginPageHeaderLocator);
    }
    public Boolean LoginPageHeaderIsDisplayed() {
        if(LoginPageHeader().isDisplayed()){ return true; }
        else { return false; }
    }
    public void EnterLoginEmail(String email) { BaseMethods.Type(EmailTextBox(),email);}
    public void EnterLoginPassword(String password) { BaseMethods.Type(PasswordTextBox(), password);}
    public void ClickOnLogInButton() { BaseMethods.Click_Element(LoginButton()); }
}
