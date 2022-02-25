package com.Learning;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShot {

	static WebDriver driver;
	
	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		 driver.get("https://www.amazon.in/"); 
		//driver.get("http://leafground.com/"); // This is the site all the locators can find in the website to automate practice.
		

		takeScreenshot("amazon_LoginPage");
		//Above method name is created by below driverfile 
		
		
	}
	
	public static void takeScreenshot(String fileName) {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		//1. take screenshot and store it as a file format:
		 File Sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
		 File Destinationfile =  new File("C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\ScreenshotImages\\"+fileName+".png");
	   //2. now copy the screenshot to desired location using copyfile method:
		 try {
			FileHandler.copy(Sourcefile, Destinationfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 // We can use FileUtils.copyFile method in common-IO Package 
		 //Also we can use FileHandler.copy method to take Screenshot then it Throw IOException we can Surround the Exception By try/catch block
		 
	}
	

}
