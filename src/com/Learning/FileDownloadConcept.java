package com.Learning;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownloadConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("http://leafground.com/pages/download.html");
		
		driver.findElement(By.linkText("Download Excel")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Download Excel")));
		
		//In this We cannot use Expilcit wait because this waits are work only with website or web pages not of System window.
		//thats what we use Thread.sleep(5000);
		Thread.sleep(5000);
		
		File filelocation = new File("C:\\Users\\Prakash\\Downloads");
		File[] TotalFiles_Downloaded = filelocation.listFiles();
		
		for (File file : TotalFiles_Downloaded) {
			if(file.getName().contains("testleaf.xlsx")) {
				System.out.println("File is Downloaded");
				break;
			}
		}
		
		driver.findElement(By.linkText("Download Text")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//pre[text()='You have downloaded the file.']"))); 
		
		boolean TextisDisplayed = driver.findElement(By.xpath("//pre[text()='You have downloaded the file.']")).isDisplayed();
		System.out.println(TextisDisplayed);
		
	    String Text = driver.findElement(By.xpath("//pre[text()='You have downloaded the file.']")).getText();
		System.out.println(Text);
		
		
	}

}
