package com.tsetng.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCityName {
	public static void main(String[] args) throws InterruptedException {
		
		//oepn browser navigate to https://www.timeanddate.com/worldclock/
		//Get All city Name And  Verify Bangkok city  present or not

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.timeanddate.com/worldclock/");

		List<WebElement> elements = driver.findElements(By.tagName("table"));

		for (int i = 0; i < elements.size(); i++) {
			String cityName = elements.get(i).getText();

			if (cityName.contains("Bangkok"))
					{
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		}
		
		Thread.sleep(3000);
		driver.close();
	}
}