package com.classrum.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDropdownValueActiveOrInactive {

	// open browser navigate to mercury.com
	// From type of holiday dropdown verify weather value is active or inactive
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

		driver.get("https://www.mercurytravels.co.in/");

		WebElement element = driver.findElement(By.id("themes"));
		List<WebElement> values = element.findElements(By.tagName("option"));
		
		System.out.println(values.size());
		
		for(int i=0;i<values.size();i++)
		{
			 String Vname =values.get(i).getText();
			 values.get(i).click();
			 if(values.get(i).isDisplayed())
			 {
			 System.out.println(Vname+"======>"+"Active");
			 }
			 else
			 {
				 System.out.println(Vname + "=====>" +"Inactive");
			 }
		
	}
		driver.close();
}
}
