package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {
    public static WebDriver driver; //webdriver=interface , driver=reference variable
    public static void main (String[] args){
        chromelaunch();

    }
    //set drive path:static
    public static void chromelaunch(){
        //System.setProperty("webdriver.chrome.driver","/Users/yeasminara/Documents/IntelliJ Workspace/src/main/resources/chromedriver");
        //set path: Dynamic
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/chromedriver");
        driver=new ChromeDriver() ; //constructor of chromedriver

        //maximize window size
        driver.manage().window().maximize();

        //open url
        //openURl ("https://google.com");
        openURl ("https://apple.com");
        closeBrowser ();

    }

    public static void openURl (String Url){
        driver.get(Url);
    }

    public static void closeBrowser (){
        driver.close();
    }

}
