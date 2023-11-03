package com.a311;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.util.Connection;

public class FrameHandlingEx 
{
	public static void main(String[] args) {
	
		
	WebDriver driver = Connection.getconnection("https://demoqa.com/frames");
	
	WebElement element =driver.findElement(By.id("frame1"));
	driver.switchTo().frame(element);
	String text = driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(text);	
	}
}
