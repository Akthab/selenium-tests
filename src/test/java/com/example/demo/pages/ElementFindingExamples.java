package com.example.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementFindingExamples {
      public void findElementByName(String browser) {
            /*
             * 1. Get webdriver object as per browser name
             * 2. Open facebook
             * 3. Find email element 
             */

            WebDriver driver = Browser.getBrowser(browser);
            //open facebook
            driver.get("https://www.facebook.com");

            //Find email web element
            WebElement emailElement = driver.findElement(By.name("email"));

            //perform any action on the email element
            emailElement.sendKeys("author@quaatso.com");
      }

      public void findElementById(String browser) {
            /*
             * 1. Get webdriver object as per browser name
             * 2. Open facebook
             * 3. Find email element 
             */

            WebDriver driver = Browser.getBrowser(browser);
            //open facebook
            driver.get("https://www.facebook.com");

            //Find email web element
            WebElement emailElement = driver.findElement(By.id("pass"));

            //perform any action on the email element
            emailElement.sendKeys("password");
      }

      public void findElementByLinkText(String browser) {
            /*
             * 1. Get webdriver object as per browser name
             * 2. Open facebook
             * 3. Find email element 
             */

            WebDriver driver = Browser.getBrowser(browser);
            //open facebook
            driver.get("https://www.facebook.com");

            //Find email web element
            WebElement emailElement = driver.findElement(By.linkText("Forgotten password?"));

            //perform any action on the email element
            emailElement.click();
      }

      public void findElementBypartialLinkText(String browser) {
            /*
             * 1. Get webdriver object as per browser name
             * 2. Open facebook
             * 3. Find email element 
             */

            WebDriver driver = Browser.getBrowser(browser);
            //open facebook
            driver.get("https://www.facebook.com");

            //Find email web element
            WebElement emailElement = driver.findElement(By.partialLinkText("Fund"));

            //perform any action on the email element
            emailElement.click();
      }
}
