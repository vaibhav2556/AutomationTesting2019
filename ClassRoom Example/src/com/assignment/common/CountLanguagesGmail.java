package com.assignment.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountLanguagesGmail {
	// open browser navigate to  gmail.com
	// count no of languages  from  languages dropdown get name of languages. 
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();
		/*
		 * driver.manage().window().fullscreen();
		 * driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 */
		/*
		 * driver.get("http://www.google.com");
		 * driver.findElement(By.linkText("Gmail")).click();
		 * driver.findElement(By.linkText("Create an account")).click();
		 */
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		List<WebElement>element= driver.findElements(By.xpath("//div[@class='MocG8c B9IrJb LMgvRb KKjvXb']"));
		//WebElement element=driver.findElement(By.xpath("//div[@class='OA0qNb ncFHed']"));
		//List<WebElement> dropdown=element.findElements(By.tagName("tabindex"));
		System.out.println(element.size());
	
		
		for(int i=0;i<element.size();i++)
		{
			System.out.println(element.get(i).getText());
			
		}
		/*
		 * List<WebElement> dropdown=element.findElements(By.tagName("jsaction"));
		 * System.out.println(dropdown.size());
		 */
		/*
		 * System.out.println(element.size()); for(int i=0;i<element.;i++) {
		 * System.out.println(element.get(i).getText()); }
		 */

		
		
		//List<WebElement>lang= element.findElements(By.cssSelector("#lang-chooser > div:nth-child(1) > div.ry3kXd.Ulgu9 > div:nth-child(2)"));
		/*
		 * List<WebElement> element= s.getOptions();
		 * 
		 * 
		 * System.out.println(element.size());
		 * 
		 * for(int i=0;i<element.size();i++) {
		 * System.out.println(element.get(i).getText()); }
		 */
		
		 
		
		
//	WebElement element=	driver.findElement(By.className("kRoyt MbhUzd"));
		/*
		 * List<WebElement> lang= driver.findElements(By.tagName("div"));
		 * System.out.println(lang.size());
		 */
	
	
		/*
		 * List<WebElement> lang= element.findElements(By.tagName("wQNmvb"));
		 * 
		 * for( int i=0;i<lang.size();i++) { System.out.println(lang.get(i).getText());
		 * }
		 */
	// driver.close();
	}

}
