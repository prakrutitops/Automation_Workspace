import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_117.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		
		//driver.close();//close tab
		//driver.quit();//close browser
	}
}
