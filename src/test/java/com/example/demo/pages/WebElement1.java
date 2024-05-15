package com.example.demo.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

      public void handleCheckBox(String browser) {
            WebDriver driver = Browser.getBrowser(browser);

            driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");

            //switch to the parent iframe
            driver.switchTo().frame("iframeResult");

            // find child frame
            driver.findElement(By.name("vehicle1")).click();

           //sleep time
           try {
            Thread.sleep(3000);
           } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
           }

           //deselect checkbox
           driver.findElement(By.name("vehicle1")).click();

      }

      public void handleRadioButton(String browser) {
            WebDriver driver = Browser.getBrowser(browser);

            driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");

            //switch to the parent iframe
            driver.switchTo().frame("iframeResult");

            // find radio button
            driver.findElement(By.cssSelector("input[value='JavaScript']")).click();

           //sleep time
           try {
            Thread.sleep(3000);
           } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
           }

           //deselect radio button
           driver.findElement(By.cssSelector("input[value='CSS']")).click();

      }

      public void handleAlert(String browser) {
            WebDriver driver = Browser.getBrowser(browser);

            driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

            //switch to the parent iframe
            driver.switchTo().frame("iframeResult");

            // find radio button
            driver.findElement(By.tagName("button")).click();

            //switch to the alert and get text
            Alert alert = driver.switchTo().alert();

            //print alert text
            System.out.println("Alert text is " + alert.getText());

            //accept alert
            alert.accept();

           //sleep time
           try {
            Thread.sleep(3000);
           } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
           }

      }

      public void handleDropdown(String browser) {
            WebDriver driver = Browser.getBrowser(browser);

            driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");

            //switch to the parent iframe
            driver.switchTo().frame("iframeResult");

            //find select element
            WebElement select = driver.findElement(By.tagName("select"));

            //switch to the alert and get text
            Select dropDown = new Select(select);
            dropDown.selectByVisibleText("Audi");
            
           //sleep time
           try {
            Thread.sleep(3000);
           } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
           }
           
      }
      
}
