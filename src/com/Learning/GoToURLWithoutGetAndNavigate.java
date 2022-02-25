package com.Learning;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoToURLWithoutGetAndNavigate {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		String Google_Url = "https://www.google.co.in/";
		
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("window.location = \'"+Google_Url+"\'");
//		
		
		GotoUrlWithoutGetandNavigate(driver, Google_Url);
		
		
		
		
		
	}

	
	public static void GotoUrlWithoutGetandNavigate(WebDriver driver, String URL) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.location = \'" + URL + "\'");
	}
	 
	
	
}
