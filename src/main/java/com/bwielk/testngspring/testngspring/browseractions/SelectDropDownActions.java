package com.bwielk.testngspring.testngspring.browseractions;

import com.bwielk.testngspring.testngspring.waits.Waits;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.bwielk.testngspring.testngspring.commons.WebElementComponent.getElementByCssSelector;

public class SelectDropDownActions {

    public static void selectOption(String cssSelectorDropdown, String optionToSelect){
        Waits.waitUntilElementVisible(cssSelectorDropdown);
        WebElement selectDropdown = getElementByCssSelector(cssSelectorDropdown);
        Select select = new Select(selectDropdown);
        select.selectByValue(optionToSelect);
    }
}
