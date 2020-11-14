package com.bwielk.testngspring.testngspring.pages;

import com.bwielk.testngspring.testngspring.browseractions.ClickableActions;
import com.bwielk.testngspring.testngspring.browseractions.ElementCheckActions;
import com.bwielk.testngspring.testngspring.browseractions.SelectDropDownActions;
import com.bwielk.testngspring.testngspring.constants.CarBrands;
import org.springframework.stereotype.Component;

import static com.bwielk.testngspring.testngspring.selector.SearchPageSelectors.*;

@Component
public class SearchResultsPage {

    public SearchResultsPage selectBrand(CarBrands carBrand){
        ClickableActions.clickElement(CAR_MAKER_FILTER_BUTTON);
        ClickableActions.clickElement(String.format(CAR_MODEL_ELEMENT, carBrand.getCarBrand()));
        ElementCheckActions.checkElementDisplayed(BACK_TO_MAKERS);
        return this;
    }

    public SearchResultsPage selectRegistartionYears(String startYear, String endYear){
        ClickableActions.clickElement(FIRST_REG_FILTER_BUTTON);
        ClickableActions.clickElement(CAR_FIRST_REG_RANGE_START);
        SelectDropDownActions.selectOption(CAR_FIRST_REG_RANGE_START, startYear);
        ClickableActions.clickElement(CAR_FIRST_REG_RANGE_END);
        SelectDropDownActions.selectOption(CAR_FIRST_REG_RANGE_END, endYear);
        return this;
    }

    public SearchResultsPage selectPriceRange(String startPrice, String endPrice){
        ClickableActions.clickElement(CAR_PRICE_FILTER_BUTTON);
        ClickableActions.clickElement(CAR_PRICE_RANGE_START);
        SelectDropDownActions.selectOption(CAR_PRICE_RANGE_START, startPrice);
        ClickableActions.clickElement(CAR_PRICE_RANGE_END);
        SelectDropDownActions.selectOption(CAR_PRICE_RANGE_END, endPrice);
        return this;
    }

}
