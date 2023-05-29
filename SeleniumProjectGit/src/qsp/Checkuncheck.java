package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkuncheck 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/kantharaj/Desktop/Export/checkuncheck.html");
		Thread.sleep(2000);
		List<WebElement> checker = driver.findElements(By.xpath("//input"));
		int count = checker.size();
		for (int i=0; i<count; i++)
		{
			WebElement we = checker.get(i);
			we.click();
		}
		for (int j=count-1; j>=0; j--)
		{
			WebElement we1 = checker.get(j);
			we1.click();
		}

	}

}
