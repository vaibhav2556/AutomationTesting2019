package com.radiobuttond.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNameRadioButton {

	// Get Name Of Radio Button from Fb.com
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("The No Of RadiosButton :" + radios.size());
		for(int i=0;i<radios.size();i++)
		{
			System.out.println(radios.get(i).getAttribute("name"));
		}
		driver.close();
	}

}
