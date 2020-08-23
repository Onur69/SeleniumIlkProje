package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\onurn\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//syfa yuklenemediyse 10 sn bekle demektir
        driver.manage().window().maximize();

        driver.get("http://facebook.com");
        //1.adim email kutusuna yazdirmak
        //<input type="text" class="inputtext _55r1 _6luy" name="email"
        // id="email" data-testid="royal_email"
        // placeholder="Email address or phone number" autofocus="1"
        // aria-label="Email address or phone number">
        WebElement mailKutusu = driver.findElement(By.id("email"));
        mailKutusu.sendKeys("techproed@gmail.com");

        //2.adim sifre kutusuna yazdirmak

        WebElement sifreKutusu = driver.findElement(By.xpath("//*[@type='password']"));
        sifreKutusu.sendKeys("Test1234");
        //sifreKutusu.submit();

        //3.adim log_in butonuna tiklayalim
        WebElement logIn = driver.findElement(By.cssSelector("#u_0_b"));
        logIn.click();

        //https://www.facebook.com/login/
        String url = driver.getCurrentUrl();

        //burada url 3 sn bekleyecek.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(url.contains("https://www.facebook.com/")){
            System.out.println("Giris basarisiz");
        }else{
            System.out.println("Giris basarili");
        }
        driver.quit();




















    }
}
