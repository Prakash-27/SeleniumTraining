package com.Learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtablehandiling {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/"); 
		  
		  
		 List<WebElement> AllDatainTable = driver.findElements(By.xpath("//tbody//td"));  //Getting all the data in web table.
		  AllDatainTable.size();
		  
		  int tablesize = AllDatainTable.size();
		  
		  for (WebElement webElement :AllDatainTable) {
			  System.out.println("----------------------------------");
			  webElement.getText();
			  System.out.println( webElement.getText());
			  
			  
			
		}
		  

		  
		
			
		
		  
		  
		  
		 
		
		
		
		
		
	}

}
