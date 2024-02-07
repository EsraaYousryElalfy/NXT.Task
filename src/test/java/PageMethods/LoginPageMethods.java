package PageMethods;

import CommonClasses.AbstractPageObject;
import CommonClasses.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageMethods extends AbstractPageObject {

    private By _EmailTextBoxLocator = By.id("username");
    private By _PasswordTextBoxLocator = By.id("password");
    private By _LoginButtonLocator = By.xpath("//button[contains(text(),'Login')]");


    public WebElement EmailTextBox() {
        return BaseMethods.findElement(_EmailTextBoxLocator);
    }
    public WebElement PasswordTextBox() { return BaseMethods.findElement(_PasswordTextBoxLocator); }
    public WebElement LoginButton() { return BaseMethods.findElement(_LoginButtonLocator);}

    public void EnterLoginEmail(String email) { BaseMethods.Type(EmailTextBox(),email);}
    public void EnterLoginPassword(String password) { BaseMethods.Type(PasswordTextBox(), password);}
    public void ClickOnLogInButton() { BaseMethods.Click_Element(LoginButton()); }
}
