package simpletestngspringtests;

import base.BaseTestClass;
import com.bwielk.testngspring.testngspring.exampleservice.ExampleService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;


public class SimpleTestNGSpringTest extends BaseTestClass {

    @Autowired
    private ExampleService exampleService;

    @Test(groups = {"functional_tests"})
    private void exampleTest(){
        int number = 5;
        assert number != 3;
    }

    @Test(groups = {"do_not_run"})
    private void doNotRunTest(){
        String stringToTest = "Hello Worls";
        assert stringToTest.equals("Hello World");
    }

    @Test(groups = {"functional_tests"})
    private void exampleServiceReturnsANameThatContainsWordRobot(){
        String nameToCheck = exampleService.generateName();
        System.out.println(nameToCheck);
        assert nameToCheck.contains("Robot");
    }

    @Test(groups = {"functional_tests"})
    private void exampleWebTest() {
        WebElement mainCTA = driver.findElement(By.cssSelector("[data-qa-selector=\"cta-button\"]"));
        System.out.println("Found element with text: " + mainCTA.getText().toUpperCase());
        mainCTA.click();
        String selector = "[data-qa-selector=\"title\"]";
        new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));
        WebElement expectedElement = driver.findElement(By.cssSelector(selector));
        assert expectedElement.isDisplayed();
        assert expectedElement.getText().equals("Deine Autosuche: Finde deinen neuen Gebrauchtwagen");
    }
}
