package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import java.util.ArrayList;
import java.util.List;


public class Counter 
{

	public static void main(String[] args) throws InterruptedException
	{
		
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
	 Thread.sleep(2000);
	 List<WebElement> ele = driver.findElements(By.xpath("//a"));
	 Thread.sleep(2000);
	 int count = ele.size();
	 System.out.println (count);
	 for (int i=0; i<count; i++)
	 {
		 WebElement we = ele.get(i);
		 String s = we.getAttribute("href");
		 System.out.println (s);
		 
	 }
	 Thread.sleep(50000);
	 driver.quit();
	 
	}
}
