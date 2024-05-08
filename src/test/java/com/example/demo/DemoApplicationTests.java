package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.pages.homePage;
import com.example.demo.pages.loginPage;
import com.example.demo.pages.mainPage;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		homePage homePage = new homePage();
		loginPage loginPage = new loginPage();

		mainPage mainPage = new mainPage(loginPage, homePage);
		mainPage.performLogin();
	}

}
