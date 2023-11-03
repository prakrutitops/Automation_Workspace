package com.a311;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.util.Connection;

public class MouseEventEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver = Connection.getconnection("https://www.amazon.in/");
		
	WebElement mob=	 driver.findElement(By.linkText("Mobiles"));
	WebElement sell= driver.findElement(By.linkText("Sell"));
	WebElement td=	 driver.findElement(By.linkText("Today's Deals"));
	
	Actions builder = new Actions(driver);	
	
	builder.moveToElement(mob).build().perform();
	Thread.sleep(1000);
	builder.moveToElement(sell).build().perform();
	Thread.sleep(1000);
	builder.moveToElement(td).build().perform();
	Thread.sleep(1000);
	
	driver.quit();
	
	
	
	
	}
}
