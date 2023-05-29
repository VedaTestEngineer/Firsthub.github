package qsp.Dropdowns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveOptionAndSort 
{

	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/reg/");
	 Thread.sleep(2000);
	 WebElement ele = driver.findElement(By.id("month"));
	 Thread.sleep(2000);
	 Select s = new Select(ele);
	 List<WebElement> opt = s.getOptions();
	 Thread.sleep(2000);
	 ArrayList<String> l = new ArrayList<String>();
	 for (WebElement we : opt)
	 {
		 String t = we.getText();
		 l.add(t);
	 }
	    l.remove("Sep");
	    Collections.sort(l);
	    for (String t : l)
	    {
	    	System.out.println(t);
	    }
	  Thread.sleep(2000);
	  driver.quit();

	}

}
