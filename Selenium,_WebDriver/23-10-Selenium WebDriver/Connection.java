package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Connection 
{
	public static WebDriver getconnection(String url)
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver_117.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	}
}
