package TestNG.TestSuite3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {



    @Parameters({"myEmail","myPhone"})
    @Test
    public void classTwoTest1(String email,String phone) {
        System.out.println("classTwoTest1");
        System.out.println("Email="+email);
        System.out.println("Phone="+phone);
    }

    @Test
    public void classTwoTest2() {
        System.out.println("classTwoTest2");
    }

    @Test(groups = "email")
    public void classTwoTest3() {
        System.out.println("classTwoTest3");
    }
}