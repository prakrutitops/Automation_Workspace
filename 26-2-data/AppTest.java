import org.testng.annotations.Test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

/*
 * Unit test for simple App.
 */
@Test
public class AppTest 
{
    public void appiumTest() throws MalformedURLException, InterruptedException
    {
//    	AppiumDriverLocalService service = new AppiumServiceBuilder()
//    			.withAppiumJS(new File("C:\\Users\\LearnVern\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
//    			.withIPAddress("127.0.0.1")
//    			.usingPort(4723).build();
//    	service.start();
    	
    	UiAutomator2Options options = new UiAutomator2Options();
    	options.setDeviceName("vivo V2040");
    	options.setApp("D:\\MyappsTesting\\facebook_lite_v321.0.0.13.113.apk");
    	
        //AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),"");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        Thread.sleep(10000);
        //driver.findElement(By.id("com.instagram.android:id/sign_up_with_email_or_phone")).click();
        //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]")).click();
        //	//xpath
        //driver.findElement(By.id("android:id/text1")).click(); //resource id 
        driver.findElement(By.xpath("//*[@id=\"screenshotContainer\"]/div[2]/div/div/div/div/div[33]")).click();
        Thread.sleep(2000);
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver.quit();
     //   service.stop();
    }
}