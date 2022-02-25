package com.Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadless {
	
	static WebDriver driver;

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
       //ChromeHeadless driver is very fast
           //1.it will not open broswer
           // We can click the launched Broswer but we are not able to open the broswer while its launched
           //In some cases we can not able to get results on console without using this line-->>((options.addArguments("window-size=1400,800");))
           // Then also it giving results means the application is Compartable with both WEB and MOBILE.

		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		//we want to pass "options" in ChromeDriver() Parameter. --> like this ChromeDriver(options).
		 driver = new ChromeDriver(options);
		
		 driver.manage().window().maximize();
		 driver.get("http://javascriptkit.com/javatutors/event2.shtml");
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 System.out.println("Before click Title is :"+ driver.getTitle());
		 
		 driver.findElement(By.xpath("//input[@value='Click me']")).click();
		 
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

		 
		 System.out.println("After click Title is :"+ driver.getTitle());
		 
		
		
		
		
		
		
		
		
	}

}
