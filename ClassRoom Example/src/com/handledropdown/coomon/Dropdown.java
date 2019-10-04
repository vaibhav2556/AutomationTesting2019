package com.handledropdown.coomon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();

		driver.get("https://www.mercurytravels.co.in/");
		
		// There  are two ways to handle dropdown 
		//1. By using senskeys();
		//2. By using Select class 
		//driver.findElement(By.id("themes")).sendKeys("Visa Free");
		
		// By using Select Class
		
		 WebElement dropdown= driver.findElement(By.id("themes"));
		
		 Select s= new  Select(dropdown);
		 
		 s.selectByVisibleText("Nature");
		
		  Thread.sleep(100);
		  
		  
		 s.selectByIndex(5);
		 
		  driver.close();
		
		 
	}

}
