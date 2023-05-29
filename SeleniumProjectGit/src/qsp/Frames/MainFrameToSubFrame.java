package qsp.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainFrameToSubFrame 
{

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("file:///C:/Users/kantharaj/Desktop/Export/Mainframe.html");
	  Thread.sleep(2000);
	  driver.findElement(By.id("a1")).sendKeys("abc");
	  Thread.sleep(2000);
	  driver.switchTo().frame(0);
	  driver.findElement(By.id("b1")).sendKeys("xyz");
	  Thread.sleep(2000);
	  driver.quit();
	  

	}

}
