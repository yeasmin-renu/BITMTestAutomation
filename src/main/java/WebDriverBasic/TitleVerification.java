package WebDriverBasic;

import com.Base.TestBase;

public class TitleVerification extends TestBase {
    public static void main (String[] args){
        chromelaunch();
        TestCase_001();
        TestCase_002();
        TestCase_003();
        TestCase_004();
        closeBrowser();

    }
    public static void TestCase_001(){
        //step 1
        openURl("https://apple.com");
        //step 2
        String exp_title="Apple";
        String act_title= driver.getTitle();

        //step 3= compare
        if(exp_title.equals(act_title)){
            System.out.println("Title is verified. Testcase Passed");
        }
        else{
            System.out.println("Title is not verified. Testcase Failed");
        }


    }

    public static void TestCase_002(){
        //step 1
        openURl("https://apple.com");
        //step 2
        String exp_title="apple";
        String act_title= driver.getTitle();

        //step 3= compare
        if(exp_title.equals(act_title)){
            System.out.println("Title is verified. Testcase Passed");
        }
        else{
            System.out.println("Title is not verified. Testcase Failed");
        }


    }

    public static void TestCase_003(){
        //step 1
        openURl("https://apple.com");
        //step 2
        String exp_title="APPLE";
        String act_title= driver.getTitle();

        //step 3= compare
        if(exp_title.equals(act_title)){
            System.out.println("Title is verified. Testcase Passed");
        }
        else{
            System.out.println("Title is not verified. Testcase Failed");
        }


    }

    public static void TestCase_004(){
        //step 1
        openURl("https://apple.com");
        //step 2
        String exp_title=" ";
        String act_title= driver.getTitle();

        //step 3= compare
        if(exp_title.equals(act_title)){
            System.out.println("Title is verified. Testcase Passed");
        }
        else{
            System.out.println("Title is Empty. Testcase Failed");
        }


    }
}
