package com.classrum.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLink {
	public static void main(String[] args) {
		//open browser
		//navigate to google.com clink on gmail link
		// display gamail title 
		
		//Set properties
		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	//to make full screen
	driver.manage().window().fullscreen();
	//to  navigate to url
	driver.navigate().to("https://www.google.com");
	
	// here i take variable to check result right or not
	String ExpectedResult ="Gmail";
	
	//To get elemnet i used linktext  
	 driver.findElement(By.linkText("Gmail")).click();
	
	 
	 
	 String ActualResult =driver.getTitle();
	 
	 //here i comapre expected value equal to actual value or not 
	 if(ActualResult.contains(ExpectedResult))
	 {
		 
		 System.out.println("Gmail Title Match");
	 }
	 else {
		
		 System.out.println("Gmail title Not Match");
		 
	}
	
		
		 driver.close();
	}

}
