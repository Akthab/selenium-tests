package com.example.demo.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExamples {
      
      public void invokeAlert(String browser) {

            //driver object
            WebDriver driver = Browser.getBrowser(browser);

            //open facebook
            driver.get("https://www.facebook.com");

            //create object or JavaScript executor
            JavascriptExecutor executor = (JavascriptExecutor)driver;

            //execute alert() function
            executor.executeScript("alert('This alert is injected by webdriver')");
      }

      public void sendTextToAnElement(String browser) {

            //driver object
            WebDriver driver = Browser.getBrowser(browser);

            //open facebook
            driver.get("https://www.facebook.com");

            //create object of JavaScript executor
            JavascriptExecutor executor = (JavascriptExecutor) driver;

            //enter email
            executor.executeScript("document.getElementById('email').value='author@quaatso.com';");

            //enter pass
            executor.executeScript("document.getElementsByName('pass')[0].value='password';");

            //click on the login button
            executor.executeScript("document.getElementsByTagName('button')[0].click();");
      }

      public void refreshBrowser(String browser) {
            //driver object
            WebDriver driver = Browser.getBrowser(browser);

            // open facebook
            driver.get("https://www.facebook.com");

            //create object or javascript executor
            JavascriptExecutor executor = (JavascriptExecutor) driver;

            //refresh the page
            executor.executeScript("history.go(0);");
      }

      public void getTitleOfWebPage(String browser) {
            //driver object
            WebDriver driver = Browser.getBrowser(browser);

            //open facebook
            driver.get("https://facebook.com");

            //create object of Javascript executor
            JavascriptExecutor executor = (JavascriptExecutor) driver;

            //get the title of the webpage
            String pageTitle = executor.executeScript("return document.title").toString();

            //print title
            System.out.println("Page title is " + pageTitle);


      }

      public void verticalScroll(String browser) {
            //driver object
            WebDriver driver = Browser.getBrowser(browser);

            //open facebook
            driver.get("https://www.w3schools.com/");

            //create object of Javascript executor
            JavascriptExecutor executor = (JavascriptExecutor) driver;

            //vertical scroll
            executor.executeScript("window.scrollBy(0,250);");

            //vertical scroll
            executor.executeScript("window.scrollBy(0,-250);");

      }
}
