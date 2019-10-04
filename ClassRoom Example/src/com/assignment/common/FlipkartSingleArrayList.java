package com.assignment.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSingleArrayList {
	// Open Browser Navigate to Flipkart.com
	// count no of links,images,dropdowns
	// get src of images
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Here i used single ArrayList to store  dropdowns,images
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No Of Links are:==>" + links.size());

		// select tag is not there for dropdown so that i used class name becoz its
		// common for dropdowns
		links = driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		System.out.println("No Of Dropdowns are:==>" + links.size());
		links = driver.findElements(By.tagName("img"));
		System.out.println("No Of Images are:==>" + links.size());

		for (int i = 0; i < links.size(); i++) {
			String img = links.get(i).getAttribute("src");
			System.out.println("Name OF src:==>" + img);

		}
		driver.close();
	}
}
