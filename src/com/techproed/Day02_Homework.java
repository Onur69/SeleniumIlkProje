package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\onurn\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        //1- driver'a gidelim
        WebDriver driver = new ChromeDriver();

        //2- facebook'a gidelim ve title'ina bakalim ve "facebook" olup oladigina inceleyelim
        //eger "facebook" degilse dogru title'i yazdiralim.
        driver.navigate().to("http://facebook.com");
        String titleFacebook = driver.getTitle();

        if (titleFacebook.equals("facebook")) {
            System.out.println("Title'imiz 'facebook' iceriyor!");
        } else {
            System.out.println("Title'imiz 'facebook' icermiyor!\nTitle'in dogrusu: "+titleFacebook);
        }
        //3- facebook'un url'sine bakalim ve "facebook" icerip icermedigine bakalim.
        //eger iceriyorsa "iceriyor" icermiyorsa "icermiyor" diye yazdiralim
        String urlFacebook = driver.getCurrentUrl();

        if (urlFacebook.contains("facebook")) {
            System.out.println("url 'facebook' iceriyor");
        } else {
            System.out.println("url facebook icermiyor\nURL= "+urlFacebook);
        }
        //4- walmart.com'a gidelim. ve title'ina bakalim.
        driver.navigate().to("http://walmart.com");
        String titleWalmart = driver.getTitle();

        //5- title'i Walmart.com iceriyorsa "dogru" diyelim, icermiyorsa "yanlis" diyelim.
        if(titleWalmart.contains("Walmart.com")){
            System.out.println("Title 'Walmart.com' iceriyor.");
        }else{
            System.out.println("Title 'Walmart.com' icermiyor.\nDogrusu= "+titleWalmart);
        }
        //6- facebook'a geri donelim.
        driver.navigate().back();
        //7- facebook sayfasini yenileyelim.
        driver.navigate().refresh();
        //8- driver'a ekrani kaplatalim.
        driver.manage().window().maximize();
        //9- driveri close yapalim.
        driver.close();

    }
}
