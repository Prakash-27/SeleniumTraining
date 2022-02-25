package com.Learning;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://talentbattle.in/"); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("Test Packs"))).build().perform();
		driver.findElement(By.linkText("Topic Wise Aptitude Preparation Test Series(Latest)")).click();
		
	}

}
