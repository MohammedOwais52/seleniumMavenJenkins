package com.mphasis.selenium.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Documents\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techgatha.com");
		
		driver.close();
	}

}
