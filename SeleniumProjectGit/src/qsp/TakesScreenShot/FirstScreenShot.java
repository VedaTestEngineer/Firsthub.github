package qsp.TakesScreenShot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class FirstScreenShot 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  Thread.sleep(2000);
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  Thread.sleep(2000);
	  File dst = new File ("E:\\Screenshot\\tc1.jpeg");
	  Thread.sleep(2000);
	  FileHandler.copy(src,dst);
	  Thread.sleep(2000);
	  driver.quit();
	  
	  
	  
	  

	}

}
