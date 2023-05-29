package qsp.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  Thread.sleep(2000);
		  /*driver.findElement(By.xpath("")).click();
		  /*Set<String> allwh= driver.getWindowHandles();
		  //String p-id = driver.getWindowHandle();
		  ArrayList<String> l = new ArrayList<String>();
		  for (String s : allwh)
		  {
			  l.add(s);
			  l.remove(0);
		  }
		  String st = l.get(0);
		  driver.switchTo().window(st);*/
		  WebElement ele = driver.findElement(By.xpath("//span[.='Apple iPhone 14 (128 GB) - Blue']/../../../following-sibling::div[2]/div[1]/div[1]/div[1]/div[1]/a/span[1]"));
		  Thread.sleep(2000);
		  String s = ele.getText();
		  String s1 = s.replace("₹","");
		  String s2 = s1.replace(",", "");
		  System.out.println (s2);
		  
		  
		  

	}

}
