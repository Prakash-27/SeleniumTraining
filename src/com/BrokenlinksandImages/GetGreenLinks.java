package com.BrokenlinksandImages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGreenLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		  WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("https://www.google.co.in/");
		 
		 WebElement SearchBox = driver.findElement(By.name("q"));
		 SearchBox.sendKeys("Angry Birds"+Keys.ENTER); // alternative we can use to enter --> "Angry Birds \n"
		
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// this will print all Urls in the page  
		/*
		 * List<WebElement> Total_links = driver.findElements(By.tagName("a"));
		 * 
		 * for (WebElement all_links : Total_links) { String Hreflinks =
		 * all_links.getAttribute("href"); System.out.println(Hreflinks); }
		 */
		
		// Fetch main links (Green Link)
		
	   List<WebElement> Mainlinks =  driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div//cite"));
		
		for (WebElement Greenlink : Mainlinks) {
			System.out.println(Greenlink.getText());
			
		}
		 
		
		
		
		
		
		
		
	}

}
