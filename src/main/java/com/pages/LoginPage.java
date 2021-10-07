package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static WebDriver  driver;
	@Test
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
//		return driver;
	}
	@Test
	public void login(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	@Test
	public void loginClick() {
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public void setupClose() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
