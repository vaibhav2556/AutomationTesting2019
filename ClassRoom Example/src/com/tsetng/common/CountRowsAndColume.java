package com.tsetng.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRowsAndColume {

	public static void main(String[] args) {
		
		// count no of rows and col
		//tr =mewns rows
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.timeanddate.com/worldclock/");
		
		List<WebElement> elements= driver.findElements(By.tagName("tr"));
		System.out.println("No Of Rows:"+elements.size());
		
		
		elements= driver.findElements(By.tagName("td"));
		System.out.println("No Of Column:"+elements.size());
				
		
		
		
	}
}
