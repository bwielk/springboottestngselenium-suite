package base;

import com.bwielk.testngspring.testngspring.TestngspringApplication;
import com.bwielk.testngspring.testngspring.commons.WebDriverComponent;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;

@SpringBootTest(classes = TestngspringApplication.class)
public class BaseTestClass extends AbstractTestNGSpringContextTests {

    @BeforeSuite(alwaysRun = true)
    public void before(){
        System.out.println("Test Suite is running");
    }

    @BeforeMethod(alwaysRun = true)
    public void launchBrowser(Method method){
        WebDriverComponent.launchBrowser(method.getName());
    }


    @AfterMethod(alwaysRun = true)
    public void closeBrowser(ITestResult testResult, Method method){
        System.out.println("------- The webdriver is closing --------");
        if(testResult.isSuccess()){
            System.out.println(String.format("\n\n\nTest '%s' has successfully PASSED", method.getName()));
        }else{
            System.out.println(String.format("\n\n\nTest '%s' has FAILED", method.getName()));
        }
        WebDriverComponent.quitDriver();
    }
}