package qsp.Testing;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra 
{

	public static void main(String[] args) throws AWTException, InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.myntra.com");
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Watches");
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	 Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//h4[.='ColorFit Icon Buzz Smart Watch']"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).click().perform();
	Set<String> allwh = driver.getWindowHandles();
	for (String wh : allwh)
	{
		driver.switchTo().window(wh);
		String ti = driver.getTitle();
		Thread.sleep(2000);
		if (ti.contains("Buy NOISE"))
		{
			driver.switchTo().window(wh);
		}
	}
	Thread.sleep(20000);
	driver.findElement(By.xpath("//span[.='WISHLIST']")).click();
	}

}
