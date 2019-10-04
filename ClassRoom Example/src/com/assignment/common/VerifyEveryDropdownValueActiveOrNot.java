package com.assignment.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEveryDropdownValueActiveOrNot {

	// open browser navigate to gmail.com
	// verify every dropdown value active or inactive

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(
				"https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		List<WebElement> element = driver.findElements(By.xpath("//div[@class='MocG8c B9IrJb LMgvRb KKjvXb']"));
		//WebElement drop = driver.findElement(By.xpath("//div[@class='MocG8c B9IrJb LMgvRb KKjvXb']"));

 //List<WebElement> element =drop.findElements(By.xpath("//div[@class='OA0qNb ncFHed']//span[text()='‪Afrikaans‬']"));
		// ncFHed']"));
		// List<WebElement> dropdown=element.findElements(By.tagName("tabindex"));

		System.out.println(element.size());

		for (int i = 0; i < element.size(); i++) {
			String dropdown = element.get(i).getText();
			element.get(i).click();
			
			if(element.get(i).isDisplayed())
			{
				System.out.println(dropdown+"  "+"Active");
			} 
			else
			{
				System.out.println(dropdown+" "+"Inactive");
			}
			
			
			
			

		}
	}


}
