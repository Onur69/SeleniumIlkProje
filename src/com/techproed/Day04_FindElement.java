package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day04_FindElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\onurn\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //a tagnae'sine ait tum webelement'leri bulalim
        //if-else, for, foreach, methodlar, obje olusturmak, arrays==> bunlar selenium'da onemli
        List<WebElement> listem = driver.findElements(By.tagName("a"));

        for(WebElement w : listem){
            System.out.print(w.getText()+" ");//Home
                                              //(current) Sign in

        }
    }
}
