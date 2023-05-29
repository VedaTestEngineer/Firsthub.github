package qsp.ImplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait2 
{

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://www.google.com");
	  driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']")).click();
	  

	}

}
