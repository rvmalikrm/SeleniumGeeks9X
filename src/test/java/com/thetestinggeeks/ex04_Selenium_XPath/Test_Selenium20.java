package com.thetestinggeeks.ex04_Selenium_XPath;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;


public class Test_Selenium20 {

    @Description("Verify that email and password are correct")
    @Test
    public void test_Selenium20(){
        EdgeOptions options=new EdgeOptions();
        //options.addArguments("start-maximized");
        //options.addArguments("headless");



        WebDriver driver =new EdgeDriver(options);
        driver.get("https://www.lcca.org.uk/");



    }
}
