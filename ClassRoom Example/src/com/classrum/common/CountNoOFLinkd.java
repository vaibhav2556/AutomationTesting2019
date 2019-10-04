package com.classrum.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class CountNoOFLinkd {
	// open browser and navigate to bing.com
	// count no of links and get link name and url
	public static void main(String[] args) {
		
		//Not working 

		//Example Not working  i got exception
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

		driver.get("https://www.bing.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).isDisplayed())
			{
				String linkName = links.get(i).getText();
				links.get(i).click();

				 Sleeper.sleepTight(200);
				String url = driver.getCurrentUrl();
				System.out.println(url + " " + linkName);
			}

			Sleeper.sleepTight(300);

			driver.navigate().back();
			links = driver.findElements(By.tagName("a"));

			driver.close();

		}
	}
}
