package TestNG.TestSuite3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

    @Parameters({"myEmail","myPhone"})
    @Test
    public void classOneTest1(String email,String phone){
        System.out.println("classOneTest1");
        System.out.println("Email="+email);
        System.out.println("Phone="+phone);
    }

    @Test//(enabled = false)
    public void classOneTest2(){
        System.out.println("classOneTest2");
    }


    @Test (groups = "email")
    public void classOneTest3(){
        System.out.println("classOneTest3");
    }
}
