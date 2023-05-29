package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;



public class Sizer 
{

	public static void main(String[] args) throws InterruptedException
	{
     System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/");
     Thread.sleep(2000);
     WebElement ele = driver.findElement(By.xpath("//img[@alt='Facebook']"));
     /*System.out.println (ele);
     System.out.println (ele.getSize());
     System.out.println (ele.getSize().getHeight());
     System.out.println (ele.getSize().getWidth());*/
     Dimension d = ele.getSize();
     System.out.println (d);
     System.out.println (d.getHeight());
     System.out.println (d.getWidth());
     Thread.sleep(2000);
     driver.quit();
     
     
     
     

	}

}
