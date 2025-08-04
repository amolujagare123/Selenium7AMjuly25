package TestNG.TestSuite3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {
    @Parameters({"myEmail","myPhone"})
    @Test
    public void classThreeTest1(String email,String phone) {
        System.out.println("classThreeTest1");
        System.out.println("Email="+email);
        System.out.println("Phone="+phone);
    }

    @Test
    public void classThreeTest2() {
        System.out.println("classThreeTest2");
    }

    @Test(groups = "email")
    public void classThreeTest3() {
        System.out.println("classThreeTest3");
    }
}