package com.Learning;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	
    static WebDriver driver;
    static JavascriptExecutor js;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe"); 
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 driver.get("http://javascriptkit.com/javatutors/event2.shtml");
		 
		 //This getURL is using for SendInputsWithoutSendKeysUsingWebElement only
		 driver.get("https://www.google.co.in/");
		 
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 //driver.findElement(By.xpath("//input[@value='Click me']")).click();
		 
		//((JavascriptExecutor) driver).executeScript("inform()");
		
		//((JavascriptExecutor) driver).executeScript("document.getElementsByName('fd0')[0].click()");
		
		WebElement ClickBtn =  driver.findElement(By.xpath("//input[@value='Click me']"));
		//WebElement ClickHereBtn = driver.findElement(By.name("B2"));
		
		
		//This Below FindElement is using the URL of --> driver.get("https://www.google.co.in/");
		WebElement SearchBox = driver.findElement(By.name("q"));
		SearchBox.sendKeys("Lord Shiva");
		
		
		 flash(ClickBtn, driver);
		 
		 drawBorder(ClickBtn, driver);
		 
		 //generateAlert(driver, "There is an issue with onClick Event handler click button");
		 
		 //clickElementByJS(ClickBtn, driver);
		
		 refreshBrowserByJS(driver);
		 
		 driver.navigate().refresh();
		 
		 System.out.println(getTitleByJS(driver));
		 
		 System.out.println(getPageInnerText(driver));
		 
		 scrollPageDown(driver);
		 
		 //scrollIntoView(ClickHereBtn, driver);
		 
		 //This Two method is using above Google URL--> driver.get("https://www.google.co.in/"); to Perform Actions 
		 SendInputsWithoutSendKeys(driver, "'q'", "'Lord Shiva'");
		 
		 SendInputsWithoutSendKeysUsingWebElement(driver, SearchBox);
		 
		 
		 
		  
		 
	}
	
	
//-------------------------JS METHOD FRAMEWORK WE IMPLEMENTED AND THE WE ARE CALLING IT--------------------- 
	
	 
//------------1.flash & changeColor Method------------
	
	    public static void flash(WebElement element, WebDriver driver) {
	         js =((JavascriptExecutor) driver);
	        String bgcolor	= element.getCssValue("backgroundColor");
	        
	        for(int i=0; i<50; i++) {
	        	
	        	changeColor("rgb(0,255,0)", element, driver);
	        	changeColor(bgcolor, element, driver);	
	        }
	    }

		public static void changeColor(String color, WebElement element, WebDriver driver) {
           
			JavascriptExecutor js =((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.backgroundColor ='"+color+"'", element);
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
	     }
		
		
//---------2.drawBorder Method--------------
		
		public static void drawBorder(WebElement element, WebDriver driver) {
			JavascriptExecutor js =((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.border='3px solid red'", element);
		}
		
//---------3.generateAlert Method-----------
		
		public static void generateAlert(WebDriver driver, String message) {
			JavascriptExecutor js =((JavascriptExecutor) driver);
			js.executeScript("alert('"+message+"')");
		}
		
//---------4.clickElementByJS Method---------
		
		public static void clickElementByJS(WebElement element, WebDriver driver) {
			JavascriptExecutor js =((JavascriptExecutor) driver);
            js.executeScript("arguments[0].click();", element);
		}
		
//---------5.refreshBrowserByJS Method-------
		
		public static void refreshBrowserByJS(WebDriver driver) {
			JavascriptExecutor js =((JavascriptExecutor) driver);
            js.executeScript("history.go(0)");
		}
		
//---------6.getTitleByJS Method------------
		
		public static String getTitleByJS(WebDriver driver) {
			JavascriptExecutor js =((JavascriptExecutor) driver);
            String title = js.executeScript("return document.title;").toString();
            return title;
		}
		
//---------7.getPageInnerText Method--------
		
		public static String getPageInnerText(WebDriver driver) {
			JavascriptExecutor js =((JavascriptExecutor) driver);
            String pageInnerText = js.executeScript("return document.documentElement.innerText;").toString();
            return pageInnerText;
		}
		
//---------8.scrollPageDown Method----------
		
		public static void scrollPageDown(WebDriver driver) {
			JavascriptExecutor js =((JavascriptExecutor) driver);
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		
//---------9.scrollPageUp Method-------------
		
		public static void scrollPageUp(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js .executeScript("window.scrollTo(0,0)", "");
		}

//----------10.scrollIntoView Method----------
		
		public static void scrollIntoView(WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		
//----------11.ScrollToSomePositionInWebpage Method----------
		
		public static void ScrollToSomePositionInWebpage(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0,500)", "");
		}
		
//----------12.ScrollBacktoTopOfTheWebPage Method------------
		
		public static void ScrollBacktoTopOfTheWebPage(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0,-500)", "");
		}
		
//---------13.SendInputsWithoutSendKeys Method------------------------
		
		public static void SendInputsWithoutSendKeys(WebDriver driver, String name_id_xpath_values, String valuetoPass) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("document.getElementsByName("+name_id_xpath_values+")[0].value="+valuetoPass+" ","");
		}
		
//---------14.SendInputsWithoutSendKeysUsingWebElement Method------------	
		
		public static void SendInputsWithoutSendKeysUsingWebElement(WebDriver driver, WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].value='Lord Shiva'", element);
		}
		
//---------15.GotoUrlWithoutGetandNavigate-------------------------------
		
		public static void GotoUrlWithoutGetandNavigate(WebDriver driver, String URL) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.location = \'"+URL+"\'");
		}
		
		
}
