package com.Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementToAppear {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("http://leafground.com/pages/appear.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn']/b")));
		
		WebElement Text = driver.findElement(By.xpath("//button[@id='btn']/b"));
		String Text_name = Text.getText();
		if(Text_name.contains("Voila! I'm here Guys")) {
			System.out.println(Text_name + "---> Passed");
		}else{
			System.out.println("Expected Text is not able to appear Hence it's ---> Failed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
