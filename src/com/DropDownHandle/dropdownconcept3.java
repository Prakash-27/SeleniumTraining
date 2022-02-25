package com.DropDownHandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownconcept3 {
	
	static WebDriver driver;

	public static void main(String[] args) {

		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		   driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		 
		 
//		 List<WebElement> monthlist = driver.findElements(By.xpath("//select[@id='month']//option"));
//		 System.out.println(monthlist.size());
//		
//		for(int i=0; i<monthlist.size(); i++) {
//			String monthlists = monthlist.get(i).getText();
//			System.out.println(monthlists);
//			
//			if(monthlists.contains("Dec")) {
//				monthlist.get(i).click();
//				break;
//			}
//		}
		 
		 String day_xpath = "//select[@id='day']//option";
		 String month_xpath = "//select[@id='month']//option";
		 String year_xpath = "//select[@id='year']//option";
		 
		 SelectDropDownValue(day_xpath, "15");
		 SelectDropDownValue(month_xpath, "Aug");
		 SelectDropDownValue(year_xpath, "1947");
		 
		 
	 
	}

	    public static void SelectDropDownValue(String xpathValue, String value) {
	    	 List<WebElement> monthlist = driver.findElements(By.xpath(xpathValue));
			 System.out.println(monthlist.size());
			
			for(int i=0; i<monthlist.size(); i++) {
				String monthlists = monthlist.get(i).getText();
				System.out.println(monthlists);
				
				if(monthlists.contains(value)) {
					monthlist.get(i).click();
					break;
				}
			}
	    }
	
	
	
	
}
