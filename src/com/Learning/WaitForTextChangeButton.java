package com.Learning;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTextChangeButton {

	static Alert alert;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
       
		driver.get("http://leafground.com/pages/TextChange.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//button[text()='Click ME!']")));
		
	   WebElement ClickBtn = driver.findElement(By.xpath("//button[text()='Click ME!']"));
	   ClickBtn.getText();
	   System.out.println("Changed Button TextName:---->"+ ClickBtn.getText());
	   ClickBtn.click();
		
	    alert = driver.switchTo().alert();
		String Alert_Text = alert.getText();
		System.out.println("Alert TextName:---->"+ Alert_Text);
		
		alert.accept();
		
		
		
		
		
		
		
		
	}

}
