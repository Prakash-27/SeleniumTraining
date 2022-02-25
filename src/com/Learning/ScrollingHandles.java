package com.Learning;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingHandles {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 
		
	    driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://javascriptkit.com/javatutors/event2.shtml");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Scroll to some position in web page.
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("window.scrollTo(0,500)", ""); Thread.sleep(5000);
//		js.executeScript("window.scrollTo(0,-500)", "");

		 
		//Go to bottom of the page.
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
//		Thread.sleep(3000); 
		//Go to top of the page 
//		js .executeScript("window.scrollTo(0,0)", "");
		
		
		//Go to the specific Element Position
//    	WebElement ClickHereBtn = driver.findElement(By.name("B2"));
//		js.executeScript("arguments[0].scrollIntoView(true);", ClickHereBtn);
		
		
//		ScrollToSomePositionInWebpage(driver);
//		Thread.sleep(3000);
//		ScrollBacktoTopOfTheWebPage(driver);
		
//		GotoBottomOfTheWebPage(driver);
//		Thread.sleep(3000);
//		GotoTopOfTheWebPage(driver);
    	
//    	ScrollUntilWebelementPosition(driver, ClickHereBtn); 
		
		
		
		
		
		
		
		
		//We can use Robot class to Scroll But its not working 
	

	}

	public static void ScrollToSomePositionInWebpage(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,500)", "");
	}
	
	
	public static void ScrollBacktoTopOfTheWebPage(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,-500)", "");
	}
	
	public static void GotoBottomOfTheWebPage(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");	
	}
	
	public static void GotoTopOfTheWebPage(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js .executeScript("window.scrollTo(0,0)", "");
	}
	
	public static void ScrollUntilWebelementPosition(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element );
	}
	
	
}
