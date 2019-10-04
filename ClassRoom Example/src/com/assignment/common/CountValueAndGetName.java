package com.assignment.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountValueAndGetName {

	// Open Browser and Navigate To MercuryTravels.com
	// count no of value and get name from holiday dropdown
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();

		driver.get("https://www.mercurytravels.co.in/");

		WebElement element = driver.findElement(By.id("themes"));

		List<WebElement> InternalValueOfDropdown = element.findElements(By.tagName("option"));
		System.out.println("The Total Size are:"+InternalValueOfDropdown.size());

		for (int i = 0; i < InternalValueOfDropdown.size(); i++) 
		{
			 // we can use getText() to get all names inside dropdown
			System.out.println("The Name are :" + "==>" + InternalValueOfDropdown.get(i).getText());
			
			System.out.println("************************");
			//InternalValueOfDropdown.size();
			
			// we also used getAttribute() to get the name inside the dropdown but we have to pass 
			//"theme-attr"  then only it will return name  but index 0 we will get "null " value
			// we have to change in for loop int i=0 to i=1 then loop starts fromst index 
			
			//System.out.println("The Name are :" + "==>" + InternalValueOfDropdown.get(i).getAttribute("theme-attr"));
			

		}
		driver.close();
	}
}