package qsp.PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMultipleTabs 
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  Robot r = new Robot();
	  for (int i =0; i<=5; i++)
	  {
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_T);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_T);
		  Thread.sleep(2000);
	  }
	  for (int i=4; i>=0; i--)
	  {
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_SHIFT);
		  r.keyPress(KeyEvent.VK_C);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_SHIFT);
		  r.keyRelease(KeyEvent.VK_C);
		  Thread.sleep(2000);
	  }

	}

}
