package com.bwielk.testngspring.testngspring.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverComponent {

    public static WebDriver driver;

    public static WebDriver launchBrowser(String nameOfTestMethod){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("name", nameOfTestMethod);
        capabilities.setCapability("elementScrollBehavior", true);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(capabilities);
        System.out.println("-----------------    " + nameOfTestMethod + "    -----------------");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete"));
        driver.manage().deleteAllCookies();
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
