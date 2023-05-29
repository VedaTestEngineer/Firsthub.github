package qsp.Testing;

//import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAmazon 
{

	public static void main(String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[.='✕']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.className("_3704LK")).sendKeys("APPLE iPhone 13 (Blue, 128 GB)");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(10000);
		  driver.findElement(By.xpath("//img[@alt='APPLE iPhone 13 (Blue, 128 GB)']")).click();
		  Set<String> allwh= driver.getWindowHandles();
		  String p_id = driver.getWindowHandle();
		  allwh.remove(p_id);
		  for (String wh : allwh)
		  {
			 driver.switchTo().window(wh);
		  }
		  WebElement ele = driver.findElement(By.xpath("//span[.='APPLE iPhone 13 (Blue, 128 GB)']/../../following-sibling::div[3]/div[1]/div[1]/div[1]"));
		  String s = ele.getText();
		  String s1 = s.replaceAll("₹","");
		  String s2 = s1.replaceAll(",", "");
		  System.out.println(s2);
		  Thread.sleep(10000);
		  driver.quit();
		  
		  
		  
		  
		  


	}

}
