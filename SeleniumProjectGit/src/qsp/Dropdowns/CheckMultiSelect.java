package qsp.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;


public class CheckMultiSelect 
{

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("file:///C:/Users/kantharaj/Desktop/Export/Dropdown.html");
      Thread.sleep(2000);
      WebElement ele = driver.findElement(By.id("Shree Sagar"));
      Select s = new Select(ele);
      boolean b = s.isMultiple();
      if (b)
      {
    	  System.out.println ("it is multiselect");
      }
      else
      {
    	  System.out.println ("not multiselect");
      }
      Thread.sleep(2000);
      driver.quit();
      
      
      

	}

}
