package com.Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsConcepts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 

		driver.get("http://leafground.com/pages/Button.html"); 
		
		//1.Get Position of Button
		WebElement Get_Position = driver.findElement(By.id("position"));
		Point XYPoint = Get_Position.getLocation();
		int Xvalue = XYPoint.getX();
		int Yvalue = XYPoint.getY();
		System.out.println("get xvalue: "+ Xvalue +"  "+  "get yvalue: "+ Yvalue);
		
		//2.find button color
		WebElement Colour = driver.findElement(By.id("color"));
		String Background = Colour.getCssValue("background-color");
		System.out.println(Background);
		
		//3. find the height and width
		WebElement Size_Button = driver.findElement(By.id("size"));
		int height = Size_Button.getSize().getHeight();
		int width = Size_Button.getSize().getWidth();
		System.out.println("Height is: "+ height +"  "+ "Width is: "+ width);
		
		//1.go to home
		WebElement home_Button = driver.findElement(By.id("home")); 
		boolean HomePage_WorkingOrNot  = home_Button.isEnabled();
		System.out.println("If home page is working fine----> "+HomePage_WorkingOrNot);
		home_Button.click();
		
		
	}

}
