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

public class Links {
	// oepn browser navigate to mbaskool
	// verify link "bkfs" present or not if not present takescreen shot
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.mbaskool.com/");

		List<WebElement> element = driver.findElements(By.tagName("a"));
		System.out.println(element.size());
		for (int i = 0; i < element.size(); i++) {
			element.get(i).getAttribute("bkfs");
			element.get(i).click();
			// break;

			File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(file1, new File("F:\\Selenium Screenshots\\bkfs.png"));
		}

	}
}