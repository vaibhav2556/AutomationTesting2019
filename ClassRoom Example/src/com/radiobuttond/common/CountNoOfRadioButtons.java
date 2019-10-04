package com.radiobuttond.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNoOfRadioButtons {
	
	//open browser navigate to fb.com
	//COunt no of Radio buttons

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("The No Of RadiosButton :" + radios.size());

	}

}
