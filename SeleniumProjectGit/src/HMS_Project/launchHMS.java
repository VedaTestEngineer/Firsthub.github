package HMS_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class launchHMS 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenApp()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://106.51.87.42:9007/");
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
