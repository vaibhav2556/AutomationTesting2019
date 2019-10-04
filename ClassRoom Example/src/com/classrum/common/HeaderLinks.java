package com.classrum.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class HeaderLinks {
	// open browser and navigate to bing.com
	// count no of links in header part
	// total no of link =19
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// ExpectedResult

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
		driver.get("https://www.bing.com/");

		WebElement element = driver.findElement(By.xpath("//ul[@id='sc_hdu']"));
		List<WebElement> links = element.findElements(By.tagName("a"));
		System.out.println("The Total No Of Links O Header Part:"+links.size());
			
		Sleeper.sleepTight(3000);
		driver.close();
}
		

	}

