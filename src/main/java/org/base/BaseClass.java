package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver lauchBrowser() {
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		return driver;
	}
	public static void launchurl(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	public static void impWait(long sec) {
driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
}
	
	public static void filltxt(WebElement a, String value) {
		a.sendKeys(value);
	}
	
	public static void btnclick(WebElement a) {
		a.click();

	}
	public static void window() {
		String window_1= driver.getWindowHandle();
		Set<String> window_2= driver.getWindowHandles();
		for(String eachid : window_2) {
			if(eachid!=window_1){
			driver.switchTo().window(eachid);
			}	
		}	
			
		}

	
	
	
	
public static void main(String[] args) throws AWTException {
	lauchBrowser();
	launchurl("");
	
}



}



	




	


