package com.example.demo.pages;

import java.util.Scanner;

public class App {
      public static void main(String[] args) {
            /*C
             * 1. Ask the user for its browser
             * 2. Validate user input
             * 3. Run example on user provided browser
             */

            System.out.println("Please enter browser  of your choice : Firefox and Chrome");
            Scanner sc = new Scanner(System.in);
            String browser = sc.next();     

            // ElementFindingExamples examples = new ElementFindingExamples();

            WebElement1 webElement = new WebElement1();

            if (browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("chrome")){
                  // examples.findElementByName(browser);
                  // examples.findElementById(browser);
                  // examples.findElementByLinkText(browser);
                  // examples.findElementByXPath(browser);
                  webElement.handleDropdown(browser);
            } else {
                  System.out.println("Browser " + browser + "you entered not supported");
            }
      }      
}
