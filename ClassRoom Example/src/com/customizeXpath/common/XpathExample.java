package com.customizeXpath.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class XpathExample {
	
	//open browser navigate to orange hrm.com
	// perform login by using customize xpath
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Sleeper.sleepTight(5000);
		WebElement element=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		element.clear();
		element.sendKeys("Admin");

		Sleeper.sleepTight(5000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		Sleeper.sleepTight(5000);
		driver.findElement(By.xpath("//input[@class='button']")).click();
		
		
		Sleeper.sleepTight(3000);
		driver.close();
	}
}
