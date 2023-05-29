package frameworkTestNG.Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginScript 
{
	@Test
	public void validLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		POM_Script p = new POM_Script(driver);
		p.clickLogin();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.clickLogin();
	}

}
