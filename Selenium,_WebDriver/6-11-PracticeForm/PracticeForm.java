package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.util.Connection;

public class PracticeForm 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = Connection.getconnection("https://demoqa.com/automation-practice-form");

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		driver.findElement(By.id("firstName")).sendKeys("urvi");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("xyz");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("urvi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("userNumber")).sendKeys("9292929292gjdkgjdf");
		
		String day = "17";
		String month = "June";
		String year = "2020";
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		Thread.sleep(1000);
		
		WebElement mymonth = driver.findElement(By.className("react-datepicker__month-select"));
		Select m = new Select(mymonth);
		m.selectByVisibleText(month);
		
		WebElement myyear = driver.findElement(By.className("react-datepicker__year-select"));
		Select m2 = new Select(myyear);
		m2.selectByVisibleText(year);
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
		
		for(WebElement d : days)
		{
			if(d.getText().equals(day))
			{
				if(d.getAttribute("aria-label").contains(month))
				{
					d.click();
					break;
				}
				
			}
		}
		
		WebElement subjects	=driver.findElement(By.id("subjectsContainer"));
		Actions builder = new Actions(driver);
		builder.click(subjects).sendKeys("Maths").sendKeys(Keys.ENTER).sendKeys("Physics").sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(1000);
		
		ScreenshotEx.getScreenShot(driver, "reg");
	}
}
