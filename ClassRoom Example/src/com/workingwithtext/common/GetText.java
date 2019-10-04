package com.workingwithtext.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
// Get Text of Normal element
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");	
		
		List<WebElement> element= driver.findElements(By.tagName("p"));
		for(int i=0;i<element.size();i++)
		{
			System.out.println(element.get(i).getText());
		}
		
		 driver.close();
		
	}
}
