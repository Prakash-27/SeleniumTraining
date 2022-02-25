package com.Learning;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> checkbox = driver.findElements(By.xpath("//div[@class='display'][1]//input[@name='sports']"));
		System.out.println(checkbox.size());

		for (WebElement e : checkbox) {
			System.out.println(e.getAttribute("value"));
			System.out.println(e.isSelected());
		}

		System.out.println("--------------------------------");

		for (WebElement e : checkbox) {

			if (e.getAttribute("value").equals("football") || e.getAttribute("value").equals("baseball")) {

				e.click();
			}

			System.out.println(e.getAttribute("value"));
			System.out.println(e.isSelected());
		}

	}

}
