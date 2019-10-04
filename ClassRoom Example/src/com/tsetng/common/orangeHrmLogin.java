package com.tsetng.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orangeHrmLogin {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		WebElement element = driver.findElement(By.id("txtUsername"));
		element.clear();
		element.sendKeys("Admin");

		element = driver.findElement(By.id("txtPassword"));
		element.clear();
		element.sendKeys("admin123");

		element = driver.findElement(By.xpath("//input[@type='submit']"));
		element.click();

		String expectedResult = "Welcome Admin";

		String actualResult = driver.findElement(By.linkText("Welcome Admin")).getText();
		
		
		if(actualResult.equals(expectedResult))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("FAIL");
		}
		driver.close();
	}

}
