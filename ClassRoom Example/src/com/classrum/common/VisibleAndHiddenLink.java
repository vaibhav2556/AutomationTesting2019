package com.classrum.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibleAndHiddenLink {

	// open browser navigate to bing.com
	// count no of visible and hidden link
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

		driver.get("https://www.bing.com/");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		//System.out.println("The Total No Of Links:"+links.size());
		
		
		int count=0;
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
			count++;
			}
		}
	
		System.out.println("The total No Of Links:"+ links.size());
		System.out.println("The visible Links are:"+ count);
		System.out.println(links.size()-count);

		driver.close();
		

	}

}
