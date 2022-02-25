package com.Learning;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://leafground.com/pages/alertappear.html");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[@id='alert']")));

		WebElement GetAlertBtn = driver.findElement(By.xpath("//button[@id='alert']"));
		GetAlertBtn.click();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    Alert alert = driver.switchTo().alert();
	    
	    alert.accept();
		












	}

	private static void findElement(By xpath) {
		// TODO Auto-generated method stub

	}

}
