package com.Learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandlingJS {

	public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 driver.get("https://www.spicejet.com/");
		 
		  WebElement date = driver.findElement(By.xpath("//div[contains(text(),'Departure Date')]"));
		 
		  String dateval = "27-12-2021";
		  
		  
		  
		  selectdateByJS(driver, date, dateval);
		  
	  }

	
	public static void selectdateByJS(WebDriver driver, WebElement element, String dateval) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
	}
}
