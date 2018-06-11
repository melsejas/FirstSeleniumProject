package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4 {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"/Users/ivka/Documents/selenium dependencies/drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("http://testing-ground.scraping.pro/login");
			Thread.sleep(2000);
			driver.findElement(By.name("usr")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("12345");
			driver.findElement(By.xpath("//*[@id=\"case_login\"]/form/input[3]")).click();
			String expected = "welcome";
			String actual = driver.getTitle();
			if (actual.contains(expected)) {
				System.out.println("pass");
			} else
				System.out.println("fail");
			System.out.println("Exected:\t" + expected);
			System.out.println("Actual:\t" + actual);
		
	}

}
