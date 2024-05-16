package com.example.demo.pages;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaits {
      
      @SuppressWarnings("unchecked")
      public void fluentWait(String browser) {

            WebDriver driver = Browser.getBrowser(browser);
            
            //open w3 schools
            driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

            //switch to the iframe
            driver.switchTo().frame("iframeResult");

            //wait till a condition is satisfied
            Wait wait = new FluentWait(driver).withTimeout(Duration.ofMillis(5000)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchFieldException.class);

            //implement the wait condition
            wait.until(new Function<WebDriver, WebElement>() {

                  public WebElement apply(WebDriver driver) {
                        WebElement element = driver.findElement(By.tagName("button"));
                        return element;
                  }
            });

            //find and click the alert
            driver.findElement(By.tagName("button")).click();

            //switch to the alert
            driver.switchTo().alert().accept();
      }

      @SuppressWarnings("unchecked")
      public void webDriverWait(String browser) {

            WebDriver driver = Browser.getBrowser(browser);
            
            //open w3 schools
            driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

            //switch to the iframe
            driver.switchTo().frame("iframeResult");

            //find and click the alert
            driver.findElement(By.tagName("button")).click();

            //wait till a condition is satisfied
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            //implement the wait condition
            wait.until(ExpectedConditions.alertIsPresent());

            //switch to the alert
            driver.switchTo().alert().accept();
      }
}
