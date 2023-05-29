package qsp.Dropdowns;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class MultiSelector 
{

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("file:///C:/Users/kantharaj/Desktop/Export/Dropdown.html");
      Thread.sleep(2000);
      WebElement ele = driver.findElement(By.id("Shree Sagar"));
      Select s = new Select (ele);
      s.selectByValue("m");
      Thread.sleep(2000);
      s.selectByIndex(2);
      Thread.sleep(2000);
      s.selectByVisibleText("Curd Rice");
      Thread.sleep(2000);
      s.deselectAll();
      Thread.sleep(2000);
      driver.quit();
      
      
      

	}

}
