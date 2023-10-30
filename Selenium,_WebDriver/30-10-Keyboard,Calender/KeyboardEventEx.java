package com.a3010;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.util.Connection;

public class KeyboardEventEx 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Connection.getconnection("https://www.google.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		Actions builder = new Actions(driver);
		builder.click(search)
				.keyDown(Keys.SHIFT)
				.sendKeys("Tops Technologies")
				.keyUp(Keys.SHIFT)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
					
	
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,100)");
		driver.findElement(By.id("inq_name")).sendKeys("Testing1");
		Thread.sleep(1000);
		driver.findElement(By.id("inq_email")).sendKeys("Testing1@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("inq_contact")).sendKeys("9275003605");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Send Inquiry")).click();
	}
}
