import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartBrowserDemoEx 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver_117.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		try 
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
	}
}
