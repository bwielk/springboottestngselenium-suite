package com.bwielk.testngspring.testngspring.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.bwielk.testngspring.testngspring.commons.WebDriverComponent.getDriver;

public class WebElementComponent {

    public static WebElement getElementByCssSelector(String cssSelector){
        return getDriver().findElement(By.cssSelector(cssSelector));
    }
}
