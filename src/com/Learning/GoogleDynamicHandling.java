package com.Learning;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDynamicHandling {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 driver.get("https://www.google.com/");
		 
		 driver.findElement(By.name("q")).sendKeys("testing"); 
		               //we can use xpath --> //ul[@role='listbox']//following::li (for get text in the dynamic google page
		 List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		
		 System.out.println("Total number of suggestions in search Box:==>" + list.size());
		 
		 int position =0;
		 for(int i = 0; i<list.size(); i++) {
			 System.out.println(list.get(i).getText());
			 position++; // In java interview b=b+1 , b++ are same are not --> answer: both are not same
			 
			 //Clicking dynamic search by using positions 0,1,2,3...
			 if(position==5) {
				 list.get(i).click();
				 break; // if we commented the break then its throw stale element exception because the (list.size() --> stored values is gone.) because the page is contiunes to loop the next search that what the stored value is gone.
			 }
			 
			 //clicking dynamic search by using contains or equals to click the correct text in suggestion list
			 if(list.get(i).getText().contains("testing of hypothesis")){
				 list.get(i).click();
				 break;  
			 }
		 }
		
		
		
		
	}

}
