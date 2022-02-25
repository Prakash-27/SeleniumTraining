package com.Learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertyFile {
	
        static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\src\\com\\Learning\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\geckodriver.exe");
            driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\internetexplorerdriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(9000);
		
		driver.findElement(By.xpath(prop.getProperty("register_xpath"))).click();
		
		Thread.sleep(9000);

		driver.findElement(By.id(prop.getProperty("FirstName_Id"))).sendKeys("Prakash");
		
		driver.findElement(By.id(prop.getProperty("LastName_Id"))).sendKeys("Saravanan");
		
		driver.findElement(By.id(prop.getProperty("email_Id"))).sendKeys("prakashs23007@gmail.com");
		
		driver.findElement(By.id(prop.getProperty("Password_Id"))).sendKeys("test@123");
		
		
		
		
		
		
	}

}
