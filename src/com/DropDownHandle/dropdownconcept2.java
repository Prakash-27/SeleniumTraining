package com.DropDownHandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownconcept2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		  WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		 
		 WebElement day = driver.findElement(By.id("day"));
		 WebElement month = driver.findElement(By.id("month"));
		 WebElement year = driver.findElement(By.id("year"));
		
		
		Select select = new Select(day);
		
//selectByIndex is used to select the element by the index value like 0,1,2,3,... (this method is not recomended because the Html Dom will change means our selected value could also change)
//selectByVisibleText is the recomended method for dropdown		
		select.selectByIndex(10);
		
// isMultiple method is used to check given method select object is multiple select dropdown or not it will give the output in boolean true or false		
		boolean IsMult = select.isMultiple();
		System.out.println(IsMult);
		
//getOptions method is used to find the total number of options in the dropdown	is will give List<WebElement>	
		List<WebElement> listdays = select.getOptions();
		System.out.println(listdays.size());
		
		int totaldays = listdays.size()-1;
		
		System.out.println("total days are: "+ totaldays);
		
		for(int i=0; i<listdays.size(); i++) {
			String dayVal = listdays.get(i).getText();
			System.out.println(dayVal);
			
			if(dayVal.equals("23")) {
				
				listdays.get(i).click();
				break;
			}
		}
		
		
		
	}

}
