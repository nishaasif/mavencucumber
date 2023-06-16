package org.pojo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
   public static WebDriver driver;
	public static void launchBrow() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	public static void launchUrl(String url) {
		driver.get(url);
		}
	public static void passValue(String val,WebElement ele) {
		ele.sendKeys(val);
		}
	public static void closeBrow() {
		driver.close();
	}
	public static void click(WebElement ele) {
		ele.click();
		}
	public static void JsClick(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
