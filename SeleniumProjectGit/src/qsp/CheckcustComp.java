package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckcustComp 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String cust = "Facebook - log in or sign up";
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String comp = driver.getTitle();
		System.out.println(comp);
		
		if (cust.equals(comp))
		{
			System.out.println("PASS");
		}
		else 
		{
			System.out.println("FAIL");
		}

	}

}
