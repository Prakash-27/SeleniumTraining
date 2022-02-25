package com.Learning;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.findElement(By.xpath("//iframe[@id='google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0']"));

		//WebElement AdverdisementFrame = driver.findElement(By.id("google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0"));
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
		
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());

		//1 method 

		
		WebElement Parent_frame = driver.findElement(By.id("frame1"));	
		driver.switchTo().frame(Parent_frame);
		//here we can't get the text inside of the parent frame
		boolean Parent_frameTextisDisplayed = driver.findElement(By.xpath("//html//body[contains(text(),'Parent frame')]")).isDisplayed();
		System.out.println(Parent_frameTextisDisplayed);
		
		 String Parent_frameText = driver.findElement(By.xpath("//html//body[contains(text(),'Parent frame')]")).toString();
		 System.out.println(Parent_frameText);
		 
		WebElement Child_frame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(Child_frame);
		System.out.println(Child_frame);















	}

}
