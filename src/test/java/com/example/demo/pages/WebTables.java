package com.example.demo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTables {

      public void getSingleElementFromWebTable(String browser){
            WebDriver driver = Browser.getBrowser(browser);

            //open time and date webpage
            driver.get("https://www.timeanddate.com/worldclock/");

            //get data of p79 id element
            String elementId = driver.findElement(By.id("p79")).getText();

            //print date and time 
            System.out.println("Text from the web table : "+ elementId);
      }

      public void getAllElementFromWebTable(String browser){
            WebDriver driver = Browser.getBrowser(browser);

            //open w3 schools html table page 
            driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");

            //switch to iframe
            driver.switchTo().frame("iframeResult");

            //get all table element
            WebElement table = driver.findElement(By.tagName("table"));

            //get all row elements
            List<WebElement> rowList = table.findElements(By.tagName("tr"));

            for(WebElement row:rowList) {
                  //get all data elements
                  List<WebElement> dataList = row.findElements(By.tagName("td"));

                  for(WebElement data:dataList) {

                        System.out.print(data.getText() + "\t");
                  }
                  System.out.println();
            }
      }
      
}
