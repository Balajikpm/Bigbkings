package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {
	
	@Test( dataProvider = "sample")
	private void login(@Optional("deepak")String email,@Optional("deepak") String pass) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//WebElement txtUser = driver.findElement(By.id("email"));
		driver.findElement(By.id("email")).sendKeys(email);
	//	WebElement txtPass = driver.findElement(By.id("pass"));
		driver.findElement(By.id("pass")).sendKeys(pass);
		

	}
	@DataProvider(name = "sample")
	public Object[][] data() {
		return new Object[][]
				{
		{"user2","test2"},
		{"user2","test2"},
		{"user1","test1"},
		{"user1","test1"}
		
				};
		
	}

}
