package com.Learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 

		driver.get("http://leafground.com/pages/selectable.html"); 
		
		List<WebElement> Selectable = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		int NumberOfSize = Selectable.size();
		System.out.println(NumberOfSize);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(Selectable.get(0))
		.click(Selectable.get(1))
		.click(Selectable.get(2))
		.click(Selectable.get(3)).build().perform();
		
		//Below type--> action1.keyUp(Keys.CONTROL); is not working, only Above Type is working fine
		/*
		 * Actions action1 = new Actions(driver); action1.keyUp(Keys.CONTROL);
		 * action1.click(Selectable.get(5)); action1.click(Selectable.get(4));
		 * action1.click(Selectable.get(3)); action1.click(Selectable.get(2));
		 * action1.build().perform();
		 */
		
		//This type is also working fine.
		Actions action2 = new Actions(driver);
		action2.clickAndHold(Selectable.get(0));
		action2.clickAndHold(Selectable.get(1));
		action2.clickAndHold(Selectable.get(2));
		action2.clickAndHold(Selectable.get(3));
		action2.build().perform();
		
		
		
		
	}

}
