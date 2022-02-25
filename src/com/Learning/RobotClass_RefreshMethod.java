package com.Learning;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass_RefreshMethod {

	public static void main(String[] args) throws AWTException  {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 
		
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		 driver.get("https://www.amazon.in/");
		 
		 //Refresh Method but its not working
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_F5);	
		 robot.keyRelease(KeyEvent.VK_F5);
		 
		 
		 driver.get(driver.getCurrentUrl());
		 
		 
		 refreshBrowserByJS(driver);
		 
		 
		 
	}

	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor) driver);
        js.executeScript("location.reload()");//location.reload() or history.go(0)
	}
	
}
