package com.Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class EncodeDecodePassword {

	public static void main(String[] args) throws Exception {
				
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.canva.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='Wrk03w']//input[@inputmode='email']")).sendKeys("prakashs23007@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='Wrk03w']//input[@name='password']")).sendKeys();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']//span[@class='_38oWvQ']")).click();
	}

}
