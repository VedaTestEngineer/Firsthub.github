package qsp.PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTabSwitch 
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.selenium.dev/");
	  Thread.sleep(2000);
	  WebElement ele1 = driver.findElement (By.xpath("//span[.='Downloads']"));
	  WebElement ele2 = driver.findElement(By.xpath("//span[.='Documentation']"));
	  WebElement ele3 = driver.findElement(By.xpath("//span[.='Projects']"));
	  WebElement ele4 = driver.findElement(By.xpath("//span[.='Support']"));
	  WebElement ele5 = driver.findElement(By.xpath("//span[.='Blog']"));
	  ArrayList<WebElement> l = new ArrayList<WebElement>();
	  {
		  l.add(ele1);
		  l.add(ele2);
		  l.add(ele3);
		  l.add(ele4);
		  l.add(ele5);
	  }
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  //ArrayList<String> tile = new ArrayList<String>();
	  for (WebElement ele : l)
	  {
      act.contextClick(ele).perform();
      Thread.sleep(2000);
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_T);
      r.keyRelease(KeyEvent.VK_T);
      Thread.sleep(2000);
      //tile.add(ele.getTitle());
	  }
      Set<String> allwh = driver.getWindowHandles();
      /*ArrayList<String> l2 = new ArrayList<String>(allwh);
      Thread.sleep(2000);
      /*for (String wh : l2)
      {
    	  l2.add(wh);
      }
      Thread.sleep(20000);*/
      for (String wh : allwh)
      {
    	 
    	  Thread.sleep(2000);
    	  String title = driver.getTitle();
    	  Thread.sleep(2000);
    	  if (title.contains("Blog"))
    	  {
    		  driver.switchTo().window(wh);
    	  }
    	  else
    	  {
    		  driver.close();
    	  }
      }
      /*String lastone = l2.get(5);
      Thread.sleep(20000);
      driver.switchTo().window(lastone);
      Thread.sleep(10000);
      driver.quit();*/

	}

}
