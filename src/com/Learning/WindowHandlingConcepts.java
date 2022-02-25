package com.Learning;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingConcepts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 

		driver.get("http://leafground.com/pages/Window.html"); 

		String ParentWindow = driver.getWindowHandle();

//------------1.Click button to open home page in New Window and Click Button Icon in newly Opened Child Window----------------- 
		
		WebElement OpenHomePageButton = driver.findElement(By.id("home"));
		OpenHomePageButton.click();

		Set<String> handles = driver.getWindowHandles();

		for (String ChildWindows : handles) {
			driver.switchTo().window(ChildWindows);
		}

		WebElement Popupwindow1 = driver.findElement(By.xpath("//img[@alt='Buttons']"));
		Popupwindow1.click();

		driver.close();

		driver.switchTo().window(ParentWindow);
		
//-------------------------------2.Find the number of opened windows Size-------------------------------------------------------
		
		WebElement OpenMultipleWindows = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		OpenMultipleWindows.click();
		
		Set<String> OpenMultipleWindowshandles = driver.getWindowHandles();
		int OpenMultipleWindows_Size = OpenMultipleWindowshandles.size();
		System.out.println("Number of windows: "+ OpenMultipleWindows_Size);
		
		for (String ChildWindows2 : OpenMultipleWindowshandles) {
			driver.switchTo().window(ChildWindows2);
		}
		
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		
//-------------------------------3.Close all child window except Parent window--------------------------------------------------
		
		WebElement DonotclosemeButton = driver.findElement(By.xpath("//button[text()='Do not close me ']"));
		DonotclosemeButton.click();
		
		Set<String> Donotcloseme_WindowHandles = driver.getWindowHandles();
		
		
		for (String allWindow : Donotcloseme_WindowHandles) {
			
			if(!(allWindow.equals(ParentWindow))) {
				driver.switchTo().window(allWindow);
				driver.close();
			}
		}
		
//-------------------------Alter Method to close the Child Windows By finding  Window ID---------------------------
		
		//You can use the Iterator method to get the window id names
		Iterator<String> it = Donotcloseme_WindowHandles.iterator();
		//initially the parent window will be the 1st windowId.
		//So you can store each window id name in a string and use it later for switching between.
		String ParentWindowId = it.next();
		String First_pop_windowId = it.next();
		String Second_pop_windowId = it.next();
	
		System.out.println(First_pop_windowId +"   "+ Second_pop_windowId );
		
		driver.switchTo().window(First_pop_windowId).close();
		
		driver.switchTo().window(ParentWindowId);
		
		driver.switchTo().window(Second_pop_windowId).close();
		
		driver.switchTo().window(ParentWindowId);
		
//----------------------------------4.Wait for 2 new Windows to open in 5 Seconds-------------------------------------------------
		
	    WebElement Waitfor5seconds = driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']"));
	    Waitfor5seconds.click();
	    
	    Thread.sleep(6000);
	    
	    Set<String> Waitfor5seconds_WindowHandles = driver.getWindowHandles();
	    
	    for (String allwindow_wait5Second : Waitfor5seconds_WindowHandles) {
	    	
			if(!(allwindow_wait5Second.equals(ParentWindow))) {
				driver.switchTo().window(allwindow_wait5Second);
				driver.close();
			}
			
		}
		

	
	}

}
