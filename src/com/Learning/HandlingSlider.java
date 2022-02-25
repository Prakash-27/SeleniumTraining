package com.Learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSlider {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/slider/");
			
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    
		    
		    List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		    System.out.println(frames.size());
		    
		    driver.switchTo().frame(0);
		    
		    WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		    System.out.println(slider.getText());
		    
		    Actions action = new Actions(driver);
		    action.moveToElement(slider).dragAndDropBy(slider, 100, 0).build().perform();
		    
	}

}
