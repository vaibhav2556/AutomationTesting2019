package com.classrum.common;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryFlight {
	public static void main(String[] args) {
		// open browser navigate to mercurytravels.com
		// count above 140 links from flight search page
		// get all name of links

		// Set properties
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// to make full screen
		driver.manage().window().fullscreen();
		// to navigate to url
		driver.navigate().to("https://www.mercurytravels.co.in/");

		// print no of links size
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		// get all links and print name of links

		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());

			driver.close();
		}

	}
}
