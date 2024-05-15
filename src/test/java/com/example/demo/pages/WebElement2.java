package com.example.demo.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

      public void handleMultipleWindows(String browser) {
            WebDriver driver = Browser.getBrowser(browser);

            //open w3schools

            driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");

            //print the title of the page
            System.out.println("Parent title is " + driver.getTitle());

            //switch to the iframe
            driver.switchTo().frame("iframeResult");

            //capture window id
            String parentWindowId = driver.getWindowHandle();

            System.out.println("Parent window Id is " + parentWindowId);

            //click over the button
            driver.findElement(By.tagName("button")).click();

            //get all windows IDS
            Set<String> windIdsSet = driver.getWindowHandles();

            //convert to list

            List<String> windIdsList = new ArrayList<String>(windIdsSet);

            //switch to the child window
            driver.switchTo().window(windIdsList.get(1));

            //print the title of the child page
            System.out.println("Child title is " + driver.getTitle());

            //switch to the parent page
            driver.switchTo().window(parentWindowId);
            System.out.println("Parent title is " + driver.getTitle());
      }
}
