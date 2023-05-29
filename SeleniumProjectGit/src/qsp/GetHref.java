package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.List;

public class GetHref 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		List<WebElement> getref = driver.findElements(By.xpath("//a"));
		int count = getref.size();
		System.out.println (count);
		for (int i=0; i<count; i++)
		{
			WebElement we = getref.get(i);
			String refer = we.getAttribute("href");
			System.out.println (refer);
		}

	}

}
