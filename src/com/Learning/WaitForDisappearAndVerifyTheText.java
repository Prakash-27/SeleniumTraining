package com.Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForDisappearAndVerifyTheText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("http://leafground.com/pages/disapper.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'I know you can do it! Button is disappeared!')]")));

		
		WebElement Verify_Text = driver.findElement(By.xpath("//strong[contains(text(),'I know you can do it! Button is disappeared!')]"));
		 String Text = Verify_Text.getText();
		 if(Text.contains("I know you can do it! Button is disappeared!")) {
			 System.out.println("Iam going to disappear keep looking at me Button has been To:---->"+Text+"---> Passed");
		 }else {
			 System.out.println("I know you can do it! Button is disappeared! is not Appeared Hence It's---> Failed");
		 }
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
