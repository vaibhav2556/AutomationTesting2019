package com.classrum.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyNoOfLinks {

	public static void main(String[] args) {
		//oepn browser 
		//navigate to icicbank.com
		//display no links or count above  710
		
		//Set properties
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	//to  navigate to url
	driver.navigate().to("https://www.icicibank.com/");
	
	// to get the no of links we used tagname
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	driver.close();

	}

}
