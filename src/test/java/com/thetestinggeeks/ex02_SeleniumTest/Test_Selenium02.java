package com.thetestinggeeks.ex02_SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_Selenium02 {
    @Test
    public void test_SeleniumTc2() {


    WebDriver driver = new FirefoxDriver();

    driver.navigate().to("https://www.lat.london/");
    driver.manage().window().maximize();
    //driver.findElement(ByXPath, "//a[@class='btn btn-orange nav-enquire-btn font-weight-bold']").click();


}

}
