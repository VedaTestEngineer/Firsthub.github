package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class BackForwRefresh 
{

	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.navigate().to("https://www.google.com");
	 Thread.sleep(2000);
	 driver.navigate().to("https://www.facebook.com");
	 Thread.sleep(2000);
	 Dimension d = new Dimension(200,300);
	 driver.manage().window().setSize(d);
	 Thread.sleep(2000);
	 Point p = new Point(100,50);
	 driver.manage().window().setPosition(p);
	 Thread.sleep(2000);
	 driver.navigate().back();
	 Thread.sleep(2000);
	 driver.navigate().forward();
	 Thread.sleep(2000);
	 driver.navigate().refresh();
	 
	 

	}

}
