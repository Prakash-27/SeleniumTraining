package com.BrokenlinksandImages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenlinkandImage {

	public static void main(String[] args) throws Exception, Exception {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		  WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("https://www.amazon.in/");
		 
		 //links -- //a href <https://www.google.com>
		 //images -- //img href <https://www.test.com>
		 
		 //1. get the list of all the links and images : 179 
		 List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		 linkslist.addAll(driver.findElements(By.tagName("img")));
		 
		 System.out.println("Size of full links and images----->"+ linkslist.size());
		 
		 List<WebElement> activelinks = new ArrayList<WebElement>(); //149 active links
		 
		 //2. iterate linklist : exclude all the links/images - doesn't have any href attribute
		 for(int i=0; i<linkslist.size(); i++) {
			 System.out.println(linkslist.get(i).getAttribute("href"));
			 if(linkslist.get(i).getAttribute("href") != null && (!linkslist.get(i).getAttribute("href").contains("javascript"))) {
				 activelinks.add(linkslist.get(i));
			 }
		 }
		 
		 //get the size of the active links list:
		 System.out.println("Size of Active links and images---->"+ activelinks.size());
		 
		 
		 //3. check the href url, with httpconnection api:
		 //200 -- Ok
		 //404 -- not found
		 //500 -- internal error
		 //400 -- bad Request
		 for(int j=0; j<activelinks.size(); j++) {
			 HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
			 
			 connection.connect();
			String response = connection.getResponseMessage();
			 connection.disconnect();
			 System.out.println(activelinks.get(j).getAttribute("href") +"---->"+ response);
		 }
	
	}

}
