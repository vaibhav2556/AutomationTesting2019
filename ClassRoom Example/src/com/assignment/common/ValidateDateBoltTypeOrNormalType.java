package com.assignment.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateDateBoltTypeOrNormalType {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");	
		// when  u run the programe change  date as update one
		WebElement date= driver.findElement(By.xpath("//b[text()='Sep 2, 2019']"));
		
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
