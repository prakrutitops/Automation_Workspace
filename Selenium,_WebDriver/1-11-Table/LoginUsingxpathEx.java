package com.a3010;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.util.Connection;

public class LoginUsingxpathEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = Connection.getconnection("https://www.demoblaze.com/");
		
		driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("pranav");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("1234");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();

		Thread.sleep(5000);
		
		driver.quit();
	}
}
