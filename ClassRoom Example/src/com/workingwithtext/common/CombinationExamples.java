package com.workingwithtext.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CombinationExamples {
	
	// By using  AddAll() Method In collection
	public static void main(String[] args) {
		
			
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.mercurytravels.co.in/");	
			
			//For Links
			 List<WebElement> count= driver.findElements(By.tagName("a"));
			 System.out.println("No Of Links:"+ count.size());
			 
			 // For Images
			 
			 count.removeAll(count);
			 
			 count.addAll(driver.findElements(By.tagName("img")));
			 System.out.println("No Of Images:"+ count.size());
			 
			// For RadioButtons
			 count.removeAll(count);
			 count.addAll(driver.findElements(By.xpath("//input[@type='radio']")));
			 System.out.println("No Of radioButtons:"+ count.size());
			 
			 // For  CheckBox
			 count.removeAll(count);
			 
			 count.addAll(driver.findElements(By.xpath("//input[@type='checkbox']")));
			 System.out.println("No Of CheckBox:"+ count.size());

			 // For DropDown
			 count.removeAll(count);
			 count.addAll(driver.findElements(By.tagName("select")));
			 System.out.println("No Of DropDown:"+ count.size());
			 
			 driver.close();
		
	}

}
