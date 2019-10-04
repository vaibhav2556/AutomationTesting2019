package com.assignment.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinkGoogle {
	
	// open browser  navigate to google.com
	// count no of visible and hidden links 
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();

		driver.navigate().to("https://www.google.com");
		 List<WebElement> elements=driver.findElements(By.tagName("a"));
		  
		 int count=0;
		 for(int i=0;i<elements.size();i++)
		 {
			 if(elements.get(i).isDisplayed())
			 {
			 count++;
			 }
		 }
		 
		 System.out.println("The Total Links on Google Page:"+ elements.size());
		 System.out.println("The Total no of Visible Links:"+ count);
		 
		 //For Total Hidden Links 
		 System.out.println( elements.size()-count);
		

	}

}
