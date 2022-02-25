package com.Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//How to solve: 
		//1. Use a third party tool like Sikuli, AutoIt
		//2. http://username:password@url.com //Sending credentials via URL
		
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	    String	username = "admin:";
	    String  password = "admin@";
	    
		driver.get("http://"+ username + password +"the-internet.herokuapp.com/basic_auth");
		
		
		
		
		
	}

}
