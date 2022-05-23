package com.ParallelTesting_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest2 {

	WebDriver driver;
	
	@Test
	public void logotest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		 WebElement logoname = driver.findElement(By.xpath("//*[@class='k1zIA rSk4se']"));
		 Assert.assertTrue(logoname.isDisplayed());
		 System.out.println(logoname);
		 Thread.sleep(5000);
	}

	@Test
	public void HomepageTitle() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		Assert.assertEquals("Google", title);
		System.out.println(title);
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
