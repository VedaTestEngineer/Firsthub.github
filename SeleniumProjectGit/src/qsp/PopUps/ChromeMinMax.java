package qsp.PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeMinMax 
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.selenium.dev/");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  Robot r = new Robot();
	  r.keyPress(KeyEvent.VK_WINDOWS);
	  r.keyPress(KeyEvent.VK_D);
	  r.keyRelease(KeyEvent.VK_WINDOWS);
	  r.keyRelease(KeyEvent.VK_D);
	  Thread.sleep(2000);
	  driver.quit();
	  
	  

	}

}
