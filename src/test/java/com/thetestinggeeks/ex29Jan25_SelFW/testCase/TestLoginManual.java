package com.thetestinggeeks.ex29Jan25_SelFW.testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestLoginManual {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.zoho.com/");
        String s=driver.getWindowHandle();
        System.out.println(driver.getTitle());
        System.out.println(s);
        driver.findElement(By.xpath("//a[@class='zgh-login'][normalize-space()='Sign In']")).click();
        Thread.sleep(500);
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement user_id=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login_id']")));
        user_id.sendKeys("ravtest91@gmail.com");
        //driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("ravtest91@gmail.com");
        driver.findElement(By.id("nextbtn")).click();
        Thread.sleep(500);
        driver.findElement(By.name("PASSWORD")).sendKeys("Institute@29");
        driver.findElement(By.xpath("//button[@id='nextbtn']")).click();

    }
}
