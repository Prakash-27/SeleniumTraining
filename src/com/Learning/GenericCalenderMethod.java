package com.Learning;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericCalenderMethod {

     static WebDriver driver;
      
	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		   driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
         driver.findElement(By.id("datepicker")).click();
		 
		 new WebDriverWait(driver, Duration.ofSeconds(5))
		 .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		 
		 
		 selectDate("16", "June", "2022");
		 	
		   
    }

	
	    public static String[] getmonthyear(String  MonthYearval) {
	    	
	    	return MonthYearval.split(" "); 
	    	
	    }
	
        public static void selectDate(String exDay, String exMonth, String exYear) {
        	
        	if(exMonth.equals("February") && Integer.parseInt(exDay) > 29) {
        		System.out.println("Wrong Date: " + exMonth + " : " + exYear);
        		return;
        	}
        	
        	if(Integer.parseInt(exDay) > 31) {
        		System.out.println("Wrong Date: " + exMonth + " : " + exYear);
                return;
        	}
        	
        	
        	String  MonthYearval = driver.findElement(By.className("ui-datepicker-title")).getText();
        	System.out.println(MonthYearval); 
    		 while(!(getmonthyear(MonthYearval)[0].equals(exMonth) && getmonthyear(MonthYearval)[1].equals(exYear))) {
    			 driver.findElement(By.xpath("//a[@title='Next']")).click();
    			  MonthYearval = driver.findElement(By.className("ui-datepicker-title")).getText();
    			 
    		 }
    		 
    		 
    		     driver.findElement(By.xpath("//a[text()='" + exDay + "']")).click();
         		System.out.println("Wrong Date: " + exMonth + " : " + exYear);

        
        	
        	
        	
        }	

}
