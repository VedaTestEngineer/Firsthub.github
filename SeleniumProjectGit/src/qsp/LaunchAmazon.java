package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon {

	public static void main(String[] args) 
	{
	   System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.Amazon.com");
	   String url= driver.getCurrentUrl();
	   System.out.println (url);

	}

}
