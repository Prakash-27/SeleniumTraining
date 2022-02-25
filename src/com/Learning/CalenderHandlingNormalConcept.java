package com.Learning;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderHandlingNormalConcept {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		 
		 driver.findElement(By.id("datepicker")).click();
		 
		 new WebDriverWait(driver, Duration.ofSeconds(5))
		 .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		 
		 String MonthYearval = driver.findElement(By.className("ui-datepicker-title")).getText();
		 
		 System.out.println(MonthYearval);//December 2021
		 String month = MonthYearval.split(" ")[0].trim();
		 String year =  MonthYearval.split(" ")[1].trim();
		 
		 while(!(month.equals("June") && year.equals("2024"))) {
			 
			 driver.findElement(By.xpath("//a[@title='Next']")).click();
			 
			  MonthYearval = driver.findElement(By.className("ui-datepicker-title")).getText();
			 
			 System.out.println(MonthYearval);//December 2021
			  month = MonthYearval.split(" ")[0].trim();
			  year =  MonthYearval.split(" ")[1].trim();
		 }
		 
		     driver.findElement(By.xpath("//a[text()='27']")).click();

			
	}

}
