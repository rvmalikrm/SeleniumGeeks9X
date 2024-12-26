package com.thetestinggeeks.ex01_SeleniumTest;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Selenium01 {
    @Test

    public void testSelenium01(){
        EdgeDriver driver =new EdgeDriver();
        driver.get("https://www.google.com");





    }
}
