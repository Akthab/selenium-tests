package com.example.demo.pages;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {

      static WebDriver getBrowser(String browser) {
            WebDriver driver = null;
            if(browser.equalsIgnoreCase("chrome")){
                  driver = new ChromeDriver();
            }
            else if (browser.equalsIgnoreCase("firefox")){
                  driver = new FirefoxDriver();
            }
            else if(browser.equalsIgnoreCase("safari")){
                  driver = new SafariDriver();
            }
            else System.out.println("Browser not supported");

            
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
            return driver;
      }
}
