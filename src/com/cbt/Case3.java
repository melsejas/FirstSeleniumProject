package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3 {
/*
 * Basic Authentication test
1. open browser chrome
2. go to website http://newtours.demoaut.com/
3. enter username: tutorial (THIS IS A TEST DATA)
4. enter password: tutorial (THIS IS A TEST DATA)
5. click Sign in button
6. Verify title contains:
		Expected : Find a Flight
 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/melisa/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();//step 1
		driver.get("http://newtours.demoaut.com/");//step 2
		
		//finds element on a page (what we learned in HTML)
		//locator-->is a way of finding element on a page used by selenium.  Locators are represented in a class called "By" in selenium
		//(By.name("userName"))-->how to find it
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
		String expected = "Find a Flight";
		String actual = driver.getTitle();
		if(actual.contains(expected)) {
			System.out.println("pass");
	}else {
		System.out.println("fail");
		System.out.println("Expected: \t" + expected);
		System.out.println("Actual: \t" + actual);
	}
	

}
}
