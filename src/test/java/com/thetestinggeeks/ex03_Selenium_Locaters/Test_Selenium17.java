package com.thetestinggeeks.ex03_Selenium_Locaters;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;


public class Test_Selenium17 {

    @Description("Verify that email and password are correct")
    @Test
    public void test_Selenium17(){
        EdgeOptions options=new EdgeOptions();
        //options.addArguments("start-maximized");
        //options.addArguments("headless");



        WebDriver driver =new EdgeDriver(options);
        driver.get("https://www.lcca.org.uk/");



    }
}
