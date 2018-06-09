package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver",
					"/Users/melisa/Documents/selenium dependencies/drivers/geckodriver");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.google.com/");
			//driver.close();
			
//			System.setProperty("webdriver.chrome.driver",
//					"/Users/melisa/Documents/selenium dependencies/drivers/chromedriver");
//			
//			WebDriver driver = new ChromeDriver();
//			
//			driver.get("https://www.google.com/");
//			//driver.close();
	}

}
