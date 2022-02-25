package com.Learning;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");

		List<String> namelist = new ArrayList<String>();
		List<WebElement> ListOfNames;
		WebElement nextButton;
		String NextButtonclassDisabledAttribute;

		// To find how many pagination are in web page--> [0]preview 1 2 3 4 5 6 [7]next
		// In this case we have 8 pagination Buttons.
		int SizeOfPagination = driver.findElements(By.xpath("//div[@id='dtBasicExample_paginate']//a")).size();

		// If SizeOfPagination > 0 many Paginations are there If it is 0 nothing to
		// Iterate Because In web page pagination is 1 page.
		System.out.println(SizeOfPagination);
		

		if (SizeOfPagination > 0) {
			// Here we have to Print the Namecoloumn names in console so I take the
			// Namecoloumn names, name Xpath to get all name in Namerow
			/*
			 * ListOfNames = driver.findElements(By.xpath("//td[@class='sorting_1']"));
			 */
			// Here we want to get the text from NameColoumn by using ListOfNames Object
			// using foreach loop to get nametext.
			/*
			 * for (WebElement nametext : ListOfNames) { // and we have to store the
			 * ListOfNames in namelist by using namelist.add(). String
			 * addnametext_tonamelist = nametext.getText();
			 * namelist.add(addnametext_tonamelist); }
			 */
			do {
				
				// Here we have to Print the Namecoloumn names in console so I take the
				// Namecoloumn names, name Xpath to get all name in Namerow
				ListOfNames = driver.findElements(By.xpath("//td[@class='sorting_1']"));

				// Here we want to get the text from NameColoumn by using ListOfNames Object
				// using foreach loop to get nametext.
				for (WebElement nametext : ListOfNames) {
					// and we have to store the ListOfNames in namelist by using namelist.add().
					String addnametext_tonamelist = nametext.getText();
					namelist.add(addnametext_tonamelist);
				}
				
				// Here we have to click nextButton so below writting xpath.
				nextButton = driver.findElement(By.xpath("//li[@id='dtBasicExample_next']"));
				// Here after 6th page to go to another page I want to click nextButton(Next)
				// but in 6th page itself nextButton(Next) is disabled so the (class=
				// paginate_button page-item next disabled) having diabled.
				// so i want to get Attribute of that disabled class and store in String has
				// NextButtonclassDisabledAttribute.
				NextButtonclassDisabledAttribute = nextButton.getAttribute("class");
				// Then using if statement i put one condition
				// !NextButtonclassDisabledAttribute.contains("paginate_button page-item next
				// disabled")
				// click nextButton.click(); this will not click nextButton after 6th page, that
				// is my condition.
				if (!NextButtonclassDisabledAttribute.contains("paginate_button page-item next disabled")) {
					nextButton.click();
				} else {
					break;
				}

			} while (true);

		} else {
			System.out.println(" No Pagination In This Web Page ");
		}
		
		//To get all 6 page names in console we have the names stored in namelist in ArrayList<String> so using foreach loop.
		for (String allNames : namelist) {
			  System.out.println(allNames);
		}
//--------------------------------------------------------------------------------------------------------------

//---------------------------------Actual Code to get names in pagination and Shifting one page to another------------------
		
		
//		if (SizeOfPagination > 0) {
//
//			do {
//				ListOfNames = driver.findElements(By.xpath("//td[@class='sorting_1']"));
//				for (WebElement nametext : ListOfNames) {
//					String addnametext_tonamelist = nametext.getText();
//					namelist.add(addnametext_tonamelist);
//				}
//
//				nextButton = driver.findElement(By.xpath("//li[@id='dtBasicExample_next']"));
//
//				NextButtonclassDisabledAttribute = nextButton.getAttribute("class");
//
//				if (!NextButtonclassDisabledAttribute.contains("paginate_button page-item next disabled")) {
//					nextButton.click();
//				} else {
//					break;
//				}
//
//			} while (true);
//
//		} else {
//			System.out.println(" No Pagination In This Web Page ");
//		}
//		
//		for (String allNames : namelist) {
//			  System.out.println(allNames);
//		}
//		
			
	}

}
