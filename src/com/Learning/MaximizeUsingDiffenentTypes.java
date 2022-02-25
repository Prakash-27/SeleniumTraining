package com.Learning;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeUsingDiffenentTypes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe"); 

		//1. // window will start on maximize mode itself
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		//WebDriver driver = new ChromeDriver(options);

		WebDriver driver = new ChromeDriver();


		driver.get("https://www.google.co.in/");

		//2. 
		driver.manage().window().maximize();

		//3.	 
		Dimension  dimension = new Dimension(1366, 768); //800 , 400 --> minimize Resolution
		driver.manage().window().setSize(dimension);


	}

}
