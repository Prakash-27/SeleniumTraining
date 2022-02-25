package com.Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptWorking {


	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.get("http://javascriptkit.com/javatutors/event2.shtml");
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 //driver.findElement(By.xpath("//input[@value='Click me']")).click();
		 
		//((JavascriptExecutor) driver).executeScript("inform()");
		
		((JavascriptExecutor) driver).executeScript("document.getElementsByName('fd0')[0].click()");
		
	}

}
