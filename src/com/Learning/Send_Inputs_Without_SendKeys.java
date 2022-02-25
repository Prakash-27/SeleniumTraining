package com.Learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_Inputs_Without_SendKeys {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 

		driver.get("https://www.google.co.in/"); 

		WebElement SearchBox = driver.findElement(By.name("q"));
		SearchBox.sendKeys("Lord Shiva");

		//By country =  By.id("Form_submitForm_Country");
		  By SearchBoxofGoogle = By.name("q");

//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("document.getElementsByName('q')[0].value='Lord Shiva'", "");
//		js.executeScript("arguments[0].value='Lord Shiva'", SearchBox );
		

//		SendInputsWithoutSendKeys(driver, "'q'", "'Lord Shiva'");
	
		SendInputsWithoutSendKeysUsingWebElement(driver, SearchBox);

		

		//////////////////////////////////////////////////////////////////////////////////////////

		//driver.switchTo().activeElement();

		//We can use Robot class to send keys in Input field
		//Robot Bot = new Robot();
		//Bot.keyPress(KeyEvent.VK_L);
		//Bot.keyRelease(KeyEvent.VK_L); 
		//By continue doing single words of L  
		//By continue doing single words of o
		//By continue doing single words of r
		//By continue doing single words of d

	}


	//----------------------SendInputsWithoutSendKeys Method----------------------------	

	public static void SendInputsWithoutSendKeys(WebDriver driver, String name_id_xpath_values, String valuetoPass) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementsByName("+name_id_xpath_values+")[0].value="+valuetoPass+" ","");
		//js.executeScript("document.getElementsByName('q')[0].value='Lord Shiva'", "");
	}

	//----------------------SendInputsWithoutSendKeysUsingWebElement-----------------------

	public static void SendInputsWithoutSendKeysUsingWebElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].value='Lord Shiva'", element);
	}

	/*
	 * public static List<WebElement> getElements(By locator) { return
	 * driver.findElements(locator);
	 * 
	 * }
	 * 
	 * public static void SendInputsWithoutSendKey(WebDriver driver, By locator,
	 * String name_id_xpath_values, String valuetoPass) { JavascriptExecutor js =
	 * ((JavascriptExecutor) driver);
	 * js.executeScript("document.getElements"+locator+"[0].value="+valuetoPass+""
	 * ); } //document.getElementsByName('q')[0].value='Lord Shiva'" //"\'"+ +"\'"
	 * //"'"+ +""'"
	 */	
	
}
