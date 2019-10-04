package com.classrum.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GetNameUnderHeaderPart {
	//open browser navigate to bing.com
	// get name of link which is present in header part
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// ExpectedResult

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
		driver.get("https://www.bing.com/");
		
		 WebElement allLinks= driver.findElement(By.xpath("//ul[@id='sc_hdu']"));
		List<WebElement>  links=allLinks.findElements(By.tagName("a"));
		System.out.println("Total Header links:"+ links.size());
		
		// To get the name of link which is available in header part
		for(int i=0;i<links.size();i++)
		{
		System.out.println(	links.get(i).getText());
		}
		
		Sleeper.sleepTight(2000);
		driver.close();
		
	}

}
