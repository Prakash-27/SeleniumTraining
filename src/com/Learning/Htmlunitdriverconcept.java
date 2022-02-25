package com.Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Htmlunitdriverconcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			
			WebDriver driver = new HtmlUnitDriver();
			
			//htmlunitdriver --- is not available in selenium 3.x versions.
			//htmlunitdriver --- to use this concept we have to download HtmlUnitDriver jar files.
			
			//Advantages:
			//1. Testing is happening behind the scene --- no browser is launched.
			//2. Very fast --- execution of test cases --- very fast --- performance of the script.
			//3. not suitable for Actions class --- user actions --- Mousemovement, doubleclick, drag and drop.
			//4. Ghost driver --- Headless Browser:
			        //---HtmlUnitDriver --- Java.
			        //---phantomJS --- JavaScript.
			
			 driver.manage().window().maximize();
			 driver.get("http://javascriptkit.com/javatutors/event2.shtml");
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 
			 System.out.println("Before click Title is :"+ driver.getTitle());
			 
			 driver.findElement(By.xpath("//input[@value='Click me']")).click();
			 
			 System.out.println("After click Title is :"+ driver.getTitle());
			 
			 

	}
	
	
}



