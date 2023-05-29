package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchClose {

	public static void main(String[] args) throws InterruptedException
	{
	    String key = "webdriver.gecko.driver";
	    String value = "./Softwares/geckodriver.exe";
	    System.setProperty(key, value);
	    FirefoxDriver driver = new FirefoxDriver();
	    Thread.sleep(2000);
	    driver.quit();
	    driver.close();

	}

}
