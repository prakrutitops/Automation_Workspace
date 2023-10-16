import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterCheckEx 
{	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_117.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");	
		
		//anchor tag -link
		
		driver.findElement(By.linkText("Create new account")).click();
		
		
	}
}
