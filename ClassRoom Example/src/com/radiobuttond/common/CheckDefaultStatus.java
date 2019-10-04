package com.radiobuttond.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckDefaultStatus {
	//open browser navigate to https://www.spicejet.com/
	//check default status of radio button
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.spicejet.com/");
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("No Of Buttons:"+radios.size());
		for(int i=0;i<radios.size();i++)
		{
			String button=radios.get(i).getAttribute("value");
				if(radios.get(i).isSelected())
				{
					System.out.println(button+" "+"Active");
				}
				else
				{
					System.out.println(button+" "+"Inactive");
				}
		
		}
		driver.close();
	}

}
