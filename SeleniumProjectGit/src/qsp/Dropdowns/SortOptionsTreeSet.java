package qsp.Dropdowns;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortOptionsTreeSet
{

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("file:///C:/Users/kantharaj/Desktop/Export/Dropdown.html");
	  Thread.sleep(2000);
	  WebElement ele = driver.findElement (By.id("Shree Sagar"));
	  Thread.sleep(2000);
	  TreeSet<String> l = new TreeSet<String>();
	  Select s = new Select(ele);
	  List<WebElement> opt = s.getOptions();
	  for (WebElement we : opt)
	  {
		  String t = we.getText();
		  l.add(t);
	  }
	  ArrayList<String> l1 = new ArrayList<String>(l);
	  for (String t1 : l1)
	  {
		  System.out.println(t1);
	  }
	  Thread.sleep(2000);
	  driver.quit();

	}

}
