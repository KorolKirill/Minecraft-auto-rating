package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/user/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://topcraft.ru/servers/308/");

        WebElement s = driver.findElement(By.xpath("//*[contains(@class, 'btn btn-info btn-vote openLoginModal')]"));
        s.click();
        WebElement s2 = driver.findElement(By.xpath("//*[@id=\"loginModal\"]/div[2]/div/div[2]/div/ul/li/a/i"));
        s2.click();
        WebElement s3 = driver.findElement(By.xpath("//*[contains(@name, 'email')]"));
        s3.sendKeys("380951598644");

        WebElement s4 = driver.findElement(By.xpath("//*[contains(@name, 'pass')]"));
        s4.sendKeys("kaban2002");


        WebElement s5 = driver.findElement(By.xpath("//*[contains(@id, 'install_allow')]"));
        s5.click();

        // разрешение?
        //WebElement s6 = driver.findElement(By.xpath("//*[contains(@class, 'flat_button fl_r button_indent')]"));
        //System.out.println(s6.toString());
        //if(s6 != null)
          //  s6.click();

        WebElement s7 = driver.findElement(By.xpath("//*[contains(@id, 'nick')]"));
        s7.sendKeys("test50");

        WebElement s8 = driver.findElement(By.xpath("//*[contains(@class, 'btn btn-info btn-vote voteBtn')]"));
        s8.click();
        // id nick
        // class btn btn-info btn-vote voteBtn


      //  s2.sendKeys("sashok.brazhnik3@gmail.com");

        // //*[@id="login_submit"]/div/div/input[6]   email
        // //*[@id="login_submit"]/div/div/input[7] pass

      //  WebElement s3 = driver.findElement(By.xpath("//*[contains(@class, 'VfPpkd-RLmnJb')]"));
      //  s3.click();
        // //*[@id="gb"]/div/div[2]/a
       // WebElement s  = driver.findElement(By.id("btnK"));
       // s.click();
       // WebElement element_enter = driver.findElement(By.xpath("//*[@id='input' and not(@disabled)]"));
       // element_enter.sendKeys("asdsa");
      //  driver.get("https://www.google.com/doodles");
       // driver.findElement(new By.ByLinkText("Мне повезёт!")).click();
    }
}
