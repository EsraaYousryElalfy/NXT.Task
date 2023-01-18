package PageMethods;

import CommonClasses.AbstractPageObject;
import CommonClasses.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageMethods extends AbstractPageObject {

    private By _PageHeaderLogoLocator = By.xpath("//img[@src='https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png']");
    private By _RegisterLinkLocator = By.cssSelector("a.ico-register");
    private By _LoginLinkLocator = By.cssSelector("a.ico-login");
    private By _TopicTitleLocator = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    private By _LogoutLinkLocator = By.cssSelector("a.ico-logout");
    private By _SearchTextBoxLocator = By.id("#small-searchterms");
    private By _SearchButtonLocator = By.cssSelector("button.search-box-button");
    private By _CartLinkLocator = By.cssSelector("a.ico-cart");

    public WebElement PageHeaderLogo() {
        return BaseMethods.findElement(_PageHeaderLogoLocator);
    }

    public Boolean PageHeaderIsDisplayed() {
        if (PageHeaderLogo().isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public WebElement LoginLink() {
        return BaseMethods.findElement(_LoginLinkLocator);
    }

    public WebElement LogoutLink() {
        return BaseMethods.findElement(_LogoutLinkLocator);
    }

    public WebElement RegisterLink() {
        return BaseMethods.findElement(_RegisterLinkLocator);
    }

    public WebElement SearchTextBox() {
        return BaseMethods.findElement(_SearchTextBoxLocator);
    }

    public WebElement SearchButton() {
        return BaseMethods.findElement(_SearchButtonLocator);
    }

    public void ClickOnLoginLink() {
        BaseMethods.Click_Element(LoginLink());
    }

    public void ClickOnRegisterLink() {
        BaseMethods.Click_Element(RegisterLink());
    }

    public WebElement TopicTitle() {
        return BaseMethods.findElement(_TopicTitleLocator);
    }

    public Boolean TopicTitleIsDisplayed() {
        if (TopicTitle().isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean LogoutLinkIsDisplayed() {
        if (LogoutLink().isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public void EnterSearchText(String text) {
        BaseMethods.Type(SearchTextBox(), text);
    }

    public void ClickOnSearchButton() {
        BaseMethods.Click_Element(SearchButton());
    }

    public WebElement CartLink() { return BaseMethods.findElement(_CartLinkLocator); }

    public void ClickOnCartLink() { BaseMethods.Click_Element(CartLink()); }

}
