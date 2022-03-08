package com.mphasis.selenium.SeleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestLLocatorStrategies {
	private WebDriver driver;
	private String url;
  @Test
  public void testFindById() throws InterruptedException{
	  WebElement nameEle = driver.findElement(By.id("firstName"));
	  System.out.println(nameEle.getTagName());
			  nameEle.sendKeys("Mohammed");
	
			  WebElement lastnameEle = driver.findElement(By.id("lastName"));
			  lastnameEle.sendKeys("Owais");
			  
			  WebElement emailEle = driver.findElement(By.id("userEmail"));
			  emailEle.sendKeys("mohammedowais52@gmail.com");
			  
			  Thread.sleep(1000);
			  
			  WebElement radioMale = driver.findElement(By.id("gender-radio-1"));
			 
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", radioMale);
			
			WebElement phoneele = driver.findElement(By.id("userNumber"));
			  phoneele.sendKeys("9492709891");
			  
			//Thread.sleep(1000);

			  
				          
				          driver.findElement(By.id("dateOfBirthInput")).sendKeys("05 Feb 2000");
				          driver.findElement(By.id("subjectsInput")).sendKeys("xyz");
				          //Thread.sleep(1000);
				          
				          //chkbox1.click();
				          js = (JavascriptExecutor) driver;
				          js.executeScript("arguments[0].click");
				          
				          WebElement fileele = driver.findElement(By.id("uploadPicture"));
				          System.out.println(fileele.getAttribute("type"));// auto-it tool
				          
				          fileele.sendKeys("C:\\Users\\moham\\OneDrive\\Desktop\\Mphasis Training");
			  
			  
			  Thread.sleep(1000);
  }
			  
			  
			  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\\\Documents\\\\chromedriver.exe");
	 driver = new ChromeDriver();
	 url = "https://demoqa.com/automation-practice-form";
	driver.navigate().to(url);
	driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
