package qsp.PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KannadaNewTab 
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
      System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com/");
      Thread.sleep(2000);
      WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
      Thread.sleep(2000);
      Actions act = new Actions(driver);
      act.contextClick(ele).perform();
      Thread.sleep(2000);
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_T);
      r.keyRelease(KeyEvent.VK_T);
      Thread.sleep(2000);
      Set<String> allwh = driver.getWindowHandles();
     ArrayList<String> l = new ArrayList<String>(allwh);
     /* for (String wh : allwh)
      {
    	  l.add(wh);
    	  //l.remove(0);
    	  //driver.switchTo().window(wh);
      }*/
      Thread.sleep(2000);
      String lastone = l.get(1);
      driver.switchTo().window(lastone);
      Thread.sleep(5000);
      driver.quit();
      
      
      
      

	}

}
