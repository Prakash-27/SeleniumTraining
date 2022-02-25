package com.Learning;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/draggable/");
			
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    // First find How many frames are in web page
		    
		   List<WebElement> list =driver.findElements(By.tagName("iframe"));
		    System.out.println(list.size());
		    
		    
		     //1st Method of Frames with index value
		    
		    
		    
		    //using swithto method to for getting webpage to frames
		    //find Xpath of Drag me around
		    
		    //iframe are having html//body on own like DOM 
		    //In some page contains many iframes each frame haves seperate html//body 
		    driver.switchTo().frame(0);
		    
		    WebElement element = driver.findElement(By.xpath("//div[@id='draggable']"));
		    System.out.println(element.getText());
		    
		    //To come out from frame to web page we using default content Method
		    
		    driver.switchTo().defaultContent();
		    
		  //now we are in web page to locate the text of Draggable
		 // find css selector of outer frame of drag me around frame
		    
		    WebElement pageelement = driver.findElement(By.cssSelector("h1.entry-title"));
		    System.out.println(pageelement.getText());
		    
		    
		    
		    
		    //2nd Method of Frame using frame(WebElement frameElement)
		    // find css selector of outer frame of drag me around frame
		    
		    WebElement Frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		    driver.switchTo().frame(Frame);
		    
		    WebElement web = driver.findElement(By.xpath("//div[@id='draggable']"));
		    System.out.println(web.getText());
		    
		    driver.switchTo().defaultContent();
		    
		    WebElement page = driver.findElement(By.cssSelector("h1.entry-title"));
		    System.out.println(page.getText());
		    
		    
		    
		    //3rd Method of Frame using String name (like name = mainpanel) we should use mainpanel in--> frame("mainpanel")
		    
		    //driver.switchTo().frame("");
			
	}

}
