package TestNG.TestNGSuite2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeSuiteExecution {

    @BeforeSuite
    public void beforeMyTest()
    {
        System.out.println("beforeMySuite");
    }

    @AfterSuite
    public void afterMyTest()
    {
        System.out.println("afterMySuite");
    }
}
