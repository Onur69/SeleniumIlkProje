package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\onurn\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        //tarayicinin ekrani kaplamasini saglar
        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");

        //navigate().to ==> get() methodu ile ayni isi gorur. navigate==>gezinmek
        webDriver.navigate().to("http://amazon.com");

        //navigate().back() ==> bir onceki sayfaya geri donmeye yariyor,
        webDriver.navigate().back();

        //navigate().forward() ==> geri geldigimiz sayfaya geri donmeye yariyor,
        // örnek : google -> amazona gittik -> amazondan google'a geri geldik
        // eğer forward yaparsak, amazona geri gideriz.
        webDriver.navigate().forward();

        //navigate().refresh() ==> sayfayi yenilemeye yarar.
        webDriver.navigate().refresh();





    }
}
