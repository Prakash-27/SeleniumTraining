package com.Learning;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHandlerPopup {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize(); 
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("http://javascriptkit.com/javatutors/event2.shtml");
		 
		 driver.findElement(By.xpath("//input[@value='Click me']")).click();
		 
		 Thread.sleep(2000);
		 
		  
		 
		 //1.BrowserHandle Popups Method but above url is not for this method (its working with Alerts method)
		 
		 
		 
		 
		 /*Set<String> handler = driver.getWindowHandles();
		 
		 Iterator<String> it = handler.iterator();
		 
		 String parentWindowId = it.next();
		 
		 System.out.println("parent window id :"+ parentWindowId);
		 
		 String childWindowId = it.next();
		 
		 System.out.println("child window id :"+ childWindowId);
		 
		 driver.switchTo().window(childWindowId);
		 
		 Thread.sleep(2000);
		 
		 System.out.println("child window popup title :"+ driver.getTitle());
		 
		 driver.close();
		 
		 driver.switchTo().window(parentWindowId);
		 
		 Thread.sleep(2000);
		 
		 System.out.println("parent window title :"+ driver.getTitle());
		 */
		 
		 
		 
		 //2.Alerts Popups Method
	
		 
		 Alert alert = driver.switchTo().alert();
			
			System.out.println(alert.getText());
			
			String text = alert.getText();
	    
			alert.accept();
	}

}
