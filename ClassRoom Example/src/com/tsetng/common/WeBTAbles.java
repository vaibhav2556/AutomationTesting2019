package com.tsetng.common;

import java.util.List;
import java.util.ListResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeBTAbles {
	public static void main(String[] args) {
		// open browser navigate to world clock  page
		//  count no of webTable
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.timeanddate.com/worldclock/");
		
		List<WebElement> clock=driver.findElements(By.tagName("Table"));
		System.out.println(clock.size());
		
		
		driver.close();
		
		
	}

}
