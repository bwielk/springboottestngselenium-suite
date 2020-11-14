package simpletestngspringtests;

import base.BaseTestClass;
import com.bwielk.testngspring.testngspring.constants.CarBrands;
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

    @Test(groups = {"functional_tests"})
    private void userCanSearchACarByPrice(){
        homePage.openHomePage();
        homePage.goToSearch();
        searchResultsPage.selectBrand(CarBrands.BMW);
        searchResultsPage.selectPriceRange("5000", "16000");
        searchResultsPage.selectRegistartionYears("2000", "2020");

    }
}
