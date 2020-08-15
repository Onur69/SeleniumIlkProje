package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {
        //java projemize, chromedriver'i tanittik. setProperty==> özellik ayarla
    System.setProperty("webdriver.chrome.driver" , "C:\\Users\\onurn\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

    //Selenium'la ilgili ilk kodumuz
    //webDriver nesnesini olusturarak chrome driver'i kullanabilir hale geldik
    WebDriver webDriver = new ChromeDriver();

    //driver'imiza google'a gitmesini soyledik. get==> alip getirmek
    webDriver.get("http://google.com");

    //driver'imizda acik olan pencereyi kapatir. close==> kapatmak
    //webDriver.close();

    //driver'imizi tamamen kapatiyor. quit==> cikmak
    webDriver.quit();












    }
}
