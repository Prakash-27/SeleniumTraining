package com.Learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopuphandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		/*String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			
			System.out.println("correct alert msg");
			
			}
		
		else{
			System.out.println("in-correct alert msg");
			
		}*/
		
		alert.accept();
		
		}

}
