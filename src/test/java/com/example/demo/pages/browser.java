package com.example.demo.pages;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class browser {
      public static void main(String[] args) {
            System.out.println("Please enter browser of your choice: firefox, chrome or safari");
            Scanner sc = new Scanner(System.in);
            String browser = sc.next();

            invokeBrowse(browser);
            sc.close();
      }
      

      private static void invokeBrowse(String browser) {
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

            driver.get("http:www.google.com");
      }
}
