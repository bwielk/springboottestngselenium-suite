package com.bwielk.testngspring.testngspring.pages;

import com.bwielk.testngspring.testngspring.browseractions.ClickableActions;
import com.bwielk.testngspring.testngspring.browseractions.ElementCheckActions;
import com.bwielk.testngspring.testngspring.content.HomePageContent;
import com.bwielk.testngspring.testngspring.content.SearchResultPageContent;
import com.bwielk.testngspring.testngspring.selector.HomePageSelectors;
import com.bwielk.testngspring.testngspring.selector.SearchPageSelectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.bwielk.testngspring.testngspring.commons.WebDriverComponent.getDriver;

@Component
public class HomePage {

    @Autowired
    private SearchResultsPage searchResultsPage;

    public HomePage openHomePage(){
        getDriver().get("https://www.autohero.com/de/");
        return this;
    }

    public HomePage checkBannerContents(){
        ElementCheckActions.checkTextDisplayed(HomePageSelectors.BANNER, HomePageContent.BANNER);
        ElementCheckActions.checkTextDisplayed(HomePageSelectors.SUBBANNER, HomePageContent.SUBBANNER);
        return this;
    }

    public SearchResultsPage goToSearch(){
        ClickableActions.clickElement(HomePageSelectors.SEARCH_BUTTON);
        ElementCheckActions.checkTextDisplayed(SearchPageSelectors.PAGE_TITLE, SearchResultPageContent.SEARCH_RESULTS_PAGE_TITLE);
        return searchResultsPage;
    }


}
