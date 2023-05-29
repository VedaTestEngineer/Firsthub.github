package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedOrNot 
{

	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("file:///C:/Users/kantharaj/Desktop/Export/Selectedornot.html");
	 Thread.sleep(2000);
	 WebElement ele = driver.findElement(By.id("a1"));
	 boolean b = ele.isSelected();
	 if (b)
	 {
		 System.out.println ("Element is Selected");
	 }
	 else
	 {
		 System.out.println ("Element not Selected");
	 }
	 Thread.sleep(2000);
	 driver.quit();
	}

}
