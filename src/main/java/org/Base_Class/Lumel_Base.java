package org.Base_Class;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Lumel_Base {

	public static WebDriver driver;
	
	
	public static void launchBrowser() {
//		 if (browser.equalsIgnoreCase("chrome")){
//	            driver = new ChromeDriver();
//	        } else if (browser.equalsIgnoreCase("firefox")) {
//	            driver = new FirefoxDriver();
//	        }
//	        else {
//	            System.out.println("No browser found");
//	        }
		
		driver = new ChromeDriver();

	}
	
	public static void window_Maximize() {
	 driver.manage().window().maximize();

	}
	
	public static void url(String url) {
	driver.get(url);	
  
	}

	public static void to_CloseBrowser() {
		driver.quit();

	}
	public static void click(WebElement c) {
		c.click();

	}
	
	public static void sendkey(WebElement s, String r) {
		s.sendKeys(r);

	}
	
	public static void implicity_Wait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public static void scrollup(WebDriver driver,WebElement web) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)",web);
  }	
  public static void window_Handles() {
	  Set<String> windowHandles = driver.getWindowHandles(); //random order
		ArrayList<String> windows = new ArrayList<String>(windowHandles); //interstion order
		driver.switchTo().window(windows.get(1));
  }
  
  
  public static void send_keys(WebElement element,String string) {
		element.sendKeys(string);
	}
  
  public static void select_By_Index(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
  }
}
