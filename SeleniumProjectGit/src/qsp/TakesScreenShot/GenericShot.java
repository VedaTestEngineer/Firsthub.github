package qsp.TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GenericShot 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
	  System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  Date d = new Date();
	  String s = d.toString();
	  String s1 = s.replaceAll(":", "-");
	  Thread.sleep(2000);
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  Thread.sleep(2000);
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  Thread.sleep(2000);
	  String store = "./Photos/";
	  File dst = new File (store+s1+".jpeg");
	  Thread.sleep(2000);
	  FileHandler.copy(src, dst);
	  Thread.sleep(2000);
	  driver.close();
	  
	}

}
