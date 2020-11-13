package com.bwielk.testngspring.testngspring.browseractions;
import com.bwielk.testngspring.testngspring.waits.Waits;

import static com.bwielk.testngspring.testngspring.commons.WebElementComponent.getElementByCssSelector;

public class ClickableActions {

    public static void clickElement(String cssSelector){
        Waits.waitUntilElementClickable(cssSelector);
        getElementByCssSelector(cssSelector).click();
    }
}
