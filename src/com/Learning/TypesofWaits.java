package com.Learning;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TypesofWaits {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		 driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.get("https://www.amazon.in/");
		 
		 
// Impilicitly wait:
		 
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung m32 5g");
	    //driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@class='hmenu-item' and @data-menu-id = '10']")).click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath("//a[starts-with(text(),'Jewellery')]")).click();
	    
	    
	    
	    
//Some Expilicit waits methods:
	    
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
//	    wait.until(ExpectedConditions.elementToBeSelected(By.xpath("")));
//	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(""), null));
//	    wait.until(ExpectedConditions.alertIsPresent());
	    
	    
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[starts-with(text(),'Jewellery')]")));
//	    driver.findElement(By.xpath("//a[starts-with(text(),'Jewellery')]")).click();
	    
	    
	    
	    
	    
//Fluent wait:
	    
	    Wait<WebDriver> webdriverwait = new FluentWait<WebDriver>(driver)
	    		.withTimeout(Duration.ofSeconds(30))
	    		.pollingEvery(Duration.ofSeconds(2))
	    		.ignoring(NoSuchElementException.class);
	    
	    
	   WebElement MenJewellery = webdriverwait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				 
				return driver.findElement(By.xpath("//a[starts-with(text(),'Jewellery')]"));
			}
		
		});
	   
	   MenJewellery.click();
	}

}
