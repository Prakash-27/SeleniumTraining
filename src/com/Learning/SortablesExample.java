package com.Learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortablesExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to("http://leafground.com/pages/sortable.html");
		
		List<WebElement> Sortable = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		
		WebElement From_element = Sortable.get(6);
		WebElement To_element = Sortable.get(0);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(From_element);
		action.moveToElement(To_element);
		action.release();
		action.build().perform();
		
		
		
		
	}

}
