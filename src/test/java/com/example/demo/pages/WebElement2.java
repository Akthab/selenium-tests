package com.example.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElement2 {
      
      public void openWebPageUsingNavigation(String browser) {
            WebDriver driver = Browser.getBrowser(browser);

            //open facebook page using navigation class
            driver.navigate().to("https://www.facebook.com");
      }

      public void handleBackwardNavigation(String browser) {
            WebDriver driver = Browser.getBrowser(browser);

            //open facebook page using navigation class
            driver.navigate().to("https://www.facebook.com");

            //open w3school
            driver.navigate().to("https://www.w3school.com");

            try {
                  Thread.sleep(3000);
            } catch (Exception e) {
                  // TODO: handle exception
                  e.printStackTrace();
            }

            //backward navigation
            driver.navigate().back();
      }

      public void handleForwardNavigation(String browser) {
            WebDriver driver = Browser.getBrowser(browser);

            //open facebook page using navigation class
            driver.navigate().to("https://www.facebook.com");

            //open about page
            driver.findElement(By.linkText("Groups")).click();

            //click on login button
            driver.findElement(By.partialLinkText("Log In")).click();


            //open w3school
            driver.navigate().back();

            try {
                  Thread.sleep(3000);
            } catch (Exception e) {
                  // TODO: handle exception
                  e.printStackTrace();
            }

            //backward navigation
            driver.navigate().forward();

            try {
                  Thread.sleep(3000);
            } catch (Exception e) {
                  // TODO: handle exception
                  e.printStackTrace();
            }

            //backward navigation
            driver.navigate().back();

            try {
                  Thread.sleep(3000);
            } catch (Exception e) {
                  // TODO: handle exception
                  e.printStackTrace();
            }

            //backward navigation
            driver.navigate().forward();
      }

      public void handlePageRefresh(String browser) {
            WebDriver driver = Browser.getBrowser(browser);

            //open facebook
            driver.navigate().to("https://www.facebook.com");

            //refresh page
            driver.navigate().refresh();
      }
}
