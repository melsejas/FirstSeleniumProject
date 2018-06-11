package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {
	/*
	 * TEST 2
	 * 1.Open chrome 
	 * 2.go to url www.cybertekschool.com
	 * 3.verify url contains 
	 * 	Expected: cybertekschool
	 * 4. navigate to google.com
	 * 5.verify url contains google
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/melisa/Documents/selenium dependencies/drivers/chromedriver");
		//new object =polymorphism
		WebDriver driver = new ChromeDriver();
		//only know there are two ways to call the browser
		driver.navigate().to("http://cybertekschool.com");//or driver.get("http://cybertekschool.com");
		//if you do not put http in order to navigate 
		String expected = "cybertekschool ya";
		//getCurrentUrl() = gets the URL currently open page
		String actual = driver.getCurrentUrl();//this is opening the browser
		System.out.println(actual);
		
		if(actual.contains(expected)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			System.out.println("Expected URL: \t "+ expected);
			System.out.println("Actual: \t"+ actual);
		}
		driver.navigate().to("http//:google.com");
		//pause --its stopping the execution of the program for a little
		Thread.sleep(1000);
		//navigate() goes back to previous page
		driver.navigate().back();
		Thread.sleep(1000);
		//forward() goes forward in browsing history 
		driver.navigate().forward();
		Thread.sleep(1000);
		//refreshed the current page
		driver.navigate().refresh();
		Thread.sleep(1000);

		//it closes only the current tab and if you have multiple tabs open, it wont affect them.
		//driver.close();
		
		//closes all tabs and windows therefore ends all sessions. 
		//we can not use the same webdriver object again. we need to instantiate it again if we want to use it 
		driver.quit();
		
	}

}
