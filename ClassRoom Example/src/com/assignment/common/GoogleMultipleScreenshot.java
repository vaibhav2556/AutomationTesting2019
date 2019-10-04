package com.assignment.common;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMultipleScreenshot {
	// Open browser navigate to google.com
	// calture screenshot of google page
	// click on gmail and capture screenshot of gmail page
	// nagivat back
	// click on image and capture screenshot of images page
	// navigate back
	// close google System.setProperty("webdriver.chrome.driver",
	// "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("F:\\Selenium Screenshots\\google.png"));
		

		driver.findElement(By.linkText("Gmail")).click();
		

		File srcFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1, new File("F:\\Selenium Screenshots\\gmail.png"));
		



		driver.navigate().back();

	driver.findElement(By.linkText("Images")).click();

		File srcFile2= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile2, new File("F:\\Selenium Screenshots\\images.png"));
		driver.navigate().back();
		
		driver.close();

		{

	}
}
}