package com.bwielk.testngspring.testngspring.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.bwielk.testngspring.testngspring.commons.WebDriverComponent.getDriver;

public class Waits {

    private static WebDriverWait wait = new WebDriverWait(getDriver(), 60);

    public static void waitUntilElementVisible(String cssSelector){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
    }

    public static void waitUntilElementClickable(String cssSelector){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelector)));
    }
}
