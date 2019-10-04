package com.workingScreenShots.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureDifferentPage {

	// open browser navigate to google.com
	// screenshot should be save as title
	public static void main(String[] args) throws IOException  {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");

		String title = driver.getTitle();

		File file =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
			FileUtils.copyFile(file, new File("F:\\Selenium Screenshots\\" + title + ".png"));
		
		

		driver.findElement(By.linkText("Gmail")).click();
		
		String title1 = driver.getTitle();

		File file1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file1, new File("F:\\Selenium Screenshots\\" + title1 + ".png"));
		
		}

	}


