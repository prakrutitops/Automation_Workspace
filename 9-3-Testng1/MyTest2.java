package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTest2 
{
	@Parameters("browser")
	@Test
	
	public void test(String browser)
	{
		
		
		
		WebDriver driver=null;
		
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedrivernew.exe");		
			driver = new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver","D:\\chromedriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		
		
		
		
		driver.get("https://topsint.com/topserp/index.php");
		
	}
		
	
}
