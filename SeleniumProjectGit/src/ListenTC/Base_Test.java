package ListenTC;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_constant
{
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(chrome_key,chrome_value);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get (baseURL);
	}
	
	@AfterMethod
	public void closeAppln(ITestResult res) throws IOException
	{
		if (ITestResult.FAILURE==res.getStatus())
		{
			Generic_Shot.getPhoto(driver);
		}
		driver.close();
	}
}


