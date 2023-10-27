package com.a2710;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.util.Connection;

public class MultipleWindowHandleEx 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver = Connection.getconnection("http://demo.guru99.com/popup.php");
		String mainwin = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> allwins =  driver.getWindowHandles();
		for(String win : allwins)
		{
			if(!win.equals(mainwin))
			{
				driver.switchTo().window(win);
			} 
		}
		driver.findElement(By.name("emailid")).sendKeys("tops@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
	}
}
