package base;

import com.bwielk.testngspring.testngspring.TestngspringApplication;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestResult;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;

@SpringBootTest(classes = TestngspringApplication.class)
public class BaseTestClass extends AbstractTestNGSpringContextTests {

    public WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void before(){
        System.out.println("Test Suite is running");
    }

    @BeforeMethod(alwaysRun = true)
    public void launchBrowser(Method method){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("name", method.getName());
        capabilities.setCapability("elementScrollBehavior", true);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(capabilities);
        System.out.println("-----------------    " + method.getName() + "    -----------------");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete"));
        driver.manage().deleteAllCookies();
        driver.get("https://www.autohero.com/de/");
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(ITestResult testResult, Method method){
        System.out.println("------- The webdriver is closing --------");
        if(testResult.isSuccess()){
            System.out.println(String.format("\n\n\nTest '%s' has successfully PASSED", method.getName()));
        }else{
            System.out.println(String.format("\n\n\nTest '%s' has FAILED", method.getName()));
        }
        driver.quit();
    }
}