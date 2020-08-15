package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    public static void main(String[] args) {
        //1. ilkonce google.com'a gidiniz
        //2. ordan youtube.com'a gidin
        //3. google.com'a back method'uyla geri donun
        //4. youtube.com'a forward method'u ile geri donunuz.
        //5. youtube.com'u refresh method'uyla yenileyiniz
        //6. driver'i quit method'uyla kapatin

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\onurn\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://google.com");

        webDriver.get("http://youtube.com");

        webDriver.navigate().back();

        webDriver.navigate().forward();

        webDriver.navigate().refresh();

        webDriver.quit();

    }
}
