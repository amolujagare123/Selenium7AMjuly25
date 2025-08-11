package TestNG.TestSuite1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassTwo {

    @Test
    public void classTwoTest1() {
        System.out.println("classTwoTest1");
    }

    @Test
    public void classTwoTest2() {
        System.out.println("classTwoTest2");

        Assert.assertEquals(true,false,
                "This test is failed");
    }

    @Test(groups = "email")
    public void classTwoTest3() {
        System.out.println("classTwoTest3");
    }
}