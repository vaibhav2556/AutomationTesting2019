package com.images.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountImage {
	// Open Browser Navigate to Mercury.com
	// Count No Of Imgage
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.mercurytravels.co.in/");

		List<WebElement> NoOfImg = driver.findElements(By.tagName("img"));
		System.out.println("No of Img are:"+ NoOfImg.size());

		
		driver.close();
	}

}
