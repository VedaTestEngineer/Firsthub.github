package qsp.MultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Point;

public class Locator 
{

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	  WebElement ele = driver.findElement(By.xpath("//img[@alt='Facebook']"));
	  Point p = ele.getLocation();
	  System.out.println(p);
	  System.out.println(ele.getLocation().getX());
	  System.out.println(ele.getLocation().getY());
	  Thread.sleep(2000);
	  driver.quit();
	  
	  
	  
		  

	}

}
