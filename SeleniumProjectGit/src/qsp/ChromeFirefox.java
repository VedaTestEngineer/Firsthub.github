package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeFirefox {

	public static void main(String[] args) 
	{
		String key = "webdriver.gecko.driver";
		String value = "./Softwares/geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver = new FirefoxDriver();
		String key1 = "webdriver.chrome.driver";
		String value1 = "./Softwares/chromedriver.exe";
		System.setProperty(key1,value1);
		ChromeDriver driver1= new ChromeDriver();
		
		driver.quit();
		//driver1.quit();
		

	}

}
   