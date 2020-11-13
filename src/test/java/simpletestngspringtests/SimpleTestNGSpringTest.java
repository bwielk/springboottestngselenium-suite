package simpletestngspringtests;

import com.bwielk.testngspring.testngspring.TestngspringApplication;
import com.bwielk.testngspring.testngspring.exampleservice.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest(classes = TestngspringApplication.class)
public class SimpleTestNGSpringTest extends AbstractTestNGSpringContextTests {

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
}
