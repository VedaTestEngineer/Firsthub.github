package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkuncheckforeach 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/kantharaj/Desktop/Export/EmptyTextfields.html");
		Thread.sleep(2000);
		List<WebElement> checker = driver.findElements(By.xpath("//input"));
		int count = checker.size();
		String[] str = {"Selenium", "Java", "Python", "C#", "Ruby"};
		for (int i=0; i<str.length; i++)
		{
		     for (WebElement we : checker)
		    {	
			we.sendKeys(str[i]);
			}
		}
		for (int i= count-1; i>=0; i--) 
		{
			checker.get(i).clear();
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
