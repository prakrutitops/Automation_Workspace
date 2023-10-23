package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.util.Connection;

public class ScrollDemo 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Connection.getconnection("https://www.demoblaze.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Samsung galaxy s6")).click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	
		
	}
}
