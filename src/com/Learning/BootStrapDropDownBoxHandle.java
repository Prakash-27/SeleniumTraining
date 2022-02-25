package com.Learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDownBoxHandle {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		  WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.jquery-az.com/jquery/demo.php?ex=48.0_6");
		 //https://www.jquery-az.com/jquery/demo.php?ex=152.0_1
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//div[contains(@class,'ms-options-wrap')]")).click();
		 
		 List<WebElement> list = driver.findElements(By.xpath("//ul[@style='column-count: 4; column-gap: 0px;']//li//label"));
		 System.out.println(list.size());
		 
		 
		 for(int i=0; i<=list.size(); i++) {
			 
				System.out.println(list.get(i).getText());
				
				if(list.get(i).getText().contains("Washington")){
					list.get(i).click();
					
				System.out.println(list.get(i).isSelected());
				
				 Thread.sleep(5000);
				}
			
				//else 
				System.out.println(list.get(i).getText());
				list.get(i).click();
			 }
		
		 
		 
//		 for(int i=0; i<=list.size(); i++) {
//			 
//			System.out.println(list.get(i).getText());
//			
//			if(list.get(i).getText().contains("Texas") || 
//			 list.get(i).getText().contains("Louisiana")) {
//				list.get(i).click();
//			}
//		 }
		              
		
		
	}

}
