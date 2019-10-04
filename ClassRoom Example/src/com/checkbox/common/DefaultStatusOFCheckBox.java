package com.checkbox.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultStatusOFCheckBox {
	
	//Open Broswer Navigate to spiceJet.com
		//default status of  Checkbox 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.spicejet.com/");
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("No Of box:"+checkboxs.size());
		
		for(int i=0;i<checkboxs.size();i++)
		{
			String check= checkboxs.get(i).getAttribute("name");
			
			if(checkboxs.get(i).isSelected())
			{
				System.out.println(check+ "==> " +"Active");
			}
			else
			{
				System.out.println(check+"==>"+"Inactive");
			}
		}
 driver.close();
	}

}
