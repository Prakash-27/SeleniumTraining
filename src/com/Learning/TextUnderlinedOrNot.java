package com.Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TextUnderlinedOrNot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 

		driver.get("https://www.google.co.in/"); 

		WebElement How_Search_works = driver.findElement(By.xpath("//a[contains(text(),'How Search works')] "));  //a[text()='']

	    String Before_Hovering = How_Search_works.getCssValue("text-decoration");//This text-decoration--> is in [Styles while] Inspecting the Element.

		System.out.println("Before Hovering--> "+ Before_Hovering);
		
	    Actions action = new Actions(driver);
	    action.moveToElement(How_Search_works).build().perform();
	    
	    System.out.println(How_Search_works.getCssValue("text-decoration"));
	    
	    String After_Hovering = How_Search_works.getCssValue("text-decoration");
	    
	    System.out.println("After Hovering--> "+ After_Hovering);
	    
	    
	    
	    
	    
	
		
	
		
		
 
		
		











	}

}
