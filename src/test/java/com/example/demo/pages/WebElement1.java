package com.example.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElement1 {

      public void handleIframe(String browser) {
            WebDriver driver = Browser.getBrowser(browser);

            driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

            //switch to the parent iframe
            driver.switchTo().frame("iframeResult");

            // find child frame
            WebElement childframe = driver.findElement(By.tagName("iframe"));
 
            //switch to the child frame
            driver.switchTo().frame(childframe);

            // click on html link
            driver.findElement(By.linkText("Learn HTML")).click();

            // switch to the parent frame
            driver.switchTo().parentFrame();

            // switch to default content
            driver.switchTo().defaultContent();
      }
      
}
