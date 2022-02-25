package com.Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadConceptWithoutUsingAutoIT {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("http://leafground.com/pages/upload.html");
		
		driver.findElement(By.name("filename")).click();
		
		String File = "C:\\Users\\Prakash\\Documents\\art of learning.txt";
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
