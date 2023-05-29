package qsp.JavaScriptExecutor;

//import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroller 
{

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      Thread.sleep(2000);
      driver.get("https://www.amazon.in/");
      Thread.sleep(10000);
      driver.manage().window().maximize();
      JavascriptExecutor js = (JavascriptExecutor) driver;
      WebElement ele = driver.findElement(By.xpath("//a[.='Facebook']"));
      
      //WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'Connect with Us')]"));
 

      Thread.sleep(10000);
      Point p = ele.getLocation();
      int x = p.getX();
      int y = p.getY();
      js.executeScript("window.scrollBy("+x+","+y+")");
      Thread.sleep(2000);
      //ele.click();
      Actions act = new Actions (driver);
      act.moveToElement(ele).click().perform();
      
      
      
           
      
      
      
      

	}

}
