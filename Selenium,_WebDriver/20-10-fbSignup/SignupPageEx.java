import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPageEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver_117.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstname")).sendKeys("tops");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("tech");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("tops@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("tops");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");
		
		Thread.sleep(1000);
		Select days = new Select(driver.findElement(By.id("day")));
		days.selectByVisibleText("11");
		
		Thread.sleep(1000);
		Select months = new Select(driver.findElement(By.id("month")));
		months.selectByVisibleText("Mar");
		
		Thread.sleep(1000);
		Select years= new Select(driver.findElement(By.id("year")));
		years.selectByIndex(11);
		
		Thread.sleep(1000);
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(1).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("websubmit")).click();
		
	}
}
