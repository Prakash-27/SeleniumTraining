package com.BrokenlinksandImages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImageConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("http://leafground.com/pages/Image.html");
		driver.navigate().to("http://leafground.com/pages/Image.html");
		
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[1]/div/div/img")).click();
		
		driver.navigate().back();
		
		WebElement Brokenimg  = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		
		if(Brokenimg.getAttribute("naturalWidth").contains("0")) {
			System.out.println("The image is Broken");
		}else {
			System.out.println("The image is Not Broken");
		}
		
		
		
		
		
		
		
		
		
	}

}
