package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switcher 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Dimension d = ele.getSize();
		System.out.println (d);
		Thread.sleep(2000);
		int h = ele.getSize().getHeight();
		System.out.println (h);
		Thread.sleep(2000);
		int w = ele.getSize().getWidth();
		System.out.println (w);
		Thread.sleep(2000);
		Point p = ele.getLocation();
		System.out.println (p);
		Thread.sleep(2000);
		int x = ele.getLocation().getX();
		System.out.println (x);
		Thread.sleep(2000);
		int y = ele.getLocation().getY();
		System.out.println(y);
		Thread.sleep(2000);
		driver.quit();
		

	}

}
