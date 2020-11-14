package com.bwielk.testngspring.testngspring.browseractions;

import com.bwielk.testngspring.testngspring.waits.Waits;
import static com.bwielk.testngspring.testngspring.commons.WebElementComponent.getElementByCssSelector;

public class ElementCheckActions {

    public static void checkTextDisplayed(String cssSelector, String textToCheck){
        Waits.waitUntilElementVisible(cssSelector);
        assert getElementByCssSelector(cssSelector).getText().equals(textToCheck);
    }

    public static void checkElementDisplayed(String cssSelector){
        Waits.waitUntilElementVisible(cssSelector);
        assert getElementByCssSelector(cssSelector).isDisplayed();
    }
}
