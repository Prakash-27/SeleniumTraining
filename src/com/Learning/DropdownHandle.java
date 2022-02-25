package com.Learning;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {
	
	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		   driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country =  By.id("Form_submitForm_Country");
		By State   =  By.id("Form_submitForm_State");
		
		//Select select = new Select(driver.findElement(country));
		//select.selectByVisibleText("India");
		
		//Select select1 = new Select(driver.findElement(country));
		//select1.selectByVisibleText("Cuba");
		
				
		//doSelectByVisibleText(country, "United Kingdom");
		//doSelectDropDownByIndex(country, 2);
		//doSelectDropDownByValue(country, "India");
	
		//SelectDropDownValue(country, "index", "5");
		//SelectDropDownValue(country, "visibletext", "India");
		//SelectDropDownValue(country, "value", "United Kingdom");
		
//--------------------------------------------------------------METHOD-3 USING ENUM--------------------------------------------------------
		
		//Using Enum DropDownEnum
		SelectDropDownValue(country, DropDownEnum.INDEX.toString(), "96");
		SelectDropDownValue(State, DropDownEnum.VALUE.toString(), "Tamil Nadu");
		//SelectDropDownValue(country, DropDownEnum.VISISBLETEXT.toString(), "United Kingdom");
		
		
	}
//---------------------------------------------------------------METHOD-2 THREE FUNCTIONS IN ONE METHOD------------------------------------------------------------------
	
        public static void SelectDropDownValue(By locator, String type, String value) {
        	Select select = new Select(getElement(locator));
        	
        	switch (type) {
        	case "index":
        	     select.selectByIndex(Integer.parseInt(value));
        	     break;
        	case "value":
        		 select.selectByValue(value);
        		 break;
        	case "visibletext":
        		 select.selectByVisibleText(value);
        		 break;
        		 
        	default:
        		System.out.println("Please pass the correct selection criteria......");
        		break;
        	
        	}
        }
	
        
//----------------------------------------------------------------METHOD 1 STATIC METHOD NOT CREATING DUPLICATE OBJECT-------------------------------------------------------------------
        
	     public static WebElement getElement(By locator) {
	    	 return driver.findElement(locator);
	    	 
	     }
	      
	     public static void doSelectByVisibleText(By locator, String value) {
	    	 Select select = new Select(getElement(locator));
	    	 select.selectByVisibleText(value);		 
	     }
	
	     public static void doSelectDropDownByIndex(By locator, int value) {
	    	 Select select = new Select(getElement(locator));
	    	 select.selectByIndex(value);	 
	     }
	
	     public static void doSelectDropDownByValue(By locator, String value) {
	    	 Select select = new Select(getElement(locator));
	    	 select.selectByValue(value);	
	     }
	
}
