package com.TestCases;

import com.Base.TestBase;

public class TestCase001 extends TestBase {

    public static void main (String[] args){
        chromelaunch();
        openURl("https://bbc.com");
        closeBrowser();
    }
}
