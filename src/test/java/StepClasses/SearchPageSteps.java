package StepClasses;

import CommonClasses.AbstractPageObject;
import PageMethods.ProductPageMethods;
import PageMethods.SearchPageMethods;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchPageSteps extends AbstractPageObject {

    @When("^The user selects the search suggestion no \"(.*)\"$")
    public void TheUserSelectsTheSearchSuggestionNo(int id) {
        SearchPageMethods searchPageMethods = new SearchPageMethods();
        int idNo = id-1;
        searchPageMethods.SelectSearchSuggestionByID(idNo);
    }
}
