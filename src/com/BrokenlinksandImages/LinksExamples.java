package com.BrokenlinksandImages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// driver.get("http://leafground.com/pages/Window.html");
		driver.navigate().to("http://leafground.com/pages/Link.html");

		// 1. Go to Home Page

		WebElement homepage_link = driver.findElement(By.linkText("Go to Home Page"));
		homepage_link.click();

		driver.navigate().back();

		// 2. Find where am supposed to go without clicking me?

		WebElement whereToGoWithoutClickingMeLink = driver
				.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String AttributeofLink = whereToGoWithoutClickingMeLink.getAttribute("href");
		System.out.println(AttributeofLink);

		// 3. Verify am I broken?

		WebElement Broken_Link = driver.findElement(By.linkText("Verify am I broken?"));
		Broken_Link.click();

		String title = driver.getTitle();

		if (title.contains("404")) {
			System.out.println("The Image is Broken");
			System.out.println("Title of the Broken Page: " + title);
		}

		driver.navigate().back();

		// 4. Go to Home Page (Interact with same link name)

		// homepage_link.click(); //stale element reference: element is not attached to
		// the page document
		// Here we have Stale Element Reference Exception Because the homepage_link is
		// as been performed action in First
		// So we have to Declare the driver.findElement once again and create object
		// like homepage_link2 to click the Home page link.

		WebElement homepage_link2 = driver.findElement(By.linkText("Go to Home Page"));
		homepage_link2.click();

		driver.navigate().back();

		// 5. How many links are available in this page?

		List<WebElement> TotalLinksInPage = driver.findElements(By.tagName("a"));
		int SizeOfLinksInPage = TotalLinksInPage.size();
		System.out.println(SizeOfLinksInPage);

	}

}
