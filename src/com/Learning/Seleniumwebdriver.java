package com.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumwebdriver { 

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		driver.get("https://www.w3schools.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[@data-pid='2']")).click();
		
		driver.findElement(By.xpath("//a[@id='nav_search_btn']")).click();
		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		
		/*List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) 
		{
			 System.out.println(list.get(i).getText());
			 
	    if(list.get(i).getText().equals("Learn SQL")) 
	    {
				 list.get(i).click();
				 
				 break;
				 
			 }
		}*/
		
		/*List<WebElement> list = driver.findElements(By.linkText("href"));
		for(int i=0; i<list.size(); i++) 
		{
			if(list.get(i).getText().equals("Log in")) {
	         
				list.get(i).click();
			    
			    break;
		      }
			    
		}*/
		

	}

}
