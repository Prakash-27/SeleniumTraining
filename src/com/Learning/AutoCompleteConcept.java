package com.Learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompleteConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("http://leafground.com/pages/autoComplete.html"); 
		
		WebElement SearchBox = driver.findElement(By.id("tags"));
		SearchBox.sendKeys("S");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']//li//div")));
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='ui-id-1']//li//div")));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='ui-id-1']//li//div")));
		
		List<WebElement> AutoComplete = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li//div"));
		AutoComplete.size();
		System.out.println(AutoComplete.size());
		
		for (WebElement auto_complete : AutoComplete) {
			  String autocomplete_Text = auto_complete.getText();
			  System.out.println(autocomplete_Text);
			 if(autocomplete_Text.equals("SOAP")) {
				 auto_complete.click();
				 System.out.println("It's If Part");
				 break; //if we remove the break it will iterate until the given condition, once the element founded mean we should use break to come out of the loop.
			 }else {
				 System.out.println("It's Else Part");
			 }
			     
			
		}
		
//		for (WebElement auto_complete : AutoComplete) {
//			  
//			 if(auto_complete.getText().equals("SOAP")) {
//				 auto_complete.click();
//				 System.out.println("It's If Part");
//				
//			 }else {
//				 System.out.println("It's Else Part");
//			 }
//			     
//			
//		}
		
		
		
		
		
	}

}
