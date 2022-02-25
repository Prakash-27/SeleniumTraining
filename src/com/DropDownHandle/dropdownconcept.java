package com.DropDownHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownconcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		  WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		 
		 WebElement day = driver.findElement(By.id("day"));
		 WebElement month = driver.findElement(By.id("month"));
		 WebElement year = driver.findElement(By.id("year"));
		 
		 
			
//			  Select select = new Select(day); 
//			  select.selectByVisibleText("20");
//			  
//			  Select select1 = new Select(month); 
//			  select1.selectByVisibleText("Jul");
//			  
//			  Select select2 = new Select(year); 
//			  select2.selectByVisibleText("2022");
		
	//Generic method 	 
		 
//		 SelectValueFromDropDown(day, "27");
//		 SelectValueFromDropDown(month, "Apr");
//		 SelectValueFromDropDown(year, "1999");	
		 
	//split by - method using Genric 	 
		
		 String dod = "26-May-2005";
		String dodArr[] = dod.split("-");
		
		
		 SelectValueFromDropDown(day, dodArr[0]);
		 SelectValueFromDropDown(month, dodArr[1]);
		 SelectValueFromDropDown(year, dodArr[2]);
		
			
	}
	
         //Genric Method
	
	     public static void  SelectValueFromDropDown(WebElement element, String value) {
	    	 Select select = new Select(element);
			 select.selectByVisibleText(value);
	     }
}
