package com.Learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtableHandling {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 driver.get("https://cosmocode.io/automation-practice-webtable/");
		 
		 //method 1
		 
		 
		 
		 driver.findElement(By.xpath("//strong[contains(text(),'Afghanistan')]//parent::td//preceding-sibling::td//child::input[@type='checkbox']")).click();
		 driver.findElement(By.xpath("//strong[contains(text(),'Albania')]//parent::td//preceding-sibling::td//child::input[@type='checkbox']")).click();
		 
		 
		 

		//Clicking All checkBox
		 
		 
		 
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(list.size());
		
		 for(WebElement e : list) {
		    	System.out.println(e.getAttribute("type"));
		    	System.out.println(e.isSelected());
		    	
		    	if(e.getAttribute("type").equals("checkbox")) {
		    		
		    		e.click();
		    	}
		 }
		
		 
		 
		 
		 
		 
		 
		
		
	}

}
