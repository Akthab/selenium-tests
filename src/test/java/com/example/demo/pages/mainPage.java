package com.example.demo.pages;

public class mainPage {
    
    private loginPage loginPage;

    private homePage homePage;


    public mainPage(loginPage loginPage, homePage homePage){
        this.loginPage = loginPage;
        this.homePage = homePage;        
    }

    public void performLogin() {
        homePage.ClickLogin();
        loginPage.Login("admin", "adminpassword23432");
        loginPage.ClickLogin();
    }
}
