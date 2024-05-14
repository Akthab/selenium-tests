package com.example.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElement1 {

      public void handleIframe(String browser) {
            WebDriver driver = Browser.getBrowser(browser);

            driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

            driver.findElement(By.linkText("LEARN HTML")).click();
 
      }
      
}
