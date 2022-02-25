package com.Learning;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JQueryUIMenu {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prakash\\eclipse-workspace\\Seleniumtraining\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://the-internet.herokuapp.com/jqueryui/menu");

		List<WebElement> MenuList = driver.findElements(By.xpath("//ul[@id='menu']/li"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='menu']/li")));

		MenuList.size();
		String text = MenuList.get(0).getText();

		System.out.println(text);

		WebElement EnabledButton = driver.findElement(By.className("ui-menu-item"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ui-menu-item")));

		Actions action = new Actions(driver);
		action.moveToElement(EnabledButton).build().perform();

		WebElement DownloadsButton = driver.findElement(By.xpath("//a[text()='Downloads']"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Downloads']")));

		action.moveToElement(DownloadsButton).build().perform();

		WebElement PdfButton = driver.findElement(By.xpath("//a[text()='PDF']"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='PDF']")));

		action.moveToElement(PdfButton).build().perform();

		PdfButton.click();

	}

}
