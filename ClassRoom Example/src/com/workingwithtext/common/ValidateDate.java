package com.workingwithtext.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateDate {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");	
		
		WebElement date= driver.findElement(By.xpath("//b[text()='Aug 31, 2019']"));
		
		String ActualdateType="b";
	
		String ExpectedDateType=date.getTagName();
		
		if(ActualdateType.contains(ExpectedDateType))
		{
			System.out.println("Date Is Bold Type");
		}
		
		else
		{
		System.out.println("Date Is Normal Type");
		}
		driver.close();
	 	}

}
