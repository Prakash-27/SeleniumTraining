package com.WebtableHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://leafground.com/pages/table.html");


		//1. Get the count of number of Columns.

		List<WebElement> Columnscount = driver.findElements(By.xpath("//th"));
		Columnscount.size();
		System.out.println("Number of Columns---->"+ Columnscount.size());

		//2. Get the count of number of Rows.

		List<WebElement> Rowscount = driver.findElements(By.xpath("//tr"));
		Rowscount.size();
		System.out.println("Number of Rows---->"+ Rowscount.size());

		//3. Get the Progress value of 'Learn to interact with Elements'.

		WebElement Progress = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String Percentage = Progress.getText();
		System.out.println("Learn to interact with Elements---> Progress Percentage Number---->"+ Percentage);

		//4. Check the vital task for the least completed progress.
		
		// So we have to compare all the three Progress values 100%,30%,80% etc.

		List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));

		List<Integer> numberList = new ArrayList<Integer>();

		for (WebElement Progressvalue : allProgress) {
			//So We want to iterate the Progressvalue object because the value are in String then we need to change to Integer then Stored in ArrayList().
			// At this point we have  java.lang.NumberFormatException: because of % Symbol we have this Exception so remove the % with replace("%","").
			String ProgressNum = Progressvalue.getText().replace("%",""); 
			// we have to change the String ProgressNum Object To Integer value by ProgressIntegerNum Object Then Add to Integer ArrayList()
			int ProgressIntegerNum = Integer.parseInt(ProgressNum); 
			numberList.add(ProgressIntegerNum);
		}
        // Printing all td[2] list integer number in array [100 80 30 80]
		System.out.println("Final List of number in numberList--->"+ numberList);
		
        //We have to find the small number by using collections.min() to find least number in Integer Collections.
		int Smallvalue = Collections.min(numberList);
		
		//Then print it in console.
        System.out.println("least completed progress Number is--->"+ Smallvalue);
        
        //convert Integer of Smallvalue to String by SmallvaluewithPercentage_String.
        String SmallvaluewithPercentage_String = Integer.toString(Smallvalue) +"%";
        
        System.out.println("least completed progress Number with Percentage--->"+ SmallvaluewithPercentage_String);
        
      //td[normalize-space()='30%']//following::td[1]//input[@type='checkbox']
        
       String FirstPartOfCheckBox_xpath = "//td[normalize-space()='";
       String LastPartOfCheckBox_xpath = "']//following::td[1]//input[@type='checkbox']";
       
       WebElement Checkbox = driver.findElement(By.xpath(FirstPartOfCheckBox_xpath + SmallvaluewithPercentage_String + LastPartOfCheckBox_xpath));
       Checkbox.click();
        









	}

}
