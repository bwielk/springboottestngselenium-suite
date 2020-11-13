package simpletestngspringtests;

import base.BaseTestClass;
import com.bwielk.testngspring.testngspring.pages.HomePage;
import com.bwielk.testngspring.testngspring.pages.SearchResultsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;


public class SearchFeatureTest extends BaseTestClass {

    @Autowired
    private HomePage homePage;
    @Autowired
    private SearchResultsPage searchResultsPage;


    @Test(groups = {"functional_tests"})
    private void homePagePromoContentIsDisplayedCorrectly() {
        homePage.openHomePage();
        homePage.checkBannerContents();
    }
}
