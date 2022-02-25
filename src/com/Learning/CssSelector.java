package com.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
          
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		//driver.get("https://www.w3schools.com/");
		
		//driver.manage().window().maximize();
		
		/*driver.findElement(By.cssSelector("a[style='margin-bottom:2px;']")).click();
		driver.findElement(By.cssSelector("a[title='Home']:not(a[style='width:77px'])")).click();
		
		driver.findElement(By.cssSelector("a#w3loginbtn")).click();
		driver.findElement(By.cssSelector("button[title='Go back']")).click();
		
		driver.findElement(By.cssSelector("a#navbtn_exercises")).click();
		driver.findElement(By.xpath("//a[contains(text(),'XML Course')]")).click();
		driver.findElement(By.cssSelector("div.w3-content + p>a")).click();
	
		driver.findElement(By.cssSelector("a.active.w3-bar-item w3-button active, a[title='W3.CSS Tutorial']")).click();
		
		driver.findElement(By.cssSelector("div#leftmenuinnerinner>a:nth-of-type(74)")).click();*/
		
		driver.navigate().to("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		//driver.navigate().forward();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='w3-bar-item w3-button bar-item-hover w3-right w3-hide-small barex ws-pink']")).click();
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
