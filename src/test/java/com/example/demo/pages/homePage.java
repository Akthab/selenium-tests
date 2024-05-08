package com.example.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePage {

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    public loginPage ClickLogin() {
        // lnkLogin.click();
        System.out.println("Click the home page login ");
        return new loginPage() ;
    }
    
    public void ClickEmployeeList(){
        lnkEmployeeList.click();
    }
    
}
