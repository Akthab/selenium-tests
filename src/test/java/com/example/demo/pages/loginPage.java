package com.example.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {
    
    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;
    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;
    @FindBy(how = How.CSS, using = ".btn-default")
    public WebElement btnLogin;

    public void Login(String userName, String password){
        // txtUserName.sendKeys(userName);
        // txtPassword.sendKeys(password);
        System.out.println("UserName and password:  " + userName + " --- " + password);
    }
    
    public loginPage ClickLogin() {
        System.out.println("Click the login page from the login page");
        return new loginPage();
    }
}
