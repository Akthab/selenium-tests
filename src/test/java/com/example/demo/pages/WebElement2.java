package com.example.demo.pages;

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

            //backward navigation
            driver.navigate().back();
      }
}
