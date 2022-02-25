package com.Learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/draggable/");
			
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    
		    
		    List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		    System.out.println(frames.size());
		    
		    driver.switchTo().frame(0);
	
		    WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		    System.out.println(drag.getText());
		    
		    //drag option is using Actions class that what we using Ations class in Drag
		    
		    Actions action = new Actions(driver);
		    action.moveToElement(drag).dragAndDropBy(drag, 100, 100).build().perform();
		    
		    
		    
		    
		    
		    
		    
	}

}
