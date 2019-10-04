package com.handledropdown.coomon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountSizeDropdown {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();

		driver.get("https://www.mercurytravels.co.in/");
		
		
	 List<WebElement> dropdown= driver.findElements(By.tagName("select"));
	 
	 System.out.println("Total Size OF Dropdown are:"+dropdown.size());
	 
	 for(int i=0;i<dropdown.size();i++)
	 {
		   //System.out.println(dropdown.get(i).getText());
		System.out.println( dropdown.get(i).getAttribute("name"));
	 }
	 
	}

}
