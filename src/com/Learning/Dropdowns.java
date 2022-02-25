package com.Learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//a[@class='signin']")).click();
	    driver.findElement(By.xpath("//u[contains(text(),'Create a new account')]")).click();
	    WebElement dropdowns = driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[1]"));
	    
	    List<WebElement> option =  dropdowns.findElements(By.tagName("option"));
	    System.out.println(option.size());
	    //option tagname are 32
	    
	    List<WebElement> Alloption = driver.findElements(By.tagName("option"));
	    System.out.println(Alloption.size());
	    //option tagname are 475
	    
	    //dropdowns.findElement(By.cssSelector("table.f14:nth-child(3) tbody:nth-child(1) tr:nth-child(23) td:nth-child(3) > select:nth-child(1)>option:nth-of-type(28)")).click();
	    
	    String element;
	    
	    for(int i=0; i<option.size(); i++) {
	    	element = option.get(i).getAttribute("value");
	    	if(element.equals("25")) {
	    		option.get(i).click();
	    	}
	    	
	    }
	    
	    
	}

}
