package com.workingwithtext.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountText {
	// open browser navigate to new tours.com
	// count no of normal text and bold text
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");

		// This way Prefered By "RK" Sir

		
		  List<WebElement> text=driver.findElements(By.tagName("p"));
		  System.out.println("No Of NormalText:"+ text.size());
		  
		  
		  text=driver.findElements(By.tagName("b"));
		  System.out.println("No Of BoldText:"+ text.size());
		

		// Second Approach
		/*
		 * // This is my own way to get all normal and bold text List<WebElement>
		 * Counttext=driver.findElements(By.tagName("p"));
		 * System.out.println("The No Of Normal Text:"+ Counttext.size());
		 * 
		 * // I romove all element from counttex first then i addAll Element into
		 * Counttext
		 * 
		 * Counttext.removeAll(Counttext); // If i directly addAll element it will not
		 * give particular element it return all element from top to bottom
		 * 
		 * Counttext.addAll(driver.findElements(By.tagName("b")));
		 * System.out.println("The No Of BoldText: "+Counttext.size());
		 * 
		 */

		driver.close();

	}
}