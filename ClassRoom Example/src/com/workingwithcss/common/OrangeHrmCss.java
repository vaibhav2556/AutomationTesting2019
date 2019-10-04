package com.workingwithcss.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmCss {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
							
										// tagNAme is option in css selector
										//If U have Id We can directly write #id
	driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
	
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
	
	driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
	
	 driver.close();
	
}
}