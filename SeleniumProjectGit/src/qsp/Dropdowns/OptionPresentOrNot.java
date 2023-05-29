package qsp.Dropdowns;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionPresentOrNot 
{

	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/reg/");
	 Thread.sleep(2000);
	 WebElement ele = driver.findElement(By.id("year"));
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
	 if (l.contains("2004"))
	 {
		 System.out.println ("Yess");
	 }
	 else
	 {
		 System.out.println ("Nooo");
	 }
	 Thread.sleep(2000);
	 driver.quit();
	}

}
