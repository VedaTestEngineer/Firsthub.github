package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkcustcomptitleusingcontains 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		String tofind = driver.getTitle();
		String toUrl = driver.getCurrentUrl();
		
		if (tofind.contains("Face") && toUrl.contains("www.face"))
		{
			System.out.println ("YESS");
		}
		else
		{
			System.out.println ("NOOO");
		}
	

	}

}
