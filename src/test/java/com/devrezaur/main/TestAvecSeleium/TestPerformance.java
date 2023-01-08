package com.devrezaur.main.TestAvecSeleium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestPerformance {
    public WebDriver driver;
    public void sleep(){
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

   @Test
 public  void MySeleniumTest() {
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        System.out.println("avant entrer");
        driver.get("http://localhost:9090");
        //    sleep();
      // driver.get("https://www.google.com/");
       driver.findElement(By.id("username")).sendKeys("ayoub");
        //  sleep();
       driver.findElement(By.id("submitButton")).submit();
           WebElement radio = driver.findElement(By.xpath("//input[@value='3']"));
           radio.click();
   //        WebElement radio1 = driver.findElement(By.xpath("//input[@value='3']"));
   //        radio1.click();
       sleep();
       driver.findElement(By.id("submitButton")).submit();
  //      System.out.println("apres entrer");

   }

}

