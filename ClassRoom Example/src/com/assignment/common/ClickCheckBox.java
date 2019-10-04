package com.assignment.common;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCheckBox {
	
	//open browser navigate to spicejet.com
	//click on student checkbox and verify weather it is active or  inactive

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.spicejet.com/");
		/*
		 * WebElement element=driver.findElement(By.xpath(
		 * "//input[@id='ctl00_mainContent_chk_StudentDiscount']")); element.click();
		 */
	WebElement button=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']"));
	button.click();
	if(button.isSelected())
	{
		System.out.println("The CheckBox Is Active");
	}
	else {
		System.out.println("The CheckBox Is Inactive");
	}

	driver.close();
	}
}
