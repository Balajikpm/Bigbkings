package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assesion {
	@Test
	public void testCaseVerifyHomePage() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
	
			driver.navigate().to("http://google.com");
			 String title = driver.getTitle();
			 System.out.println(title);
			 SoftAssert s = new SoftAssert();
			 s.assertEquals("Gooogle", title);
			//Assert.assertEquals("Go0ogle",title, "Strings are  matching");
			System.out.println("assestiion pass");
			
			driver.quit();
			
			}
	
	
	}


