package com.Learning;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlefileuploadpopup {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://html.com/input-type-file/");
		driver.get("https://resume.naukri.com/resume-quality-score");
		
        //driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("C:\\Users\\Prakash\\Documents\\books.txt");
//----------------------------------------------------------------------------------------------        
        //AutoIT
        driver.findElement(By.xpath("//span[@class='browse']")).click();
        
        Thread.sleep(3000);
        
        Runtime.getRuntime().exec("C:\\Users\\Prakash\\Desktop\\uploadscript.exe");
        
	}

}
