package com.Learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/droppable/");
			
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    
		    
		    List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		    System.out.println(frames.size());
		    
		    driver.switchTo().frame(0);
		    
		    WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		    System.out.println(drag.getText());
		    WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		    System.out.println(drop.getText());
		    Actions action = new Actions(driver);
		    action.moveToElement(drag).dragAndDrop(drag, drop).build().perform();
	
		    Thread.sleep(1000);
		    WebElement dpd = driver.findElement(By.xpath("//p[contains(text(),'Dropped!')]"));
		    System.out.println(dpd.getText());
//------------------------------------------------------------------------------------------------------------		    
		   
		    
		    driver.switchTo().frame(0); 
		    Actions actions = new Actions(driver);
		    
		    actions.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
		    .moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
		    .release()
		    .build()
		    .perform();
		    
	}

}
