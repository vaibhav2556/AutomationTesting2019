package com.workingScreenShots.common;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {
	//Not working
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (int i = 0; i < links.size(); i++) {
			{
				if (links.get(i).isDisplayed()) {
					String lname = links.get(i).getText();
					links.get(i).click();

					File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(file1, new File("F:\\Selenium Screenshots\\" + lname + ".png"));
					
					driver.navigate().back();
					driver.findElements(By.tagName("a"));

					//driver.close();
				}
			}
		}
	
	}
}