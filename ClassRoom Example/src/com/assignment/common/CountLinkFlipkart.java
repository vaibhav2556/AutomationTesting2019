package com.assignment.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinkFlipkart {
	
	// open  browser and navigate to flipkard.com
	//count no of links and  get name 
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().window().fullscreen();

	driver.get("https://www.flipkart.com/");
	 List<WebElement> links=driver.findElements(By.tagName("a"));
	 
	 System.out.println("The Total No Of Links Is:"+ links.size());
	 
	 
	 for(int i=0;i<links.size();i++)
	 {
		//links.get(i).getText();
		System.out.println( "The Total Link Names:"+links.get(i).getText());
	 }
	 driver.close();
}
}
