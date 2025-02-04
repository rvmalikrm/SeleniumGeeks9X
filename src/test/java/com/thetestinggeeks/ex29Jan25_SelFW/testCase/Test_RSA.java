package com.thetestinggeeks.ex29Jan25_SelFW.testCase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
/****************************************************************************
 *                                                                          *
 *          Program Name: Automating the RahulshettyAcademy login Page        *
 * -----------------------------------------------------------------------  *
 * Description:                                                             *
 * Enter the username and password on differenct veiw with same Url
 * then veriying the line text using assert.*
 *                                                                          *
 *                                                                          *
 * Author: Ravi Malik                                                       *
 * Date Created: February 04, 2025                                           *
 * Last Modified: February 04, 2025                                          *
 * Version: 1.0                                                             *
 * Contact: rm.rvmalik@gmail.com
 * creds: Username Ravi Malik*
 * Password : rahulshettyacademy
 *                                                                          *
 ***************************************************************************/
public class Test_RSA {
    public static void main(String[] args)  {
        String name="Ravi malik";
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.cssSelector(".forgot-pwd-container")).click();
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("RaviMalik");
        driver.findElement(By.cssSelector("input[placeholder='Email")).sendKeys("ravtest91@gmail.com");
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Phone')]")).sendKeys("9568810724");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".reset-pwd-btn")));
        element.click();
        String str=driver.findElement(By.className("infoMsg")).getText();
        System.out.println(str);
        int fin=str.indexOf("'");
        int lin=str.lastIndexOf("'");
        System.out.println("fin"+fin);
        System.out.println("lin"+lin);
        String str2=str.substring(fin+1,lin);
        System.out.println("str2 =  "+str2);
        driver.findElement(By.xpath("//button[starts-with(@class,'go')]")).click();
        driver.findElement(By.cssSelector("input[id*='User']")).sendKeys(name);
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(str2);
        WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign In']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", signInButton);
//        WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
//        WebElement ele2=wait2.until(ExpectedConditions.presenceOfElementLocated(By.tagName("p")));
//        ele2.getText();
//        System.out.println(ele2.getText());
//        try {
//            Thread.sleep(2000);
//            WebElement ele3= driver.findElement(By.tagName("p"));
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        WebElement ele3= driver.findElement(By.xpath("//p[text()='You are successfully logged in.']"));
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
        driver.findElement(By.cssSelector(".logout-btn")).click();
        driver.quit();
    }
}
