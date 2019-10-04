package com.tsetng.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCity {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "F:\\SeleniumDriver\\Chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.timeanddate.com/worldclock/");
String Data1=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[3]/a")).getText();
		
System.out.println(Data1);


 String data2=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[3]/td[5]/a")).getText();
		System.out.println(data2);
		
		
		
		driver.close();
	}
}
