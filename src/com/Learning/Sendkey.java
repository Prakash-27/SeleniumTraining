package com.Learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkey {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.get("https://www.google.co.in/"); 
		
		 By SearchBoxofGoogle = By.name("q");
		
		 

		 SendInputsWithoutSendKey(driver, SearchBoxofGoogle, "'Lord Shiva'");
         // This approch is not working problem in locator.
		 

	}

	
	public static WebElement getElements(By locator) {
    	 return driver.findElement(locator);
    	 
     }

	public static void SendInputsWithoutSendKey(WebDriver driver, By locator,  String valuetoPass) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElements"+locator+"[0].value="+valuetoPass+"" );
	}
	//document.getElementsByName('q')[0].value='Lord Shiva'"
	//"\'"+ +"\'"
	//"'"+  +""'"
	
	
	
	
	
}
