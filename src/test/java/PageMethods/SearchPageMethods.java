package PageMethods;

import CommonClasses.AbstractPageObject;
import CommonClasses.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPageMethods extends AbstractPageObject {

    private By _SearchItemsLocator = By.cssSelector("div.product-grid h2.product-title a");
    public List<WebElement> SearchItems() { return BaseMethods.findElements(_SearchItemsLocator); }
    public void SelectSearchSuggestionByID(int id) { BaseMethods.Click_Element(SearchItems().get(id)); }
}
