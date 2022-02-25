package com.Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datapicker {

	static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.get("https://www.tripadvisor.in/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//button[@type='button' and @aria-haspopup='menu' and @aria-label='Explore Tripadvisor: More']")).click();
	    
	    driver.findElement(By.xpath("//a[@id='menu-item-4']")).click();
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("//input[@type='text' and @name='From']")).sendKeys("Boston (BOS)");
	    driver.findElement(By.xpath("//input[@type='text' and @name='To']")).sendKeys("Chennai(Madras)(MAA)");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@tabindex='0'and@class='bUKdg f z w Pb PO Po PB o q Gi B1 Z BB R2 _M Q _S ciOIC']")).click();
	    
	    String date = "18-December 2021";
	    String splitter[] = date.split("-");
	    String checkInmonth_year = splitter[1];
	    String checkInday = splitter[0];
	    
	    
	   
	    
	    
	}

}
