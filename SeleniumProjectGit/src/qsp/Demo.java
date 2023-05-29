package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{

	public static void main(String[] args) 
	{
		
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
	}

}
