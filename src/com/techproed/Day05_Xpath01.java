package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\onurn\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//syfa yuklenemediyse 10 sn bekle demektir
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com/sign_in");

        //xpath ile 1.yol ==> element bulma
        WebElement emailKutusu = driver.findElement(By.xpath("//input[@type='email']"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement paswordKutusu = driver.findElement(By.xpath("//input[@type='password']"));
        paswordKutusu.sendKeys("Test1234!");

        WebElement signIn = driver.findElement(By.xpath("//input[@type='submit']"));
        signIn.click();

    }
}
