package com.Learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioandCheckbuttons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	    List<WebElement> list = driver.findElements(By.xpath("//input[@name='group1']"));
	    
	    System.out.println(list.size());
	    
	    for(WebElement e: list) {
	    	
	    	System.out.println(e.getAttribute("value"));
	    	System.out.println(e.isSelected());
	    	 
	    if(e.getAttribute("value").equals("Cheese")){
	    	e.click();
	    }
	    }
	    
	    System.out.println("----------------------------------------------");
	    	
	    for(WebElement e : list ) {
	    	
	    	System.out.println(e.getAttribute("value"));
	    	System.out.println(e.isSelected());
	    	    	
	    }
		
		
		
	}

}
