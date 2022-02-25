package com.Learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingResize {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/resizable/");
			
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    
		    
		    List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		    System.out.println(frames.size());
		    
		    driver.switchTo().frame(0);
		    
		    WebElement resize = driver.findElement(By.xpath("//body/div[@id='resizable']/div[3]"));
		    
		    Actions action = new Actions(driver);
		    action.moveToElement(resize).dragAndDropBy(resize, 50, 50).build().perform();
		    
		    
		    
	}

}
